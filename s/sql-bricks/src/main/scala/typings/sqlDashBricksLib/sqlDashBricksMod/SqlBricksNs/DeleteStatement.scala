package typings
package sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DELETE statement
  */
@js.native
trait DeleteStatement extends Statement {
  def and(): SelectStatement = js.native
  def and(column: java.lang.String): SelectStatement = js.native
  def and(column: java.lang.String, value: js.Any): SelectStatement = js.native
  def and(column: scala.Null, value: js.Any): SelectStatement = js.native
  def and(whereExpr: WhereExpression*): SelectStatement = js.native
  def from(tbls: java.lang.String*): DeleteStatement = js.native
  def using(columnList: java.lang.String*): SelectStatement = js.native
  def using(columnList: js.Array[java.lang.String]): SelectStatement = js.native
  def where(): SelectStatement = js.native
  def where(column: java.lang.String): SelectStatement = js.native
  def where(column: java.lang.String, value: js.Any): SelectStatement = js.native
  def where(column: scala.Null, value: js.Any): SelectStatement = js.native
  def where(whereExpr: WhereExpression*): SelectStatement = js.native
}

