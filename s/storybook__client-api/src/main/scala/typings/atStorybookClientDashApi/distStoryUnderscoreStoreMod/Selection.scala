package typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  var storyId: String
  var viewMode: String
}

object Selection {
  @scala.inline
  def apply(storyId: String, viewMode: String): Selection = {
    val __obj = js.Dynamic.literal(storyId = storyId, viewMode = viewMode)
  
    __obj.asInstanceOf[Selection]
  }
}

