package typings.reactDevtoolsInline.anon

import typings.reactDevtoolsInline.commonsMod.ReactRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactBuildType extends StObject {
  
  var id: Double
  
  var reactBuildType: String
  
  var renderer: ReactRenderer
}
object ReactBuildType {
  
  inline def apply(id: Double, reactBuildType: String, renderer: ReactRenderer): ReactBuildType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reactBuildType = reactBuildType.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactBuildType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactBuildType] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReactBuildType(value: String): Self = StObject.set(x, "reactBuildType", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: ReactRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
