package typings.reactNativePaper

import typings.reactNativePaper.anon.platforminPlatformOSTyped
import typings.reactNativePaper.typescriptTypesMod.Fonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontsMod {
  
  @JSImport("react-native-paper/lib/typescript/styles/fonts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Fonts = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Fonts]
  inline def default(config: platforminPlatformOSTyped): Fonts = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Fonts]
}
