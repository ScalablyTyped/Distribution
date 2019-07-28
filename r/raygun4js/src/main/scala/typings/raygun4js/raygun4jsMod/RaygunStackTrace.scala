package typings.raygun4js.raygun4jsMod

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
    val __obj = js.Dynamic.literal(ClassName = ClassName, ColumnNumber = ColumnNumber, FileName = FileName, LineNumber = LineNumber, MethodName = MethodName)
  
    __obj.asInstanceOf[RaygunStackTrace]
  }
}

