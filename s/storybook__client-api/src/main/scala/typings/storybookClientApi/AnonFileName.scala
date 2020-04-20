package typings.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileName extends js.Object {
  var fileName: String
  var kind: String
  var stories: js.Array[AnonName]
}

object AnonFileName {
  @scala.inline
  def apply(fileName: String, kind: String, stories: js.Array[AnonName]): AnonFileName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileName]
  }
}

