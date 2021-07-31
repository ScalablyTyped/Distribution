package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirelensConfiguration extends StObject {
  
  var options: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var `type`: String
}
object FirelensConfiguration {
  
  @scala.inline
  def apply(`type`: String): FirelensConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirelensConfiguration]
  }
  
  @scala.inline
  implicit class FirelensConfigurationMutableBuilder[Self <: FirelensConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
