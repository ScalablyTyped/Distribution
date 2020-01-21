package typings.storybookAddonJest.provideJestResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HocState extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var storyName: js.UndefOr[String] = js.undefined
  var tests: js.UndefOr[js.Array[Test]] = js.undefined
}

object HocState {
  @scala.inline
  def apply(kind: String = null, storyName: String = null, tests: js.Array[Test] = null): HocState = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (storyName != null) __obj.updateDynamic("storyName")(storyName.asInstanceOf[js.Any])
    if (tests != null) __obj.updateDynamic("tests")(tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[HocState]
  }
}

