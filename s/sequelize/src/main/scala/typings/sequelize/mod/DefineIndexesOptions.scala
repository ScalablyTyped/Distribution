package typings.sequelize.mod

import typings.sequelize.anon.Attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for indexes property in DefineOptions
  *
  * @see DefineOptions
  */
@js.native
trait DefineIndexesOptions extends js.Object {
  
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
  implicit class DefineIndexesOptionsOps[Self <: DefineIndexesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConcurrently(value: Boolean): Self = this.set("concurrently", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrently: Self = this.set("concurrently", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: (String | fn | Attribute)*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String | fn | Attribute]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setType(value: IndexType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setUsing(value: String): Self = this.set("using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsing: Self = this.set("using", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
