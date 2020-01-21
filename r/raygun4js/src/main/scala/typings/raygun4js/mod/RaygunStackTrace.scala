package typings.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunStackTrace extends js.Object {
  var ClassName: String
  var ColumnNumber: Double
  var FileName: String
  var LineNumber: Double
  var MethodName: String
}

object RaygunStackTrace {
  @scala.inline
  def apply(ClassName: String, ColumnNumber: Double, FileName: String, LineNumber: Double, MethodName: String): RaygunStackTrace = {
    val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], ColumnNumber = ColumnNumber.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], MethodName = MethodName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaygunStackTrace]
  }
}

