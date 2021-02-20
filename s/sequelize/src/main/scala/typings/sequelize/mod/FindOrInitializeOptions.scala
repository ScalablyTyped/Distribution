package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.findOrInitialize method
  */
@js.native
trait FindOrInitializeOptions[TAttributes] extends FindOptions[TAttributes] {
  
  /**
    * Default values to use if building a new instance
    */
  var defaults: js.UndefOr[TAttributes] = js.native
}
object FindOrInitializeOptions {
  
  @scala.inline
  def apply[TAttributes](): FindOrInitializeOptions[TAttributes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOrInitializeOptions[TAttributes]]
  }
  
  @scala.inline
  implicit class FindOrInitializeOptionsMutableBuilder[Self <: FindOrInitializeOptions[_], TAttributes] (val x: Self with FindOrInitializeOptions[TAttributes]) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: TAttributes): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
  }
}
