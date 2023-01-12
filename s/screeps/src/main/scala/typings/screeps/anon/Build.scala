package typings.screeps.anon

import typings.screeps.screepsDoubles.`1.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  var build: `1.5`
  
  var repair: `1.5`
}
object Build {
  
  inline def apply(): Build = {
    val __obj = js.Dynamic.literal(build = 1.5d, repair = 1.5d)
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: `1.5`): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setRepair(value: `1.5`): Self = StObject.set(x, "repair", value.asInstanceOf[js.Any])
  }
}
