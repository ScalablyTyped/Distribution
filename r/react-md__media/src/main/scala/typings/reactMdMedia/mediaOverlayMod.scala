package typings.reactMdMedia

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaOverlayMod {
  
  @JSImport("@react-md/media/types/MediaOverlay", "MediaOverlay")
  @js.native
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdMedia.reactMdMediaStrings.top
    - typings.reactMdMedia.reactMdMediaStrings.right
    - typings.reactMdMedia.reactMdMediaStrings.bottom
    - typings.reactMdMedia.reactMdMediaStrings.left
    - typings.reactMdMedia.reactMdMediaStrings.middle
    - typings.reactMdMedia.reactMdMediaStrings.center
    - typings.reactMdMedia.reactMdMediaStrings.`absolute-center`
  */
  trait MediaOverlayPosition extends StObject
  object MediaOverlayPosition {
    
    @scala.inline
    def `absolute-center`: typings.reactMdMedia.reactMdMediaStrings.`absolute-center` = "absolute-center".asInstanceOf[typings.reactMdMedia.reactMdMediaStrings.`absolute-center`]
    
    @scala.inline
    def bottom: typings.reactMdMedia.reactMdMediaStrings.bottom = "bottom".asInstanceOf[typings.reactMdMedia.reactMdMediaStrings.bottom]
    
    @scala.inline
    def center: typings.reactMdMedia.reactMdMediaStrings.center = "center".asInstanceOf[typings.reactMdMedia.reactMdMediaStrings.center]
    
    @scala.inline
    def left: typings.reactMdMedia.reactMdMediaStrings.left = "left".asInstanceOf[typings.reactMdMedia.reactMdMediaStrings.left]
    
    @scala.inline
    def middle: typings.reactMdMedia.reactMdMediaStrings.middle = "middle".asInstanceOf[typings.reactMdMedia.reactMdMediaStrings.middle]
    
    @scala.inline
    def right: typings.reactMdMedia.reactMdMediaStrings.right = "right".asInstanceOf[typings.reactMdMedia.reactMdMediaStrings.right]
    
    @scala.inline
    def top: typings.reactMdMedia.reactMdMediaStrings.top = "top".asInstanceOf[typings.reactMdMedia.reactMdMediaStrings.top]
  }
  
  trait MediaOverlayProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * The position of the overlay within the `MediaContainer`.
      */
    var position: js.UndefOr[MediaOverlayPosition] = js.undefined
  }
  object MediaOverlayProps {
    
    @scala.inline
    def apply(): MediaOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOverlayProps]
    }
    
    @scala.inline
    implicit class MediaOverlayPropsMutableBuilder[Self <: MediaOverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: MediaOverlayPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
