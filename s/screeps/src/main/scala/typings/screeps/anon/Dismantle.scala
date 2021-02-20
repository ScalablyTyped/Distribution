package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dismantle extends StObject {
  
  var dismantle: typings.screeps.screepsNumbers.`2` = js.native
}
object Dismantle {
  
  @scala.inline
  def apply(dismantle: typings.screeps.screepsNumbers.`2`): Dismantle = {
    val __obj = js.Dynamic.literal(dismantle = dismantle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dismantle]
  }
  
  @scala.inline
  implicit class DismantleMutableBuilder[Self <: Dismantle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismantle(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "dismantle", value.asInstanceOf[js.Any])
  }
}
