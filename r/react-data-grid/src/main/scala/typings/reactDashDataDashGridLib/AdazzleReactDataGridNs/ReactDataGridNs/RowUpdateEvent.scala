package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information about a row update. Generic event type returns untyped row, use parameterized type with the row type as the parameter
     * @default T = any
     */

trait RowUpdateEvent[T] extends js.Object {
  /**
           * The name of the column that was updated.
           */
  var cellKey: java.lang.String
  /**
           * The name of the key pressed to trigger the event ('Tab', 'Enter', etc.).
           */
  var key: java.lang.String
  /**
           * The index of the updated row.
           */
  var rowIdx: scala.Double
  /**
           * The columns that were updated and their values.
           */
  var updated: T
}

