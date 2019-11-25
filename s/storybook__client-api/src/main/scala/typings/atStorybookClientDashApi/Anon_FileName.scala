package typings.atStorybookClientDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileName extends js.Object {
  var fileName: String
  var kind: String
  var stories: js.Array[Anon_Name]
}

object Anon_FileName {
  @scala.inline
  def apply(fileName: String, kind: String, stories: js.Array[Anon_Name]): Anon_FileName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FileName]
  }
}

