package typings.reactNativeDraggableFlatlist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-reanimated.react-native-reanimated.default.SharedValue<number>> */
trait ReadonlySharedValuenumber extends StObject {
  
  val value: Double
}
object ReadonlySharedValuenumber {
  
  inline def apply(value: Double): ReadonlySharedValuenumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySharedValuenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlySharedValuenumber] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
