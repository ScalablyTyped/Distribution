package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.reactNativePaper.typescriptTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object darkThemeMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/styles/DarkTheme", JSImport.Default)
  @js.native
  val default: Theme = js.native
  
  type _To = Theme
  
  /* This means you don't have to write `default`, but can instead just say `darkThemeMod.foo` */
  override def _to: Theme = default
}
