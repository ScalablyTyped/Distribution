package typings.sequelize.mod

import typings.sequelize.anon.Attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for indexes property in DefineOptions
  *
  * @see DefineOptions
  */
@js.native
trait DefineIndexesOptions extends StObject {
  
  /**
    * PostgreSQL will build the index without taking any write locks. Postgres only
    *
    * Defaults to false
    */
  var concurrently: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of the fields to index. Each field can either be a string containing the name of the field,
    * a sequelize object (e.g `sequelize.fn`), or an object with the following attributes: `attribute`
    * (field name), `length` (create a prefix index of length chars), `order` (the direction the column
    * should be sorted in), `collate` (the collation (sort order) for the column)
    */
  var fields: js.UndefOr[js.Array[String | fn | Attribute]] = js.native
  
  /**
    * The method to create the index by (`USING` statement in SQL). BTREE and HASH are supported by mysql and
    * postgres, and postgres additionally supports GIST and GIN.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * The name of the index. Defaults to model name + _ + fields concatenated
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Operator that should be used by gin index, see Built-in GIN Operator Classes
    */
  var operator: js.UndefOr[String] = js.native
  
  /**
    * Index type. Only used by mysql. One of `UNIQUE`, `FULLTEXT` and `SPATIAL`
    */
  var `type`: js.UndefOr[IndexType] = js.native
  
  /**
    * Should the index by unique? Can also be triggered by setting type to `UNIQUE`
    *
    * Defaults to false
    */
  var unique: js.UndefOr[Boolean] = js.native
  
  /**
    * Method the index should use, for example 'gin' index.
    */
  var using: js.UndefOr[String] = js.native
  
  /**
    * Condition for partioal index
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object DefineIndexesOptions {
  
  @scala.inline
  def apply(): DefineIndexesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineIndexesOptions]
  }
  
  @scala.inline
  implicit class DefineIndexesOptionsMutableBuilder[Self <: DefineIndexesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcurrently(value: Boolean): Self = StObject.set(x, "concurrently", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentlyUndefined: Self = StObject.set(x, "concurrently", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String | fn | Attribute]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: (String | fn | Attribute)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setType(value: IndexType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    @scala.inline
    def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsingUndefined: Self = StObject.set(x, "using", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
