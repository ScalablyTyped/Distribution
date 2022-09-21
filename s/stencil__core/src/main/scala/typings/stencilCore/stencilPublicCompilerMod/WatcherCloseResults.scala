package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherCloseResults extends StObject {
  
  var exitCode: Double
}
object WatcherCloseResults {
  
  inline def apply(exitCode: Double): WatcherCloseResults = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherCloseResults]
  }
  
  extension [Self <: WatcherCloseResults](x: Self) {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}
