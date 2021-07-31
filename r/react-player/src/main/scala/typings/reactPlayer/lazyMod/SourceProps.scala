package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceProps extends StObject {
  
  var src: String
  
  var `type`: String
}
object SourceProps {
  
  @scala.inline
  def apply(src: String, `type`: String): SourceProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceProps]
  }
  
  @scala.inline
  implicit class SourcePropsMutableBuilder[Self <: SourceProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
