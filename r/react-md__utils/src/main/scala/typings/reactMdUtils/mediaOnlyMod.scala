package typings.reactMdUtils

import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaOnlyMod {
  
  @JSImport("@react-md/utils/types/sizing/MediaOnly", "DesktopOnly")
  @js.native
  val DesktopOnly: FC[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils/types/sizing/MediaOnly", "MobileOnly")
  @js.native
  val MobileOnly: FC[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils/types/sizing/MediaOnly", "PhoneOnly")
  @js.native
  val PhoneOnly: FC[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils/types/sizing/MediaOnly", "TabletOnly")
  @js.native
  val TabletOnly: FC[MediaOnlyProps] = js.native
  
  trait MediaOnlyProps extends StObject {
    
    /**
      * The children to display.
      */
    var children: ReactElement | Null
    
    /**
      * An optional fallback element to show when the media queries do not match.
      */
    var fallback: js.UndefOr[ReactElement | Null] = js.undefined
  }
  object MediaOnlyProps {
    
    inline def apply(): MediaOnlyProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MediaOnlyProps]
    }
    
    extension [Self <: MediaOnlyProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
