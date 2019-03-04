package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxLayoutErrors...
  */
trait INxLayoutErrors extends js.Object {
  /**
    * Error code  <Integer>
    */
  var ErrorCode: scala.Double
}

object INxLayoutErrors {
  @scala.inline
  def apply(ErrorCode: scala.Double): INxLayoutErrors = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode)
  
    __obj.asInstanceOf[INxLayoutErrors]
  }
}

