package typings
package proxyDashListsLib.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var anonymityLevels: js.UndefOr[js.Array[AnonymityLevel]] = js.undefined
  var countries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var countriesBlackList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var defaultRequestOptions: js.UndefOr[requestLib.requestMod.requestNs.CoreOptions] = js.undefined
  var filterMode: js.UndefOr[
    proxyDashListsLib.proxyDashListsLibStrings.strict | proxyDashListsLib.proxyDashListsLibStrings.loose
  ] = js.undefined
  var ipTypes: js.UndefOr[js.Array[IPType]] = js.undefined
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  var series: js.UndefOr[scala.Boolean] = js.undefined
  var sourcesBlackList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sourcesWhiteList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

