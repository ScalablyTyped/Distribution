package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingTypeProperties extends StObject {
  
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object ThingTypeProperties {
  
  inline def apply(): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeProperties]
  }
  
  extension [Self <: ThingTypeProperties](x: Self) {
    
    inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSearchableAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "searchableAttributes", value.asInstanceOf[js.Any])
    
    inline def setSearchableAttributesUndefined: Self = StObject.set(x, "searchableAttributes", js.undefined)
    
    inline def setSearchableAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "searchableAttributes", js.Array(value :_*))
  }
}
