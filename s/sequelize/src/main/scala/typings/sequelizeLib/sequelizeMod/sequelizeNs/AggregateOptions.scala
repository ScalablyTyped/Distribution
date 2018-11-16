package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options used for Model.aggregate
     */

trait AggregateOptions extends LoggingOptions {
  /**
           * The type of the result. If `field` is a field in this Model, the default will be the type of that field,
           * otherwise defaults to float.
           */
  var dataType: js.UndefOr[DataTypeAbstract | java.lang.String] = js.undefined
  /**
           * Applies DISTINCT to the field being aggregated over
           */
  var distinct: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When `true`, the first returned value of `aggregateFunction` is cast to `dataType` and returned.
           * If additional attributes are specified, along with `group` clauses, set `plain` to `false` to return all values of all returned rows.
           * Defaults to `true`
           */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The transaction that the query should be executed under
           */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
           * A hash of search attributes.
           */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

