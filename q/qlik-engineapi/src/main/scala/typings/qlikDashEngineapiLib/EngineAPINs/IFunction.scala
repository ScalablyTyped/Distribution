package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Function...
  */
trait IFunction extends js.Object {
  /**
    * Group of the script function.
    */
  var qGroup: FunctionGroupType
  /**
    * Name of the script function.
    */
  var qName: java.lang.String
  /**
    * Signature of the script function.
    * Gives general information about the function.
    */
  var qSignature: java.lang.String
}

object IFunction {
  @scala.inline
  def apply(qGroup: FunctionGroupType, qName: java.lang.String, qSignature: java.lang.String): IFunction = {
    val __obj = js.Dynamic.literal(qGroup = qGroup, qName = qName, qSignature = qSignature)
  
    __obj.asInstanceOf[IFunction]
  }
}

