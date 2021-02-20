package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var harvest: typings.screeps.screepsNumbers.`5` = js.native
}
object `0` {
  
  @scala.inline
  def apply(harvest: typings.screeps.screepsNumbers.`5`): `0` = {
    val __obj = js.Dynamic.literal(harvest = harvest.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHarvest(value: typings.screeps.screepsNumbers.`5`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
