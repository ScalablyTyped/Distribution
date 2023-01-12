package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistInts.`0`
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-reanimated.react-native-reanimated.default.SharedValue<0 | 1>> */
trait ReadonlySharedValue01 extends StObject {
  
  val value: `0` | `1`
}
object ReadonlySharedValue01 {
  
  inline def apply(value: `0` | `1`): ReadonlySharedValue01 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySharedValue01]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlySharedValue01] (val x: Self) extends AnyVal {
    
    inline def setValue(value: `0` | `1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
