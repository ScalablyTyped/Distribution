package typings.reactNativeElements

import typings.reactNativeElements.anon.Brand
import typings.reactNativeElements.anon.Solid
import typings.reactNativeElements.iconMod.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIconStyleMod {
  
  @JSImport("react-native-elements/dist/helpers/getIconStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`type`: IconType, extraProps: Any): Brand | Solid = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[Brand | Solid]
}
