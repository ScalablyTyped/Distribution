package typings
package sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * A SELECT statement
   */
@js.native
trait SelectStatement extends Statement {
  def and(options: js.Any*): SelectStatement = js.native
  def as(alias: java.lang.String): SelectStatement = js.native
  def crossJoin(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  def crossJoin(tbl: java.lang.String): SelectStatement = js.native
  def crossJoin(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  def crossJoin(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  def crossJoin(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def crossJoin(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  def distinct(columns: (java.lang.String | SelectStatement)*): SelectStatement = js.native
  def distinct(columns: js.Array[SelectStatement | java.lang.String]): SelectStatement = js.native
  def except(stmt: Statement*): SelectStatement = js.native
  def forUpdate(tbls: java.lang.String*): SelectStatement = js.native
  /**
       * Table names can be passed in as multiple string arguments, a comma-delimited string or an array.
       * @param tbls table names
       */
  def from(tbls: TableName*): SelectStatement = js.native
  /**
       * Table names can be passed in as multiple string arguments, a comma-delimited string or an array.
       * @param tbls array of table names
       */
  def from(tbls: js.Array[TableName]): SelectStatement = js.native
  def fullJoin(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  def fullJoin(tbl: java.lang.String): SelectStatement = js.native
  def fullJoin(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  def fullJoin(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  def fullJoin(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def fullJoin(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  def fullOuterJoin(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  def fullOuterJoin(tbl: java.lang.String): SelectStatement = js.native
  def fullOuterJoin(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  def fullOuterJoin(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  def fullOuterJoin(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def fullOuterJoin(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  /**
       * Sets or extends the GROUP BY columns.
       * @param columns can take multiple arguments, a single comma-delimited string or an array.
       */
  def groupBy(columns: java.lang.String*): SelectStatement = js.native
  def groupBy(columns: js.Array[java.lang.String]): SelectStatement = js.native
  def having(column: java.lang.String, value: java.lang.String): SelectStatement = js.native
  def having(whereExpr: WhereExpression): SelectStatement = js.native
  def innerJoin(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  def innerJoin(tbl: java.lang.String): SelectStatement = js.native
  def innerJoin(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  def innerJoin(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  def innerJoin(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def innerJoin(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  def intersect(stmt: Statement*): SelectStatement = js.native
  /**
       * Makes the query a SELECT ... INTO query (which creates a new table with the results of the query).
       * @alias intoTable
       * @param tbl new table to create
       */
  def into(tbl: TableName): SelectStatement = js.native
  /**
       * Makes the query a SELECT ... INTO query (which creates a new table with the results of the query).
       * @alias into
       * @param tbl new table to create
       */
  def intoTable(tbl: TableName): SelectStatement = js.native
  def intoTemp(tbl: TableName): SelectStatement = js.native
  def intoTempTable(tbl: TableName): SelectStatement = js.native
  def join(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  /**
       * Adds the specified join to the query.
       * @alias innerJoin
       * @param tbl can include an alias after a space or after the 'AS' keyword ('my_table my_alias').
       * @param onCriteria is optional if a joinCriteria function has been supplied.
       */
  def join(tbl: java.lang.String): SelectStatement = js.native
  /**
       * Adds the specified join to the query.
       * @alias innerJoin
       * @param tbl can include an alias after a space or after the 'AS' keyword ('my_table my_alias').
       * @param onCriteria is optional if a joinCriteria function has been supplied.
       */
  def join(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  /**
       * Adds the specified join to the query.
       * @alias innerJoin
       * @param tbl can include an alias after a space or after the 'AS' keyword ('my_table my_alias').
       * @param onCriteria is optional if a joinCriteria function has been supplied.
       */
  def join(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  /**
       * Adds the specified join to the query.
       * @alias innerJoin
       * @param tbl can include an alias after a space or after the 'AS' keyword ('my_table my_alias').
       * @param onCriteria is optional if a joinCriteria function has been supplied.
       */
  def join(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def join(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  def leftJoin(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  def leftJoin(tbl: java.lang.String): SelectStatement = js.native
  def leftJoin(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  def leftJoin(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  def leftJoin(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def leftJoin(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  def leftOuterJoin(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  def leftOuterJoin(tbl: java.lang.String): SelectStatement = js.native
  def leftOuterJoin(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  def leftOuterJoin(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  def leftOuterJoin(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def leftOuterJoin(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  def minus(stmt: Statement*): SelectStatement = js.native
  def naturalFullJoin(tbl: java.lang.String): SelectStatement = js.native
  def naturalFullOuterJoin(tbl: java.lang.String): SelectStatement = js.native
  def naturalInnerJoin(tbl: java.lang.String): SelectStatement = js.native
  /**
       * Adds the specified natural join to the query.
       * @param tbl can include an alias after a space or after the 'AS' keyword ('my_table my_alias').
       */
  def naturalJoin(tbl: java.lang.String): SelectStatement = js.native
  def naturalLeftJoin(tbl: java.lang.String): SelectStatement = js.native
  def naturalLeftOuterJoin(tbl: java.lang.String): SelectStatement = js.native
  def naturalRightJoin(tbl: java.lang.String): SelectStatement = js.native
  def naturalRightOuterJoin(tbl: java.lang.String): SelectStatement = js.native
  def noWait(): SelectStatement = js.native
  def of(tlb: java.lang.String): SelectStatement = js.native
  def on(onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  def on(onCriteria: OnCriteria): SelectStatement = js.native
  def on(onCriteria: WhereExpression): SelectStatement = js.native
  def order(columns: java.lang.String*): SelectStatement = js.native
  def order(columns: js.Array[java.lang.String]): SelectStatement = js.native
  /**
       * Sets or extends the list of columns in the ORDER BY clause.
       * @param columns can be passed as multiple arguments, a single comma-delimited string or an array.
       */
  def orderBy(columns: java.lang.String*): SelectStatement = js.native
  def orderBy(columns: js.Array[java.lang.String]): SelectStatement = js.native
  def rightJoin(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  def rightJoin(tbl: java.lang.String): SelectStatement = js.native
  def rightJoin(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  def rightJoin(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  def rightJoin(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def rightJoin(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  def rightOuterJoin(firstTbl: java.lang.String, otherTbls: java.lang.String*): SelectStatement = js.native
  def rightOuterJoin(tbl: java.lang.String): SelectStatement = js.native
  def rightOuterJoin(tbl: java.lang.String, criteria: js.Array[java.lang.String]): SelectStatement = js.native
  def rightOuterJoin(tbl: java.lang.String, criteria: OnCriteria): SelectStatement = js.native
  def rightOuterJoin(tbl: java.lang.String, criteria: WhereExpression): SelectStatement = js.native
  def rightOuterJoin(tbl: java.lang.String, onCol1: java.lang.String, onCol2: java.lang.String): SelectStatement = js.native
  /**
       * Appends additional columns to an existing query.
       * @param columns can be passed as multiple arguments, a comma-delimited string or an array.
       */
  def select(columns: (java.lang.String | SelectStatement)*): SelectStatement = js.native
  /**
       * Appends additional columns to an existing query.
       * @param columns can be passed as multiple arguments, a comma-delimited string or an array.
       */
  def select(columns: js.Array[SelectStatement | java.lang.String]): SelectStatement = js.native
  def union(stmt: Statement*): SelectStatement = js.native
  /**
       * Joins using USING instead of ON.
       * @param columnList columnList can be passed in as one or more string arguments, a comma-delimited string, or an array.
       * @example
       * select('*').from('person').join('address').using('address_id', 'country_id');
       * // SELECT * FROM person INNER JOIN address USING (address_id, country_id)
       */
  def using(columnList: java.lang.String*): SelectStatement = js.native
  def using(columnList: js.Array[java.lang.String]): SelectStatement = js.native
  def where(): SelectStatement = js.native
  def where(column: java.lang.String): SelectStatement = js.native
  def where(column: java.lang.String, value: js.Any): SelectStatement = js.native
  def where(column: scala.Null, value: js.Any): SelectStatement = js.native
  def where(whereExpr: WhereExpression*): SelectStatement = js.native
}

