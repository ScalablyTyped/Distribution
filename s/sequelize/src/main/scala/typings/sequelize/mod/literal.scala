package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait literal extends StObject {
  
  var `val`: js.Any = js.native
}
object literal {
  
  @scala.inline
  def apply(`val`: js.Any): literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[literal]
  }
  
  @scala.inline
  implicit class literalMutableBuilder[Self <: literal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVal(value: js.Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
