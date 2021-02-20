package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("@pulumi/aws/ec2/tag", "Tag")
  @js.native
  class Tag protected () extends CustomResource {
    /**
      * Create a Tag resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TagArgs) = this()
    def this(name: String, args: TagArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The tag name.
      */
    val key: Output_[String] = js.native
    
    /**
      * The ID of the EC2 resource to manage the tag for.
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * The value of the tag.
      */
    val value: Output_[String] = js.native
  }
  /* static members */
  object Tag {
    
    /**
      * Get an existing Tag resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/tag", "Tag.get")
    @js.native
    def get(name: String, id: Input[ID]): Tag = js.native
    @JSImport("@pulumi/aws/ec2/tag", "Tag.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Tag = js.native
    @JSImport("@pulumi/aws/ec2/tag", "Tag.get")
    @js.native
    def get(name: String, id: Input[ID], state: TagState): Tag = js.native
    @JSImport("@pulumi/aws/ec2/tag", "Tag.get")
    @js.native
    def get(name: String, id: Input[ID], state: TagState, opts: CustomResourceOptions): Tag = js.native
    
    /**
      * Returns true if the given object is an instance of Tag.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/tag", "Tag.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/tag.Tag */ Boolean = js.native
  }
  
  @js.native
  trait TagArgs extends StObject {
    
    /**
      * The tag name.
      */
    val key: Input[String] = js.native
    
    /**
      * The ID of the EC2 resource to manage the tag for.
      */
    val resourceId: Input[String] = js.native
    
    /**
      * The value of the tag.
      */
    val value: Input[String] = js.native
  }
  object TagArgs {
    
    @scala.inline
    def apply(key: Input[String], resourceId: Input[String], value: Input[String]): TagArgs = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagArgs]
    }
    
    @scala.inline
    implicit class TagArgsMutableBuilder[Self <: TagArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagState extends StObject {
    
    /**
      * The tag name.
      */
    val key: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the EC2 resource to manage the tag for.
      */
    val resourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The value of the tag.
      */
    val value: js.UndefOr[Input[String]] = js.native
  }
  object TagState {
    
    @scala.inline
    def apply(): TagState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagState]
    }
    
    @scala.inline
    implicit class TagStateMutableBuilder[Self <: TagState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
