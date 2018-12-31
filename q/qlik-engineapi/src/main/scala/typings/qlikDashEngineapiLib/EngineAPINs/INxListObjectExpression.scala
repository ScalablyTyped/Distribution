package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxListObjectExpression...
  */
trait INxListObjectExpression extends js.Object {
  /**
    * Gives information on the error.
    * >> This parameter is optional.
    */
  var qError: js.UndefOr[INxLayoutErrors] = js.undefined
  /**
    * Value of the expression.
    */
  var qExpr: java.lang.String
}

