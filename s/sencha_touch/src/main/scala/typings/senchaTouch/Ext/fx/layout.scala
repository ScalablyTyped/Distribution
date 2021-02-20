package typings.senchaTouch.Ext.fx

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  type ICard = IBase
  
  object card {
    
    @js.native
    trait IAbstract extends IEvented {
      
      /** [Method] Returns the value of direction
        * @returns String
        */
      var getDirection: js.UndefOr[js.Function0[String]] = js.native
      
      /** [Method] Returns the value of duration
        * @returns Object
        */
      var getDuration: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Returns the value of layout
        * @returns Object
        */
      var getLayout: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Returns the value of reverse
        * @returns Object
        */
      var getReverse: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Sets the value of direction
        * @param direction String The new value.
        */
      var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
      
      /** [Method] Sets the value of duration
        * @param duration Object The new value.
        */
      var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of layout
        * @param layout Object The new value.
        */
      var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of reverse
        * @param reverse Object The new value.
        */
      var setReverse: js.UndefOr[js.Function1[/* reverse */ js.UndefOr[js.Any], Unit]] = js.native
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
        def setGetDirection(value: () => String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
        
        @scala.inline
        def setGetDuration(value: () => _): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
        
        @scala.inline
        def setGetLayout(value: () => _): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
        
        @scala.inline
        def setGetReverse(value: () => _): Self = StObject.set(x, "getReverse", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetReverseUndefined: Self = StObject.set(x, "getReverse", js.undefined)
        
        @scala.inline
        def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
        
        @scala.inline
        def setSetDuration(value: /* duration */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
        
        @scala.inline
        def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
        
        @scala.inline
        def setSetReverse(value: /* reverse */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setReverse", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetReverseUndefined: Self = StObject.set(x, "setReverse", js.undefined)
      }
    }
    
    @js.native
    trait ICover extends IStyle
    object ICover {
      
      @scala.inline
      def apply(): ICover = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICover]
      }
    }
    
    @js.native
    trait ICube extends IStyle
    object ICube {
      
      @scala.inline
      def apply(): ICube = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICube]
      }
    }
    
    @js.native
    trait IFade extends IStyle
    object IFade {
      
      @scala.inline
      def apply(): IFade = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFade]
      }
    }
    
    @js.native
    trait IFlip extends IStyle {
      
      /** [Method] Returns the value of duration
        * @returns Number
        */
      @JSName("getDuration")
      var getDuration_IFlip: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Sets the value of duration
        * @param duration Number The new value.
        */
      @JSName("setDuration")
      var setDuration_IFlip: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
    }
    object IFlip {
      
      @scala.inline
      def apply(): IFlip = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFlip]
      }
      
      @scala.inline
      implicit class IFlipMutableBuilder[Self <: IFlip] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
        
        @scala.inline
        def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      }
    }
    
    @js.native
    trait IPop extends IStyle {
      
      /** [Method] Returns the value of duration
        * @returns Number
        */
      @JSName("getDuration")
      var getDuration_IPop: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Sets the value of duration
        * @param duration Number The new value.
        */
      @JSName("setDuration")
      var setDuration_IPop: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
    }
    object IPop {
      
      @scala.inline
      def apply(): IPop = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPop]
      }
      
      @scala.inline
      implicit class IPopMutableBuilder[Self <: IPop] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
        
        @scala.inline
        def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      }
    }
    
    @js.native
    trait IReveal extends IStyle
    object IReveal {
      
      @scala.inline
      def apply(): IReveal = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IReveal]
      }
    }
    
    @js.native
    trait IScroll extends IAbstract {
      
      /** [Method] Returns the value of duration
        * @returns Number
        */
      @JSName("getDuration")
      var getDuration_IScroll: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Sets the value of duration
        * @param duration Number The new value.
        */
      @JSName("setDuration")
      var setDuration_IScroll: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
    }
    object IScroll {
      
      @scala.inline
      def apply(): IScroll = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IScroll]
      }
      
      @scala.inline
      implicit class IScrollMutableBuilder[Self <: IScroll] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
        
        @scala.inline
        def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      }
    }
    
    type IScrollCover = IScroll
    
    type IScrollReveal = IScroll
    
    @js.native
    trait ISlide extends IStyle
    object ISlide {
      
      @scala.inline
      def apply(): ISlide = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISlide]
      }
    }
    
    @js.native
    trait IStyle extends IAbstract {
      
      /** [Method] Returns the value of inAnimation
        * @returns Object
        */
      var getInAnimation: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Returns the value of outAnimation
        * @returns Object
        */
      var getOutAnimation: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Sets the value of inAnimation
        * @param inAnimation Object The new value.
        */
      var setInAnimation: js.UndefOr[js.Function1[/* inAnimation */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of outAnimation
        * @param outAnimation Object The new value.
        */
      var setOutAnimation: js.UndefOr[js.Function1[/* outAnimation */ js.UndefOr[js.Any], Unit]] = js.native
    }
    object IStyle {
      
      @scala.inline
      def apply(): IStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IStyle]
      }
      
      @scala.inline
      implicit class IStyleMutableBuilder[Self <: IStyle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetInAnimation(value: () => _): Self = StObject.set(x, "getInAnimation", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetInAnimationUndefined: Self = StObject.set(x, "getInAnimation", js.undefined)
        
        @scala.inline
        def setGetOutAnimation(value: () => _): Self = StObject.set(x, "getOutAnimation", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetOutAnimationUndefined: Self = StObject.set(x, "getOutAnimation", js.undefined)
        
        @scala.inline
        def setSetInAnimation(value: /* inAnimation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setInAnimation", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetInAnimationUndefined: Self = StObject.set(x, "setInAnimation", js.undefined)
        
        @scala.inline
        def setSetOutAnimation(value: /* outAnimation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOutAnimation", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetOutAnimationUndefined: Self = StObject.set(x, "setOutAnimation", js.undefined)
      }
    }
  }
}
