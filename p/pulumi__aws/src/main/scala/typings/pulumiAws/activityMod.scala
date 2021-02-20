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

object activityMod {
  
  @JSImport("@pulumi/aws/sfn/activity", "Activity")
  @js.native
  class Activity protected () extends CustomResource {
    /**
      * Create a Activity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ActivityArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ActivityArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The date the activity was created.
      */
    val creationDate: Output_[String] = js.native
    
    /**
      * The name of the activity to create.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Activity {
    
    /**
      * Get an existing Activity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sfn/activity", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID]): Activity = js.native
    @JSImport("@pulumi/aws/sfn/activity", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Activity = js.native
    @JSImport("@pulumi/aws/sfn/activity", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivityState): Activity = js.native
    @JSImport("@pulumi/aws/sfn/activity", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivityState, opts: CustomResourceOptions): Activity = js.native
    
    /**
      * Returns true if the given object is an instance of Activity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sfn/activity", "Activity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/activity.Activity */ Boolean = js.native
  }
  
  @js.native
  trait ActivityArgs extends StObject {
    
    /**
      * The name of the activity to create.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ActivityArgs {
    
    @scala.inline
    def apply(): ActivityArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityArgs]
    }
    
    @scala.inline
    implicit class ActivityArgsMutableBuilder[Self <: ActivityArgs] (val x: Self) extends AnyVal {
      
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
  trait ActivityState extends StObject {
    
    /**
      * The date the activity was created.
      */
    val creationDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the activity to create.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ActivityState {
    
    @scala.inline
    def apply(): ActivityState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityState]
    }
    
    @scala.inline
    implicit class ActivityStateMutableBuilder[Self <: ActivityState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: Input[String]): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
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
