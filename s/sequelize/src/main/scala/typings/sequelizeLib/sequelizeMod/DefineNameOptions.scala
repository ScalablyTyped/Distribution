package typings
package sequelizeLib.sequelizeMod

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
  var plural: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Singular model name
    */
  var singular: js.UndefOr[java.lang.String] = js.undefined
}

object DefineNameOptions {
  @scala.inline
  def apply(plural: java.lang.String = null, singular: java.lang.String = null): DefineNameOptions = {
    val __obj = js.Dynamic.literal()
    if (plural != null) __obj.updateDynamic("plural")(plural)
    if (singular != null) __obj.updateDynamic("singular")(singular)
    __obj.asInstanceOf[DefineNameOptions]
  }
}

