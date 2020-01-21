package typings.reactNativeFirebase.mod.RNFirebase.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HttpsCallableResult wraps a single result from a function call.
  */
trait HttpsCallableResult[R] extends js.Object {
  val data: R
}

object HttpsCallableResult {
  @scala.inline
  def apply[R](data: R): HttpsCallableResult[R] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpsCallableResult[R]]
  }
}

