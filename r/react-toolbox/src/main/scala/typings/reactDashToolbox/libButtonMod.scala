package typings.reactDashToolbox

import typings.react.reactMod.Component
import typings.reactDashToolbox.libButtonBrowseButtonMod.BrowseButtonProps
import typings.reactDashToolbox.libButtonButtonMod.ButtonProps
import typings.reactDashToolbox.libButtonIconButtonMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/button", JSImport.Namespace)
@js.native
object libButtonMod extends js.Object {
  @js.native
  class BrowseButton ()
    extends Component[BrowseButtonProps, js.Object, js.Any]
  
  @js.native
  class Button ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  @js.native
  class IconButton ()
    extends Component[IconButtonProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  
}

