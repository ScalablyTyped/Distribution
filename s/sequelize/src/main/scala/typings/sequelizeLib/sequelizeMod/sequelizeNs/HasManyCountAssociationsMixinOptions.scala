package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The options for the countAssociations mixin of the hasMany association.
     * @see HasManyCountAssociationsMixin
     */

trait HasManyCountAssociationsMixinOptions extends js.Object {
  /**
           * Apply a scope on the related model, or remove its default scope by passing false.
           */
  var scope: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
           * An optional where clause to limit the associated models.
           */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

