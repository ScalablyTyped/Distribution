package typings.sqlDashTemplateDashStrings

import typings.sqlDashTemplateDashStrings.sqlDashTemplateDashStringsMod.SQLStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql-template-strings", JSImport.Namespace)
@js.native
object sqlDashTemplateDashStringsMod extends js.Object {
  @js.native
  class SQLStatement () extends js.Object {
    /**
      * The name for postgres prepared statements, if set
      */
    var name: String = js.native
    /**
      * The SQL Statement for [Sequelize](https://www.npmjs.com/package/sequelize)
      */
    var query: String = js.native
    /**
      * The SQL Statement for [mysql](https://www.npmjs.com/package/mysql)
      */
    var sql: String = js.native
    var strings: js.Array[String] = js.native
    /**
      * The SQL Statement for [node-postgres](https://www.npmjs.com/package/pg)
      */
    var text: String = js.native
    /**
      * The values to be inserted for the placeholders
      */
    var values: js.Array[_] = js.native
    def append(statement: String): this.type = js.native
    def append(statement: Double): this.type = js.native
    /**
      * Appends a string or another statement
      *
      * ```ts
      * query.append(SQL`AND genre = ${genre}`).append(' ORDER BY rating')
      * query.text   // => 'SELECT author FROM books WHERE name = $1 AND author = $2 AND genre = $3 ORDER BY rating'
      * query.sql    // => 'SELECT author FROM books WHERE name = ? AND author = ? AND genre = ? ORDER BY rating'
      * query.values // => ['harry potter', 'J. K. Rowling', 'Fantasy'] ORDER BY rating`
      *
      * const query = SQL`SELECT * FROM books`
      * if (params.name) {
      *   query.append(SQL` WHERE name = ${params.name}`)
      * }
      * query.append(SQL` LIMIT 10 OFFSET ${params.offset || 0}`)
      * ```
      */
    def append(statement: SQLStatement): this.type = js.native
    /**
      * Sets the name property of this statement for prepared statements in postgres
      *
      * ```ts
      * pg.query(SQL`SELECT author FROM books WHERE name = ${book}`.setName('my_query'))
      * ```
      */
    def setName(name: String): this.type = js.native
    /**
      * Use a prepared statement with Sequelize.
      * Makes `query` return a query with `$n` syntax instead of `?`  and switches the `values` key name to `bind`
      * If omitted, `value` defaults to `true`.
      */
    def useBind(): this.type = js.native
    def useBind(value: Boolean): this.type = js.native
  }
  
  def SQL(strings: js.Any, values: js.Any*): SQLStatement = js.native
  def default(strings: js.Any, values: js.Any*): SQLStatement = js.native
}

