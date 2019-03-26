package typings
package reactDashBootstrapLib.libSplitButtonMod.SplitButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.React.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.React.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>] ]: react.react.React.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>[P]} */ trait SplitButtonProps extends js.Object {
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var dropdownTitle: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var dropup: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var pullRight: js.UndefOr[scala.Boolean] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object SplitButtonProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    title: reactLib.reactMod.ReactNs.ReactNode,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    dropdownTitle: js.Any = null,
    dropup: js.UndefOr[scala.Boolean] = js.undefined,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined
  ): SplitButtonProps = {
    val __obj = js.Dynamic.literal(id = id, title = title.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (dropdownTitle != null) __obj.updateDynamic("dropdownTitle")(dropdownTitle)
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[SplitButtonProps]
  }
}

