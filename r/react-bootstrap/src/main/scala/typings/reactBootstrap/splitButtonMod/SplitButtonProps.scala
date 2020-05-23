package typings.reactBootstrap.splitButtonMod

import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>[P]} */ trait SplitButtonProps extends js.Object {
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var dropdownTitle: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var dropup: js.UndefOr[Boolean] = js.undefined
  var id: String
  var pullRight: js.UndefOr[Boolean] = js.undefined
  var title: ReactNode
}

object SplitButtonProps {
  @scala.inline
  def apply(
    id: String,
    bsSize: Sizes = null,
    bsStyle: String = null,
    dropdownTitle: js.Any = null,
    dropup: js.UndefOr[Boolean] = js.undefined,
    pullRight: js.UndefOr[Boolean] = js.undefined,
    title: ReactNode = null
  ): SplitButtonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (dropdownTitle != null) __obj.updateDynamic("dropdownTitle")(dropdownTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitButtonProps]
  }
}

