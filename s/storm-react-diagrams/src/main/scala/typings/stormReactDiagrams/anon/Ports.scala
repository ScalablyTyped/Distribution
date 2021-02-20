package typings.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ports extends StObject {
  
  var extras: js.Any = js.native
  
  var id: String = js.native
  
  var ports: js.Array[Links] = js.native
  
  var selected: Boolean = js.native
  
  var `type`: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Ports {
  
  @scala.inline
  def apply(
    extras: js.Any,
    id: String,
    ports: js.Array[Links],
    selected: Boolean,
    `type`: String,
    x: Double,
    y: Double
  ): Ports = {
    val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ports]
  }
  
  @scala.inline
  implicit class PortsMutableBuilder[Self <: Ports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtras(value: js.Any): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorts(value: js.Array[Links]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: Links*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
