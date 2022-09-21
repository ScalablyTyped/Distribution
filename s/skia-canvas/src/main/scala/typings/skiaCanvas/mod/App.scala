package typings.skiaCanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var fps: Double
  
  def launch(): Unit
  
  def quit(): Unit
  
  val running: Boolean
  
  val windows: js.Array[Window]
}
object App {
  
  @JSImport("skia-canvas/lib", "App")
  @js.native
  val ^ : App = js.native
  
  extension [Self <: App](x: Self) {
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setLaunch(value: () => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction0(value))
    
    inline def setQuit(value: () => Unit): Self = StObject.set(x, "quit", js.Any.fromFunction0(value))
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setWindows(value: js.Array[Window]): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    inline def setWindowsVarargs(value: Window*): Self = StObject.set(x, "windows", js.Array(value*))
  }
}
