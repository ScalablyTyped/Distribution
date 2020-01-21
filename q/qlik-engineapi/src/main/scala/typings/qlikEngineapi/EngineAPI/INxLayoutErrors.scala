package typings.qlikEngineapi.EngineAPI

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
  var ErrorCode: Double
}

object INxLayoutErrors {
  @scala.inline
  def apply(ErrorCode: Double): INxLayoutErrors = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxLayoutErrors]
  }
}

