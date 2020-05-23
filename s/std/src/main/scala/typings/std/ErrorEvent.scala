package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events providing information related to errors in scripts or in files. */
@js.native
trait ErrorEvent extends Event {
  val colno: Double = js.native
  val error: js.Any = js.native
  val filename: java.lang.String = js.native
  val lineno: Double = js.native
  val message: java.lang.String = js.native
}

