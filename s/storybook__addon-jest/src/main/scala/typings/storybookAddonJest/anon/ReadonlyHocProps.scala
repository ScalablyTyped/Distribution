package typings.storybookAddonJest.anon

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocProps> */
trait ReadonlyHocProps extends js.Object {
  val active: js.UndefOr[Boolean] = js.undefined
  val api: API
}

object ReadonlyHocProps {
  @scala.inline
  def apply(api: API, active: js.UndefOr[Boolean] = js.undefined): ReadonlyHocProps = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHocProps]
  }
}

