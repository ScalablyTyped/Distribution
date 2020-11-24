package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SELECT statement
  */
@js.native
trait SelectStatement extends Statement {
  
  def and(options: js.Any*): SelectStatement = js.native
  
  def as(alias: String): SelectStatement = js.native
  
  def crossJoin(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  def crossJoin(tbl: String): SelectStatement = js.native
  def crossJoin(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def crossJoin(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def crossJoin(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def crossJoin(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
  def distinct(columns: (String | SelectStatement)*): SelectStatement = js.native
  def distinct(columns: js.Array[SelectStatement | String]): SelectStatement = js.native
  
  def except(stmt: Statement*): SelectStatement = js.native
  
  def forUpdate(tbls: String*): SelectStatement = js.native
  
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
  
  def fullJoin(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  def fullJoin(tbl: String): SelectStatement = js.native
  def fullJoin(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def fullJoin(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def fullJoin(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def fullJoin(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
  def fullOuterJoin(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  def fullOuterJoin(tbl: String): SelectStatement = js.native
  def fullOuterJoin(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def fullOuterJoin(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def fullOuterJoin(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def fullOuterJoin(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
  /**
    * Sets or extends the GROUP BY columns.
    * @param columns can take multiple arguments, a single comma-delimited string or an array.
    */
  def groupBy(columns: String*): SelectStatement = js.native
  def groupBy(columns: js.Array[String]): SelectStatement = js.native
  
  def having(column: String, value: String): SelectStatement = js.native
  def having(whereExpr: WhereExpression): SelectStatement = js.native
  
  def innerJoin(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  def innerJoin(tbl: String): SelectStatement = js.native
  def innerJoin(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def innerJoin(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def innerJoin(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def innerJoin(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
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
  
  def join(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  /**
    * Adds the specified join to the query.
    * @alias innerJoin
    * @param tbl can include an alias after a space or after the 'AS' keyword ('my_table my_alias').
    * @param onCriteria is optional if a joinCriteria function has been supplied.
    */
  def join(tbl: String): SelectStatement = js.native
  def join(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def join(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def join(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def join(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
  def leftJoin(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  def leftJoin(tbl: String): SelectStatement = js.native
  def leftJoin(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def leftJoin(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def leftJoin(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def leftJoin(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
  def leftOuterJoin(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  def leftOuterJoin(tbl: String): SelectStatement = js.native
  def leftOuterJoin(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def leftOuterJoin(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def leftOuterJoin(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def leftOuterJoin(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
  def minus(stmt: Statement*): SelectStatement = js.native
  
  def naturalFullJoin(tbl: String): SelectStatement = js.native
  
  def naturalFullOuterJoin(tbl: String): SelectStatement = js.native
  
  def naturalInnerJoin(tbl: String): SelectStatement = js.native
  
  /**
    * Adds the specified natural join to the query.
    * @param tbl can include an alias after a space or after the 'AS' keyword ('my_table my_alias').
    */
  def naturalJoin(tbl: String): SelectStatement = js.native
  
  def naturalLeftJoin(tbl: String): SelectStatement = js.native
  
  def naturalLeftOuterJoin(tbl: String): SelectStatement = js.native
  
  def naturalRightJoin(tbl: String): SelectStatement = js.native
  
  def naturalRightOuterJoin(tbl: String): SelectStatement = js.native
  
  def noWait(): SelectStatement = js.native
  
  def of(tlb: String): SelectStatement = js.native
  
  def on(onCol1: String, onCol2: String): SelectStatement = js.native
  def on(onCriteria: OnCriteria): SelectStatement = js.native
  def on(onCriteria: WhereExpression): SelectStatement = js.native
  
  def order(columns: String*): SelectStatement = js.native
  def order(columns: js.Array[String]): SelectStatement = js.native
  
  /**
    * Sets or extends the list of columns in the ORDER BY clause.
    * @param columns can be passed as multiple arguments, a single comma-delimited string or an array.
    */
  def orderBy(columns: String*): SelectStatement = js.native
  def orderBy(columns: js.Array[String]): SelectStatement = js.native
  
  def rightJoin(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  def rightJoin(tbl: String): SelectStatement = js.native
  def rightJoin(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def rightJoin(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def rightJoin(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def rightJoin(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
  def rightOuterJoin(firstTbl: String, otherTbls: String*): SelectStatement = js.native
  def rightOuterJoin(tbl: String): SelectStatement = js.native
  def rightOuterJoin(tbl: String, criteria: js.Array[String]): SelectStatement = js.native
  def rightOuterJoin(tbl: String, criteria: OnCriteria): SelectStatement = js.native
  def rightOuterJoin(tbl: String, criteria: WhereExpression): SelectStatement = js.native
  def rightOuterJoin(tbl: String, onCol1: String, onCol2: String): SelectStatement = js.native
  
  /**
    * Appends additional columns to an existing query.
    * @param columns can be passed as multiple arguments, a comma-delimited string or an array.
    */
  def select(columns: (String | SelectStatement)*): SelectStatement = js.native
  /**
    * Appends additional columns to an existing query.
    * @param columns can be passed as multiple arguments, a comma-delimited string or an array.
    */
  def select(columns: js.Array[SelectStatement | String]): SelectStatement = js.native
  
  def union(stmt: Statement*): SelectStatement = js.native
  
  /**
    * Joins using USING instead of ON.
    * @param columnList columnList can be passed in as one or more string arguments, a comma-delimited string, or an array.
    * @example
    * select('*').from('person').join('address').using('address_id', 'country_id');
    * // SELECT * FROM person INNER JOIN address USING (address_id, country_id)
    */
  def using(columnList: String*): SelectStatement = js.native
  def using(columnList: js.Array[String]): SelectStatement = js.native
  
  def where(): SelectStatement = js.native
  def where(column: js.UndefOr[scala.Nothing], value: js.Any): SelectStatement = js.native
  def where(column: String): SelectStatement = js.native
  def where(column: String, value: js.Any): SelectStatement = js.native
  def where(column: Null, value: js.Any): SelectStatement = js.native
  def where(whereExpr: WhereExpression*): SelectStatement = js.native
}
