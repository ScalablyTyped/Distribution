package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camera {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Allows you to capture a photo
      * @param options Object The options to use when taking a photo.
      * @param scope Object The scope in which to call the success and failure functions, if specified.
      * @param destination String The destination of the image which is returned. Available options are:  data - returns a base64 encoded string file - returns the file's URI
      * @param encoding String The encoding of the returned image. Available options are:  jpg png
      * @param width Number The width of the image to return
      * @param height Number The height of the image to return
      */
    var capture: js.UndefOr[
        js.Function6[
          /* options */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          /* destination */ js.UndefOr[String], 
          /* encoding */ js.UndefOr[String], 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
  }
  object IAbstract {
    
    @scala.inline
    def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit class IAbstractMutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(
        value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* destination */ js.UndefOr[String], /* encoding */ js.UndefOr[String], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "capture", js.Any.fromFunction6(value))
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract {
    
    /** [Method] Allows you to capture a photo
      * @param args Object
      */
    @JSName("capture")
    var capture_ICordova: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ICordova {
    
    @scala.inline
    def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    @scala.inline
    implicit class ICordovaMutableBuilder[Self <: ICordova] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: /* args */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  trait IPhoneGap
    extends StObject
       with IAbstract {
    
    /** [Method] Allows you to capture a photo
      * @param args Object
      */
    @JSName("capture")
    var capture_IPhoneGap: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IPhoneGap {
    
    @scala.inline
    def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
    
    @scala.inline
    implicit class IPhoneGapMutableBuilder[Self <: IPhoneGap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: /* args */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  trait ISencha
    extends StObject
       with IAbstract {
    
    /** [Method] Allows you to capture a photo
      * @param options Object
      */
    @JSName("capture")
    var capture_ISencha: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ISencha {
    
    @scala.inline
    def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    @scala.inline
    implicit class ISenchaMutableBuilder[Self <: ISencha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  trait ISimulator
    extends StObject
       with IAbstract {
    
    /** [Method] Allows you to capture a photo
      * @param options Object
      */
    @JSName("capture")
    var capture_ISimulator: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Returns the value of samples
      * @returns Array
      */
    var getSamples: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Sets the value of samples
      * @param samples Array The new value.
      */
    var setSamples: js.UndefOr[js.Function1[/* samples */ js.UndefOr[Array], Unit]] = js.undefined
  }
  object ISimulator {
    
    @scala.inline
    def apply(): ISimulator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISimulator]
    }
    
    @scala.inline
    implicit class ISimulatorMutableBuilder[Self <: ISimulator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setGetSamples(value: () => Array): Self = StObject.set(x, "getSamples", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSamplesUndefined: Self = StObject.set(x, "getSamples", js.undefined)
      
      @scala.inline
      def setSetSamples(value: /* samples */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setSamples", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSamplesUndefined: Self = StObject.set(x, "setSamples", js.undefined)
    }
  }
}
