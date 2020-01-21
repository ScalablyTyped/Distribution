package typings.storybookAddonA11y.tagsMod

import typings.axeCore.mod.TagValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsProps extends js.Object {
  var tags: js.Array[TagValue]
}

object TagsProps {
  @scala.inline
  def apply(tags: js.Array[TagValue]): TagsProps = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagsProps]
  }
}

