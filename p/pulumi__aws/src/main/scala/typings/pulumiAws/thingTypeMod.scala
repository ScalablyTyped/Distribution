package typings.pulumiAws

import typings.pulumiAws.outputMod.iot.ThingTypeProperties
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thingTypeMod {
  
  @JSImport("@pulumi/aws/iot/thingType", "ThingType")
  @js.native
  class ThingType protected () extends CustomResource {
    /**
      * Create a ThingType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingTypeArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ThingTypeArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the created AWS IoT Thing Type.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Whether the thing type is deprecated. If true, no new things could be associated with this type.
      */
    val deprecated: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The name of the thing type.
      */
    val name: Output_[String] = js.native
    
    /**
      * , Configuration block that can contain the following properties of the thing type:
      */
    val properties: Output_[js.UndefOr[ThingTypeProperties]] = js.native
  }
  /* static members */
  object ThingType {
    
    @JSImport("@pulumi/aws/iot/thingType", "ThingType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ThingType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ThingType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ThingType]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ThingType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThingType]
    @scala.inline
    def get(name: String, id: Input[ID], state: ThingTypeState): ThingType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ThingType]
    @scala.inline
    def get(name: String, id: Input[ID], state: ThingTypeState, opts: CustomResourceOptions): ThingType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThingType]
    
    /**
      * Returns true if the given object is an instance of ThingType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ Boolean]
  }
  
  trait ThingTypeArgs extends StObject {
    
    /**
      * Whether the thing type is deprecated. If true, no new things could be associated with this type.
      */
    val deprecated: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the thing type.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * , Configuration block that can contain the following properties of the thing type:
      */
    val properties: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.ThingTypeProperties]] = js.undefined
  }
  object ThingTypeArgs {
    
    @scala.inline
    def apply(): ThingTypeArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingTypeArgs]
    }
    
    @scala.inline
    implicit class ThingTypeArgsMutableBuilder[Self <: ThingTypeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecated(value: Input[Boolean]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: Input[typings.pulumiAws.inputMod.iot.ThingTypeProperties]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
  
  trait ThingTypeState extends StObject {
    
    /**
      * The ARN of the created AWS IoT Thing Type.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the thing type is deprecated. If true, no new things could be associated with this type.
      */
    val deprecated: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the thing type.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * , Configuration block that can contain the following properties of the thing type:
      */
    val properties: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.ThingTypeProperties]] = js.undefined
  }
  object ThingTypeState {
    
    @scala.inline
    def apply(): ThingTypeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingTypeState]
    }
    
    @scala.inline
    implicit class ThingTypeStateMutableBuilder[Self <: ThingTypeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDeprecated(value: Input[Boolean]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: Input[typings.pulumiAws.inputMod.iot.ThingTypeProperties]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
}
