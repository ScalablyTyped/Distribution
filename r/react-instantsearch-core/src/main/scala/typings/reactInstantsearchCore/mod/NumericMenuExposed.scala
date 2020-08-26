package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumericMenuExposed extends js.Object {
  /** the name of the attribute in the records */
  var attribute: String = js.native
  /** the value of the item selected by default, follow the shape of a string with a pattern of '{start}:{end}'. */
  var defaultRefinement: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /** List of options. With a text label, and upper and lower bounds. */
  var items: js.Array[End] = js.native
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object NumericMenuExposed {
  @scala.inline
  def apply(attribute: String, items: js.Array[End]): NumericMenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericMenuExposed]
  }
  @scala.inline
  implicit class NumericMenuExposedOps[Self <: NumericMenuExposed] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: End*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[End]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRefinement(value: String): Self = this.set("defaultRefinement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRefinement: Self = this.set("defaultRefinement", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTransformItems(value: /* repeated */ js.Any => _): Self = this.set("transformItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformItems: Self = this.set("transformItems", js.undefined)
  }
  
}

