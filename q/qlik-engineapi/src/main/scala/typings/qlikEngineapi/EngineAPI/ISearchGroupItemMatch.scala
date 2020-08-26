package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroupItemMatch...
  */
@js.native
trait ISearchGroupItemMatch extends js.Object {
  /**
    * Property of the search group item.
    * For example, if the user requests SearchObjects with SearchObjectOptions.qAttributes = [],
    * then the outputted qAttributes will be empty.
    *
    * Otherwise, if SearchObjectOptions.qAttributes = [qProperty],
    * SearchGroupItemMatch.qAttributes = [qProperty, qMetaDef/title]
    * if the match has been found in the title of the item.
    *
    * For dimension values, the returned qProperty will be *.
    */
  var qAttributes: js.Array[ISearchAttribute] = js.native
  /**
    * List of ranges.
    * For example, if the search terms are Price and Make, and the search group item value is Make by Price vs Mileage,
    * then there are two ranges: one for Price and one for Make.
    */
  var qRanges: js.Array[ISearchCharRange] = js.native
  /**
    * Search match value.
    * Value of the search group item.
    * If the match is found in a field, it corresponds to the value of the field.
    * If the match is found in a generic object property, it corresponds to the property value.
    */
  var qText: String = js.native
}

object ISearchGroupItemMatch {
  @scala.inline
  def apply(qAttributes: js.Array[ISearchAttribute], qRanges: js.Array[ISearchCharRange], qText: String): ISearchGroupItemMatch = {
    val __obj = js.Dynamic.literal(qAttributes = qAttributes.asInstanceOf[js.Any], qRanges = qRanges.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroupItemMatch]
  }
  @scala.inline
  implicit class ISearchGroupItemMatchOps[Self <: ISearchGroupItemMatch] (val x: Self) extends AnyVal {
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
    def setQAttributesVarargs(value: ISearchAttribute*): Self = this.set("qAttributes", js.Array(value :_*))
    @scala.inline
    def setQAttributes(value: js.Array[ISearchAttribute]): Self = this.set("qAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setQRangesVarargs(value: ISearchCharRange*): Self = this.set("qRanges", js.Array(value :_*))
    @scala.inline
    def setQRanges(value: js.Array[ISearchCharRange]): Self = this.set("qRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
  }
  
}

