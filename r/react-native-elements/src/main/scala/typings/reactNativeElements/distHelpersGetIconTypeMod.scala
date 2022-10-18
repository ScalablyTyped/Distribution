package typings.reactNativeElements

import typings.reactNativeElements.distIconsIconMod.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersGetIconTypeMod {
  
  @JSImport("react-native-elements/dist/helpers/getIconType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`type`: IconType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def registerCustomIconType(id: String, customIcon: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomIconType")(id.asInstanceOf[js.Any], customIcon.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
