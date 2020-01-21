package typings.proxyLists.mod

import typings.proxyLists.proxyListsStrings.loose
import typings.proxyLists.proxyListsStrings.strict
import typings.request.mod.CoreOptions
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
    if (anonymityLevels != null) __obj.updateDynamic("anonymityLevels")(anonymityLevels.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (countriesBlackList != null) __obj.updateDynamic("countriesBlackList")(countriesBlackList.asInstanceOf[js.Any])
    if (defaultRequestOptions != null) __obj.updateDynamic("defaultRequestOptions")(defaultRequestOptions.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (ipTypes != null) __obj.updateDynamic("ipTypes")(ipTypes.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(sample)) __obj.updateDynamic("sample")(sample.asInstanceOf[js.Any])
    if (!js.isUndefined(series)) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (sourcesBlackList != null) __obj.updateDynamic("sourcesBlackList")(sourcesBlackList.asInstanceOf[js.Any])
    if (sourcesWhiteList != null) __obj.updateDynamic("sourcesWhiteList")(sourcesWhiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalOptions]
  }
}

