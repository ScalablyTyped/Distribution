package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacyRef[C] extends StObject {
  
  def getNode(): C = js.native
}
object LegacyRef {
  
  @scala.inline
  def apply[C](getNode: () => C): LegacyRef[C] = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[LegacyRef[C]]
  }
  
  @scala.inline
  implicit class LegacyRefMutableBuilder[Self <: LegacyRef[_], C] (val x: Self with LegacyRef[C]) extends AnyVal {
    
    @scala.inline
    def setGetNode(value: () => C): Self = StObject.set(x, "getNode", js.Any.fromFunction0(value))
  }
}
