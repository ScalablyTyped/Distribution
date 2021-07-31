package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ssm.DocumentAttachmentsSource
import typings.pulumiAws.outputMod.ssm.DocumentParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("@pulumi/aws/ssm/document", "Document")
  @js.native
  class Document protected () extends CustomResource {
    /**
      * Create a Document resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DocumentArgs) = this()
    def this(name: String, args: DocumentArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    /**
      * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
      */
    val attachmentsSources: Output_[js.UndefOr[js.Array[DocumentAttachmentsSource]]] = js.native
    
    /**
      * The JSON or YAML content of the document.
      */
    val content: Output_[String] = js.native
    
    /**
      * The date the document was created.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The default version of the document.
      */
    val defaultVersion: Output_[String] = js.native
    
    /**
      * The description of the document.
      */
    val description: Output_[String] = js.native
    
    /**
      * The format of the document. Valid document types include: `JSON` and `YAML`
      */
    val documentFormat: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
      */
    val documentType: Output_[String] = js.native
    
    /**
      * The document version.
      */
    val documentVersion: Output_[String] = js.native
    
    /**
      * The sha1 or sha256 of the document content
      */
    val hash: Output_[String] = js.native
    
    /**
      * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
      */
    val hashType: Output_[String] = js.native
    
    /**
      * The latest version of the document.
      */
    val latestVersion: Output_[String] = js.native
    
    /**
      * The name of the document.
      */
    val name: Output_[String] = js.native
    
    /**
      * The AWS user account of the person who created the document.
      */
    val owner: Output_[String] = js.native
    
    /**
      * The parameters that are available to this document.
      */
    val parameters: Output_[js.Array[DocumentParameter]] = js.native
    
    /**
      * Additional Permissions to attach to the document. See Permissions below for details.
      */
    val permissions: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
      */
    val platformTypes: Output_[js.Array[String]] = js.native
    
    /**
      * The schema version of the document.
      */
    val schemaVersion: Output_[String] = js.native
    
    /**
      * "Creating", "Active" or "Deleting". The current status of the document.
      */
    val status: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
      */
    val targetType: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Document {
    
    @JSImport("@pulumi/aws/ssm/document", "Document")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Document resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Document]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Document]
    @scala.inline
    def get(name: String, id: Input[ID], state: DocumentState): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Document]
    @scala.inline
    def get(name: String, id: Input[ID], state: DocumentState, opts: CustomResourceOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Document]
    
    /**
      * Returns true if the given object is an instance of Document.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean]
  }
  
  trait DocumentArgs extends StObject {
    
    /**
      * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
      */
    val attachmentsSources: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.DocumentAttachmentsSource]]]] = js.undefined
    
    /**
      * The JSON or YAML content of the document.
      */
    val content: Input[String]
    
    /**
      * The format of the document. Valid document types include: `JSON` and `YAML`
      */
    val documentFormat: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
      */
    val documentType: Input[String]
    
    /**
      * The name of the document.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Additional Permissions to attach to the document. See Permissions below for details.
      */
    val permissions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
      */
    val targetType: js.UndefOr[Input[String]] = js.undefined
  }
  object DocumentArgs {
    
    @scala.inline
    def apply(content: Input[String], documentType: Input[String]): DocumentArgs = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentArgs]
    }
    
    @scala.inline
    implicit class DocumentArgsMutableBuilder[Self <: DocumentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachmentsSources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.DocumentAttachmentsSource]]]): Self = StObject.set(x, "attachmentsSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsSourcesUndefined: Self = StObject.set(x, "attachmentsSources", js.undefined)
      
      @scala.inline
      def setAttachmentsSourcesVarargs(value: Input[typings.pulumiAws.inputMod.ssm.DocumentAttachmentsSource]*): Self = StObject.set(x, "attachmentsSources", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: Input[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentFormat(value: Input[String]): Self = StObject.set(x, "documentFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentFormatUndefined: Self = StObject.set(x, "documentFormat", js.undefined)
      
      @scala.inline
      def setDocumentType(value: Input[String]): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPermissions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetType(value: Input[String]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    }
  }
  
  trait DocumentState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
      */
    val attachmentsSources: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.DocumentAttachmentsSource]]]] = js.undefined
    
    /**
      * The JSON or YAML content of the document.
      */
    val content: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The date the document was created.
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The default version of the document.
      */
    val defaultVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the document.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The format of the document. Valid document types include: `JSON` and `YAML`
      */
    val documentFormat: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
      */
    val documentType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The document version.
      */
    val documentVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The sha1 or sha256 of the document content
      */
    val hash: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
      */
    val hashType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The latest version of the document.
      */
    val latestVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the document.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS user account of the person who created the document.
      */
    val owner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The parameters that are available to this document.
      */
    val parameters: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.DocumentParameter]]]] = js.undefined
    
    /**
      * Additional Permissions to attach to the document. See Permissions below for details.
      */
    val permissions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
      */
    val platformTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The schema version of the document.
      */
    val schemaVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * "Creating", "Active" or "Deleting". The current status of the document.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
      */
    val targetType: js.UndefOr[Input[String]] = js.undefined
  }
  object DocumentState {
    
    @scala.inline
    def apply(): DocumentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentState]
    }
    
    @scala.inline
    implicit class DocumentStateMutableBuilder[Self <: DocumentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAttachmentsSources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.DocumentAttachmentsSource]]]): Self = StObject.set(x, "attachmentsSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsSourcesUndefined: Self = StObject.set(x, "attachmentsSources", js.undefined)
      
      @scala.inline
      def setAttachmentsSourcesVarargs(value: Input[typings.pulumiAws.inputMod.ssm.DocumentAttachmentsSource]*): Self = StObject.set(x, "attachmentsSources", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: Input[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      @scala.inline
      def setDefaultVersion(value: Input[String]): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDocumentFormat(value: Input[String]): Self = StObject.set(x, "documentFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentFormatUndefined: Self = StObject.set(x, "documentFormat", js.undefined)
      
      @scala.inline
      def setDocumentType(value: Input[String]): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentTypeUndefined: Self = StObject.set(x, "documentType", js.undefined)
      
      @scala.inline
      def setDocumentVersion(value: Input[String]): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
      
      @scala.inline
      def setHash(value: Input[String]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashType(value: Input[String]): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setLatestVersion(value: Input[String]): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestVersionUndefined: Self = StObject.set(x, "latestVersion", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.DocumentParameter]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.ssm.DocumentParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setPermissions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setPlatformTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
      
      @scala.inline
      def setPlatformTypesVarargs(value: Input[String]*): Self = StObject.set(x, "platformTypes", js.Array(value :_*))
      
      @scala.inline
      def setSchemaVersion(value: Input[String]): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetType(value: Input[String]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    }
  }
}
