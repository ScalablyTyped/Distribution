package typings.semanticUiSearch.anon

import typings.semanticUiSearch.semanticUiSearchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'source'> */
@js.native
trait PickImplsource extends js.Object {
  var source: `false` | js.Any = js.native
}

object PickImplsource {
  @scala.inline
  def apply(source: `false` | js.Any): PickImplsource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsource]
  }
  @scala.inline
  implicit class PickImplsourceOps[Self <: PickImplsource] (val x: Self) extends AnyVal {
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
    def setSource(value: `false` | js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

