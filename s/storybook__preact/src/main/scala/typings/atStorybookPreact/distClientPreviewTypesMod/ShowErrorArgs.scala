package typings.atStorybookPreact.distClientPreviewTypesMod

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
    val __obj = js.Dynamic.literal(description = description, title = title)
  
    __obj.asInstanceOf[ShowErrorArgs]
  }
}

