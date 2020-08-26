package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.SearchBoxProvided> */
@js.native
trait PartialSearchBoxProvided extends js.Object {
  var currentRefinement: js.UndefOr[String] = js.native
  var isSearchStalled: js.UndefOr[Boolean] = js.native
  var refine: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object PartialSearchBoxProvided {
  @scala.inline
  def apply(): PartialSearchBoxProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchBoxProvided]
  }
  @scala.inline
  implicit class PartialSearchBoxProvidedOps[Self <: PartialSearchBoxProvided] (val x: Self) extends AnyVal {
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
    def setCurrentRefinement(value: String): Self = this.set("currentRefinement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRefinement: Self = this.set("currentRefinement", js.undefined)
    @scala.inline
    def setIsSearchStalled(value: Boolean): Self = this.set("isSearchStalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSearchStalled: Self = this.set("isSearchStalled", js.undefined)
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => _): Self = this.set("refine", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefine: Self = this.set("refine", js.undefined)
  }
  
}

