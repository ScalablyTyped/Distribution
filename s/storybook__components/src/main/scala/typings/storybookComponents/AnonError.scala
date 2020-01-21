package typings.storybookComponents

import typings.storybookComponents.storyMod.StoryError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[StoryError] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(error: StoryError = null): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

