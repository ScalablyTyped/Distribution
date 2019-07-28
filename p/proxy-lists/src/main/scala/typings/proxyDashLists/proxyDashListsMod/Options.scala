package typings.proxyDashLists.proxyDashListsMod

import typings.proxyDashLists.proxyDashListsStrings.loose
import typings.proxyDashLists.proxyDashListsStrings.strict
import typings.request.requestMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var anonymityLevels: js.UndefOr[js.Array[AnonymityLevel]] = js.undefined
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  var countriesBlackList: js.UndefOr[js.Array[String]] = js.undefined
  var defaultRequestOptions: js.UndefOr[CoreOptions] = js.undefined
  var filterMode: js.UndefOr[strict | loose] = js.undefined
  var ipTypes: js.UndefOr[js.Array[IPType]] = js.undefined
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  var series: js.UndefOr[Boolean] = js.undefined
  var sourcesBlackList: js.UndefOr[js.Array[String]] = js.undefined
  var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    anonymityLevels: js.Array[AnonymityLevel] = null,
    countries: js.Array[String] = null,
    countriesBlackList: js.Array[String] = null,
    defaultRequestOptions: CoreOptions = null,
    filterMode: strict | loose = null,
    ipTypes: js.Array[IPType] = null,
    protocols: js.Array[Protocol] = null,
    series: js.UndefOr[Boolean] = js.undefined,
    sourcesBlackList: js.Array[String] = null,
    sourcesWhiteList: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (anonymityLevels != null) __obj.updateDynamic("anonymityLevels")(anonymityLevels)
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (countriesBlackList != null) __obj.updateDynamic("countriesBlackList")(countriesBlackList)
    if (defaultRequestOptions != null) __obj.updateDynamic("defaultRequestOptions")(defaultRequestOptions)
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (ipTypes != null) __obj.updateDynamic("ipTypes")(ipTypes)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (!js.isUndefined(series)) __obj.updateDynamic("series")(series)
    if (sourcesBlackList != null) __obj.updateDynamic("sourcesBlackList")(sourcesBlackList)
    if (sourcesWhiteList != null) __obj.updateDynamic("sourcesWhiteList")(sourcesWhiteList)
    __obj.asInstanceOf[Options]
  }
}

