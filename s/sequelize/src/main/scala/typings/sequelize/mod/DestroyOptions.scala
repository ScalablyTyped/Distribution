package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Model.destroy
  */
trait DestroyOptions
  extends StObject
     with TruncateOptions {
  
  /**
    * Run before / after bulk destroy hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, destroy will SELECT all records matching the where parameter and will execute before /
    * after destroy hooks on each row
    */
  var individualHooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How many rows to delete
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * If set to true, dialects that support it will use TRUNCATE instead of DELETE FROM. If a table is
    * truncated the where and limit options are ignored
    */
  var truncate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filter the destroy
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}
object DestroyOptions {
  
  inline def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  
  extension [Self <: DestroyOptions](x: Self) {
    
    inline def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setIndividualHooks(value: Boolean): Self = StObject.set(x, "individualHooks", value.asInstanceOf[js.Any])
    
    inline def setIndividualHooksUndefined: Self = StObject.set(x, "individualHooks", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    
    inline def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
