package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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
  var fields: js.UndefOr[js.Array[java.lang.String | fn | sequelizeLib.Anon_Order]] = js.undefined
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

