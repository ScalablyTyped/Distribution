package typings.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScratchExtension extends StObject {
  
  /** Returns data about the extension. */
  def getInfo(): ExtensionMetadata
}
object ScratchExtension {
  
  inline def apply(getInfo: () => ExtensionMetadata): ScratchExtension = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo))
    __obj.asInstanceOf[ScratchExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScratchExtension] (val x: Self) extends AnyVal {
    
    inline def setGetInfo(value: () => ExtensionMetadata): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
  }
}
