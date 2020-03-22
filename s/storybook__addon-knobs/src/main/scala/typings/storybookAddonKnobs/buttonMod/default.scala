package typings.storybookAddonKnobs.buttonMod

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.PartialButtonTypeProps
import typings.storybookAddonKnobs.WeakValidationMapButtonTy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Button", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialButtonTypeProps] = js.native
  var deserialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonTy] = js.native
  var serialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
  def apply(props: PropsWithChildren[ButtonTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ButtonTypeProps], context: js.Any): ReactElement | Null = js.native
}

