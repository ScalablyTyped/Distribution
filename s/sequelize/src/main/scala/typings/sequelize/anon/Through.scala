package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Through[TJoinTableAttributes] extends StObject {
  
  var through: TJoinTableAttributes = js.native
}
object Through {
  
  @scala.inline
  def apply[TJoinTableAttributes](through: TJoinTableAttributes): Through[TJoinTableAttributes] = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
    __obj.asInstanceOf[Through[TJoinTableAttributes]]
  }
  
  @scala.inline
  implicit class ThroughMutableBuilder[Self <: Through[_], TJoinTableAttributes] (val x: Self with Through[TJoinTableAttributes]) extends AnyVal {
    
    @scala.inline
    def setThrough(value: TJoinTableAttributes): Self = StObject.set(x, "through", value.asInstanceOf[js.Any])
  }
}
