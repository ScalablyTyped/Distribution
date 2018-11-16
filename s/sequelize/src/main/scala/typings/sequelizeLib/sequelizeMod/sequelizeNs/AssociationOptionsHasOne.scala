package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options provided when associating models with hasOne relationship
     *
     * @see Association class hasOne method
     */

trait AssociationOptionsHasOne extends AssociationOptions {
  /**
           * A string or a data type to represent the identifier in the table
           */
  var keyType: js.UndefOr[DataTypeAbstract] = js.undefined
}

