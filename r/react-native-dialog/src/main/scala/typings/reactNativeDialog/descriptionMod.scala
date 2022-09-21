package typings.reactNativeDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.reactNative.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptionMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Description", JSImport.Default)
  @js.native
  val default: FC[DialogDescriptionProps] = js.native
  
  type DialogDescriptionProps = TextProps
  
  type _To = FC[DialogDescriptionProps]
  
  /* This means you don't have to write `default`, but can instead just say `descriptionMod.foo` */
  override def _to: FC[DialogDescriptionProps] = default
}
