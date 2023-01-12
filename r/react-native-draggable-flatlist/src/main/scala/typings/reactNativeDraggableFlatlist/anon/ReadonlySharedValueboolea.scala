package typings.reactNativeDraggableFlatlist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-reanimated.react-native-reanimated.default.SharedValue<boolean>> */
trait ReadonlySharedValueboolea extends StObject {
  
  val value: Boolean
}
object ReadonlySharedValueboolea {
  
  inline def apply(value: Boolean): ReadonlySharedValueboolea = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySharedValueboolea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlySharedValueboolea] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
