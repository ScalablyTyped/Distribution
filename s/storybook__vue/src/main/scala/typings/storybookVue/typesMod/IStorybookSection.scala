package typings.storybookVue.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorybookSection extends js.Object {
  var kind: String
  var stories: js.Array[IStorybookStory]
}

object IStorybookSection {
  @scala.inline
  def apply(kind: String, stories: js.Array[IStorybookStory]): IStorybookSection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorybookSection]
  }
}

