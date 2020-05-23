package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileName extends js.Object {
  var fileName: String
  var kind: String
  var stories: js.Array[Name]
}

object FileName {
  @scala.inline
  def apply(fileName: String, kind: String, stories: js.Array[Name]): FileName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
}

