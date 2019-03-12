package typings
package reactDashFlagsDashSelectLib.reactDashFlagsDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var alignOptions: js.UndefOr[java.lang.String] = js.undefined
  var blackList: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var countries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var customLabels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var defaultCountry: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* countryCode */ java.lang.String, scala.Unit]] = js.undefined
  var optionsSize: js.UndefOr[scala.Double] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var searchable: js.UndefOr[scala.Boolean] = js.undefined
  var selectedSize: js.UndefOr[scala.Double] = js.undefined
  var showOptionLabel: js.UndefOr[scala.Boolean] = js.undefined
  var showSelectedLabel: js.UndefOr[scala.Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    alignOptions: java.lang.String = null,
    blackList: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    countries: js.Array[java.lang.String] = null,
    customLabels: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    defaultCountry: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: /* countryCode */ java.lang.String => scala.Unit = null,
    optionsSize: scala.Int | scala.Double = null,
    placeholder: java.lang.String = null,
    searchable: js.UndefOr[scala.Boolean] = js.undefined,
    selectedSize: scala.Int | scala.Double = null,
    showOptionLabel: js.UndefOr[scala.Boolean] = js.undefined,
    showSelectedLabel: js.UndefOr[scala.Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (alignOptions != null) __obj.updateDynamic("alignOptions")(alignOptions)
    if (!js.isUndefined(blackList)) __obj.updateDynamic("blackList")(blackList)
    if (className != null) __obj.updateDynamic("className")(className)
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (customLabels != null) __obj.updateDynamic("customLabels")(customLabels)
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (optionsSize != null) __obj.updateDynamic("optionsSize")(optionsSize.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable)
    if (selectedSize != null) __obj.updateDynamic("selectedSize")(selectedSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showOptionLabel)) __obj.updateDynamic("showOptionLabel")(showOptionLabel)
    if (!js.isUndefined(showSelectedLabel)) __obj.updateDynamic("showSelectedLabel")(showSelectedLabel)
    __obj.asInstanceOf[Props]
  }
}

