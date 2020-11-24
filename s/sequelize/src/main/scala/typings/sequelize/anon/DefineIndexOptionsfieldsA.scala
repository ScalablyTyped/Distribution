package typings.sequelize.anon

import typings.sequelize.mod.AnyWhereOptions
import typings.sequelize.mod.IndexType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sequelize.sequelize.DefineIndexOptions & {  fields :std.Array<string>} */
@js.native
trait DefineIndexOptionsfieldsA extends js.Object {
  
  /**
    * Pass CONCURRENT so other operations run while the index is created - PostgresSQL only. Default is false
    */
  var concurrently: js.UndefOr[Boolean] = js.native
  
  var fields: js.Array[String] = js.native
  
  /**
    * The name of the index. Default is __
    */
  var indexName: js.UndefOr[String] = js.native
  
  /**
    * Set a type for the index, e.g. BTREE. See the documentation of the used dialect
    */
  var indexType: js.UndefOr[String] = js.native
  
  /**
    * The index type
    */
  var indicesType: js.UndefOr[IndexType] = js.native
  
  /**
    * A function that receives the sql query, e.g. console.log
    */
  var logging: js.UndefOr[js.Function] = js.native
  
  /**
    * The name of the index. Default is Default is <table>_<attr1>_<attr2>
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Index operator
    */
  var operator: js.UndefOr[String] = js.native
  
  /**
    * For FULLTEXT columns set your parser
    */
  var parser: js.UndefOr[String] = js.native
  
  /**
    * The index type
    */
  var `type`: js.UndefOr[IndexType] = js.native
  
  /**
    * Create a unique index
    */
  var unique: js.UndefOr[Boolean] = js.native
  
  /**
    * Create an unique index
    */
  var using: js.UndefOr[String] = js.native
  
  /**
    * A hash of attributes to limit your index(Filtered Indexes - MSSQL & PostgreSQL only)
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object DefineIndexOptionsfieldsA {
  
  @scala.inline
  def apply(fields: js.Array[String]): DefineIndexOptionsfieldsA = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexOptionsfieldsA]
  }
  
  @scala.inline
  implicit class DefineIndexOptionsfieldsAOps[Self <: DefineIndexOptionsfieldsA] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrently(value: Boolean): Self = this.set("concurrently", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrently: Self = this.set("concurrently", js.undefined)
    
    @scala.inline
    def setIndexName(value: String): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("indexName", js.undefined)
    
    @scala.inline
    def setIndexType(value: String): Self = this.set("indexType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexType: Self = this.set("indexType", js.undefined)
    
    @scala.inline
    def setIndicesType(value: IndexType): Self = this.set("indicesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicesType: Self = this.set("indicesType", js.undefined)
    
    @scala.inline
    def setLogging(value: js.Function): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
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
