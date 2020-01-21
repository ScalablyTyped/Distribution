package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.browseButtonMod.BrowseButtonProps
import typings.reactToolbox.buttonButtonMod.ButtonProps
import typings.reactToolbox.iconButtonMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
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

