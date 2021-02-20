package typings.spectrogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Enable extends StObject {
    
    var enable: js.UndefOr[Boolean] = js.native
  }
  object Enable {
    
    @scala.inline
    def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit class EnableMutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: js.UndefOr[Double | js.Function0[Double]] = js.native
    
    var width: js.UndefOr[Double | js.Function0[Double]] = js.native
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double | js.Function0[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightFunction0(value: () => Double): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | js.Function0[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthFunction0(value: () => Double): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
