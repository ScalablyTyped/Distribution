package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StoriesConfigured extends js.Object {
  var storiesConfigured: scala.Boolean
  var storyId: java.lang.String
  var viewMode: java.lang.String
}

object Anon_StoriesConfigured {
  @scala.inline
  def apply(storiesConfigured: scala.Boolean, storyId: java.lang.String, viewMode: java.lang.String): Anon_StoriesConfigured = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured, storyId = storyId, viewMode = viewMode)
  
    __obj.asInstanceOf[Anon_StoriesConfigured]
  }
}

