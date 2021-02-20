package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
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
  implicit class CountOptionsMutableBuilder[Self <: CountOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | (js.Tuple2[String, String]))*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setCol(value: String): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    @scala.inline
    def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Object): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: AnyWhereOptions | js.Array[String]): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: String*): Self = StObject.set(x, "where", js.Array(value :_*))
  }
}
