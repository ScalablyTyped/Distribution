package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cast extends StObject {
  
  var `type`: String
  
  var `val`: js.Any
}
object cast {
  
  @scala.inline
  def apply(`type`: String, `val`: js.Any): cast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[cast]
  }
  
  @scala.inline
  implicit class castMutableBuilder[Self <: cast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: js.Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
