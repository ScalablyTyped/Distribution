package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("@pulumi/aws/ses/template", "Template")
  @js.native
  class Template protected () extends CustomResource {
    /**
      * Create a Template resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TemplateArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TemplateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
      */
    val html: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
      */
    val name: Output_[String] = js.native
    
    /**
      * The subject line of the email.
      */
    val subject: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
      */
    val text: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Template {
    
    @JSImport("@pulumi/aws/ses/template", "Template")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Template resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Template]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Template]
    inline def get(name: String, id: Input[ID], state: TemplateState): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Template]
    inline def get(name: String, id: Input[ID], state: TemplateState, opts: CustomResourceOptions): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Template]
    
    /**
      * Returns true if the given object is an instance of Template.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean]
  }
  
  trait TemplateArgs extends StObject {
    
    /**
      * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
      */
    val html: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The subject line of the email.
      */
    val subject: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
      */
    val text: js.UndefOr[Input[String]] = js.undefined
  }
  object TemplateArgs {
    
    inline def apply(): TemplateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateArgs]
    }
    
    extension [Self <: TemplateArgs](x: Self) {
      
      inline def setHtml(value: Input[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubject(value: Input[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setText(value: Input[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait TemplateState extends StObject {
    
    /**
      * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
      */
    val html: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The subject line of the email.
      */
    val subject: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
      */
    val text: js.UndefOr[Input[String]] = js.undefined
  }
  object TemplateState {
    
    inline def apply(): TemplateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateState]
    }
    
    extension [Self <: TemplateState](x: Self) {
      
      inline def setHtml(value: Input[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubject(value: Input[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setText(value: Input[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
