package typings.storybookAddonBackgrounds

import typings.storybookAddonBackgrounds.typesMod.Background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@storybook/addon-backgrounds/dist/ts3.9/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBackgroundStyle(selector: String, css: String, storyId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBackgroundStyle")(selector.asInstanceOf[js.Any], css.asInstanceOf[js.Any], storyId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addGridStyle(selector: String, css: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addGridStyle")(selector.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearStyles(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStyles")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearStyles(selector: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStyles")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getBackgroundColorByName(currentSelectedValue: String, backgrounds: js.Array[Background], defaultName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundColorByName")(currentSelectedValue.asInstanceOf[js.Any], backgrounds.asInstanceOf[js.Any], defaultName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isReduceMotionEnabled(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isReduceMotionEnabled")().asInstanceOf[Any]
}
