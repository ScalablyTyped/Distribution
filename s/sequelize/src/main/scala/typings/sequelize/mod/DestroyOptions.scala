package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Model.destroy
  */
@js.native
trait DestroyOptions extends TruncateOptions {
  
  /**
    * Run before / after bulk destroy hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, destroy will SELECT all records matching the where parameter and will execute before /
    * after destroy hooks on each row
    */
  var individualHooks: js.UndefOr[Boolean] = js.native
  
  /**
    * How many rows to delete
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * If set to true, dialects that support it will use TRUNCATE instead of DELETE FROM. If a table is
    * truncated the where and limit options are ignored
    */
  var truncate: js.UndefOr[Boolean] = js.native
  
  /**
    * Filter the destroy
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object DestroyOptions {
  
  @scala.inline
  def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  
  @scala.inline
  implicit class DestroyOptionsMutableBuilder[Self <: DestroyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setIndividualHooks(value: Boolean): Self = StObject.set(x, "individualHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualHooksUndefined: Self = StObject.set(x, "individualHooks", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
