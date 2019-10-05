package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScriptSyntaxError...
  */
trait IScriptSyntaxError extends js.Object {
  /**
    * Position of the erroneous text from the beginning of the line
    */
  var qColInLine: Double
  /**
    * Length of the word where the error is located
    */
  var qErrLen: Double
  /**
    * Line number in the section where the error is located
    */
  var qLineInTab: Double
  /**
    * The default value is false.
    */
  var qSecondaryFailure: Boolean
  /**
    * Number of the faulty section
    */
  var qTabIx: Double
  /**
    * Position of the erroneous text from the beginning of the script
    */
  var qTextPos: Double
}

object IScriptSyntaxError {
  @scala.inline
  def apply(
    qColInLine: Double,
    qErrLen: Double,
    qLineInTab: Double,
    qSecondaryFailure: Boolean,
    qTabIx: Double,
    qTextPos: Double
  ): IScriptSyntaxError = {
    val __obj = js.Dynamic.literal(qColInLine = qColInLine, qErrLen = qErrLen, qLineInTab = qLineInTab, qSecondaryFailure = qSecondaryFailure, qTabIx = qTabIx, qTextPos = qTextPos)
  
    __obj.asInstanceOf[IScriptSyntaxError]
  }
}

