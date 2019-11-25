package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Through options for Include Options
  */
trait IncludeThroughOptions extends js.Object {
  /**
    * A list of attributes to select from the join model for belongsToMany relations
    */
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Filter on the join model for belongsToMany relations
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object IncludeThroughOptions {
  @scala.inline
  def apply(attributes: js.Array[String] = null, where: AnyWhereOptions = null): IncludeThroughOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeThroughOptions]
  }
}

