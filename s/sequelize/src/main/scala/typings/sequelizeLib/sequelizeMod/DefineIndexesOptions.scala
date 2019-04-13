package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for indexes property in DefineOptions
  *
  * @see DefineOptions
  */
trait DefineIndexesOptions extends js.Object {
  /**
    * PostgreSQL will build the index without taking any write locks. Postgres only
    *
    * Defaults to false
    */
  var concurrently: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of the fields to index. Each field can either be a string containing the name of the field,
    * a sequelize object (e.g `sequelize.fn`), or an object with the following attributes: `attribute`
    * (field name), `length` (create a prefix index of length chars), `order` (the direction the column
    * should be sorted in), `collate` (the collation (sort order) for the column)
    */
  var fields: js.UndefOr[js.Array[java.lang.String | fn | sequelizeLib.Anon_Attribute]] = js.undefined
  /**
    * Index type. Only used by mysql. One of `UNIQUE`, `FULLTEXT` and `SPATIAL`
    */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The method to create the index by (`USING` statement in SQL). BTREE and HASH are supported by mysql and
    * postgres, and postgres additionally supports GIST and GIN.
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the index. Defaults to model name + _ + fields concatenated
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Operator that should be used by gin index, see Built-in GIN Operator Classes
    */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Should the index by unique? Can also be triggered by setting type to `UNIQUE`
    *
    * Defaults to false
    */
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Method the index should use, for example 'gin' index.
    */
  var using: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Condition for partioal index
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object DefineIndexesOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Array[java.lang.String | fn | sequelizeLib.Anon_Attribute] = null,
    index: java.lang.String = null,
    method: java.lang.String = null,
    name: java.lang.String = null,
    operator: java.lang.String = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined,
    using: java.lang.String = null,
    where: AnyWhereOptions = null
  ): DefineIndexesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (index != null) __obj.updateDynamic("index")(index)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    if (using != null) __obj.updateDynamic("using")(using)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[DefineIndexesOptions]
  }
}

