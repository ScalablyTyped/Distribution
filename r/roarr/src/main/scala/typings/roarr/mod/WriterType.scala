package typings.roarr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriterType extends js.Object {
  def write(message: String): Unit
}

object WriterType {
  @scala.inline
  def apply(write: String => Unit): WriterType = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[WriterType]
  }
}

