package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.ImagePropsComponentcontexAccessibilityActions
import typings.reactNativeElements.anon.PickImagePropsComponentco
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardImageMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/card/CardImage", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickImagePropsComponentco] | ForwardRefExoticComponent[ImagePropsComponentcontexAccessibilityActions] = js.native
  
  type _To = FunctionComponent[PickImagePropsComponentco] | ForwardRefExoticComponent[ImagePropsComponentcontexAccessibilityActions]
  
  /* This means you don't have to write `default`, but can instead just say `cardImageMod.foo` */
  override def _to: FunctionComponent[PickImagePropsComponentco] | ForwardRefExoticComponent[ImagePropsComponentcontexAccessibilityActions] = default
}
