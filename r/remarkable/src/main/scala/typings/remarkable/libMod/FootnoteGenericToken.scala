package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteGenericToken
  extends StObject
     with TagToken {
  
  /**
    * Footnote id.
    */
  var id: Double
  
  /**
    * Footnote sub id.
    */
  var subId: js.UndefOr[Double] = js.undefined
}
object FootnoteGenericToken {
  
  inline def apply(id: Double, level: Double, `type`: String): FootnoteGenericToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteGenericToken]
  }
  
  extension [Self <: FootnoteGenericToken](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSubId(value: Double): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    
    inline def setSubIdUndefined: Self = StObject.set(x, "subId", js.undefined)
  }
}
