package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerContentContainer extends StObject {
  
  var container: js.UndefOr[ViewStyle] = js.native
  
  var contentContainer: js.UndefOr[ViewStyle] = js.native
}
object ContainerContentContainer {
  
  @scala.inline
  def apply(): ContainerContentContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerContentContainer]
  }
  
  @scala.inline
  implicit class ContainerContentContainerMutableBuilder[Self <: ContainerContentContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContentContainer(value: ViewStyle): Self = StObject.set(x, "contentContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerNull: Self = StObject.set(x, "contentContainer", null)
    
    @scala.inline
    def setContentContainerUndefined: Self = StObject.set(x, "contentContainer", js.undefined)
  }
}
