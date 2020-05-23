package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestExtra extends js.Object {
  /**
    * Set to true if this property must always be passed.
    */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the property
    *
    * This name will be used in the extraProps argument itself.
    */
  var name: Extra
  /**
    * Possible values for this property.
    * This is useful for things like genres, where you need the user to select from a pre-set list of options.
    *
    * e.g. { name: "genre", options: ["Action", "Comedy", "Drama"] }
    *
    *
    * It's also useful if we want to specify a limited number of pages (for the skip parameter).
    *
    * e.g. { name: "skip", options: ["0", "100", "200"] }
    */
  var options: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The limit of values a user may select from the pre-set options list
    *
    * By default this is set to 1.
    */
  var optionsLimit: js.UndefOr[Double] = js.undefined
}

object ManifestExtra {
  @scala.inline
  def apply(
    name: Extra,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    options: js.Array[String] = null,
    optionsLimit: js.UndefOr[Double] = js.undefined
  ): ManifestExtra = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsLimit)) __obj.updateDynamic("optionsLimit")(optionsLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestExtra]
  }
}

