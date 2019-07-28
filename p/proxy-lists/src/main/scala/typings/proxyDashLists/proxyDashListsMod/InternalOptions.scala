package typings.proxyDashLists.proxyDashListsMod

import typings.proxyDashLists.proxyDashListsStrings.loose
import typings.proxyDashLists.proxyDashListsStrings.strict
import typings.request.requestMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalOptions extends Options {
  var sample: js.UndefOr[Boolean] = js.undefined
}

object InternalOptions {
  @scala.inline
  def apply(
    anonymityLevels: js.Array[AnonymityLevel] = null,
    countries: js.Array[String] = null,
    countriesBlackList: js.Array[String] = null,
    defaultRequestOptions: CoreOptions = null,
    filterMode: strict | loose = null,
    ipTypes: js.Array[IPType] = null,
    protocols: js.Array[Protocol] = null,
    sample: js.UndefOr[Boolean] = js.undefined,
    series: js.UndefOr[Boolean] = js.undefined,
    sourcesBlackList: js.Array[String] = null,
    sourcesWhiteList: js.Array[String] = null
  ): InternalOptions = {
    val __obj = js.Dynamic.literal()
    if (anonymityLevels != null) __obj.updateDynamic("anonymityLevels")(anonymityLevels)
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (countriesBlackList != null) __obj.updateDynamic("countriesBlackList")(countriesBlackList)
    if (defaultRequestOptions != null) __obj.updateDynamic("defaultRequestOptions")(defaultRequestOptions)
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (ipTypes != null) __obj.updateDynamic("ipTypes")(ipTypes)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (!js.isUndefined(sample)) __obj.updateDynamic("sample")(sample)
    if (!js.isUndefined(series)) __obj.updateDynamic("series")(series)
    if (sourcesBlackList != null) __obj.updateDynamic("sourcesBlackList")(sourcesBlackList)
    if (sourcesWhiteList != null) __obj.updateDynamic("sourcesWhiteList")(sourcesWhiteList)
    __obj.asInstanceOf[InternalOptions]
  }
}

