package typings
package stackDashTraceLib.stackDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StackFrame extends js.Object {
  def getColumnNumber(): scala.Double
  def getFileName(): java.lang.String
  def getFunctionName(): java.lang.String
  def getLineNumber(): scala.Double
  def getMethodName(): java.lang.String
  def getTypeName(): java.lang.String
  def isNative(): scala.Boolean
}

