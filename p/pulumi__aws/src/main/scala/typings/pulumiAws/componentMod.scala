package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@pulumi/aws/imagebuilder/component", "Component")
  @js.native
  class Component protected () extends CustomResource {
    /**
      * Create a Component resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ComponentArgs) = this()
    def this(name: String, args: ComponentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * (Required) Amazon Resource Name (ARN) of the component.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Change description of the component.
      */
    val changeDescription: Output_[js.UndefOr[String]] = js.native
    
    val data: Output_[String] = js.native
    
    /**
      * Date the component was created.
      */
    val dateCreated: Output_[String] = js.native
    
    /**
      * Description of the component.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Encryption status of the component.
      */
    val encrypted: Output_[Boolean] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
      */
    val kmsKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the component.
      */
    val name: Output_[String] = js.native
    
    /**
      * Owner of the component.
      */
    val owner: Output_[String] = js.native
    
    /**
      * Platform of the component.
      */
    val platform: Output_[String] = js.native
    
    /**
      * Set of Operating Systems (OS) supported by the component.
      */
    val supportedOsVersions: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Key-value map of resource tags for the component.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Type of the component.
      */
    val `type`: Output_[String] = js.native
    
    /**
      * S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
      */
    val uri: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Version of the component.
      */
    val version: Output_[String] = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("@pulumi/aws/imagebuilder/component", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Component resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Component]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Component]
    @scala.inline
    def get(name: String, id: Input[ID], state: ComponentState): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Component]
    @scala.inline
    def get(name: String, id: Input[ID], state: ComponentState, opts: CustomResourceOptions): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Component]
    
    /**
      * Returns true if the given object is an instance of Component.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/component.Component */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/imagebuilder/component.Component */ Boolean]
  }
  
  trait ComponentArgs extends StObject {
    
    /**
      * Change description of the component.
      */
    val changeDescription: js.UndefOr[Input[String]] = js.undefined
    
    val data: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the component.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the component.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Platform of the component.
      */
    val platform: Input[String]
    
    /**
      * Set of Operating Systems (OS) supported by the component.
      */
    val supportedOsVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value map of resource tags for the component.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
      */
    val uri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Version of the component.
      */
    val version: Input[String]
  }
  object ComponentArgs {
    
    @scala.inline
    def apply(platform: Input[String], version: Input[String]): ComponentArgs = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentArgs]
    }
    
    @scala.inline
    implicit class ComponentArgsMutableBuilder[Self <: ComponentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeDescription(value: Input[String]): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeDescriptionUndefined: Self = StObject.set(x, "changeDescription", js.undefined)
      
      @scala.inline
      def setData(value: Input[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlatform(value: Input[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOsVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOsVersionsUndefined: Self = StObject.set(x, "supportedOsVersions", js.undefined)
      
      @scala.inline
      def setSupportedOsVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "supportedOsVersions", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentState extends StObject {
    
    /**
      * (Required) Amazon Resource Name (ARN) of the component.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Change description of the component.
      */
    val changeDescription: js.UndefOr[Input[String]] = js.undefined
    
    val data: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Date the component was created.
      */
    val dateCreated: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the component.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Encryption status of the component.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the component.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Owner of the component.
      */
    val owner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Platform of the component.
      */
    val platform: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of Operating Systems (OS) supported by the component.
      */
    val supportedOsVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value map of resource tags for the component.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Type of the component.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
      */
    val uri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Version of the component.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object ComponentState {
    
    @scala.inline
    def apply(): ComponentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentState]
    }
    
    @scala.inline
    implicit class ComponentStateMutableBuilder[Self <: ComponentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setChangeDescription(value: Input[String]): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeDescriptionUndefined: Self = StObject.set(x, "changeDescription", js.undefined)
      
      @scala.inline
      def setData(value: Input[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDateCreated(value: Input[String]): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setPlatform(value: Input[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setSupportedOsVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOsVersionsUndefined: Self = StObject.set(x, "supportedOsVersions", js.undefined)
      
      @scala.inline
      def setSupportedOsVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "supportedOsVersions", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
