package typings.sequelize.mod

import typings.sequelize.AnonAttribute
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
  var concurrently: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of the fields to index. Each field can either be a string containing the name of the field,
    * a sequelize object (e.g `sequelize.fn`), or an object with the following attributes: `attribute`
    * (field name), `length` (create a prefix index of length chars), `order` (the direction the column
    * should be sorted in), `collate` (the collation (sort order) for the column)
    */
  var fields: js.UndefOr[js.Array[String | fn | AnonAttribute]] = js.undefined
  /**
    * The method to create the index by (`USING` statement in SQL). BTREE and HASH are supported by mysql and
    * postgres, and postgres additionally supports GIST and GIN.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The name of the index. Defaults to model name + _ + fields concatenated
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Operator that should be used by gin index, see Built-in GIN Operator Classes
    */
  var operator: js.UndefOr[String] = js.undefined
  /**
    * Index type. Only used by mysql. One of `UNIQUE`, `FULLTEXT` and `SPATIAL`
    */
  var `type`: js.UndefOr[IndexType] = js.undefined
  /**
    * Should the index by unique? Can also be triggered by setting type to `UNIQUE`
    *
    * Defaults to false
    */
  var unique: js.UndefOr[Boolean] = js.undefined
  /**
    * Method the index should use, for example 'gin' index.
    */
  var using: js.UndefOr[String] = js.undefined
  /**
    * Condition for partioal index
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object DefineIndexesOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String | fn | AnonAttribute] = null,
    method: String = null,
    name: String = null,
    operator: String = null,
    `type`: IndexType = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    using: String = null,
    where: AnyWhereOptions = null
  ): DefineIndexesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (using != null) __obj.updateDynamic("using")(using.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexesOptions]
  }
}

