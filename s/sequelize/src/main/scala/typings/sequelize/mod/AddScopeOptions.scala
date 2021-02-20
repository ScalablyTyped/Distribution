package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AddScope Options for Model.addScope
  */
@js.native
trait AddScopeOptions extends StObject {
  
  /**
    * If a scope of the same name already exists, should it be overwritten?
    */
  var `override`: Boolean = js.native
}
object AddScopeOptions {
  
  @scala.inline
  def apply(`override`: Boolean): AddScopeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScopeOptions]
  }
  
  @scala.inline
  implicit class AddScopeOptionsMutableBuilder[Self <: AddScopeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
  }
}
