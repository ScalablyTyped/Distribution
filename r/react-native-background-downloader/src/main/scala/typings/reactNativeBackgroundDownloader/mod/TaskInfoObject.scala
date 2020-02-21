package typings.reactNativeBackgroundDownloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskInfoObject extends js.Object {
  var bytesWritten: Double
  var id: String
  var percent: Double
  var totalBytes: Double
}

object TaskInfoObject {
  @scala.inline
  def apply(bytesWritten: Double, id: String, percent: Double, totalBytes: Double): TaskInfoObject = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskInfoObject]
  }
}

