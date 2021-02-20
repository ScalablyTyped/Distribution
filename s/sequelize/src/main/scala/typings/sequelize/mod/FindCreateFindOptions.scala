package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.findOrInitialize method
  */
@js.native
trait FindCreateFindOptions[TAttributes] extends FindOptions[TAttributes] {
  
  /**
    * Default values to use if building a new instance
    */
  var defaults: js.UndefOr[TAttributes] = js.native
}
object FindCreateFindOptions {
  
  @scala.inline
  def apply[TAttributes](): FindCreateFindOptions[TAttributes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindCreateFindOptions[TAttributes]]
  }
  
  @scala.inline
  implicit class FindCreateFindOptionsMutableBuilder[Self <: FindCreateFindOptions[_], TAttributes] (val x: Self with FindCreateFindOptions[TAttributes]) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: TAttributes): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
  }
}
