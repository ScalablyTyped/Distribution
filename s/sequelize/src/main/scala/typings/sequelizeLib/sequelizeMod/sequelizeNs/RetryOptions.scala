package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for retry Options in the sequelize constructor and QueryOptions
  *
  * @see Options, QueryOptions
  */
trait RetryOptions extends js.Object {
  /**
    * Only retry a query if the error matches one of these strings.
    */
  var `match`: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp | nodeLib.Error]] = js.undefined
  /**
    * How many times a failing query is automatically retried. Set to 0 to disable retrying on SQL_BUSY error.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    `match`: js.Array[java.lang.String | stdLib.RegExp | nodeLib.Error] = null,
    max: scala.Int | scala.Double = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

