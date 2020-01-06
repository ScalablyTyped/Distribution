package typings.reactDashMathquill.reactDashMathquillMod

import typings.atEdtrDashIoMathquill.atEdtrDashIoMathquillMod.Config
import typings.atEdtrDashIoMathquill.atEdtrDashIoMathquillMod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.ComponentProps<'span'>, 'onChange'> ]: react.react.ComponentProps<'span'>[P]} */ trait Props extends js.Object {
  var config: js.UndefOr[Config] = js.undefined
  var latex: js.UndefOr[String] = js.undefined
  var mathquillDidMount: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    config: Config = null,
    latex: String = null,
    mathquillDidMount: /* mathField */ MQ => Unit = null,
    onChange: /* mathField */ MQ => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (latex != null) __obj.updateDynamic("latex")(latex.asInstanceOf[js.Any])
    if (mathquillDidMount != null) __obj.updateDynamic("mathquillDidMount")(js.Any.fromFunction1(mathquillDidMount))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Props]
  }
}

