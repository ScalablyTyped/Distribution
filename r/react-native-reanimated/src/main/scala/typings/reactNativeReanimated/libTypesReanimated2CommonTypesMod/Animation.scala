package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation[T /* <: AnimationObject */]
  extends StObject
     with AnimationObject {
  
  def onStart(
    nextAnimation: T,
    current: /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any,
    timestamp: Timestamp,
    previousAnimation: T
  ): Unit
}
object Animation {
  
  inline def apply[T /* <: AnimationObject */](
    callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
    onFrame: (Any, Timestamp) => Boolean,
    onStart: (T, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, T) => Unit
  ): Animation[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart))
    __obj.asInstanceOf[Animation[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation[?], T /* <: AnimationObject */] (val x: Self & Animation[T]) extends AnyVal {
    
    inline def setOnStart(
      value: (T, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, T) => Unit
    ): Self = StObject.set(x, "onStart", js.Any.fromFunction4(value))
  }
}
