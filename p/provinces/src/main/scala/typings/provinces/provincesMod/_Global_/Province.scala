package typings.provinces.provincesMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/substack/provinces#data-format}
  */
trait Province extends js.Object {
  /**
    * optional array of additional names and abbreviations
    */
  var alt: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * country abbreviation
    */
  var country: String
  /**
    * full name of the province or state
    */
  var name: String
  /**
    * optional region of a country (for example: "Wales")
    */
  var region: js.UndefOr[String] = js.undefined
  /**
    * optional 2 or 3 character short name
    */
  var short: js.UndefOr[String] = js.undefined
}

object Province {
  @scala.inline
  def apply(
    country: String,
    name: String,
    alt: js.Array[String] = null,
    region: String = null,
    short: String = null
  ): Province = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Province]
  }
}

