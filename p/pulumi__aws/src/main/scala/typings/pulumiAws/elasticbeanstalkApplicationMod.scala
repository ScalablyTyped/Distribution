package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticbeanstalk.ApplicationAppversionLifecycle
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticbeanstalkApplicationMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/application", "Application")
  @js.native
  class Application protected () extends CustomResource {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
    
    val appversionLifecycle: Output_[js.UndefOr[ApplicationAppversionLifecycle]] = js.native
    
    /**
      * The ARN assigned by AWS for this Elastic Beanstalk Application.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Short description of the application
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the application, must be unique within your account
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of tags for the Elastic Beanstalk Application.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Application {
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticbeanstalk/application", "Application.get")
    @js.native
    def get(name: String, id: Input[ID]): Application = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/application", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Application = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/application", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState): Application = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/application", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): Application = js.native
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticbeanstalk/application", "Application.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/application.Application */ Boolean = js.native
  }
  
  @js.native
  trait ApplicationArgs extends StObject {
    
    val appversionLifecycle: js.UndefOr[
        Input[typings.pulumiAws.inputMod.elasticbeanstalk.ApplicationAppversionLifecycle]
      ] = js.native
    
    /**
      * Short description of the application
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the application, must be unique within your account
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags for the Elastic Beanstalk Application.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ApplicationArgs {
    
    @scala.inline
    def apply(): ApplicationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationArgs]
    }
    
    @scala.inline
    implicit class ApplicationArgsMutableBuilder[Self <: ApplicationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppversionLifecycle(value: Input[typings.pulumiAws.inputMod.elasticbeanstalk.ApplicationAppversionLifecycle]): Self = StObject.set(x, "appversionLifecycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppversionLifecycleUndefined: Self = StObject.set(x, "appversionLifecycle", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ApplicationState extends StObject {
    
    val appversionLifecycle: js.UndefOr[
        Input[typings.pulumiAws.inputMod.elasticbeanstalk.ApplicationAppversionLifecycle]
      ] = js.native
    
    /**
      * The ARN assigned by AWS for this Elastic Beanstalk Application.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Short description of the application
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the application, must be unique within your account
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags for the Elastic Beanstalk Application.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ApplicationState {
    
    @scala.inline
    def apply(): ApplicationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationState]
    }
    
    @scala.inline
    implicit class ApplicationStateMutableBuilder[Self <: ApplicationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppversionLifecycle(value: Input[typings.pulumiAws.inputMod.elasticbeanstalk.ApplicationAppversionLifecycle]): Self = StObject.set(x, "appversionLifecycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppversionLifecycleUndefined: Self = StObject.set(x, "appversionLifecycle", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
