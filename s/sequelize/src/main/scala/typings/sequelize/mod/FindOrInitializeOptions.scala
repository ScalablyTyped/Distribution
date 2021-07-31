package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.findOrInitialize method
  */
trait FindOrInitializeOptions[TAttributes]
  extends StObject
     with FindOptions[TAttributes] {
  
  /**
    * Default values to use if building a new instance
    */
  var defaults: js.UndefOr[TAttributes] = js.undefined
}
object FindOrInitializeOptions {
  
  @scala.inline
  def apply[TAttributes](): FindOrInitializeOptions[TAttributes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOrInitializeOptions[TAttributes]]
  }
  
  @scala.inline
  implicit class FindOrInitializeOptionsMutableBuilder[Self <: FindOrInitializeOptions[?], TAttributes] (val x: Self & FindOrInitializeOptions[TAttributes]) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: TAttributes): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
  }
}
