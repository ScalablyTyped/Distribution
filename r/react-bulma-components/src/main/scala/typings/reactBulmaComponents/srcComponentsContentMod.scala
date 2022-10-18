package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsContentMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/content", JSImport.Default)
  @js.native
  val default: BulmaComponent[ContentProps, div] = js.native
  
  trait ContentProps extends StObject {
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object ContentProps {
    
    inline def apply(): ContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = BulmaComponent[ContentProps, div]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsContentMod.foo` */
  override def _to: BulmaComponent[ContentProps, div] = default
}
