package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.storagegateway.NfsFileShareCacheAttributes
import typings.pulumiAws.outputMod.storagegateway.NfsFileShareNfsFileShareDefaults
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nfsFileShareMod {
  
  @JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare")
  @js.native
  class NfsFileShare protected () extends CustomResource {
    /**
      * Create a NfsFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NfsFileShareArgs) = this()
    def this(name: String, args: NfsFileShareArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the NFS File Share.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Refresh cache information. see Cache Attributes for more details.
      */
    val cacheAttributes: Output_[js.UndefOr[NfsFileShareCacheAttributes]] = js.native
    
    /**
      * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
      */
    val clientLists: Output_[js.Array[String]] = js.native
    
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
      */
    val defaultStorageClass: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the file share. Must be set if an S3 prefix name is set in `locationArn`.
      */
    val fileShareName: Output_[String] = js.native
    
    /**
      * ID of the NFS File Share.
      */
    val fileshareId: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the file gateway.
      */
    val gatewayArn: Output_[String] = js.native
    
    /**
      * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
      */
    val guessMimeTypeEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
      */
    val kmsEncrypted: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
      */
    val kmsKeyArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the backed storage used for storing file data.
      */
    val locationArn: Output_[String] = js.native
    
    /**
      * Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
      */
    val nfsFileShareDefaults: Output_[js.UndefOr[NfsFileShareNfsFileShareDefaults]] = js.native
    
    /**
      * Access Control List permission for S3 bucket objects. Defaults to `private`.
      */
    val objectAcl: Output_[js.UndefOr[String]] = js.native
    
    /**
      * File share path used by the NFS client to identify the mount point.
      */
    val path: Output_[String] = js.native
    
    /**
      * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
      */
    val readOnly: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
      */
    val requesterPays: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
      */
    val squash: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object NfsFileShare {
    
    @JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): NfsFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NfsFileShare]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NfsFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NfsFileShare]
    inline def get(name: String, id: Input[ID], state: NfsFileShareState): NfsFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NfsFileShare]
    inline def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): NfsFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NfsFileShare]
    
    /**
      * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean]
  }
  
  trait NfsFileShareArgs extends StObject {
    
    /**
      * Refresh cache information. see Cache Attributes for more details.
      */
    val cacheAttributes: js.UndefOr[Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareCacheAttributes]] = js.undefined
    
    /**
      * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
      */
    val clientLists: Input[js.Array[Input[String]]]
    
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
      */
    val defaultStorageClass: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the file share. Must be set if an S3 prefix name is set in `locationArn`.
      */
    val fileShareName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the file gateway.
      */
    val gatewayArn: Input[String]
    
    /**
      * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
      */
    val guessMimeTypeEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
      */
    val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the backed storage used for storing file data.
      */
    val locationArn: Input[String]
    
    /**
      * Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
      */
    val nfsFileShareDefaults: js.UndefOr[
        Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults]
      ] = js.undefined
    
    /**
      * Access Control List permission for S3 bucket objects. Defaults to `private`.
      */
    val objectAcl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
      */
    val readOnly: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
      */
    val requesterPays: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
      */
    val roleArn: Input[String]
    
    /**
      * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
      */
    val squash: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object NfsFileShareArgs {
    
    inline def apply(
      clientLists: Input[js.Array[Input[String]]],
      gatewayArn: Input[String],
      locationArn: Input[String],
      roleArn: Input[String]
    ): NfsFileShareArgs = {
      val __obj = js.Dynamic.literal(clientLists = clientLists.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], locationArn = locationArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NfsFileShareArgs]
    }
    
    extension [Self <: NfsFileShareArgs](x: Self) {
      
      inline def setCacheAttributes(value: Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareCacheAttributes]): Self = StObject.set(x, "cacheAttributes", value.asInstanceOf[js.Any])
      
      inline def setCacheAttributesUndefined: Self = StObject.set(x, "cacheAttributes", js.undefined)
      
      inline def setClientLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clientLists", value.asInstanceOf[js.Any])
      
      inline def setClientListsVarargs(value: Input[String]*): Self = StObject.set(x, "clientLists", js.Array(value :_*))
      
      inline def setDefaultStorageClass(value: Input[String]): Self = StObject.set(x, "defaultStorageClass", value.asInstanceOf[js.Any])
      
      inline def setDefaultStorageClassUndefined: Self = StObject.set(x, "defaultStorageClass", js.undefined)
      
      inline def setFileShareName(value: Input[String]): Self = StObject.set(x, "fileShareName", value.asInstanceOf[js.Any])
      
      inline def setFileShareNameUndefined: Self = StObject.set(x, "fileShareName", js.undefined)
      
      inline def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      inline def setGuessMimeTypeEnabled(value: Input[Boolean]): Self = StObject.set(x, "guessMimeTypeEnabled", value.asInstanceOf[js.Any])
      
      inline def setGuessMimeTypeEnabledUndefined: Self = StObject.set(x, "guessMimeTypeEnabled", js.undefined)
      
      inline def setKmsEncrypted(value: Input[Boolean]): Self = StObject.set(x, "kmsEncrypted", value.asInstanceOf[js.Any])
      
      inline def setKmsEncryptedUndefined: Self = StObject.set(x, "kmsEncrypted", js.undefined)
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      inline def setLocationArn(value: Input[String]): Self = StObject.set(x, "locationArn", value.asInstanceOf[js.Any])
      
      inline def setNfsFileShareDefaults(value: Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults]): Self = StObject.set(x, "nfsFileShareDefaults", value.asInstanceOf[js.Any])
      
      inline def setNfsFileShareDefaultsUndefined: Self = StObject.set(x, "nfsFileShareDefaults", js.undefined)
      
      inline def setObjectAcl(value: Input[String]): Self = StObject.set(x, "objectAcl", value.asInstanceOf[js.Any])
      
      inline def setObjectAclUndefined: Self = StObject.set(x, "objectAcl", js.undefined)
      
      inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequesterPays(value: Input[Boolean]): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
      
      inline def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setSquash(value: Input[String]): Self = StObject.set(x, "squash", value.asInstanceOf[js.Any])
      
      inline def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait NfsFileShareState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the NFS File Share.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Refresh cache information. see Cache Attributes for more details.
      */
    val cacheAttributes: js.UndefOr[Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareCacheAttributes]] = js.undefined
    
    /**
      * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
      */
    val clientLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
      */
    val defaultStorageClass: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the file share. Must be set if an S3 prefix name is set in `locationArn`.
      */
    val fileShareName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the NFS File Share.
      */
    val fileshareId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the file gateway.
      */
    val gatewayArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
      */
    val guessMimeTypeEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
      */
    val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the backed storage used for storing file data.
      */
    val locationArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
      */
    val nfsFileShareDefaults: js.UndefOr[
        Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults]
      ] = js.undefined
    
    /**
      * Access Control List permission for S3 bucket objects. Defaults to `private`.
      */
    val objectAcl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * File share path used by the NFS client to identify the mount point.
      */
    val path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
      */
    val readOnly: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
      */
    val requesterPays: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
      */
    val squash: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object NfsFileShareState {
    
    inline def apply(): NfsFileShareState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NfsFileShareState]
    }
    
    extension [Self <: NfsFileShareState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCacheAttributes(value: Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareCacheAttributes]): Self = StObject.set(x, "cacheAttributes", value.asInstanceOf[js.Any])
      
      inline def setCacheAttributesUndefined: Self = StObject.set(x, "cacheAttributes", js.undefined)
      
      inline def setClientLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clientLists", value.asInstanceOf[js.Any])
      
      inline def setClientListsUndefined: Self = StObject.set(x, "clientLists", js.undefined)
      
      inline def setClientListsVarargs(value: Input[String]*): Self = StObject.set(x, "clientLists", js.Array(value :_*))
      
      inline def setDefaultStorageClass(value: Input[String]): Self = StObject.set(x, "defaultStorageClass", value.asInstanceOf[js.Any])
      
      inline def setDefaultStorageClassUndefined: Self = StObject.set(x, "defaultStorageClass", js.undefined)
      
      inline def setFileShareName(value: Input[String]): Self = StObject.set(x, "fileShareName", value.asInstanceOf[js.Any])
      
      inline def setFileShareNameUndefined: Self = StObject.set(x, "fileShareName", js.undefined)
      
      inline def setFileshareId(value: Input[String]): Self = StObject.set(x, "fileshareId", value.asInstanceOf[js.Any])
      
      inline def setFileshareIdUndefined: Self = StObject.set(x, "fileshareId", js.undefined)
      
      inline def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      inline def setGatewayArnUndefined: Self = StObject.set(x, "gatewayArn", js.undefined)
      
      inline def setGuessMimeTypeEnabled(value: Input[Boolean]): Self = StObject.set(x, "guessMimeTypeEnabled", value.asInstanceOf[js.Any])
      
      inline def setGuessMimeTypeEnabledUndefined: Self = StObject.set(x, "guessMimeTypeEnabled", js.undefined)
      
      inline def setKmsEncrypted(value: Input[Boolean]): Self = StObject.set(x, "kmsEncrypted", value.asInstanceOf[js.Any])
      
      inline def setKmsEncryptedUndefined: Self = StObject.set(x, "kmsEncrypted", js.undefined)
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      inline def setLocationArn(value: Input[String]): Self = StObject.set(x, "locationArn", value.asInstanceOf[js.Any])
      
      inline def setLocationArnUndefined: Self = StObject.set(x, "locationArn", js.undefined)
      
      inline def setNfsFileShareDefaults(value: Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults]): Self = StObject.set(x, "nfsFileShareDefaults", value.asInstanceOf[js.Any])
      
      inline def setNfsFileShareDefaultsUndefined: Self = StObject.set(x, "nfsFileShareDefaults", js.undefined)
      
      inline def setObjectAcl(value: Input[String]): Self = StObject.set(x, "objectAcl", value.asInstanceOf[js.Any])
      
      inline def setObjectAclUndefined: Self = StObject.set(x, "objectAcl", js.undefined)
      
      inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequesterPays(value: Input[Boolean]): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
      
      inline def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      inline def setSquash(value: Input[String]): Self = StObject.set(x, "squash", value.asInstanceOf[js.Any])
      
      inline def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
