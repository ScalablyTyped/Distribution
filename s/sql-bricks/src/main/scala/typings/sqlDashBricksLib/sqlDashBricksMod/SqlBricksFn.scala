package typings
package sqlDashBricksLib.sqlDashBricksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlBricksFn extends js.Object {
  var conversions: js.Any = js.native
  var prop: scala.Double = js.native
  def apply(params: js.Any*): js.Any = js.native
  def _extension(): js.Any = js.native
  /**
     * Registers a set of frequently-used table aliases with SQL Bricks.
     * These table aliases can then be used by themselves in from(), join(), etc
     * and SQL Bricks will automatically expand them to include the table name as well as the alias.
     * @param expansions
     * @example
     * sql.aliasExpansions({'psn': 'person', 'addr': 'address', 'zip': 'zipcode', 'usr': 'user'});
     * select().from('psn').join('addr', {'psn.addr_id': 'addr.id'});
     * // SELECT * FROM person psn INNER JOIN address addr ON psn.addr_id = addr.id
     */
  def aliasExpansions(expansions: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  //////////////////////////////////////////
  //////  Where Expression functions  //////
  //////////////////////////////////////////
  /**
     * Joins the passed expressions with AND
     * @param whereExprs
     */
  def and(whereExprs: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression*): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereGroup = js.native
  /**
     * Generates a BETWEEN
     * @param column
     * @param value1
     * @param value2
     */
  def between(column: java.lang.String, value1: js.Any, value2: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression = js.native
  /**
     * Returns a new DELETE statement. It can be used with or without the new operator.
     * @alias deleteFrom
     * @param tbl table name
     */
  def delete(): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.DeleteStatement = js.native
  /**
     * Returns a new DELETE statement. It can be used with or without the new operator.
     * @alias deleteFrom
     * @param tbl table name
     */
  def delete(tbl: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.DeleteStatement = js.native
  /**
     * Returns a new DELETE statement. It can be used with or without the new operator.
     * @alias delete
     * @param tbl table name
     */
  def deleteFrom(): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.DeleteStatement = js.native
  /**
     * Returns a new DELETE statement. It can be used with or without the new operator.
     * @alias delete
     * @param tbl table name
     */
  def deleteFrom(tbl: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.DeleteStatement = js.native
  /**
     * Generates the appropriate relational operator (=, <>, <, <=, > or >=).
     * @param column column name or query result
     * @param value column value
     */
  def eq(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  /**
     * Generates the appropriate relational operator (=, <>, <, <=, > or >=).
     * @param column column name or query result
     * @param value column value
     */
  def eq(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  /**
     * Generates the appropriate relational operator (=, <>, <, <=, > or >=).
     * @param column column name or query result
     * @param value column value
     */
  def eq(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  /**
     * Generates the appropriate relational operator (=, <>, <, <=, > or >=).
     * @param column column name or query result
     * @param value column value
     */
  def eq(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqAll(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqAll(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqAny(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqAny(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqSome(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqSome(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def eqSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def equal(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def equal(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def equal(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def equal(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def exists(stmt: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression = js.native
  def gt(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gt(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gt(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gt(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtAll(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtAll(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtAny(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtAny(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtSome(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtSome(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gtSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gte(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gte(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gte(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gte(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteAll(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteAll(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteAny(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteAny(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteSome(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteSome(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def gteSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def in(column: java.lang.String, stmt: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression = js.native
  def in(column: java.lang.String, values: js.Any*): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression = js.native
  /**
     * Returns a new INSERT statement. It can be used with or without the new operator.
     * @alias insertInto
     * @param tbl table name
     * @param values a values object or a columns list. Passing a set of columns (as multiple arguments, a comma-delimited string or an array)
     * will put the statement into split keys/values mode, where a matching array of values is expected in values()
     * @example
     * insert('person', {'first_name': 'Fred', 'last_name': 'Flintstone'});
     * // INSERT INTO person (first_name, last_name) VALUES ('Fred', 'Flintstone')
     */
  def insert(): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.InsertStatement = js.native
  /**
     * Returns a new INSERT statement. It can be used with or without the new operator.
     * @alias insertInto
     * @param tbl table name
     * @param values a values object or a columns list. Passing a set of columns (as multiple arguments, a comma-delimited string or an array)
     * will put the statement into split keys/values mode, where a matching array of values is expected in values()
     * @example
     * insert('person', {'first_name': 'Fred', 'last_name': 'Flintstone'});
     * // INSERT INTO person (first_name, last_name) VALUES ('Fred', 'Flintstone')
     */
  def insert(tbl: java.lang.String, values: js.Any*): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.InsertStatement = js.native
  /**
     * Returns a new INSERT statement. It can be used with or without the new operator.
     * @alias insert
     * @param tbl table name
     * @param values a values object or a columns list. Passing a set of columns (as multiple arguments, a comma-delimited string or an array)
     * will put the statement into split keys/values mode, where a matching array of values is expected in values()
     * @example
     * insert('person', {'first_name': 'Fred', 'last_name': 'Flintstone'});
     * // INSERT INTO person (first_name, last_name) VALUES ('Fred', 'Flintstone')
     */
  def insertInto(): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.InsertStatement = js.native
  /**
     * Returns a new INSERT statement. It can be used with or without the new operator.
     * @alias insert
     * @param tbl table name
     * @param values a values object or a columns list. Passing a set of columns (as multiple arguments, a comma-delimited string or an array)
     * will put the statement into split keys/values mode, where a matching array of values is expected in values()
     * @example
     * insert('person', {'first_name': 'Fred', 'last_name': 'Flintstone'});
     * // INSERT INTO person (first_name, last_name) VALUES ('Fred', 'Flintstone')
     */
  def insertInto(tbl: java.lang.String, values: js.Any*): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.InsertStatement = js.native
  def isNotNull(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression = js.native
  def isNull(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression = js.native
  /**
     * Sets a user-supplied function to automatically generate the .on() criteria for joins whenever it is not supplied explicitly.
     * @param func
     */
  def joinCriteria(): js.Any = js.native
  /**
     * Sets a user-supplied function to automatically generate the .on() criteria for joins whenever it is not supplied explicitly.
     * @param func
     */
  def joinCriteria(func: js.Function1[/* repeated */js.Any, sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.OnCriteria]): js.Any = js.native
  def like(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression = js.native
  def like(column: java.lang.String, value: js.Any, escapeStr: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression = js.native
  def lt(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lt(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lt(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lt(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltAll(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltAll(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltAny(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltAny(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltSome(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltSome(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def ltSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lte(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lte(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lte(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lte(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteAll(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteAll(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteAny(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteAny(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteSome(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteSome(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def lteSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  /**
     * Negates the expression by wrapping it in NOT (...)
     * (if it is at the top level, the parentheses are unnecessary and will be omitted)
     * @param whereExpr
     */
  def not(whereExpr: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereGroup = js.native
  def notEq(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEq(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEq(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEq(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqAll(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqAll(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqAll(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqAny(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqAny(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqAny(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqSome(column: java.lang.String): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqSome(column: java.lang.String, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  def notEqSome(column: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement, value: js.Any): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereBinary = js.native
  /**
     * Joins the passed expressions with OR:
     * @param whereExprs
     */
  def or(whereExprs: sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereExpression*): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.WhereGroup = js.native
  /**
     * Returns a new select statement, seeded with a set of columns. It can be used with or without the new keyword.
     * @param columns it can be passed in here (or appended later via sel.select() or sel.distinct()) via multiple arguments
     * or a comma-delimited string or an array. If no columns are specified, toString() will default to SELECT *.
     */
  def select(columns: (java.lang.String | sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement)*): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement = js.native
  def select(
    columns: js.Array[sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement | java.lang.String]
  ): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.SelectStatement = js.native
  /**
     * Returns a new UPDATE statement. It can be used with or without the new operator.
     * @param tbl table name
     * @param values
     */
  def update(tbl: java.lang.String, values: js.Any*): sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs.UpdateStatement = js.native
  /**
     * Wraps a value (user-supplied string, number, boolean, etc) so that it can be passed into SQL Bricks
     * anywhere that a column is expected (the left-hand side of WHERE criteria and many other SQL Bricks APIs)
     * @param value value to be wraped
     */
  def `val`(value: js.Any): js.Any = js.native
}

