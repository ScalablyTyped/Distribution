package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralReaderSelector extends ReaderSelector {
  val kind: String = js.native
  val selectors: js.Array[SingularReaderSelector] = js.native
}

object PluralReaderSelector {
  @scala.inline
  def apply(kind: String, selectors: js.Array[SingularReaderSelector]): PluralReaderSelector = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralReaderSelector]
  }
  @scala.inline
  implicit class PluralReaderSelectorOps[Self <: PluralReaderSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorsVarargs(value: SingularReaderSelector*): Self = this.set("selectors", js.Array(value :_*))
    @scala.inline
    def setSelectors(value: js.Array[SingularReaderSelector]): Self = this.set("selectors", value.asInstanceOf[js.Any])
  }
  
}

