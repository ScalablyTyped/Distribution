package typings.reactNavigationDrawer

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.reactNative.mod.TouchableWithoutFeedback
import typings.reactNavigationDrawer.anon.Borderless
import typings.reactNavigationDrawer.anon.PressColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer/lib/typescript/src/views/TouchableItem", JSImport.Namespace)
@js.native
object touchableItemMod extends js.Object {
  @js.native
  trait TouchableItem
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends TouchableItem
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Borderless = js.native
  }
  
  type Props = ComponentProps[Instantiable0[TouchableWithoutFeedback]] with PressColor
}

