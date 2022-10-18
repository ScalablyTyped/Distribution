package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distValidateMod {
  
  @JSImport("react-native-uuid/dist/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validate(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
