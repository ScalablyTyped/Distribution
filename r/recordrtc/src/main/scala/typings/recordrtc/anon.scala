package typings.recordrtc

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var image: String
  }
  object Image {
    
    inline def apply(image: String): Image = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in recordrtc.recordrtc.DiskStorageType ]:? std.Blob} */
  trait KinDiskStorageTypeBlob extends StObject {
    
    var audioBlob: js.UndefOr[Blob] = js.undefined
    
    var gifBlob: js.UndefOr[Blob] = js.undefined
    
    var videoBlob: js.UndefOr[Blob] = js.undefined
  }
  object KinDiskStorageTypeBlob {
    
    inline def apply(): KinDiskStorageTypeBlob = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KinDiskStorageTypeBlob]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KinDiskStorageTypeBlob] (val x: Self) extends AnyVal {
      
      inline def setAudioBlob(value: Blob): Self = StObject.set(x, "audioBlob", value.asInstanceOf[js.Any])
      
      inline def setAudioBlobUndefined: Self = StObject.set(x, "audioBlob", js.undefined)
      
      inline def setGifBlob(value: Blob): Self = StObject.set(x, "gifBlob", value.asInstanceOf[js.Any])
      
      inline def setGifBlobUndefined: Self = StObject.set(x, "gifBlob", js.undefined)
      
      inline def setVideoBlob(value: Blob): Self = StObject.set(x, "videoBlob", value.asInstanceOf[js.Any])
      
      inline def setVideoBlobUndefined: Self = StObject.set(x, "videoBlob", js.undefined)
    }
  }
  
  trait OnRecordingStopped extends StObject {
    
    def onRecordingStopped(callback: js.Function0[Unit]): Unit
  }
  object OnRecordingStopped {
    
    inline def apply(onRecordingStopped: js.Function0[Unit] => Unit): OnRecordingStopped = {
      val __obj = js.Dynamic.literal(onRecordingStopped = js.Any.fromFunction1(onRecordingStopped))
      __obj.asInstanceOf[OnRecordingStopped]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnRecordingStopped] (val x: Self) extends AnyVal {
      
      inline def setOnRecordingStopped(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onRecordingStopped", js.Any.fromFunction1(value))
    }
  }
}
