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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomizeFrame] (val x: Self) extends AnyVal {
    
    inline def setCustomizeFrame(value: File => Collapse): Self = StObject.set(x, "customizeFrame", js.Any.fromFunction1(value))
  }
}
