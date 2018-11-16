package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options provided when associating models with belongsTo relationship
     *
     * @see Association class belongsTo method
     */

trait AssociationOptionsBelongsTo extends AssociationOptions {
  /**
           * A string or a data type to represent the identifier in the table
           */
  var keyType: js.UndefOr[DataTypeAbstract] = js.undefined
  /**
           * The name of the field to use as the key for the association in the target table. Defaults to the primary
           * key of the target table
           */
  var targetKey: js.UndefOr[java.lang.String] = js.undefined
}

