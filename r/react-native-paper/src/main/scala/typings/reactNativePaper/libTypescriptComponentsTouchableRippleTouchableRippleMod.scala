package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.reactNative.mod.TouchableWithoutFeedback
import typings.reactNativePaper.anon.Background
import typings.reactNativePaper.anon.Call
import typings.reactNativePaper.anon.PickTouchableWithoutFeedb
import typings.reactNativePaper.anon.TouchableWithoutFeedbackP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTouchableRippleTouchableRippleMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/TouchableRipple/TouchableRipple", JSImport.Default)
  @js.native
  val default: ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object]) = js.native
  
  type Props = ComponentPropsWithRef[Instantiable0[TouchableWithoutFeedback]] & Background
  
  type _To = ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsTouchableRippleTouchableRippleMod.foo` */
  override def _to: ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object]) = default
}
