package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options provided for many-to-many relationships
     *
     * @see AssociationOptionsHasMany
     * @see AssociationOptionsBelongsToMany
     */

trait AssociationOptionsManyToMany extends AssociationOptions {
  /**
           * A key/value set that will be used for association create and find defaults on the target.
           * (sqlite not supported for N:M)
           */
  var scope: js.UndefOr[AssociationScope] = js.undefined
}

