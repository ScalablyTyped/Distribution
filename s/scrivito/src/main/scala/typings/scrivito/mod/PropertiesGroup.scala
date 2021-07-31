package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO talk about this with krishan
trait PropertiesGroup extends StObject {
  
  var component: js.UndefOr[String] = js.undefined
  
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: String
}
object PropertiesGroup {
  
  @scala.inline
  def apply(title: String): PropertiesGroup = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesGroup]
  }
  
  @scala.inline
  implicit class PropertiesGroupMutableBuilder[Self <: PropertiesGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
