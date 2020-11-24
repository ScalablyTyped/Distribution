package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.count method
  */
@js.native
trait CountOptions
  extends LoggingOptions
     with SearchPathOptions {
  
  /**
    * Used in conjustion with `group`
    */
  var attributes: js.UndefOr[js.Array[String | (js.Tuple2[String, String])]] = js.native
  
  /**
    * Apply column on which COUNT() should be applied
    */
  var col: js.UndefOr[String] = js.native
  
  /**
    * Apply COUNT(DISTINCT(col))
    */
  var distinct: js.UndefOr[Boolean] = js.native
  
  /**
    * For creating complex counts. Will return multiple rows as needed.
    *
    * TODO: Check?
    */
  var group: js.UndefOr[js.Object] = js.native
  
  /**
    * Include options. See `find` for details
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  
  /**
    * A hash of search attributes.
    */
  var where: js.UndefOr[AnyWhereOptions | js.Array[String]] = js.native
}
object CountOptions {
  
  @scala.inline
  def apply(): CountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountOptions]
  }
  
  @scala.inline
  implicit class CountOptionsOps[Self <: CountOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: (String | (js.Tuple2[String, String]))*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String | (js.Tuple2[String, String])]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setCol(value: String): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCol: Self = this.set("col", js.undefined)
    
    @scala.inline
    def setDistinct(value: Boolean): Self = this.set("distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinct: Self = this.set("distinct", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Object): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: String*): Self = this.set("where", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: AnyWhereOptions | js.Array[String]): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
