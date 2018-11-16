package typings
package sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * An UPDATE statement
   */
@js.native
trait UpdateStatement extends Statement {
  def and(): UpdateStatement = js.native
  def and(column: java.lang.String): UpdateStatement = js.native
  def and(column: java.lang.String, value: js.Any): UpdateStatement = js.native
  def and(column: scala.Null, value: js.Any): UpdateStatement = js.native
  def and(whereExpr: WhereExpression*): UpdateStatement = js.native
  def set(values: js.Any*): UpdateStatement = js.native
  def values(values: js.Any*): UpdateStatement = js.native
  def where(): UpdateStatement = js.native
  def where(column: java.lang.String): UpdateStatement = js.native
  def where(column: java.lang.String, value: js.Any): UpdateStatement = js.native
  def where(column: scala.Null, value: js.Any): UpdateStatement = js.native
  def where(whereExpr: WhereExpression*): UpdateStatement = js.native
}

