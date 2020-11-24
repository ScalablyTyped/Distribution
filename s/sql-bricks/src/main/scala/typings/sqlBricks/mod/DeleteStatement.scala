package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DELETE statement
  */
@js.native
trait DeleteStatement extends Statement {
  
  def and(): SelectStatement = js.native
  def and(column: js.UndefOr[scala.Nothing], value: js.Any): SelectStatement = js.native
  def and(column: String): SelectStatement = js.native
  def and(column: String, value: js.Any): SelectStatement = js.native
  def and(column: Null, value: js.Any): SelectStatement = js.native
  def and(whereExpr: WhereExpression*): SelectStatement = js.native
  
  def from(tbls: String*): DeleteStatement = js.native
  
  def using(columnList: String*): SelectStatement = js.native
  def using(columnList: js.Array[String]): SelectStatement = js.native
  
  def where(): SelectStatement = js.native
  def where(column: js.UndefOr[scala.Nothing], value: js.Any): SelectStatement = js.native
  def where(column: String): SelectStatement = js.native
  def where(column: String, value: js.Any): SelectStatement = js.native
  def where(column: Null, value: js.Any): SelectStatement = js.native
  def where(whereExpr: WhereExpression*): SelectStatement = js.native
}
