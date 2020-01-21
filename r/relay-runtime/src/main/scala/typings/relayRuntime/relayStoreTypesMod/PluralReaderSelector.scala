package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralReaderSelector extends ReaderSelector {
  val kind: String
  val selectors: js.Array[SingularReaderSelector]
}

object PluralReaderSelector {
  @scala.inline
  def apply(kind: String, selectors: js.Array[SingularReaderSelector]): PluralReaderSelector = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluralReaderSelector]
  }
}

