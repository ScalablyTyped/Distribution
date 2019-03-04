package typings
package raygun4jsLib.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunStackTrace extends js.Object {
  var ClassName: java.lang.String
  var ColumnNumber: scala.Double
  var FileName: java.lang.String
  var LineNumber: scala.Double
  var MethodName: java.lang.String
}

object RaygunStackTrace {
  @scala.inline
  def apply(
    ClassName: java.lang.String,
    ColumnNumber: scala.Double,
    FileName: java.lang.String,
    LineNumber: scala.Double,
    MethodName: java.lang.String
  ): RaygunStackTrace = {
    val __obj = js.Dynamic.literal(ClassName = ClassName, ColumnNumber = ColumnNumber, FileName = FileName, LineNumber = LineNumber, MethodName = MethodName)
  
    __obj.asInstanceOf[RaygunStackTrace]
  }
}

