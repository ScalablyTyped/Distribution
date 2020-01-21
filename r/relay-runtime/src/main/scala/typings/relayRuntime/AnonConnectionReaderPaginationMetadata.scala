package typings.relayRuntime

import typings.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnectionReaderPaginationMetadata extends js.Object {
  var connection: ReaderPaginationMetadata
}

object AnonConnectionReaderPaginationMetadata {
  @scala.inline
  def apply(connection: ReaderPaginationMetadata): AnonConnectionReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConnectionReaderPaginationMetadata]
  }
}

