package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AddScope Options for Model.addScope
  */
trait AddScopeOptions extends StObject {
  
  /**
    * If a scope of the same name already exists, should it be overwritten?
    */
  var `override`: Boolean
}
object AddScopeOptions {
  
  inline def apply(`override`: Boolean): AddScopeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScopeOptions]
  }
  
  extension [Self <: AddScopeOptions](x: Self) {
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
  }
}
