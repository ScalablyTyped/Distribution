package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var controlsList: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var mediaGroup: js.UndefOr[String] = js.undefined
  
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var playsInline: js.UndefOr[Boolean] = js.undefined
  
  var preload: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
}
object MediaHTMLAttributes {
  
  @scala.inline
  def apply[T](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MediaHTMLAttributesMutableBuilder[Self <: MediaHTMLAttributes[?], T] (val x: Self & MediaHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsList(value: String): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsListUndefined: Self = StObject.set(x, "controlsList", js.undefined)
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    @scala.inline
    def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
