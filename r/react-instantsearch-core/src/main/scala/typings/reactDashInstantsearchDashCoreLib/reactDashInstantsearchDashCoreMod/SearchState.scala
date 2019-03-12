package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchState
  extends /* widgetId */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var configure: js.UndefOr[reactDashInstantsearchDashCoreLib.Anon_AroundLatLng] = js.undefined
  var hierarchicalMenu: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var hitsPerPage: js.UndefOr[scala.Double] = js.undefined
  var indices: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactDashInstantsearchDashCoreLib.Anon_Configure]
  ] = js.undefined
  var menu: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var multiRange: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactDashInstantsearchDashCoreLib.Anon_Max]
  ] = js.undefined
  var refinementList: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  var toggle: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
}

object SearchState {
  @scala.inline
  def apply(
    StringDictionary: /* widgetId */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    configure: reactDashInstantsearchDashCoreLib.Anon_AroundLatLng = null,
    hierarchicalMenu: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    hitsPerPage: scala.Int | scala.Double = null,
    indices: org.scalablytyped.runtime.StringDictionary[reactDashInstantsearchDashCoreLib.Anon_Configure] = null,
    menu: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    multiRange: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    page: scala.Int | scala.Double = null,
    query: java.lang.String = null,
    range: org.scalablytyped.runtime.StringDictionary[reactDashInstantsearchDashCoreLib.Anon_Max] = null,
    refinementList: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    sortBy: java.lang.String = null,
    toggle: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null
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

