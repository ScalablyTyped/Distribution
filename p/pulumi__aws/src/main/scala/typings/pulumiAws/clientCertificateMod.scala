package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientCertificateMod {
  
  @JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate")
  @js.native
  class ClientCertificate protected () extends CustomResource {
    /**
      * Create a ClientCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClientCertificateArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClientCertificateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The date when the client certificate was created.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The description of the client certificate.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The date when the client certificate will expire.
      */
    val expirationDate: Output_[String] = js.native
    
    /**
      * The PEM-encoded public key of the client certificate.
      */
    val pemEncodedCertificate: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ClientCertificate {
    
    /**
      * Get an existing ClientCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate.get")
    @js.native
    def get(name: String, id: Input[ID]): ClientCertificate = js.native
    @JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClientCertificate = js.native
    @JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClientCertificateState): ClientCertificate = js.native
    @JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClientCertificateState, opts: CustomResourceOptions): ClientCertificate = js.native
    
    /**
      * Returns true if the given object is an instance of ClientCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/clientCertificate.ClientCertificate */ Boolean = js.native
  }
  
  @js.native
  trait ClientCertificateArgs extends StObject {
    
    /**
      * The description of the client certificate.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ClientCertificateArgs {
    
    @scala.inline
    def apply(): ClientCertificateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientCertificateArgs]
    }
    
    @scala.inline
    implicit class ClientCertificateArgsMutableBuilder[Self <: ClientCertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ClientCertificateState extends StObject {
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The date when the client certificate was created.
      */
    val createdDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the client certificate.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The date when the client certificate will expire.
      */
    val expirationDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The PEM-encoded public key of the client certificate.
      */
    val pemEncodedCertificate: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ClientCertificateState {
    
    @scala.inline
    def apply(): ClientCertificateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientCertificateState]
    }
    
    @scala.inline
    implicit class ClientCertificateStateMutableBuilder[Self <: ClientCertificateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: Input[String]): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setPemEncodedCertificate(value: Input[String]): Self = StObject.set(x, "pemEncodedCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPemEncodedCertificateUndefined: Self = StObject.set(x, "pemEncodedCertificate", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
