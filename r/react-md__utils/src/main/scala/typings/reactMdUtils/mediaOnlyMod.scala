package typings.reactMdUtils

import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait MediaOnlyProps extends StObject {
    
    /**
      * The children to display.
      */
    var children: ReactElement | Null = js.native
    
    /**
      * An optional fallback element to show when the media queries do not match.
      */
    var fallback: js.UndefOr[ReactElement | Null] = js.native
  }
  object MediaOnlyProps {
    
    @scala.inline
    def apply(): MediaOnlyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOnlyProps]
    }
    
    @scala.inline
    implicit class MediaOnlyPropsMutableBuilder[Self <: MediaOnlyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
