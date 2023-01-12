package typings.storybookCoreServer.anon

import typings.storybookStore.distTs3Dot9TypesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkingDir extends StObject {
  
  var workingDir: Path
}
object WorkingDir {
  
  inline def apply(workingDir: Path): WorkingDir = {
    val __obj = js.Dynamic.literal(workingDir = workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkingDir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkingDir] (val x: Self) extends AnyVal {
    
    inline def setWorkingDir(value: Path): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
  }
}
