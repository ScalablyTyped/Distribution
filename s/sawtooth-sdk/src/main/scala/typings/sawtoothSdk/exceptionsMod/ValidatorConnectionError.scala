package typings.sawtoothSdk.exceptionsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/processor/exceptions", "ValidatorConnectionError")
@js.native
/**
  * Construcs a new ValidatorConnectionError
  *
  * @param [message] - an optional message, defaults to the empty
  * string
  */
class ValidatorConnectionError () extends Error {
  def this(message: String) = this()
}

