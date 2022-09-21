package typings.senchaTouch.Ext.fx

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  type ICard = IBase
  
  object card {
    
    trait IAbstract
      extends StObject
         with IEvented {
      
      /** [Method] Returns the value of direction
        * @returns String
        */
      var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
      
      /** [Method] Returns the value of duration
        * @returns Object
        */
      var getDuration: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of layout
        * @returns Object
        */
      var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of reverse
        * @returns Object
        */
      var getReverse: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Sets the value of direction
        * @param direction String The new value.
        */
      var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
      
      /** [Method] Sets the value of duration
        * @param duration Object The new value.
        */
      var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of layout
        * @param layout Object The new value.
        */
      var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of reverse
        * @param reverse Object The new value.
        */
      var setReverse: js.UndefOr[js.Function1[/* reverse */ js.UndefOr[Any], Unit]] = js.undefined
    }
    object IAbstract {
      
      inline def apply(): IAbstract = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAbstract]
      }
      
      extension [Self <: IAbstract](x: Self) {
        
        inline def setGetDirection(value: () => String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
        
        inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
        
        inline def setGetDuration(value: () => Any): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
        
        inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
        
        inline def setGetLayout(value: () => Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
        
        inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
        
        inline def setGetReverse(value: () => Any): Self = StObject.set(x, "getReverse", js.Any.fromFunction0(value))
        
        inline def setGetReverseUndefined: Self = StObject.set(x, "getReverse", js.undefined)
        
        inline def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
        
        inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
        
        inline def setSetDuration(value: /* duration */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
        
        inline def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
        
        inline def setSetLayout(value: /* layout */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
        
        inline def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
        
        inline def setSetReverse(value: /* reverse */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setReverse", js.Any.fromFunction1(value))
        
        inline def setSetReverseUndefined: Self = StObject.set(x, "setReverse", js.undefined)
      }
    }
    
    trait ICover
      extends StObject
         with IStyle
    object ICover {
      
      inline def apply(): ICover = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICover]
      }
    }
    
    trait ICube
      extends StObject
         with IStyle
    object ICube {
      
      inline def apply(): ICube = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICube]
      }
    }
    
    trait IFade
      extends StObject
         with IStyle
    object IFade {
      
      inline def apply(): IFade = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFade]
      }
    }
    
    trait IFlip
      extends StObject
         with IStyle {
      
      /** [Method] Returns the value of duration
        * @returns Number
        */
      @JSName("getDuration")
      var getDuration_IFlip: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Sets the value of duration
        * @param duration Number The new value.
        */
      @JSName("setDuration")
      var setDuration_IFlip: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object IFlip {
      
      inline def apply(): IFlip = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFlip]
      }
      
      extension [Self <: IFlip](x: Self) {
        
        inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
        
        inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
        
        inline def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
        
        inline def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      }
    }
    
    trait IPop
      extends StObject
         with IStyle {
      
      /** [Method] Returns the value of duration
        * @returns Number
        */
      @JSName("getDuration")
      var getDuration_IPop: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Sets the value of duration
        * @param duration Number The new value.
        */
      @JSName("setDuration")
      var setDuration_IPop: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object IPop {
      
      inline def apply(): IPop = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPop]
      }
      
      extension [Self <: IPop](x: Self) {
        
        inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
        
        inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
        
        inline def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
        
        inline def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      }
    }
    
    trait IReveal
      extends StObject
         with IStyle
    object IReveal {
      
      inline def apply(): IReveal = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IReveal]
      }
    }
    
    trait IScroll
      extends StObject
         with IAbstract {
      
      /** [Method] Returns the value of duration
        * @returns Number
        */
      @JSName("getDuration")
      var getDuration_IScroll: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Sets the value of duration
        * @param duration Number The new value.
        */
      @JSName("setDuration")
      var setDuration_IScroll: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object IScroll {
      
      inline def apply(): IScroll = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IScroll]
      }
      
      extension [Self <: IScroll](x: Self) {
        
        inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
        
        inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
        
        inline def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
        
        inline def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      }
    }
    
    type IScrollCover = IScroll
    
    type IScrollReveal = IScroll
    
    trait ISlide
      extends StObject
         with IStyle
    object ISlide {
      
      inline def apply(): ISlide = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISlide]
      }
    }
    
    trait IStyle
      extends StObject
         with IAbstract {
      
      /** [Method] Returns the value of inAnimation
        * @returns Object
        */
      var getInAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of outAnimation
        * @returns Object
        */
      var getOutAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Sets the value of inAnimation
        * @param inAnimation Object The new value.
        */
      var setInAnimation: js.UndefOr[js.Function1[/* inAnimation */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of outAnimation
        * @param outAnimation Object The new value.
        */
      var setOutAnimation: js.UndefOr[js.Function1[/* outAnimation */ js.UndefOr[Any], Unit]] = js.undefined
    }
    object IStyle {
      
      inline def apply(): IStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IStyle]
      }
      
      extension [Self <: IStyle](x: Self) {
        
        inline def setGetInAnimation(value: () => Any): Self = StObject.set(x, "getInAnimation", js.Any.fromFunction0(value))
        
        inline def setGetInAnimationUndefined: Self = StObject.set(x, "getInAnimation", js.undefined)
        
        inline def setGetOutAnimation(value: () => Any): Self = StObject.set(x, "getOutAnimation", js.Any.fromFunction0(value))
        
        inline def setGetOutAnimationUndefined: Self = StObject.set(x, "getOutAnimation", js.undefined)
        
        inline def setSetInAnimation(value: /* inAnimation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setInAnimation", js.Any.fromFunction1(value))
        
        inline def setSetInAnimationUndefined: Self = StObject.set(x, "setInAnimation", js.undefined)
        
        inline def setSetOutAnimation(value: /* outAnimation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setOutAnimation", js.Any.fromFunction1(value))
        
        inline def setSetOutAnimationUndefined: Self = StObject.set(x, "setOutAnimation", js.undefined)
      }
    }
  }
}
