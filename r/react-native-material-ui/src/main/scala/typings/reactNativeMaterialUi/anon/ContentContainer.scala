package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentContainer extends StObject {
  
  var contentContainer: js.UndefOr[ViewStyle] = js.undefined
}
object ContentContainer {
  
  inline def apply(): ContentContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentContainer] (val x: Self) extends AnyVal {
    
    inline def setContentContainer(value: ViewStyle): Self = StObject.set(x, "contentContainer", value.asInstanceOf[js.Any])
    
    inline def setContentContainerNull: Self = StObject.set(x, "contentContainer", null)
    
    inline def setContentContainerUndefined: Self = StObject.set(x, "contentContainer", js.undefined)
  }
}
