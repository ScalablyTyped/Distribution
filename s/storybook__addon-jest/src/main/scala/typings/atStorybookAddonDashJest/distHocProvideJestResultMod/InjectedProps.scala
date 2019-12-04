package typings.atStorybookAddonDashJest.distHocProvideJestResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedProps extends js.Object {
  var tests: js.UndefOr[js.Array[Test]] = js.undefined
}

object InjectedProps {
  @scala.inline
  def apply(tests: js.Array[Test] = null): InjectedProps = {
    val __obj = js.Dynamic.literal()
    if (tests != null) __obj.updateDynamic("tests")(tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedProps]
  }
}

