package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildRepair extends StObject {
  
  var build: typings.screeps.screepsNumbers.`2` = js.native
  
  var repair: typings.screeps.screepsNumbers.`2` = js.native
}
object BuildRepair {
  
  @scala.inline
  def apply(build: typings.screeps.screepsNumbers.`2`, repair: typings.screeps.screepsNumbers.`2`): BuildRepair = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRepair]
  }
  
  @scala.inline
  implicit class BuildRepairMutableBuilder[Self <: BuildRepair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepair(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "repair", value.asInstanceOf[js.Any])
  }
}
