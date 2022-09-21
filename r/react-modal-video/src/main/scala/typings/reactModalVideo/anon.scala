package typings.reactModalVideo

import typings.reactModalVideo.reactModalVideoStrings.`Close the modal by clicking here`
import typings.reactModalVideo.reactModalVideoStrings.`You just opened the modal video`
import typings.reactModalVideo.reactModalVideoStrings.`modal-video-body`
import typings.reactModalVideo.reactModalVideoStrings.`modal-video-close-btn`
import typings.reactModalVideo.reactModalVideoStrings.`modal-video-close`
import typings.reactModalVideo.reactModalVideoStrings.`modal-video-effect`
import typings.reactModalVideo.reactModalVideoStrings.`modal-video-inner`
import typings.reactModalVideo.reactModalVideoStrings.`modal-video-movie-wrap`
import typings.reactModalVideo.reactModalVideoStrings.`modal-video`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DismissBtnMessage extends StObject {
    
    var dismissBtnMessage: `Close the modal by clicking here`
    
    var openMessage: `You just opened the modal video`
  }
  object DismissBtnMessage {
    
    inline def apply(): DismissBtnMessage = {
      val __obj = js.Dynamic.literal(dismissBtnMessage = "Close the modal by clicking here", openMessage = "You just opened the modal video")
      __obj.asInstanceOf[DismissBtnMessage]
    }
    
    extension [Self <: DismissBtnMessage](x: Self) {
      
      inline def setDismissBtnMessage(value: `Close the modal by clicking here`): Self = StObject.set(x, "dismissBtnMessage", value.asInstanceOf[js.Any])
      
      inline def setOpenMessage(value: `You just opened the modal video`): Self = StObject.set(x, "openMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModalVideo extends StObject {
    
    var modalVideo: `modal-video`
    
    var modalVideoBody: `modal-video-body`
    
    var modalVideoClose: `modal-video-close`
    
    var modalVideoCloseBtn: `modal-video-close-btn`
    
    var modalVideoEffect: `modal-video-effect`
    
    var modalVideoIframeWrap: `modal-video-movie-wrap`
    
    var modalVideoInner: `modal-video-inner`
  }
  object ModalVideo {
    
    inline def apply(): ModalVideo = {
      val __obj = js.Dynamic.literal(modalVideo = "modal-video", modalVideoBody = "modal-video-body", modalVideoClose = "modal-video-close", modalVideoCloseBtn = "modal-video-close-btn", modalVideoEffect = "modal-video-effect", modalVideoIframeWrap = "modal-video-movie-wrap", modalVideoInner = "modal-video-inner")
      __obj.asInstanceOf[ModalVideo]
    }
    
    extension [Self <: ModalVideo](x: Self) {
      
      inline def setModalVideo(value: `modal-video`): Self = StObject.set(x, "modalVideo", value.asInstanceOf[js.Any])
      
      inline def setModalVideoBody(value: `modal-video-body`): Self = StObject.set(x, "modalVideoBody", value.asInstanceOf[js.Any])
      
      inline def setModalVideoClose(value: `modal-video-close`): Self = StObject.set(x, "modalVideoClose", value.asInstanceOf[js.Any])
      
      inline def setModalVideoCloseBtn(value: `modal-video-close-btn`): Self = StObject.set(x, "modalVideoCloseBtn", value.asInstanceOf[js.Any])
      
      inline def setModalVideoEffect(value: `modal-video-effect`): Self = StObject.set(x, "modalVideoEffect", value.asInstanceOf[js.Any])
      
      inline def setModalVideoIframeWrap(value: `modal-video-movie-wrap`): Self = StObject.set(x, "modalVideoIframeWrap", value.asInstanceOf[js.Any])
      
      inline def setModalVideoInner(value: `modal-video-inner`): Self = StObject.set(x, "modalVideoInner", value.asInstanceOf[js.Any])
    }
  }
}
