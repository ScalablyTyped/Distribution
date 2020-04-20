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
  def readonly: readonly_ = "readonly".asInstanceOf[readonly_]
  @scala.inline
  def readwrite: typings.std.stdStrings.readwrite = "readwrite".asInstanceOf[typings.std.stdStrings.readwrite]
  @scala.inline
  def versionchange: typings.std.stdStrings.versionchange = "versionchange".asInstanceOf[typings.std.stdStrings.versionchange]
}

