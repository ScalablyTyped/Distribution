package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconGalleryMod {
  
  @JSImport("@storybook/components/dist/blocks/IconGallery", "IconGallery")
  @js.native
  val IconGallery: FunctionComponent[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks/IconGallery", "IconItem")
  @js.native
  val IconItem: FunctionComponent[IconItemProps] = js.native
  
  trait IconItemProps extends StObject {
    
    var name: String
  }
  object IconItemProps {
    
    inline def apply(name: String): IconItemProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconItemProps]
    }
    
    extension [Self <: IconItemProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
