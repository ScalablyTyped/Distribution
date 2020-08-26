package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestExtra extends js.Object {
  /**
    * Set to true if this property must always be passed.
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  /**
    * The name of the property
    *
    * This name will be used in the extraProps argument itself.
    */
  var name: Extra = js.native
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
  var options: js.UndefOr[js.Array[String]] = js.native
  /**
    * The limit of values a user may select from the pre-set options list
    *
    * By default this is set to 1.
    */
  var optionsLimit: js.UndefOr[Double] = js.native
}

object ManifestExtra {
  @scala.inline
  def apply(name: Extra): ManifestExtra = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestExtra]
  }
  @scala.inline
  implicit class ManifestExtraOps[Self <: ManifestExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Extra): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setOptionsLimit(value: Double): Self = this.set("optionsLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsLimit: Self = this.set("optionsLimit", js.undefined)
  }
  
}

