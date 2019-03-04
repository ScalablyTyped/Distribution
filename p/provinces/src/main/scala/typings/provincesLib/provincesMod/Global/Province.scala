package typings
package provincesLib.provincesMod.Global

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
  var alt: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * country abbreviation
    */
  var country: java.lang.String
  /**
    * full name of the province or state
    */
  var name: java.lang.String
  /**
    * optional region of a country (for example: "Wales")
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional 2 or 3 character short name
    */
  var short: js.UndefOr[java.lang.String] = js.undefined
}

object Province {
  @scala.inline
  def apply(
    country: java.lang.String,
    name: java.lang.String,
    alt: js.Array[java.lang.String] = null,
    region: java.lang.String = null,
    short: java.lang.String = null
  ): Province = {
    val __obj = js.Dynamic.literal(country = country, name = name)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (region != null) __obj.updateDynamic("region")(region)
    if (short != null) __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[Province]
  }
}

