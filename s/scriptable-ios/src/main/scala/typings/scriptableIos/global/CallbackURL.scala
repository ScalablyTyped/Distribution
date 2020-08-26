package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Open x-callback-url requests._
  *
  * Constructs an object that opens x-callback-url requests and waits for a response from the target app.
  * @see https://docs.scriptable.app/callbackurl/#-new-callbackurl
  */
@JSGlobal("CallbackURL")
@js.native
class CallbackURL protected ()
  extends typings.scriptableIos.CallbackURL {
  /**
    * _Open x-callback-url requests._
    *
    * Constructs an object that opens x-callback-url requests and waits for a response from the target app.
    * @param baseURL - Base URL of the request. This is usally something like my-app://x-callback-url/action
    * @see https://docs.scriptable.app/callbackurl/#-new-callbackurl
    */
  def this(baseURL: String) = this()
}

