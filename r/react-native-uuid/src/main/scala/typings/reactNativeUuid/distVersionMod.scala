package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVersionMod {
  
  @JSImport("react-native-uuid/dist/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def version(uuid: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("version")(uuid.asInstanceOf[js.Any]).asInstanceOf[Double]
}
