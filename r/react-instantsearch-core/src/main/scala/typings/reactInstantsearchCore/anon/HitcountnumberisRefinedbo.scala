package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-instantsearch-core.react-instantsearch-core.Hit<{  count :number,   isRefined :boolean,   label :string,   value :std.Array<string>}> */
@js.native
trait HitcountnumberisRefinedbo extends js.Object {
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: typings.reactInstantsearchCore.mod.HighlightResult[Value] = js.native
  var count: Double = js.native
  var isRefined: Boolean = js.native
  var label: String = js.native
  var objectID: String = js.native
  var value: js.Array[String] = js.native
}

object HitcountnumberisRefinedbo {
  @scala.inline
  def apply(
    _highlightResult: typings.reactInstantsearchCore.mod.HighlightResult[Value],
    count: Double,
    isRefined: Boolean,
    label: String,
    objectID: String,
    value: js.Array[String]
  ): HitcountnumberisRefinedbo = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitcountnumberisRefinedbo]
  }
  @scala.inline
  implicit class HitcountnumberisRefinedboOps[Self <: HitcountnumberisRefinedbo] (val x: Self) extends AnyVal {
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
    def set_highlightResult(value: typings.reactInstantsearchCore.mod.HighlightResult[Value]): Self = this.set("_highlightResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRefined(value: Boolean): Self = this.set("isRefined", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectID(value: String): Self = this.set("objectID", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

