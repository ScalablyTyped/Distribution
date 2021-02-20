package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var dismantle: typings.screeps.screepsNumbers.`3` = js.native
}
object `2` {
  
  @scala.inline
  def apply(dismantle: typings.screeps.screepsNumbers.`3`): `2` = {
    val __obj = js.Dynamic.literal(dismantle = dismantle.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismantle(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "dismantle", value.asInstanceOf[js.Any])
  }
}
