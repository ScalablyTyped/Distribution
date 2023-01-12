package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyRef[C] extends StObject {
  
  def getNode(): C
}
object LegacyRef {
  
  inline def apply[C](getNode: () => C): LegacyRef[C] = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[LegacyRef[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegacyRef[?], C] (val x: Self & LegacyRef[C]) extends AnyVal {
    
    inline def setGetNode(value: () => C): Self = StObject.set(x, "getNode", js.Any.fromFunction0(value))
  }
}
