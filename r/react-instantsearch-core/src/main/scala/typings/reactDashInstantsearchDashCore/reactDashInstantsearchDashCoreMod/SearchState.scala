package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashInstantsearchDashCore.Anon_AroundLatLng
import typings.reactDashInstantsearchDashCore.Anon_Configure
import typings.reactDashInstantsearchDashCore.Anon_Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchState
  extends /* widgetId */ StringDictionary[js.Any] {
  var configure: js.UndefOr[Anon_AroundLatLng] = js.undefined
  var hierarchicalMenu: js.UndefOr[StringDictionary[String]] = js.undefined
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  var indices: js.UndefOr[StringDictionary[Anon_Configure]] = js.undefined
  var menu: js.UndefOr[StringDictionary[String]] = js.undefined
  var multiRange: js.UndefOr[StringDictionary[String]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[StringDictionary[Anon_Max]] = js.undefined
  var refinementList: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}

object SearchState {
  @scala.inline
  def apply(
    StringDictionary: /* widgetId */ StringDictionary[js.Any] = null,
    configure: Anon_AroundLatLng = null,
    hierarchicalMenu: StringDictionary[String] = null,
    hitsPerPage: Int | Double = null,
    indices: StringDictionary[Anon_Configure] = null,
    menu: StringDictionary[String] = null,
    multiRange: StringDictionary[String] = null,
    page: Int | Double = null,
    query: String = null,
    range: StringDictionary[Anon_Max] = null,
    refinementList: StringDictionary[js.Array[String]] = null,
    sortBy: String = null,
    toggle: StringDictionary[Boolean] = null
  ): SearchState = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (configure != null) __obj.updateDynamic("configure")(configure)
    if (hierarchicalMenu != null) __obj.updateDynamic("hierarchicalMenu")(hierarchicalMenu)
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (multiRange != null) __obj.updateDynamic("multiRange")(multiRange)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (range != null) __obj.updateDynamic("range")(range)
    if (refinementList != null) __obj.updateDynamic("refinementList")(refinementList)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[SearchState]
  }
}

