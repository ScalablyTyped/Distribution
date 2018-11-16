package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options provided when associating models with hasMany relationship
     *
     * @see Association class hasMany method
     */

trait AssociationOptionsHasMany extends AssociationOptionsManyToMany {
  /**
           * A string or a data type to represent the identifier in the table
           */
  var keyType: js.UndefOr[DataTypeAbstract] = js.undefined
  /**
           * A string to represent the name of the field to use as the key for an 1 to many association in the source table.
           *
           * @see http://docs.sequelizejs.com/class/lib/model.js~Model.html#static-method-hasMany
           * @see https://github.com/sequelize/sequelize/blob/b4fd46426db9cdbb97074bea121203d565e4195d/lib/associations/has-many.js#L81
           */
  var sourceKey: js.UndefOr[java.lang.String] = js.undefined
}

