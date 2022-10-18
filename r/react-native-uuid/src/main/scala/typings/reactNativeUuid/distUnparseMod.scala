package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUnparseMod {
  
  @JSImport("react-native-uuid/dist/unparse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unparse(buf: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unparse(buf: js.Array[Double], offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
}
