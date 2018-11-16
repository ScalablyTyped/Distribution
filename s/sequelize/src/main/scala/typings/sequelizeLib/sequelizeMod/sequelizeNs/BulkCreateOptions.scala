package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options for Model.bulkCreate method
     */


trait BulkCreateOptions
  extends FieldsOptions
     with LoggingOptions
     with SearchPathOptions
     with ReturningOptions {
  /**
           * Run before / after bulk create hooks?
           */
  var hooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Ignore duplicate values for primary keys? (not supported by postgres)
           *
           * Defaults to false
           */
  var ignoreDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Run before / after create hooks for each individual Instance? BulkCreate hooks will still be run if
           * options.hooks is true.
           */
  var individualHooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Fields to update if row key already exists (on duplicate key update)? (only supported by mysql &
           * mariadb). By default, all fields are updated.
           */
  var updateOnDuplicate: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

