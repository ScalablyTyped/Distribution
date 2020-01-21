package typings.storybookVue.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowErrorArgs extends js.Object {
  var description: String
  var title: String
}

object ShowErrorArgs {
  @scala.inline
  def apply(description: String, title: String): ShowErrorArgs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShowErrorArgs]
  }
}

