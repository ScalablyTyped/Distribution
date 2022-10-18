package typings.reactNativeDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.reactNative.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTitleMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Title", JSImport.Default)
  @js.native
  val default: FC[DialogTitleProps] = js.native
  
  type DialogTitleProps = TextProps
  
  type _To = FC[DialogTitleProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTitleMod.foo` */
  override def _to: FC[DialogTitleProps] = default
}
