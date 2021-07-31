package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgType
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ArgType {
  
  @scala.inline
  def apply(): ArgType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgType]
  }
  
  @scala.inline
  implicit class ArgTypeMutableBuilder[Self <: ArgType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
