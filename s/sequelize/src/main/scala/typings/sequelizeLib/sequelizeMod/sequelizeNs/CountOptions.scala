package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.count method
  */
trait CountOptions
  extends LoggingOptions
     with SearchPathOptions {
  /**
    * Used in conjustion with `group`
    */
  var attributes: js.UndefOr[js.Array[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]] = js.undefined
  /**
    * Apply column on which COUNT() should be applied
    */
  var col: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Apply COUNT(DISTINCT(col))
    */
  var distinct: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For creating complex counts. Will return multiple rows as needed.
    *
    * TODO: Check?
    */
  var group: js.UndefOr[js.Object] = js.undefined
  /**
    * Include options. See `find` for details
    */
  var include: js.UndefOr[js.Array[(Model[_, _]) | IncludeOptions]] = js.undefined
  /**
    * A hash of search attributes.
    */
  var where: js.UndefOr[AnyWhereOptions | js.Array[java.lang.String]] = js.undefined
}

