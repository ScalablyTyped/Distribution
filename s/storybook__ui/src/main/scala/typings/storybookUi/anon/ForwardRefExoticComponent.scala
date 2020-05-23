package typings.storybookUi.anon

import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.storybookComponents.anon.IsLink
import typings.storybookComponents.anon.PartialButtonPropsRefAttr
import typings.storybookComponents.anon.WeakValidationMapButtonPr
import typings.storybookComponents.buttonButtonMod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ForwardRefExoticComponent<@storybook/components.@storybook/components/dist/Button/Button.ButtonProps & react.react.RefAttributes<any>> & {  defaultProps  :{  isLink  :boolean}} */
@js.native
trait ForwardRefExoticComponent extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[PartialButtonPropsRefAttr with IsLink] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ButtonProps with RefAttributes[_]): ReactElement | Null = js.native
}

