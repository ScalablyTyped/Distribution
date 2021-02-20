package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Instance.save method
  */
@js.native
trait InstanceSaveOptions
  extends FieldsOptions
     with LoggingOptions
     with ReturningOptions
     with SearchPathOptions {
  
  var hooks: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the updatedAt timestamp will not be updated.
    *
    * Defaults to false
    */
  var silent: js.UndefOr[Boolean] = js.native
}
object InstanceSaveOptions {
  
  @scala.inline
  def apply(): InstanceSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSaveOptions]
  }
  
  @scala.inline
  implicit class InstanceSaveOptionsMutableBuilder[Self <: InstanceSaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
