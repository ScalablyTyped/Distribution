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
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID]): NfsFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NfsFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState): NfsFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): NfsFileShare = js.native
    
    /**
      * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway/nfsFileShare", "NfsFileShare.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = js.native
  }
  
  @js.native
  trait NfsFileShareArgs extends StObject {
    
    /**
      * Refresh cache information. see Cache Attributes for more details.
      */
    val cacheAttributes: js.UndefOr[Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareCacheAttributes]] = js.native
    
    /**
      * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
      */
    val clientLists: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
      */
    val defaultStorageClass: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the file share. Must be set if an S3 prefix name is set in `locationArn`.
      */
    val fileShareName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the file gateway.
      */
    val gatewayArn: Input[String] = js.native
    
    /**
      * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
      */
    val guessMimeTypeEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
      */
    val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the backed storage used for storing file data.
      */
    val locationArn: Input[String] = js.native
    
    /**
      * Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
      */
    val nfsFileShareDefaults: js.UndefOr[
        Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults]
      ] = js.native
    
    /**
      * Access Control List permission for S3 bucket objects. Defaults to `private`.
      */
    val objectAcl: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
      */
    val readOnly: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
      */
    val requesterPays: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
      */
    val roleArn: Input[String] = js.native
    
    /**
      * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
      */
    val squash: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object NfsFileShareArgs {
    
    @scala.inline
    def apply(
      clientLists: Input[js.Array[Input[String]]],
      gatewayArn: Input[String],
      locationArn: Input[String],
      roleArn: Input[String]
    ): NfsFileShareArgs = {
      val __obj = js.Dynamic.literal(clientLists = clientLists.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], locationArn = locationArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NfsFileShareArgs]
    }
    
    @scala.inline
    implicit class NfsFileShareArgsMutableBuilder[Self <: NfsFileShareArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheAttributes(value: Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareCacheAttributes]): Self = StObject.set(x, "cacheAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheAttributesUndefined: Self = StObject.set(x, "cacheAttributes", js.undefined)
      
      @scala.inline
      def setClientLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clientLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientListsVarargs(value: Input[String]*): Self = StObject.set(x, "clientLists", js.Array(value :_*))
      
      @scala.inline
      def setDefaultStorageClass(value: Input[String]): Self = StObject.set(x, "defaultStorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStorageClassUndefined: Self = StObject.set(x, "defaultStorageClass", js.undefined)
      
      @scala.inline
      def setFileShareName(value: Input[String]): Self = StObject.set(x, "fileShareName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileShareNameUndefined: Self = StObject.set(x, "fileShareName", js.undefined)
      
      @scala.inline
      def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuessMimeTypeEnabled(value: Input[Boolean]): Self = StObject.set(x, "guessMimeTypeEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuessMimeTypeEnabledUndefined: Self = StObject.set(x, "guessMimeTypeEnabled", js.undefined)
      
      @scala.inline
      def setKmsEncrypted(value: Input[Boolean]): Self = StObject.set(x, "kmsEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsEncryptedUndefined: Self = StObject.set(x, "kmsEncrypted", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setLocationArn(value: Input[String]): Self = StObject.set(x, "locationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNfsFileShareDefaults(value: Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults]): Self = StObject.set(x, "nfsFileShareDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNfsFileShareDefaultsUndefined: Self = StObject.set(x, "nfsFileShareDefaults", js.undefined)
      
      @scala.inline
      def setObjectAcl(value: Input[String]): Self = StObject.set(x, "objectAcl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectAclUndefined: Self = StObject.set(x, "objectAcl", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRequesterPays(value: Input[Boolean]): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquash(value: Input[String]): Self = StObject.set(x, "squash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait NfsFileShareState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the NFS File Share.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Refresh cache information. see Cache Attributes for more details.
      */
    val cacheAttributes: js.UndefOr[Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareCacheAttributes]] = js.native
    
    /**
      * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `["0.0.0.0/0"]` to not limit access. Minimum 1 item. Maximum 100 items.
      */
    val clientLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
      */
    val defaultStorageClass: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the file share. Must be set if an S3 prefix name is set in `locationArn`.
      */
    val fileShareName: js.UndefOr[Input[String]] = js.native
    
    /**
      * ID of the NFS File Share.
      */
    val fileshareId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the file gateway.
      */
    val gatewayArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
      */
    val guessMimeTypeEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
      */
    val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the backed storage used for storing file data.
      */
    val locationArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
      */
    val nfsFileShareDefaults: js.UndefOr[
        Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults]
      ] = js.native
    
    /**
      * Access Control List permission for S3 bucket objects. Defaults to `private`.
      */
    val objectAcl: js.UndefOr[Input[String]] = js.native
    
    /**
      * File share path used by the NFS client to identify the mount point.
      */
    val path: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
      */
    val readOnly: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
      */
    val requesterPays: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
      */
    val squash: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object NfsFileShareState {
    
    @scala.inline
    def apply(): NfsFileShareState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NfsFileShareState]
    }
    
    @scala.inline
    implicit class NfsFileShareStateMutableBuilder[Self <: NfsFileShareState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCacheAttributes(value: Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareCacheAttributes]): Self = StObject.set(x, "cacheAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheAttributesUndefined: Self = StObject.set(x, "cacheAttributes", js.undefined)
      
      @scala.inline
      def setClientLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clientLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientListsUndefined: Self = StObject.set(x, "clientLists", js.undefined)
      
      @scala.inline
      def setClientListsVarargs(value: Input[String]*): Self = StObject.set(x, "clientLists", js.Array(value :_*))
      
      @scala.inline
      def setDefaultStorageClass(value: Input[String]): Self = StObject.set(x, "defaultStorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStorageClassUndefined: Self = StObject.set(x, "defaultStorageClass", js.undefined)
      
      @scala.inline
      def setFileShareName(value: Input[String]): Self = StObject.set(x, "fileShareName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileShareNameUndefined: Self = StObject.set(x, "fileShareName", js.undefined)
      
      @scala.inline
      def setFileshareId(value: Input[String]): Self = StObject.set(x, "fileshareId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileshareIdUndefined: Self = StObject.set(x, "fileshareId", js.undefined)
      
      @scala.inline
      def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayArnUndefined: Self = StObject.set(x, "gatewayArn", js.undefined)
      
      @scala.inline
      def setGuessMimeTypeEnabled(value: Input[Boolean]): Self = StObject.set(x, "guessMimeTypeEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuessMimeTypeEnabledUndefined: Self = StObject.set(x, "guessMimeTypeEnabled", js.undefined)
      
      @scala.inline
      def setKmsEncrypted(value: Input[Boolean]): Self = StObject.set(x, "kmsEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsEncryptedUndefined: Self = StObject.set(x, "kmsEncrypted", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setLocationArn(value: Input[String]): Self = StObject.set(x, "locationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationArnUndefined: Self = StObject.set(x, "locationArn", js.undefined)
      
      @scala.inline
      def setNfsFileShareDefaults(value: Input[typings.pulumiAws.inputMod.storagegateway.NfsFileShareNfsFileShareDefaults]): Self = StObject.set(x, "nfsFileShareDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNfsFileShareDefaultsUndefined: Self = StObject.set(x, "nfsFileShareDefaults", js.undefined)
      
      @scala.inline
      def setObjectAcl(value: Input[String]): Self = StObject.set(x, "objectAcl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectAclUndefined: Self = StObject.set(x, "objectAcl", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRequesterPays(value: Input[Boolean]): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setSquash(value: Input[String]): Self = StObject.set(x, "squash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
