package typings.sqlBricks

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.sqlBricks.anon.Placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sql-bricks", JSImport.Namespace)
  @js.native
  val ^ : SqlBricksFn = js.native
  
  /**
    * A DELETE statement
    */
  @js.native
  trait DeleteStatement
    extends StObject
       with Statement {
    
    def and(): SelectStatement = js.native
    def and(column: String): SelectStatement = js.native
    def and(column: String, value: Any): SelectStatement = js.native
    def and(column: Null, value: Any): SelectStatement = js.native
    def and(column: Unit, value: Any): SelectStatement = js.native
    def and(whereExpr: WhereExpression*): SelectStatement = js.native
    
    def from(tbls: String*): DeleteStatement = js.native
    
    def `using`(columnList: String*): SelectStatement = js.native
    def `using`(columnList: js.Array[String]): SelectStatement = js.native
    
    def where(): SelectStatement = js.native
    def where(column: String): SelectStatement = js.native
    def where(column: String, value: Any): SelectStatement = js.native
    def where(column: Null, value: Any): SelectStatement = js.native
    def where(column: Unit, value: Any): SelectStatement = js.native
    def where(whereExpr: WhereExpression*): SelectStatement = js.native
  }
  
  /**
    * An INSERT statement
    */
  @js.native
  trait InsertStatement
    extends StObject
       with Statement {
    
    def into(tbl: TableName, columns: Any*): InsertStatement = js.native
    
    def intoTable(tbl: TableName, columns: Any*): InsertStatement = js.native
    
    def select(columns: (String | SelectStatement)*): SelectStatement = js.native
    def select(columns: js.Array[SelectStatement | String]): SelectStatement = js.native
    
    def values(values: Any*): InsertStatement = js.native
  }
  
  type OnCriteria = StringDictionary[String]
  
  /**
    * A SELECT statement
    */
  @js.native
  trait SelectStatement
    extends StObject
       with Statement {
    
    def and(options: Any*): SelectStatement = js.native
    
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
    def `using`(columnList: String*): SelectStatement = js.native
    def `using`(columnList: js.Array[String]): SelectStatement = js.native
    
    def where(): SelectStatement = js.native
    def where(column: String): SelectStatement = js.native
    def where(column: String, value: Any): SelectStatement = js.native
    def where(column: Null, value: Any): SelectStatement = js.native
    def where(column: Unit, value: Any): SelectStatement = js.native
    def where(whereExpr: WhereExpression*): SelectStatement = js.native
  }
  
  @js.native
  trait SqlBricksFn extends StObject {
    
    def apply(params: Any*): Any = js.native
    
    def _extension(): Any = js.native
    
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
    def aliasExpansions(expansions: StringDictionary[String]): Unit = js.native
    
    //////////////////////////////////////////
    //////  Where Expression functions  //////
    //////////////////////////////////////////
    /**
      * Joins the passed expressions with AND
      * @param whereExprs
      */
    def and(whereExprs: WhereExpression*): WhereGroup = js.native
    
    /**
      * Generates a BETWEEN
      * @param column
      * @param value1
      * @param value2
      */
    def between(column: String, value1: Any, value2: Any): WhereExpression = js.native
    
    var conversions: Any = js.native
    
    /**
      * Returns a new DELETE statement. It can be used with or without the new operator.
      * @alias deleteFrom
      * @param tbl table name
      */
    def delete(): DeleteStatement = js.native
    def delete(tbl: String): DeleteStatement = js.native
    
    /**
      * Returns a new DELETE statement. It can be used with or without the new operator.
      * @alias delete
      * @param tbl table name
      */
    def deleteFrom(): DeleteStatement = js.native
    def deleteFrom(tbl: String): DeleteStatement = js.native
    
    /**
      * Generates the appropriate relational operator (=, <>, <, <=, > or >=).
      * @param column column name or query result
      * @param value column value
      */
    def eq(column: String): WhereBinary = js.native
    def eq(column: String, value: Any): WhereBinary = js.native
    def eq(column: SelectStatement): WhereBinary = js.native
    def eq(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def eqAll(column: String): WhereBinary = js.native
    def eqAll(column: String, value: Any): WhereBinary = js.native
    def eqAll(column: SelectStatement): WhereBinary = js.native
    def eqAll(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def eqAny(column: String): WhereBinary = js.native
    def eqAny(column: String, value: Any): WhereBinary = js.native
    def eqAny(column: SelectStatement): WhereBinary = js.native
    def eqAny(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def eqSome(column: String): WhereBinary = js.native
    def eqSome(column: String, value: Any): WhereBinary = js.native
    def eqSome(column: SelectStatement): WhereBinary = js.native
    def eqSome(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def equal(column: String): WhereBinary = js.native
    def equal(column: String, value: Any): WhereBinary = js.native
    def equal(column: SelectStatement): WhereBinary = js.native
    def equal(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def exists(stmt: Any): WhereExpression = js.native
    
    def gt(column: String): WhereBinary = js.native
    def gt(column: String, value: Any): WhereBinary = js.native
    def gt(column: SelectStatement): WhereBinary = js.native
    def gt(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def gtAll(column: String): WhereBinary = js.native
    def gtAll(column: String, value: Any): WhereBinary = js.native
    def gtAll(column: SelectStatement): WhereBinary = js.native
    def gtAll(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def gtAny(column: String): WhereBinary = js.native
    def gtAny(column: String, value: Any): WhereBinary = js.native
    def gtAny(column: SelectStatement): WhereBinary = js.native
    def gtAny(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def gtSome(column: String): WhereBinary = js.native
    def gtSome(column: String, value: Any): WhereBinary = js.native
    def gtSome(column: SelectStatement): WhereBinary = js.native
    def gtSome(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def gte(column: String): WhereBinary = js.native
    def gte(column: String, value: Any): WhereBinary = js.native
    def gte(column: SelectStatement): WhereBinary = js.native
    def gte(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def gteAll(column: String): WhereBinary = js.native
    def gteAll(column: String, value: Any): WhereBinary = js.native
    def gteAll(column: SelectStatement): WhereBinary = js.native
    def gteAll(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def gteAny(column: String): WhereBinary = js.native
    def gteAny(column: String, value: Any): WhereBinary = js.native
    def gteAny(column: SelectStatement): WhereBinary = js.native
    def gteAny(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def gteSome(column: String): WhereBinary = js.native
    def gteSome(column: String, value: Any): WhereBinary = js.native
    def gteSome(column: SelectStatement): WhereBinary = js.native
    def gteSome(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def in(column: String, stmt: SelectStatement): WhereExpression = js.native
    def in(column: String, values: Any*): WhereExpression = js.native
    
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
    def insert(tbl: String, values: Any*): InsertStatement = js.native
    def insert(tbl: Unit, values: Any*): InsertStatement = js.native
    
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
    def insertInto(tbl: String, values: Any*): InsertStatement = js.native
    def insertInto(tbl: Unit, values: Any*): InsertStatement = js.native
    
    def isNotNull(column: String): WhereExpression = js.native
    
    def isNull(column: String): WhereExpression = js.native
    
    /**
      * Sets a user-supplied function to automatically generate the .on() criteria for joins whenever it is not supplied explicitly.
      * @param func
      */
    def joinCriteria(): Any = js.native
    def joinCriteria(func: js.Function1[/* repeated */ Any, OnCriteria]): Any = js.native
    
    def like(column: String, value: Any): WhereExpression = js.native
    def like(column: String, value: Any, escapeStr: String): WhereExpression = js.native
    
    def lt(column: String): WhereBinary = js.native
    def lt(column: String, value: Any): WhereBinary = js.native
    def lt(column: SelectStatement): WhereBinary = js.native
    def lt(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def ltAll(column: String): WhereBinary = js.native
    def ltAll(column: String, value: Any): WhereBinary = js.native
    def ltAll(column: SelectStatement): WhereBinary = js.native
    def ltAll(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def ltAny(column: String): WhereBinary = js.native
    def ltAny(column: String, value: Any): WhereBinary = js.native
    def ltAny(column: SelectStatement): WhereBinary = js.native
    def ltAny(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def ltSome(column: String): WhereBinary = js.native
    def ltSome(column: String, value: Any): WhereBinary = js.native
    def ltSome(column: SelectStatement): WhereBinary = js.native
    def ltSome(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def lte(column: String): WhereBinary = js.native
    def lte(column: String, value: Any): WhereBinary = js.native
    def lte(column: SelectStatement): WhereBinary = js.native
    def lte(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def lteAll(column: String): WhereBinary = js.native
    def lteAll(column: String, value: Any): WhereBinary = js.native
    def lteAll(column: SelectStatement): WhereBinary = js.native
    def lteAll(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def lteAny(column: String): WhereBinary = js.native
    def lteAny(column: String, value: Any): WhereBinary = js.native
    def lteAny(column: SelectStatement): WhereBinary = js.native
    def lteAny(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def lteSome(column: String): WhereBinary = js.native
    def lteSome(column: String, value: Any): WhereBinary = js.native
    def lteSome(column: SelectStatement): WhereBinary = js.native
    def lteSome(column: SelectStatement, value: Any): WhereBinary = js.native
    
    /**
      * Negates the expression by wrapping it in NOT (...)
      * (if it is at the top level, the parentheses are unnecessary and will be omitted)
      * @param whereExpr
      */
    def not(whereExpr: WhereExpression): WhereGroup = js.native
    
    def notEq(column: String): WhereBinary = js.native
    def notEq(column: String, value: Any): WhereBinary = js.native
    def notEq(column: SelectStatement): WhereBinary = js.native
    def notEq(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def notEqAll(column: String): WhereBinary = js.native
    def notEqAll(column: String, value: Any): WhereBinary = js.native
    def notEqAll(column: SelectStatement): WhereBinary = js.native
    def notEqAll(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def notEqAny(column: String): WhereBinary = js.native
    def notEqAny(column: String, value: Any): WhereBinary = js.native
    def notEqAny(column: SelectStatement): WhereBinary = js.native
    def notEqAny(column: SelectStatement, value: Any): WhereBinary = js.native
    
    def notEqSome(column: String): WhereBinary = js.native
    def notEqSome(column: String, value: Any): WhereBinary = js.native
    def notEqSome(column: SelectStatement): WhereBinary = js.native
    def notEqSome(column: SelectStatement, value: Any): WhereBinary = js.native
    
    /**
      * Joins the passed expressions with OR:
      * @param whereExprs
      */
    def or(whereExprs: WhereExpression*): WhereGroup = js.native
    
    var prop: Double = js.native
    
    /**
      * Returns a new select statement, seeded with a set of columns. It can be used with or without the new keyword.
      * @param columns it can be passed in here (or appended later via sel.select() or sel.distinct()) via multiple arguments
      * or a comma-delimited string or an array. If no columns are specified, toString() will default to SELECT *.
      */
    def select(columns: (String | SelectStatement)*): SelectStatement = js.native
    def select(columns: js.Array[SelectStatement | String]): SelectStatement = js.native
    
    /**
      * Returns a new UPDATE statement. It can be used with or without the new operator.
      * @param tbl table name
      * @param values
      */
    def update(tbl: String, values: Any*): UpdateStatement = js.native
    
    /**
      * Wraps a value (user-supplied string, number, boolean, etc) so that it can be passed into SQL Bricks
      * anywhere that a column is expected (the left-hand side of WHERE criteria and many other SQL Bricks APIs)
      * @param value value to be wraped
      */
    def `val`(value: Any): Any = js.native
  }
  
  trait SqlBricksParam extends StObject {
    
    var text: String
    
    var values: js.Array[Any]
  }
  object SqlBricksParam {
    
    inline def apply(text: String, values: js.Array[Any]): SqlBricksParam = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[SqlBricksParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SqlBricksParam] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  /**
    * Statement is an abstract base class for all statements (SELECT, INSERT, UPDATE, DELETE)
    * and should never be instantiated directly. It is exposed because it can be used with the
    * instanceof operator to easily determine whether something is a SQL Bricks statement: my_var instanceof Statement.
    */
  @js.native
  trait Statement extends StObject {
    
    /**
      * Returns an object with two properties: a parameterized text string and a values array. The values are populated with anything on the right-hand side
      * of a WHERE criteria,as well as any values passed into an insert() or update() (they can be passed explicitly with val() or opted out of with sql())
      * @param options A placeholder option of '?%d' can be passed to generate placeholders compatible with node-sqlite3 (%d is replaced with the parameter #):
      * @example
      * update('person', {'first_name': 'Fred'}).where({'last_name': 'Flintstone'}).toParams({placeholder: '?%d'});
      *    // {"text": "UPDATE person SET first_name = ?1 WHERE last_name = ?2", "values": ["Fred", "Flintstone"]}
      */
    def toParams(): SqlBricksParam = js.native
    def toParams(options: Placeholder): SqlBricksParam = js.native
  }
  
  type TableName = String | SelectStatement
  
  /**
    * An UPDATE statement
    */
  @js.native
  trait UpdateStatement
    extends StObject
       with Statement {
    
    def and(): UpdateStatement = js.native
    def and(column: String): UpdateStatement = js.native
    def and(column: String, value: Any): UpdateStatement = js.native
    def and(column: Null, value: Any): UpdateStatement = js.native
    def and(column: Unit, value: Any): UpdateStatement = js.native
    def and(whereExpr: WhereExpression*): UpdateStatement = js.native
    
    def set(values: Any*): UpdateStatement = js.native
    
    def values(values: Any*): UpdateStatement = js.native
    
    def where(): UpdateStatement = js.native
    def where(column: String): UpdateStatement = js.native
    def where(column: String, value: Any): UpdateStatement = js.native
    def where(column: Null, value: Any): UpdateStatement = js.native
    def where(column: Unit, value: Any): UpdateStatement = js.native
    def where(whereExpr: WhereExpression*): UpdateStatement = js.native
  }
  
  trait WhereBinary
    extends StObject
       with _WhereExpression {
    
    var col: String | SelectStatement
    
    var op: String
    
    var quantifier: String
    
    var `val`: Any
  }
  object WhereBinary {
    
    inline def apply(col: String | SelectStatement, op: String, quantifier: String, `val`: Any): WhereBinary = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WhereBinary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WhereBinary] (val x: Self) extends AnyVal {
      
      inline def setCol(value: String | SelectStatement): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setQuantifier(value: String): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
      
      inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * When a non-expression object is passed somewhere a whereExpression is expected,
    * each key/value pair will be ANDed together:
    */
  /* Rewritten from type alias, can be one of: 
    - typings.sqlBricks.mod.WhereGroup
    - typings.sqlBricks.mod.WhereBinary
    - typings.sqlBricks.mod.WhereObject
    - java.lang.String
  */
  type WhereExpression = _WhereExpression | WhereObject | String
  
  trait WhereGroup
    extends StObject
       with _WhereExpression {
    
    var expressions: js.Array[WhereExpression]
    
    var op: js.UndefOr[String] = js.undefined
  }
  object WhereGroup {
    
    inline def apply(expressions: js.Array[WhereExpression]): WhereGroup = {
      val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[WhereGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WhereGroup] (val x: Self) extends AnyVal {
      
      inline def setExpressions(value: js.Array[WhereExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsVarargs(value: WhereExpression*): Self = StObject.set(x, "expressions", js.Array(value*))
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    }
  }
  
  type WhereObject = StringDictionary[Any]
  
  type _To = SqlBricksFn
  
  trait _WhereExpression extends StObject
  object _WhereExpression {
    
    inline def WhereBinary(col: String | SelectStatement, op: String, quantifier: String, `val`: Any): typings.sqlBricks.mod.WhereBinary = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sqlBricks.mod.WhereBinary]
    }
    
    inline def WhereGroup(expressions: js.Array[WhereExpression]): typings.sqlBricks.mod.WhereGroup = {
      val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sqlBricks.mod.WhereGroup]
    }
  }
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SqlBricksFn = ^
}
