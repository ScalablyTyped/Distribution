package typings.screeps.anon

import typings.screeps.screepsNumbers.`1.8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repair extends StObject {
  
  var build: `1.8` = js.native
  
  var repair: `1.8` = js.native
}
object Repair {
  
  @scala.inline
  def apply(build: `1.8`, repair: `1.8`): Repair = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repair]
  }
  
  @scala.inline
  implicit class RepairMutableBuilder[Self <: Repair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: `1.8`): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepair(value: `1.8`): Self = StObject.set(x, "repair", value.asInstanceOf[js.Any])
  }
}
