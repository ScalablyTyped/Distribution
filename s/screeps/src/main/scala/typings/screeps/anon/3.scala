package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var dismantle: typings.screeps.screepsNumbers.`4` = js.native
}
object `3` {
  
  @scala.inline
  def apply(dismantle: typings.screeps.screepsNumbers.`4`): `3` = {
    val __obj = js.Dynamic.literal(dismantle = dismantle.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismantle(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "dismantle", value.asInstanceOf[js.Any])
  }
}
