package typings.rcMenu.subPopupMenuMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rcMenu.anon.PartialSubPopupMenuProps
import typings.rcMenu.anon.WeakValidationMapSubPopup
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/es/SubPopupMenu", JSImport.Default)
@js.native
class default protected ()
  extends Component[SubPopupMenuProps, js.Any, js.Any] {
  def this(props: SubPopupMenuProps) = this()
  def this(props: SubPopupMenuProps, context: js.Any) = this()
}

@JSImport("rc-menu/es/SubPopupMenu", JSImport.Default)
@js.native
object default
  extends Instantiable1[/* props */ SubPopupMenuProps, Component[SubPopupMenuProps, js.Any, js.Any]]
     with Instantiable2[
      /* props */ SubPopupMenuProps, 
      /* context */ js.Any, 
      Component[SubPopupMenuProps, js.Any, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSubPopupMenuProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[SubPopupMenuProps, _]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[SubPopupMenuProps, _]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSubPopup] = js.native
  def getWrappedInstance(): SubPopupMenu = js.native
}

