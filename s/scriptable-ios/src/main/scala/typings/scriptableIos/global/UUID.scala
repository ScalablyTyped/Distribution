package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Unique identifier._
  * @see https://docs.scriptable.app/uuid
  */
@JSGlobal("UUID")
@js.native
object UUID extends js.Object {
  /**
    * _Get string value._
    *
    * Used for getting the string value of a UUID.
    * @see https://docs.scriptable.app/uuid/#string
    */
  def string(): String = js.native
}

