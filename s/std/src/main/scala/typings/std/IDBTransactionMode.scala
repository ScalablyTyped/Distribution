package typings.std

import typings.std.stdStrings.readonly_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.readonly_
  - typings.std.stdStrings.readwrite
  - typings.std.stdStrings.versionchange
*/
trait IDBTransactionMode extends js.Object

object IDBTransactionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def readonly: readonly_ = this.cast("readonly")
  @scala.inline
  def readwrite: typings.std.stdStrings.readwrite = this.cast("readwrite")
  @scala.inline
  def versionchange: typings.std.stdStrings.versionchange = this.cast("versionchange")
}

