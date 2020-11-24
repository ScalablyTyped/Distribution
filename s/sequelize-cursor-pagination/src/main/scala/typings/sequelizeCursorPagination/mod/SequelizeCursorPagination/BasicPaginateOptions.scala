package typings.sequelizeCursorPagination.mod.SequelizeCursorPagination

import typings.sequelize.anon.Exclude
import typings.sequelize.mod.FindOptionsAttributesArray
import typings.sequelize.mod.IncludeOptions
import typings.sequelize.mod.Model
import typings.sequelize.mod.WhereOptions
import typings.sequelize.mod.and
import typings.sequelize.mod.cast
import typings.sequelize.mod.col
import typings.sequelize.mod.fn
import typings.sequelize.mod.literal
import typings.sequelize.mod.or
import typings.sequelize.mod.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicPaginateOptions[T] extends js.Object {
  
   // the before cursor
  var after: js.UndefOr[String] = js.native
  
  var attributes: js.UndefOr[FindOptionsAttributesArray | Exclude] = js.native
  
   // [default: false]
  var before: js.UndefOr[String] = js.native
  
   // limit the number of records returned
  var desc: js.UndefOr[Boolean] = js.native
  
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
   // the after cursor
  var paginationField: js.UndefOr[String] = js.native
  
   // [default: primaryKeyField]
  var subQuery: js.UndefOr[Boolean] = js.native
  
  var where: js.UndefOr[
    WhereOptions[T] | typings.sequelize.mod.where | fn | (js.Array[col | and | or | String])
  ] = js.native
}
object BasicPaginateOptions {
  
  @scala.inline
  def apply[T](): BasicPaginateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicPaginateOptions[T]]
  }
  
  @scala.inline
  implicit class BasicPaginateOptionsOps[Self <: BasicPaginateOptions[_], T] (val x: Self with BasicPaginateOptions[T]) extends AnyVal {
    
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast)*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: FindOptionsAttributesArray | Exclude): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setDesc(value: Boolean): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPaginationField(value: String): Self = this.set("paginationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationField: Self = this.set("paginationField", js.undefined)
    
    @scala.inline
    def setSubQuery(value: Boolean): Self = this.set("subQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubQuery: Self = this.set("subQuery", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: (col | and | or | String)*): Self = this.set("where", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: WhereOptions[T] | where | fn | (js.Array[col | and | or | String])): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
