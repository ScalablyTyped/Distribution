package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchResult...
  */
@js.native
trait ISearchResult extends js.Object {
  /**
    * List of search groups.
    * The groups are numbered
    * from
    * the value of SearchPage.qOffset
    * to
    * the value of SearchPage.qOffset + SearchPage.qCount.
    */
  var qSearchGroupArray: ISearchGroup = js.native
  /**
    * List of the search terms.
    */
  var qSearchTerms: js.Array[String] = js.native
  /**
    * Total number of groups.
    */
  var qTotalNumberOfGroups: Double = js.native
}

object ISearchResult {
  @scala.inline
  def apply(qSearchGroupArray: ISearchGroup, qSearchTerms: js.Array[String], qTotalNumberOfGroups: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(qSearchGroupArray = qSearchGroupArray.asInstanceOf[js.Any], qSearchTerms = qSearchTerms.asInstanceOf[js.Any], qTotalNumberOfGroups = qTotalNumberOfGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchResult]
  }
  @scala.inline
  implicit class ISearchResultOps[Self <: ISearchResult] (val x: Self) extends AnyVal {
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
    def setQSearchGroupArray(value: ISearchGroup): Self = this.set("qSearchGroupArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSearchTermsVarargs(value: String*): Self = this.set("qSearchTerms", js.Array(value :_*))
    @scala.inline
    def setQSearchTerms(value: js.Array[String]): Self = this.set("qSearchTerms", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTotalNumberOfGroups(value: Double): Self = this.set("qTotalNumberOfGroups", value.asInstanceOf[js.Any])
  }
  
}

