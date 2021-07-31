package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactTag extends StObject {
  
  var reactTag: Double | Null
}
object ReactTag {
  
  @scala.inline
  def apply(): ReactTag = {
    val __obj = js.Dynamic.literal(reactTag = null)
    __obj.asInstanceOf[ReactTag]
  }
  
  @scala.inline
  implicit class ReactTagMutableBuilder[Self <: ReactTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReactTag(value: Double): Self = StObject.set(x, "reactTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactTagNull: Self = StObject.set(x, "reactTag", null)
  }
}
