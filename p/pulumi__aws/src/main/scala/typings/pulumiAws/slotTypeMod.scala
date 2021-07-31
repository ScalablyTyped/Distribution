package typings.pulumiAws

import typings.pulumiAws.outputMod.lex.SlotTypeEnumerationValue
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotTypeMod {
  
  @JSImport("@pulumi/aws/lex/slotType", "SlotType")
  @js.native
  class SlotType protected () extends CustomResource {
    /**
      * Create a SlotType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SlotTypeArgs) = this()
    def this(name: String, args: SlotTypeArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Checksum identifying the version of the slot type that was created. The checksum is
      * not included as an argument because the resource will add it automatically when updating the slot type.
      */
    val checksum: Output_[String] = js.native
    
    /**
      * Determines if a new slot type version is created when the initial resource is created and on each
      * update. Defaults to `false`.
      */
    val createVersion: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The date when the slot type version was created.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * A description of the slot type. Must be less than or equal to 200 characters in length.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of EnumerationValue objects that defines the values that
      * the slot type can take. Each value can have a list of synonyms, which are additional values that help
      * train the machine learning model about the values that it resolves for a slot. Attributes are
      * documented under enumeration_value.
      */
    val enumerationValues: Output_[js.Array[SlotTypeEnumerationValue]] = js.native
    
    /**
      * The date when the `$LATEST` version of this slot type was updated.
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * The name of the slot type. The name is not case sensitive. Must be less than or equal to 100 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * Determines the slot resolution strategy that Amazon Lex
      * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
      * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
      * if there is a resolution list for the slot, otherwise null is returned. Defaults to `ORIGINAL_VALUE`.
      */
    val valueSelectionStrategy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The version of the slot type.
      */
    val version: Output_[String] = js.native
  }
  /* static members */
  object SlotType {
    
    @JSImport("@pulumi/aws/lex/slotType", "SlotType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SlotType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): SlotType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SlotType]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SlotType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SlotType]
    @scala.inline
    def get(name: String, id: Input[ID], state: SlotTypeState): SlotType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SlotType]
    @scala.inline
    def get(name: String, id: Input[ID], state: SlotTypeState, opts: CustomResourceOptions): SlotType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SlotType]
    
    /**
      * Returns true if the given object is an instance of SlotType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/slotType.SlotType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lex/slotType.SlotType */ Boolean]
  }
  
  trait SlotTypeArgs extends StObject {
    
    /**
      * Determines if a new slot type version is created when the initial resource is created and on each
      * update. Defaults to `false`.
      */
    val createVersion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A description of the slot type. Must be less than or equal to 200 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of EnumerationValue objects that defines the values that
      * the slot type can take. Each value can have a list of synonyms, which are additional values that help
      * train the machine learning model about the values that it resolves for a slot. Attributes are
      * documented under enumeration_value.
      */
    val enumerationValues: Input[js.Array[Input[typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue]]]
    
    /**
      * The name of the slot type. The name is not case sensitive. Must be less than or equal to 100 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Determines the slot resolution strategy that Amazon Lex
      * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
      * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
      * if there is a resolution list for the slot, otherwise null is returned. Defaults to `ORIGINAL_VALUE`.
      */
    val valueSelectionStrategy: js.UndefOr[Input[String]] = js.undefined
  }
  object SlotTypeArgs {
    
    @scala.inline
    def apply(enumerationValues: Input[js.Array[Input[typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue]]]): SlotTypeArgs = {
      val __obj = js.Dynamic.literal(enumerationValues = enumerationValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlotTypeArgs]
    }
    
    @scala.inline
    implicit class SlotTypeArgsMutableBuilder[Self <: SlotTypeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateVersion(value: Input[Boolean]): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnumerationValues(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue]]]): Self = StObject.set(x, "enumerationValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerationValuesVarargs(value: Input[typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue]*): Self = StObject.set(x, "enumerationValues", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValueSelectionStrategy(value: Input[String]): Self = StObject.set(x, "valueSelectionStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSelectionStrategyUndefined: Self = StObject.set(x, "valueSelectionStrategy", js.undefined)
    }
  }
  
  trait SlotTypeState extends StObject {
    
    /**
      * Checksum identifying the version of the slot type that was created. The checksum is
      * not included as an argument because the resource will add it automatically when updating the slot type.
      */
    val checksum: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Determines if a new slot type version is created when the initial resource is created and on each
      * update. Defaults to `false`.
      */
    val createVersion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The date when the slot type version was created.
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the slot type. Must be less than or equal to 200 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of EnumerationValue objects that defines the values that
      * the slot type can take. Each value can have a list of synonyms, which are additional values that help
      * train the machine learning model about the values that it resolves for a slot. Attributes are
      * documented under enumeration_value.
      */
    val enumerationValues: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue]]]] = js.undefined
    
    /**
      * The date when the `$LATEST` version of this slot type was updated.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the slot type. The name is not case sensitive. Must be less than or equal to 100 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Determines the slot resolution strategy that Amazon Lex
      * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
      * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
      * if there is a resolution list for the slot, otherwise null is returned. Defaults to `ORIGINAL_VALUE`.
      */
    val valueSelectionStrategy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the slot type.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object SlotTypeState {
    
    @scala.inline
    def apply(): SlotTypeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlotTypeState]
    }
    
    @scala.inline
    implicit class SlotTypeStateMutableBuilder[Self <: SlotTypeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecksum(value: Input[String]): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      @scala.inline
      def setCreateVersion(value: Input[Boolean]): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
      
      @scala.inline
      def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnumerationValues(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue]]]): Self = StObject.set(x, "enumerationValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerationValuesUndefined: Self = StObject.set(x, "enumerationValues", js.undefined)
      
      @scala.inline
      def setEnumerationValuesVarargs(value: Input[typings.pulumiAws.inputMod.lex.SlotTypeEnumerationValue]*): Self = StObject.set(x, "enumerationValues", js.Array(value :_*))
      
      @scala.inline
      def setLastUpdatedDate(value: Input[String]): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValueSelectionStrategy(value: Input[String]): Self = StObject.set(x, "valueSelectionStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSelectionStrategyUndefined: Self = StObject.set(x, "valueSelectionStrategy", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
