package typings.storybookAddonJest.anon

import typings.storybookAddonJest.provideJestResultMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocState> */
trait ReadonlyHocState extends js.Object {
  val kind: js.UndefOr[String] = js.undefined
  val storyName: js.UndefOr[String] = js.undefined
  val tests: js.UndefOr[js.Array[Test]] = js.undefined
}

object ReadonlyHocState {
  @scala.inline
  def apply(kind: String = null, storyName: String = null, tests: js.Array[Test] = null): ReadonlyHocState = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (storyName != null) __obj.updateDynamic("storyName")(storyName.asInstanceOf[js.Any])
    if (tests != null) __obj.updateDynamic("tests")(tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHocState]
  }
}

