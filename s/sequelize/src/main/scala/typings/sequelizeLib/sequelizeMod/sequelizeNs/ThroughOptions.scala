package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Used for a association table in n:m associations.
     *
     * @see AssociationOptionsBelongsToMany
     */

trait ThroughOptions extends js.Object {
  /**
           * The model used to join both sides of the N:M association.
           */
  var model: Model[_, _]
  /**
           * A key/value set that will be used for association create and find defaults on the through model.
           * (Remember to add the attributes to the through model)
           */
  var scope: js.UndefOr[AssociationScope] = js.undefined
  /**
           * If true a unique key will be generated from the foreign keys used (might want to turn this off and create
           * specific unique keys when using scopes)
           *
           * Defaults to true
           */
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

