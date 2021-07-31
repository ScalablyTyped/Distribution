package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildRepair extends StObject {
  
  var build: typings.screeps.screepsNumbers.`2`
  
  var repair: typings.screeps.screepsNumbers.`2`
}
object BuildRepair {
  
  @scala.inline
  def apply(): BuildRepair = {
    val __obj = js.Dynamic.literal(build = 2, repair = 2)
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
