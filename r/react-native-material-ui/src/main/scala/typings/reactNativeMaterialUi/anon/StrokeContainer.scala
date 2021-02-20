package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeContainer extends StObject {
  
  var container: js.UndefOr[ViewStyle] = js.native
  
  var content: js.UndefOr[ViewStyle] = js.native
  
  var strokeContainer: js.UndefOr[ViewStyle] = js.native
}
object StrokeContainer {
  
  @scala.inline
  def apply(): StrokeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeContainer]
  }
  
  @scala.inline
  implicit class StrokeContainerMutableBuilder[Self <: StrokeContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setStrokeContainer(value: ViewStyle): Self = StObject.set(x, "strokeContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeContainerNull: Self = StObject.set(x, "strokeContainer", null)
    
    @scala.inline
    def setStrokeContainerUndefined: Self = StObject.set(x, "strokeContainer", js.undefined)
  }
}
