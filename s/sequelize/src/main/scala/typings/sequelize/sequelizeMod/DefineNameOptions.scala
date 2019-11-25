package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for name property in DefineOptions
  *
  * @see DefineOptions
  */
trait DefineNameOptions extends js.Object {
  /**
    * Plural model name
    */
  var plural: js.UndefOr[String] = js.undefined
  /**
    * Singular model name
    */
  var singular: js.UndefOr[String] = js.undefined
}

object DefineNameOptions {
  @scala.inline
  def apply(plural: String = null, singular: String = null): DefineNameOptions = {
    val __obj = js.Dynamic.literal()
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (singular != null) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineNameOptions]
  }
}

