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

object StackFrame {
  @scala.inline
  def apply(
    getColumnNumber: js.Function0[scala.Double],
    getFileName: js.Function0[java.lang.String],
    getFunctionName: js.Function0[java.lang.String],
    getLineNumber: js.Function0[scala.Double],
    getMethodName: js.Function0[java.lang.String],
    getTypeName: js.Function0[java.lang.String],
    isNative: js.Function0[scala.Boolean]
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getColumnNumber = getColumnNumber, getFileName = getFileName, getFunctionName = getFunctionName, getLineNumber = getLineNumber, getMethodName = getMethodName, getTypeName = getTypeName, isNative = isNative)
  
    __obj.asInstanceOf[StackFrame]
  }
}

