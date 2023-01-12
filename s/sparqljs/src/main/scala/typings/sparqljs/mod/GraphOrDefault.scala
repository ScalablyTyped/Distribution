package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphOrDefault extends StObject {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[IriTerm] = js.undefined
  
  var `type`: graph
}
object GraphOrDefault {
  
  inline def apply(): GraphOrDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[GraphOrDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphOrDefault] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setName(value: IriTerm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: graph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
