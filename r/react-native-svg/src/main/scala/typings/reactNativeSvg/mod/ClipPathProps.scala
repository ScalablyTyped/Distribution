package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipPathProps extends StObject {
  
  var id: js.UndefOr[String] = js.native
}
object ClipPathProps {
  
  @scala.inline
  def apply(): ClipPathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipPathProps]
  }
  
  @scala.inline
  implicit class ClipPathPropsMutableBuilder[Self <: ClipPathProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
