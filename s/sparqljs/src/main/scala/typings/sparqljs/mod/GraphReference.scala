package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphReference
  extends StObject
     with GraphOrDefault {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var named: js.UndefOr[Boolean] = js.undefined
}
object GraphReference {
  
  inline def apply(): GraphReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[GraphReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphReference] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
    
    inline def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
  }
}
