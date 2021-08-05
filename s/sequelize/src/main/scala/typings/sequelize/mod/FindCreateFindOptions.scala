package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.findOrInitialize method
  */
trait FindCreateFindOptions[TAttributes]
  extends StObject
     with FindOptions[TAttributes] {
  
  /**
    * Default values to use if building a new instance
    */
  var defaults: js.UndefOr[TAttributes] = js.undefined
}
object FindCreateFindOptions {
  
  inline def apply[TAttributes](): FindCreateFindOptions[TAttributes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindCreateFindOptions[TAttributes]]
  }
  
  extension [Self <: FindCreateFindOptions[?], TAttributes](x: Self & FindCreateFindOptions[TAttributes]) {
    
    inline def setDefaults(value: TAttributes): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
  }
}
