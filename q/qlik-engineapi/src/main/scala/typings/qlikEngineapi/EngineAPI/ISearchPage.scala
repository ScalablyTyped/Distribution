package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchPage...
  */
@js.native
trait ISearchPage extends js.Object {
  /**
    * Number of search groups to return (in qSearchGroupArray).
    */
  var qCount: Double = js.native
  /**
    * Options of the search group items.
    * If this property is not set, all values are returned.
    * This property is to be used with the SearchResults method or the SearchObjects method.
    */
  var qGroupItemOptions: js.Array[ISearchGroupItemOptions] = js.native
  /**
    * Options of the search groups.
    * If this property is not set, all values are returned.
    * This property is to be used with the SearchResults method or the SearchObjects method.
    */
  var qGroupOptions: js.Array[ISearchGroupOptions] = js.native
  /**
    * Maximum number of matching values to return per search result.
    * The default value is -1; all values are returned.
    * This property is to be used with the SearchAssociations method.
    */
  var qMaxNbrFieldMatches: Double = js.native
  /**
    * Position from the top, starting from 0.
    * If the offset is set to 0, the first search result to be returned is at position 0.
    */
  var qOffset: Double = js.native
}

object ISearchPage {
  @scala.inline
  def apply(
    qCount: Double,
    qGroupItemOptions: js.Array[ISearchGroupItemOptions],
    qGroupOptions: js.Array[ISearchGroupOptions],
    qMaxNbrFieldMatches: Double,
    qOffset: Double
  ): ISearchPage = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupItemOptions = qGroupItemOptions.asInstanceOf[js.Any], qGroupOptions = qGroupOptions.asInstanceOf[js.Any], qMaxNbrFieldMatches = qMaxNbrFieldMatches.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPage]
  }
  @scala.inline
  implicit class ISearchPageOps[Self <: ISearchPage] (val x: Self) extends AnyVal {
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
    def setQCount(value: Double): Self = this.set("qCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQGroupItemOptionsVarargs(value: ISearchGroupItemOptions*): Self = this.set("qGroupItemOptions", js.Array(value :_*))
    @scala.inline
    def setQGroupItemOptions(value: js.Array[ISearchGroupItemOptions]): Self = this.set("qGroupItemOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQGroupOptionsVarargs(value: ISearchGroupOptions*): Self = this.set("qGroupOptions", js.Array(value :_*))
    @scala.inline
    def setQGroupOptions(value: js.Array[ISearchGroupOptions]): Self = this.set("qGroupOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMaxNbrFieldMatches(value: Double): Self = this.set("qMaxNbrFieldMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOffset(value: Double): Self = this.set("qOffset", value.asInstanceOf[js.Any])
  }
  
}

