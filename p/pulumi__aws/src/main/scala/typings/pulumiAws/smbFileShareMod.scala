package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.storagegateway.SmbFileShareCacheAttributes
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smbFileShareMod {
  
  @JSImport("@pulumi/aws/storagegateway/smbFileShare", "SmbFileShare")
  @js.native
  class SmbFileShare protected () extends CustomResource {
    /**
      * Create a SmbFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SmbFileShareArgs) = this()
    def this(name: String, args: SmbFileShareArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of users in the Active Directory that have admin access to the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val adminUserLists: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the SMB File Share.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch Log Group used for the audit logs.
      */
    val auditDestinationArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The authentication method that users use to access the file share. Defaults to `ActiveDirectory`. Valid values: `ActiveDirectory`, `GuestAccess`.
      */
    val authentication: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Refresh cache information. see Cache Attributes for more details.
      */
    val cacheAttributes: Output_[js.UndefOr[SmbFileShareCacheAttributes]] = js.native
    
    /**
      * The case of an object name in an Amazon S3 bucket. For `ClientSpecified`, the client determines the case sensitivity. For `CaseSensitive`, the gateway determines the case sensitivity. The default value is `ClientSpecified`.
      */
    val caseSensitivity: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
      */
    val defaultStorageClass: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the file share. Must be set if an S3 prefix name is set in `locationArn`.
      */
    val fileShareName: Output_[String] = js.native
    
    /**
      * ID of the SMB File Share.
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
      * A list of users in the Active Directory that are not allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val invalidUserLists: Output_[js.UndefOr[js.Array[String]]] = js.native
    
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
      * Set this value to `true` to enable ACL (access control list) on the SMB fileshare. Set it to `false` to map file and directory permissions to the POSIX permissions. This setting applies only to `ActiveDirectory` authentication type.
      */
    val smbAclEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A list of users in the Active Directory that are allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val validUserLists: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object SmbFileShare {
    
    @JSImport("@pulumi/aws/storagegateway/smbFileShare", "SmbFileShare")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): SmbFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SmbFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SmbFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SmbFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: SmbFileShareState): SmbFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SmbFileShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): SmbFileShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SmbFileShare]
    
    /**
      * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean]
  }
  
  trait SmbFileShareArgs extends StObject {
    
    /**
      * A list of users in the Active Directory that have admin access to the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val adminUserLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch Log Group used for the audit logs.
      */
    val auditDestinationArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The authentication method that users use to access the file share. Defaults to `ActiveDirectory`. Valid values: `ActiveDirectory`, `GuestAccess`.
      */
    val authentication: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Refresh cache information. see Cache Attributes for more details.
      */
    val cacheAttributes: js.UndefOr[Input[typings.pulumiAws.inputMod.storagegateway.SmbFileShareCacheAttributes]] = js.undefined
    
    /**
      * The case of an object name in an Amazon S3 bucket. For `ClientSpecified`, the client determines the case sensitivity. For `CaseSensitive`, the gateway determines the case sensitivity. The default value is `ClientSpecified`.
      */
    val caseSensitivity: js.UndefOr[Input[String]] = js.undefined
    
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
      * A list of users in the Active Directory that are not allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val invalidUserLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
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
      * Set this value to `true` to enable ACL (access control list) on the SMB fileshare. Set it to `false` to map file and directory permissions to the POSIX permissions. This setting applies only to `ActiveDirectory` authentication type.
      */
    val smbAclEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of users in the Active Directory that are allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val validUserLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object SmbFileShareArgs {
    
    @scala.inline
    def apply(gatewayArn: Input[String], locationArn: Input[String], roleArn: Input[String]): SmbFileShareArgs = {
      val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any], locationArn = locationArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmbFileShareArgs]
    }
    
    @scala.inline
    implicit class SmbFileShareArgsMutableBuilder[Self <: SmbFileShareArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminUserLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "adminUserLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminUserListsUndefined: Self = StObject.set(x, "adminUserLists", js.undefined)
      
      @scala.inline
      def setAdminUserListsVarargs(value: Input[String]*): Self = StObject.set(x, "adminUserLists", js.Array(value :_*))
      
      @scala.inline
      def setAuditDestinationArn(value: Input[String]): Self = StObject.set(x, "auditDestinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuditDestinationArnUndefined: Self = StObject.set(x, "auditDestinationArn", js.undefined)
      
      @scala.inline
      def setAuthentication(value: Input[String]): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      @scala.inline
      def setCacheAttributes(value: Input[typings.pulumiAws.inputMod.storagegateway.SmbFileShareCacheAttributes]): Self = StObject.set(x, "cacheAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheAttributesUndefined: Self = StObject.set(x, "cacheAttributes", js.undefined)
      
      @scala.inline
      def setCaseSensitivity(value: Input[String]): Self = StObject.set(x, "caseSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitivityUndefined: Self = StObject.set(x, "caseSensitivity", js.undefined)
      
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
      def setInvalidUserLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "invalidUserLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUserListsUndefined: Self = StObject.set(x, "invalidUserLists", js.undefined)
      
      @scala.inline
      def setInvalidUserListsVarargs(value: Input[String]*): Self = StObject.set(x, "invalidUserLists", js.Array(value :_*))
      
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
      def setSmbAclEnabled(value: Input[Boolean]): Self = StObject.set(x, "smbAclEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmbAclEnabledUndefined: Self = StObject.set(x, "smbAclEnabled", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setValidUserLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "validUserLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUserListsUndefined: Self = StObject.set(x, "validUserLists", js.undefined)
      
      @scala.inline
      def setValidUserListsVarargs(value: Input[String]*): Self = StObject.set(x, "validUserLists", js.Array(value :_*))
    }
  }
  
  trait SmbFileShareState extends StObject {
    
    /**
      * A list of users in the Active Directory that have admin access to the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val adminUserLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the SMB File Share.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch Log Group used for the audit logs.
      */
    val auditDestinationArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The authentication method that users use to access the file share. Defaults to `ActiveDirectory`. Valid values: `ActiveDirectory`, `GuestAccess`.
      */
    val authentication: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Refresh cache information. see Cache Attributes for more details.
      */
    val cacheAttributes: js.UndefOr[Input[typings.pulumiAws.inputMod.storagegateway.SmbFileShareCacheAttributes]] = js.undefined
    
    /**
      * The case of an object name in an Amazon S3 bucket. For `ClientSpecified`, the client determines the case sensitivity. For `CaseSensitive`, the gateway determines the case sensitivity. The default value is `ClientSpecified`.
      */
    val caseSensitivity: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
      */
    val defaultStorageClass: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the file share. Must be set if an S3 prefix name is set in `locationArn`.
      */
    val fileShareName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the SMB File Share.
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
      * A list of users in the Active Directory that are not allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val invalidUserLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
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
      * Set this value to `true` to enable ACL (access control list) on the SMB fileshare. Set it to `false` to map file and directory permissions to the POSIX permissions. This setting applies only to `ActiveDirectory` authentication type.
      */
    val smbAclEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of users in the Active Directory that are allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
      */
    val validUserLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object SmbFileShareState {
    
    @scala.inline
    def apply(): SmbFileShareState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmbFileShareState]
    }
    
    @scala.inline
    implicit class SmbFileShareStateMutableBuilder[Self <: SmbFileShareState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminUserLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "adminUserLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminUserListsUndefined: Self = StObject.set(x, "adminUserLists", js.undefined)
      
      @scala.inline
      def setAdminUserListsVarargs(value: Input[String]*): Self = StObject.set(x, "adminUserLists", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAuditDestinationArn(value: Input[String]): Self = StObject.set(x, "auditDestinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuditDestinationArnUndefined: Self = StObject.set(x, "auditDestinationArn", js.undefined)
      
      @scala.inline
      def setAuthentication(value: Input[String]): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      @scala.inline
      def setCacheAttributes(value: Input[typings.pulumiAws.inputMod.storagegateway.SmbFileShareCacheAttributes]): Self = StObject.set(x, "cacheAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheAttributesUndefined: Self = StObject.set(x, "cacheAttributes", js.undefined)
      
      @scala.inline
      def setCaseSensitivity(value: Input[String]): Self = StObject.set(x, "caseSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitivityUndefined: Self = StObject.set(x, "caseSensitivity", js.undefined)
      
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
      def setInvalidUserLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "invalidUserLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUserListsUndefined: Self = StObject.set(x, "invalidUserLists", js.undefined)
      
      @scala.inline
      def setInvalidUserListsVarargs(value: Input[String]*): Self = StObject.set(x, "invalidUserLists", js.Array(value :_*))
      
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
      def setSmbAclEnabled(value: Input[Boolean]): Self = StObject.set(x, "smbAclEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmbAclEnabledUndefined: Self = StObject.set(x, "smbAclEnabled", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setValidUserLists(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "validUserLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUserListsUndefined: Self = StObject.set(x, "validUserLists", js.undefined)
      
      @scala.inline
      def setValidUserListsVarargs(value: Input[String]*): Self = StObject.set(x, "validUserLists", js.Array(value :_*))
    }
  }
}
