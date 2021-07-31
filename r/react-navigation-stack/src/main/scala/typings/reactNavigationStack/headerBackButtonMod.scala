package typings.reactNavigationStack

import typings.react.mod.global.JSX.Element
import typings.reactNavigationStack.vendorTypesMod.StackHeaderLeftButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerBackButtonMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderBackButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressCustomPressColorAndroidScreenLayoutCustomTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle: Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressCustomPressColorAndroidScreenLayoutCustomTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type Props = StackHeaderLeftButtonProps
}
