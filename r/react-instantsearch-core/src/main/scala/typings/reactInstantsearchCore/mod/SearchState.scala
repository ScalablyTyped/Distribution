package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactInstantsearchCore.anon.Dictkey
import typings.reactInstantsearchCore.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchState
  extends /* widgetId */ StringDictionary[js.Any] {
  var configure: js.UndefOr[Dictkey] = js.native
  var hierarchicalMenu: js.UndefOr[StringDictionary[String]] = js.native
  var hitsPerPage: js.UndefOr[Double] = js.native
  var indices: js.UndefOr[StringDictionary[typings.reactInstantsearchCore.anon.Configure]] = js.native
  var menu: js.UndefOr[StringDictionary[String]] = js.native
  var multiRange: js.UndefOr[StringDictionary[String]] = js.native
  var page: js.UndefOr[Double] = js.native
  var query: js.UndefOr[String] = js.native
  var range: js.UndefOr[StringDictionary[Max]] = js.native
  var refinementList: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  var sortBy: js.UndefOr[String] = js.native
  var toggle: js.UndefOr[StringDictionary[Boolean]] = js.native
}

object SearchState {
  @scala.inline
  def apply(): SearchState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchState]
  }
  @scala.inline
  implicit class SearchStateOps[Self <: SearchState] (val x: Self) extends AnyVal {
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
    def setConfigure(value: Dictkey): Self = this.set("configure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigure: Self = this.set("configure", js.undefined)
    @scala.inline
    def setHierarchicalMenu(value: StringDictionary[String]): Self = this.set("hierarchicalMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchicalMenu: Self = this.set("hierarchicalMenu", js.undefined)
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitsPerPage: Self = this.set("hitsPerPage", js.undefined)
    @scala.inline
    def setIndices(value: StringDictionary[typings.reactInstantsearchCore.anon.Configure]): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    @scala.inline
    def setMenu(value: StringDictionary[String]): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setMultiRange(value: StringDictionary[String]): Self = this.set("multiRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiRange: Self = this.set("multiRange", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRange(value: StringDictionary[Max]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRefinementList(value: StringDictionary[js.Array[String]]): Self = this.set("refinementList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefinementList: Self = this.set("refinementList", js.undefined)
    @scala.inline
    def setSortBy(value: String): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    @scala.inline
    def setToggle(value: StringDictionary[Boolean]): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
  
}

