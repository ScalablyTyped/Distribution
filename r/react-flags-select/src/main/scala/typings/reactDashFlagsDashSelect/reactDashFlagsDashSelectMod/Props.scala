package typings.reactDashFlagsDashSelect.reactDashFlagsDashSelectMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var alignOptions: js.UndefOr[String] = js.undefined
  var blackList: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  var customLabels: js.UndefOr[StringDictionary[String]] = js.undefined
  var defaultCountry: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* countryCode */ String, Unit]] = js.undefined
  var optionsSize: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var searchable: js.UndefOr[Boolean] = js.undefined
  var selectedSize: js.UndefOr[Double] = js.undefined
  var showOptionLabel: js.UndefOr[Boolean] = js.undefined
  var showSelectedLabel: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    alignOptions: String = null,
    blackList: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    countries: js.Array[String] = null,
    customLabels: StringDictionary[String] = null,
    defaultCountry: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onSelect: /* countryCode */ String => Unit = null,
    optionsSize: Int | Double = null,
    placeholder: String = null,
    searchable: js.UndefOr[Boolean] = js.undefined,
    selectedSize: Int | Double = null,
    showOptionLabel: js.UndefOr[Boolean] = js.undefined,
    showSelectedLabel: js.UndefOr[Boolean] = js.undefined
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

