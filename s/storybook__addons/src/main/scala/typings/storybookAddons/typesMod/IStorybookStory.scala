package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorybookStory extends StObject {
  
  var name: String
  
  def render(context: Any): Any
}
object IStorybookStory {
  
  inline def apply(name: String, render: Any => Any): IStorybookStory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[IStorybookStory]
  }
  
  extension [Self <: IStorybookStory](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Any => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
