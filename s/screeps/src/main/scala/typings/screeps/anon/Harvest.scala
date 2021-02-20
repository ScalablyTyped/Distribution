package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Harvest extends StObject {
  
  var harvest: typings.screeps.screepsNumbers.`3` = js.native
}
object Harvest {
  
  @scala.inline
  def apply(harvest: typings.screeps.screepsNumbers.`3`): Harvest = {
    val __obj = js.Dynamic.literal(harvest = harvest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Harvest]
  }
  
  @scala.inline
  implicit class HarvestMutableBuilder[Self <: Harvest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHarvest(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
