package typings.storybookAddonKnobs

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.buttonMod.ButtonTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> & {serialize (): undefined, deserialize (): undefined} */
@js.native
trait FunctionComponentButtonTy extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialButtonTypeProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonTy] = js.native
  def apply(props: PropsWithChildren[ButtonTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ButtonTypeProps], context: js.Any): ReactElement | Null = js.native
  def deserialize(): js.UndefOr[scala.Nothing] = js.native
  def serialize(): js.UndefOr[scala.Nothing] = js.native
}

