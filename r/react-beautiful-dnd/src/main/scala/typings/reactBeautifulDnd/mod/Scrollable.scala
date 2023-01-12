package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  // Used for comparision with dynamic recollecting
  var frameClient: BoxModel
  
  // This is the window through which the droppable is observed
  // It does not change during a drag
  var pageMarginBox: Rect
  
  var scroll: ScrollDetails
  
  var scrollSize: ScrollSize
  
  // Whether or not we should clip the subject by the frame
  // Is controlled by the ignoreContainerClipping prop
  var shouldClipSubject: Boolean
}
object Scrollable {
  
  inline def apply(
    frameClient: BoxModel,
    pageMarginBox: Rect,
    scroll: ScrollDetails,
    scrollSize: ScrollSize,
    shouldClipSubject: Boolean
  ): Scrollable = {
    val __obj = js.Dynamic.literal(frameClient = frameClient.asInstanceOf[js.Any], pageMarginBox = pageMarginBox.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollSize = scrollSize.asInstanceOf[js.Any], shouldClipSubject = shouldClipSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scrollable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scrollable] (val x: Self) extends AnyVal {
    
    inline def setFrameClient(value: BoxModel): Self = StObject.set(x, "frameClient", value.asInstanceOf[js.Any])
    
    inline def setPageMarginBox(value: Rect): Self = StObject.set(x, "pageMarginBox", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: ScrollDetails): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollSize(value: ScrollSize): Self = StObject.set(x, "scrollSize", value.asInstanceOf[js.Any])
    
    inline def setShouldClipSubject(value: Boolean): Self = StObject.set(x, "shouldClipSubject", value.asInstanceOf[js.Any])
  }
}
