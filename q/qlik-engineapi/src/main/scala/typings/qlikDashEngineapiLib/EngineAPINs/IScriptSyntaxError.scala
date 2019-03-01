package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qColInLine: scala.Double
  /**
    * Length of the word where the error is located
    */
  var qErrLen: scala.Double
  /**
    * Line number in the section where the error is located
    */
  var qLineInTab: scala.Double
  /**
    * The default value is false.
    */
  var qSecondaryFailure: scala.Boolean
  /**
    * Number of the faulty section
    */
  var qTabIx: scala.Double
  /**
    * Position of the erroneous text from the beginning of the script
    */
  var qTextPos: scala.Double
}

object IScriptSyntaxError {
  @scala.inline
  def apply(
    qColInLine: scala.Double,
    qErrLen: scala.Double,
    qLineInTab: scala.Double,
    qSecondaryFailure: scala.Boolean,
    qTabIx: scala.Double,
    qTextPos: scala.Double
  ): IScriptSyntaxError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qColInLine")(qColInLine)
    __obj.updateDynamic("qErrLen")(qErrLen)
    __obj.updateDynamic("qLineInTab")(qLineInTab)
    __obj.updateDynamic("qSecondaryFailure")(qSecondaryFailure)
    __obj.updateDynamic("qTabIx")(qTabIx)
    __obj.updateDynamic("qTextPos")(qTextPos)
    __obj.asInstanceOf[IScriptSyntaxError]
  }
}

