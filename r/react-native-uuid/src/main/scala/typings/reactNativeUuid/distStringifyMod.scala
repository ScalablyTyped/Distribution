package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyMod {
  
  @JSImport("react-native-uuid/dist/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(arr: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(arr: js.typedarray.Uint8Array, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(arr.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
}
