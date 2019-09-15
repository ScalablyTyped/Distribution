package typings.atStorybookComponents

import typings.atStorybookComponents.distBlocksStoryMod.StoryError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[StoryError] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: StoryError = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_Error]
  }
}

