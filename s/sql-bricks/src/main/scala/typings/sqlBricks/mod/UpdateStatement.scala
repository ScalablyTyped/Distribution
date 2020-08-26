package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An UPDATE statement
  */
@js.native
trait UpdateStatement extends Statement {
  def and(): UpdateStatement = js.native
  def and(column: js.UndefOr[scala.Nothing], value: js.Any): UpdateStatement = js.native
  def and(column: String): UpdateStatement = js.native
  def and(column: String, value: js.Any): UpdateStatement = js.native
  def and(column: Null, value: js.Any): UpdateStatement = js.native
  def and(whereExpr: WhereExpression*): UpdateStatement = js.native
  def set(values: js.Any*): UpdateStatement = js.native
  def values(values: js.Any*): UpdateStatement = js.native
  def where(): UpdateStatement = js.native
  def where(column: js.UndefOr[scala.Nothing], value: js.Any): UpdateStatement = js.native
  def where(column: String): UpdateStatement = js.native
  def where(column: String, value: js.Any): UpdateStatement = js.native
  def where(column: Null, value: js.Any): UpdateStatement = js.native
  def where(whereExpr: WhereExpression*): UpdateStatement = js.native
}

