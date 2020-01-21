package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.buttonBrowseButtonMod.BrowseButtonProps
import typings.reactToolbox.buttonIconButtonMod.IconButtonProps
import typings.reactToolbox.libButtonButtonMod.ButtonProps
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

