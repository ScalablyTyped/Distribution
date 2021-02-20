package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentContainer extends StObject {
  
  var contentContainer: js.UndefOr[ViewStyle] = js.native
}
object ContentContainer {
  
  @scala.inline
  def apply(): ContentContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentContainer]
  }
  
  @scala.inline
  implicit class ContentContainerMutableBuilder[Self <: ContentContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentContainer(value: ViewStyle): Self = StObject.set(x, "contentContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerNull: Self = StObject.set(x, "contentContainer", null)
    
    @scala.inline
    def setContentContainerUndefined: Self = StObject.set(x, "contentContainer", js.undefined)
  }
}
