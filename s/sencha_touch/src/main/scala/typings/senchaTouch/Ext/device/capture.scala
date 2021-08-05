package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capture {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Start the audio recorder application and return information about captured audio clip file s
      * @param config Object The configuration object to be passed:
      */
    var captureAudio: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Start the video recorder application and return information about captured video clip file s
      * @param config Object The configuration object to be passed:
      */
    var captureVideo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setCaptureAudio(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "captureAudio", js.Any.fromFunction1(value))
      
      inline def setCaptureAudioUndefined: Self = StObject.set(x, "captureAudio", js.undefined)
      
      inline def setCaptureVideo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "captureVideo", js.Any.fromFunction1(value))
      
      inline def setCaptureVideoUndefined: Self = StObject.set(x, "captureVideo", js.undefined)
    }
  }
  
  type ICordova = IBase
  
  trait ISimulator
    extends StObject
       with IBase {
    
    /** [Method] Start the audio recorder application and return information about captured audio clip file s
      * @param config Object The configuration object to be passed:
      */
    var captureAudio: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Start the video recorder application and return information about captured video clip file s
      * @param config Object The configuration object to be passed:
      */
    var captureVideo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ISimulator {
    
    inline def apply(): ISimulator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISimulator]
    }
    
    extension [Self <: ISimulator](x: Self) {
      
      inline def setCaptureAudio(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "captureAudio", js.Any.fromFunction1(value))
      
      inline def setCaptureAudioUndefined: Self = StObject.set(x, "captureAudio", js.undefined)
      
      inline def setCaptureVideo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "captureVideo", js.Any.fromFunction1(value))
      
      inline def setCaptureVideoUndefined: Self = StObject.set(x, "captureVideo", js.undefined)
    }
  }
}
