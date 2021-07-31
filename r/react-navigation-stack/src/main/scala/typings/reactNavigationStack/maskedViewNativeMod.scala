package typings.reactNavigationStack

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactNativeCommunityMaskedView.mod.default
import typings.reactNavigationStack.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maskedViewNativeMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/MaskedViewNative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasChildrenRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type MaskedViewType = Instantiable0[default]
  
  type Props = ComponentProps[MaskedViewType] & Children
}
