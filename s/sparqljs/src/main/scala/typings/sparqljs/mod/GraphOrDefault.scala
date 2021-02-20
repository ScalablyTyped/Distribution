package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphOrDefault extends StObject {
  
  var default: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[IriTerm] = js.native
  
  var `type`: graph = js.native
}
object GraphOrDefault {
  
  @scala.inline
  def apply(`type`: graph): GraphOrDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphOrDefault]
  }
  
  @scala.inline
  implicit class GraphOrDefaultMutableBuilder[Self <: GraphOrDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setName(value: IriTerm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: graph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
