package typings.reactNativeReanimated.reanimated2CommonTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation[T /* <: AnimationObject */]
  extends StObject
     with AnimationObject
object Animation {
  
  inline def apply[T /* <: AnimationObject */](
    callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
    onFrame: (Any, Timestamp) => Boolean,
    onStart: (Any, Any, Timestamp, Any) => Unit
  ): Animation[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart))
    __obj.asInstanceOf[Animation[T]]
  }
}
