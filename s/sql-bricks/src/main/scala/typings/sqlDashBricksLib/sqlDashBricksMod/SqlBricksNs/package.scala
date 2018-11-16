package typings
package sqlDashBricksLib.sqlDashBricksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SqlBricksNs {
  type TableName = java.lang.String | SelectStatement
  /**
     * When a non-expression object is passed somewhere a whereExpression is expected,
     * each key/value pair will be ANDed together:
     */
  type WhereExpression = WhereGroup | WhereBinary | WhereObject | java.lang.String
}
