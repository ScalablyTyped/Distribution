package typings.pulumiAws

import typings.pulumiAws.outputMod.lex.GetSlotTypeEnumerationValue
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSlotTypeMod {
  
  @JSImport("@pulumi/aws/lex/getSlotType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSlotType(args: GetSlotTypeArgs): js.Promise[GetSlotTypeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotType")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSlotTypeResult]]
  inline def getSlotType(args: GetSlotTypeArgs, opts: InvokeOptions): js.Promise[GetSlotTypeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlotType")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSlotTypeResult]]
  
  trait GetSlotTypeArgs extends StObject {
    
    /**
      * The name of the slot type. The name is case sensitive.
      */
    val name: String
    
    /**
      * The version of the slot type.
      */
    val version: js.UndefOr[String] = js.undefined
  }
  object GetSlotTypeArgs {
    
    inline def apply(name: String): GetSlotTypeArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSlotTypeArgs]
    }
    
    extension [Self <: GetSlotTypeArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GetSlotTypeResult extends StObject {
    
    /**
      * Checksum identifying the version of the slot type that was created. The checksum is
      * not included as an argument because the resource will add it automatically when updating the slot type.
      */
    val checksum: String
    
    /**
      * The date when the slot type version was created.
      */
    val createdDate: String
    
    /**
      * A description of the slot type.
      */
    val description: String
    
    /**
      * A set of EnumerationValue objects that defines the values that
      * the slot type can take. Each value can have a set of synonyms, which are additional values that help
      * train the machine learning model about the values that it resolves for a slot.
      */
    val enumerationValues: js.Array[GetSlotTypeEnumerationValue]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The date when the $LATEST version of this slot type was updated.
      */
    val lastUpdatedDate: String
    
    /**
      * The name of the slot type. The name is not case sensitive.
      */
    val name: String
    
    /**
      * Determines the slot resolution strategy that Amazon Lex
      * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
      * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
      * if there is a resolution list for the slot, otherwise null is returned.
      */
    val valueSelectionStrategy: String
    
    /**
      * The version of the slot type.
      */
    val version: js.UndefOr[String] = js.undefined
  }
  object GetSlotTypeResult {
    
    inline def apply(
      checksum: String,
      createdDate: String,
      description: String,
      enumerationValues: js.Array[GetSlotTypeEnumerationValue],
      id: String,
      lastUpdatedDate: String,
      name: String,
      valueSelectionStrategy: String
    ): GetSlotTypeResult = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enumerationValues = enumerationValues.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], valueSelectionStrategy = valueSelectionStrategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSlotTypeResult]
    }
    
    extension [Self <: GetSlotTypeResult](x: Self) {
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnumerationValues(value: js.Array[GetSlotTypeEnumerationValue]): Self = StObject.set(x, "enumerationValues", value.asInstanceOf[js.Any])
      
      inline def setEnumerationValuesVarargs(value: GetSlotTypeEnumerationValue*): Self = StObject.set(x, "enumerationValues", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedDate(value: String): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValueSelectionStrategy(value: String): Self = StObject.set(x, "valueSelectionStrategy", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
