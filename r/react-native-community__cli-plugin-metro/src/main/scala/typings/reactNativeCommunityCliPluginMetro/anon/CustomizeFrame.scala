package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizeFrame extends StObject {
  
  def customizeFrame(frame: File): Collapse
}
object CustomizeFrame {
  
  inline def apply(customizeFrame: File => Collapse): CustomizeFrame = {
    val __obj = js.Dynamic.literal(customizeFrame = js.Any.fromFunction1(customizeFrame))
    __obj.asInstanceOf[CustomizeFrame]
  }
  
  extension [Self <: CustomizeFrame](x: Self) {
    
    inline def setCustomizeFrame(value: File => Collapse): Self = StObject.set(x, "customizeFrame", js.Any.fromFunction1(value))
  }
}
