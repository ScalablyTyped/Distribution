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
  
  @scala.inline
  def apply(): GraphReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[GraphReference]
  }
  
  @scala.inline
  implicit class GraphReferenceMutableBuilder[Self <: GraphReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
  }
}
