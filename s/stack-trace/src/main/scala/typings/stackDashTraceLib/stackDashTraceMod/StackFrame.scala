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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumnNumber")(getColumnNumber)
    __obj.updateDynamic("getFileName")(getFileName)
    __obj.updateDynamic("getFunctionName")(getFunctionName)
    __obj.updateDynamic("getLineNumber")(getLineNumber)
    __obj.updateDynamic("getMethodName")(getMethodName)
    __obj.updateDynamic("getTypeName")(getTypeName)
    __obj.updateDynamic("isNative")(isNative)
    __obj.asInstanceOf[StackFrame]
  }
}

