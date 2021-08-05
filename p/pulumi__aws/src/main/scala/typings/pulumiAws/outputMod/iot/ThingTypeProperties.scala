package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingTypeProperties extends StObject {
  
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.Array[String]
}
object ThingTypeProperties {
  
  inline def apply(searchableAttributes: js.Array[String]): ThingTypeProperties = {
    val __obj = js.Dynamic.literal(searchableAttributes = searchableAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeProperties]
  }
  
  extension [Self <: ThingTypeProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSearchableAttributes(value: js.Array[String]): Self = StObject.set(x, "searchableAttributes", value.asInstanceOf[js.Any])
    
    inline def setSearchableAttributesVarargs(value: String*): Self = StObject.set(x, "searchableAttributes", js.Array(value :_*))
  }
}
