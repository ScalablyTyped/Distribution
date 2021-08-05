package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ec2/tag", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Tag resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Tag]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Tag]
    inline def get(name: String, id: Input[ID], state: TagState): Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Tag]
    inline def get(name: String, id: Input[ID], state: TagState, opts: CustomResourceOptions): Tag = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Tag]
    
    /**
      * Returns true if the given object is an instance of Tag.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/tag.Tag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/tag.Tag */ Boolean]
  }
  
  trait TagArgs extends StObject {
    
    /**
      * The tag name.
      */
    val key: Input[String]
    
    /**
      * The ID of the EC2 resource to manage the tag for.
      */
    val resourceId: Input[String]
    
    /**
      * The value of the tag.
      */
    val value: Input[String]
  }
  object TagArgs {
    
    inline def apply(key: Input[String], resourceId: Input[String], value: Input[String]): TagArgs = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagArgs]
    }
    
    extension [Self <: TagArgs](x: Self) {
      
      inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagState extends StObject {
    
    /**
      * The tag name.
      */
    val key: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the EC2 resource to manage the tag for.
      */
    val resourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The value of the tag.
      */
    val value: js.UndefOr[Input[String]] = js.undefined
  }
  object TagState {
    
    inline def apply(): TagState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagState]
    }
    
    extension [Self <: TagState](x: Self) {
      
      inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
