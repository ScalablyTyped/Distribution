package typings.relayDashRuntime.libStoreRelayStoreTypesMod

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
    val __obj = js.Dynamic.literal(kind = kind, selectors = selectors)
  
    __obj.asInstanceOf[PluralReaderSelector]
  }
}

