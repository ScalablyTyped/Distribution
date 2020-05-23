package typings.snykGradlePlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradleProjectInfo extends js.Object {
  var depDict: StringDictionary[DepTree]
  var targetFile: String
}

object GradleProjectInfo {
  @scala.inline
  def apply(depDict: StringDictionary[DepTree], targetFile: String): GradleProjectInfo = {
    val __obj = js.Dynamic.literal(depDict = depDict.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradleProjectInfo]
  }
}

