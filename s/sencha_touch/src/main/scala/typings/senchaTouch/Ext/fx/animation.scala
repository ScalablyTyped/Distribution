package typings.senchaTouch.Ext.fx

import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animation {
  
  trait IAbstract
    extends StObject
       with IEvented {
    
    /** [Config Option] (Object) */
    var before: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var easing: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of after
      * @returns Object
      */
    var getAfter: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of before
      * @returns Object
      */
    var getBefore: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of delay
      * @returns Number
      */
    var getDelay: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of duration
      * @returns Number
      */
    var getDuration: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of easing
      * @returns String
      */
    var getEasing: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of element
      * @returns Object
      */
    var getElement: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of iteration
      * @returns Number
      */
    var getIteration: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of name
      * @returns String
      */
    var getName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of onBeforeEnd
      * @returns Object
      */
    var getOnBeforeEnd: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of onBeforeStart
      * @returns Object
      */
    var getOnBeforeStart: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of onEnd
      * @returns Object
      */
    var getOnEnd: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of preserveEndState
      * @returns Boolean
      */
    var getPreserveEndState: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of replacePrevious
      * @returns Boolean
      */
    var getReplacePrevious: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of reverse
      * @returns Object
      */
    var getReverse: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of scope
      * @returns Object
      */
    var getScope: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Sets the value of after
      * @param after Object The new value.
      */
    var setAfter: js.UndefOr[js.Function1[/* after */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of before
      * @param before Object The new value.
      */
    var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of delay
      * @param delay Number The new value.
      */
    var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of duration
      * @param duration Number The new value.
      */
    var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of easing
      * @param easing String The new value.
      */
    var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of element
      * @param element Object The new value.
      */
    var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of iteration
      * @param iteration Number The new value.
      */
    var setIteration: js.UndefOr[js.Function1[/* iteration */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of name
      * @param name String The new value.
      */
    var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of onBeforeEnd
      * @param onBeforeEnd Object The new value.
      */
    var setOnBeforeEnd: js.UndefOr[js.Function1[/* onBeforeEnd */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of onBeforeStart
      * @param onBeforeStart Object The new value.
      */
    var setOnBeforeStart: js.UndefOr[js.Function1[/* onBeforeStart */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of onEnd
      * @param onEnd Object The new value.
      */
    var setOnEnd: js.UndefOr[js.Function1[/* onEnd */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of preserveEndState
      * @param preserveEndState Boolean The new value.
      */
    var setPreserveEndState: js.UndefOr[js.Function1[/* preserveEndState */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of replacePrevious
      * @param replacePrevious Boolean The new value.
      */
    var setReplacePrevious: js.UndefOr[js.Function1[/* replacePrevious */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of reverse
      * @param reverse Object The new value.
      */
    var setReverse: js.UndefOr[js.Function1[/* reverse */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of scope
      * @param scope Object The new value.
      */
    var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setBefore(value: js.Any): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setGetAfter(value: () => js.Any): Self = StObject.set(x, "getAfter", js.Any.fromFunction0(value))
      
      inline def setGetAfterUndefined: Self = StObject.set(x, "getAfter", js.undefined)
      
      inline def setGetBefore(value: () => js.Any): Self = StObject.set(x, "getBefore", js.Any.fromFunction0(value))
      
      inline def setGetBeforeUndefined: Self = StObject.set(x, "getBefore", js.undefined)
      
      inline def setGetDelay(value: () => Double): Self = StObject.set(x, "getDelay", js.Any.fromFunction0(value))
      
      inline def setGetDelayUndefined: Self = StObject.set(x, "getDelay", js.undefined)
      
      inline def setGetDirection(value: () => String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
      
      inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
      
      inline def setGetEasing(value: () => String): Self = StObject.set(x, "getEasing", js.Any.fromFunction0(value))
      
      inline def setGetEasingUndefined: Self = StObject.set(x, "getEasing", js.undefined)
      
      inline def setGetElement(value: () => js.Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      inline def setGetIteration(value: () => Double): Self = StObject.set(x, "getIteration", js.Any.fromFunction0(value))
      
      inline def setGetIterationUndefined: Self = StObject.set(x, "getIteration", js.undefined)
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      inline def setGetOnBeforeEnd(value: () => js.Any): Self = StObject.set(x, "getOnBeforeEnd", js.Any.fromFunction0(value))
      
      inline def setGetOnBeforeEndUndefined: Self = StObject.set(x, "getOnBeforeEnd", js.undefined)
      
      inline def setGetOnBeforeStart(value: () => js.Any): Self = StObject.set(x, "getOnBeforeStart", js.Any.fromFunction0(value))
      
      inline def setGetOnBeforeStartUndefined: Self = StObject.set(x, "getOnBeforeStart", js.undefined)
      
      inline def setGetOnEnd(value: () => js.Any): Self = StObject.set(x, "getOnEnd", js.Any.fromFunction0(value))
      
      inline def setGetOnEndUndefined: Self = StObject.set(x, "getOnEnd", js.undefined)
      
      inline def setGetPreserveEndState(value: () => Boolean): Self = StObject.set(x, "getPreserveEndState", js.Any.fromFunction0(value))
      
      inline def setGetPreserveEndStateUndefined: Self = StObject.set(x, "getPreserveEndState", js.undefined)
      
      inline def setGetReplacePrevious(value: () => Boolean): Self = StObject.set(x, "getReplacePrevious", js.Any.fromFunction0(value))
      
      inline def setGetReplacePreviousUndefined: Self = StObject.set(x, "getReplacePrevious", js.undefined)
      
      inline def setGetReverse(value: () => js.Any): Self = StObject.set(x, "getReverse", js.Any.fromFunction0(value))
      
      inline def setGetReverseUndefined: Self = StObject.set(x, "getReverse", js.undefined)
      
      inline def setGetScope(value: () => js.Any): Self = StObject.set(x, "getScope", js.Any.fromFunction0(value))
      
      inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
      
      inline def setSetAfter(value: /* after */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAfter", js.Any.fromFunction1(value))
      
      inline def setSetAfterUndefined: Self = StObject.set(x, "setAfter", js.undefined)
      
      inline def setSetBefore(value: /* before */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBefore", js.Any.fromFunction1(value))
      
      inline def setSetBeforeUndefined: Self = StObject.set(x, "setBefore", js.undefined)
      
      inline def setSetDelay(value: /* delay */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDelay", js.Any.fromFunction1(value))
      
      inline def setSetDelayUndefined: Self = StObject.set(x, "setDelay", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
      
      inline def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
      
      inline def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      
      inline def setSetEasing(value: /* easing */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setEasing", js.Any.fromFunction1(value))
      
      inline def setSetEasingUndefined: Self = StObject.set(x, "setEasing", js.undefined)
      
      inline def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
      
      inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
      
      inline def setSetIteration(value: /* iteration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIteration", js.Any.fromFunction1(value))
      
      inline def setSetIterationUndefined: Self = StObject.set(x, "setIteration", js.undefined)
      
      inline def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
      
      inline def setSetOnBeforeEnd(value: /* onBeforeEnd */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnBeforeEnd", js.Any.fromFunction1(value))
      
      inline def setSetOnBeforeEndUndefined: Self = StObject.set(x, "setOnBeforeEnd", js.undefined)
      
      inline def setSetOnBeforeStart(value: /* onBeforeStart */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnBeforeStart", js.Any.fromFunction1(value))
      
      inline def setSetOnBeforeStartUndefined: Self = StObject.set(x, "setOnBeforeStart", js.undefined)
      
      inline def setSetOnEnd(value: /* onEnd */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnEnd", js.Any.fromFunction1(value))
      
      inline def setSetOnEndUndefined: Self = StObject.set(x, "setOnEnd", js.undefined)
      
      inline def setSetPreserveEndState(value: /* preserveEndState */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPreserveEndState", js.Any.fromFunction1(value))
      
      inline def setSetPreserveEndStateUndefined: Self = StObject.set(x, "setPreserveEndState", js.undefined)
      
      inline def setSetReplacePrevious(value: /* replacePrevious */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setReplacePrevious", js.Any.fromFunction1(value))
      
      inline def setSetReplacePreviousUndefined: Self = StObject.set(x, "setReplacePrevious", js.undefined)
      
      inline def setSetReverse(value: /* reverse */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setReverse", js.Any.fromFunction1(value))
      
      inline def setSetReverseUndefined: Self = StObject.set(x, "setReverse", js.undefined)
      
      inline def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setScope", js.Any.fromFunction1(value))
      
      inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    }
  }
  
  trait ICube
    extends StObject
       with IAbstract {
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object ICube {
    
    inline def apply(): ICube = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICube]
    }
    
    extension [Self <: ICube](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
    }
  }
  
  trait IFade
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IFade {
    
    inline def apply(): IFade = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFade]
    }
    
    extension [Self <: IFade](x: Self) {
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
    }
  }
  
  trait IFadeIn
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IFadeIn {
    
    inline def apply(): IFadeIn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFadeIn]
    }
    
    extension [Self <: IFadeIn](x: Self) {
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
    }
  }
  
  trait IFadeOut
    extends StObject
       with IFade
  object IFadeOut {
    
    inline def apply(): IFadeOut = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFadeOut]
    }
  }
  
  trait IFlip
    extends StObject
       with IAbstract {
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of half
      * @returns Boolean
      */
    var getHalf: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of out
      * @returns Object
      */
    var getOut: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Sets the value of half
      * @param half Boolean The new value.
      */
    var setHalf: js.UndefOr[js.Function1[/* half */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Object The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IFlip {
    
    inline def apply(): IFlip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFlip]
    }
    
    extension [Self <: IFlip](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetHalf(value: () => Boolean): Self = StObject.set(x, "getHalf", js.Any.fromFunction0(value))
      
      inline def setGetHalfUndefined: Self = StObject.set(x, "getHalf", js.undefined)
      
      inline def setGetOut(value: () => js.Any): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setSetHalf(value: /* half */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHalf", js.Any.fromFunction1(value))
      
      inline def setSetHalfUndefined: Self = StObject.set(x, "setHalf", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
    }
  }
  
  trait IPop
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IPop {
    
    inline def apply(): IPop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPop]
    }
    
    extension [Self <: IPop](x: Self) {
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
    }
  }
  
  trait IPopIn
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IPopIn {
    
    inline def apply(): IPopIn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopIn]
    }
    
    extension [Self <: IPopIn](x: Self) {
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
    }
  }
  
  trait IPopOut
    extends StObject
       with IPop
  object IPopOut {
    
    inline def apply(): IPopOut = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopOut]
    }
  }
  
  trait ISlide
    extends StObject
       with IAbstract {
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of isElementBoxFit
      * @returns Boolean
      */
    var getIsElementBoxFit: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of offset
      * @returns Number
      */
    var getOffset: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of useCssTransform
      * @returns Boolean
      */
    var getUseCssTransform: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Number) */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of containerBox
      * @param containerBox String The new value.
      */
    var setContainerBox: js.UndefOr[js.Function1[/* containerBox */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of elementBox
      * @param elementBox String The new value.
      */
    var setElementBox: js.UndefOr[js.Function1[/* elementBox */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of isElementBoxFit
      * @param isElementBoxFit Boolean The new value.
      */
    var setIsElementBoxFit: js.UndefOr[js.Function1[/* isElementBoxFit */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of offset
      * @param offset Number The new value.
      */
    var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of useCssTransform
      * @param useCssTransform Boolean The new value.
      */
    var setUseCssTransform: js.UndefOr[js.Function1[/* useCssTransform */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object ISlide {
    
    inline def apply(): ISlide = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlide]
    }
    
    extension [Self <: ISlide](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetIsElementBoxFit(value: () => Boolean): Self = StObject.set(x, "getIsElementBoxFit", js.Any.fromFunction0(value))
      
      inline def setGetIsElementBoxFitUndefined: Self = StObject.set(x, "getIsElementBoxFit", js.undefined)
      
      inline def setGetOffset(value: () => Double): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
      
      inline def setGetOffsetUndefined: Self = StObject.set(x, "getOffset", js.undefined)
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setGetUseCssTransform(value: () => Boolean): Self = StObject.set(x, "getUseCssTransform", js.Any.fromFunction0(value))
      
      inline def setGetUseCssTransformUndefined: Self = StObject.set(x, "getUseCssTransform", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setSetContainerBox(value: /* containerBox */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setContainerBox", js.Any.fromFunction1(value))
      
      inline def setSetContainerBoxUndefined: Self = StObject.set(x, "setContainerBox", js.undefined)
      
      inline def setSetElementBox(value: /* elementBox */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setElementBox", js.Any.fromFunction1(value))
      
      inline def setSetElementBoxUndefined: Self = StObject.set(x, "setElementBox", js.undefined)
      
      inline def setSetIsElementBoxFit(value: /* isElementBoxFit */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setIsElementBoxFit", js.Any.fromFunction1(value))
      
      inline def setSetIsElementBoxFitUndefined: Self = StObject.set(x, "setIsElementBoxFit", js.undefined)
      
      inline def setSetOffset(value: /* offset */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      inline def setSetOffsetUndefined: Self = StObject.set(x, "setOffset", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
      
      inline def setSetUseCssTransform(value: /* useCssTransform */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseCssTransform", js.Any.fromFunction1(value))
      
      inline def setSetUseCssTransformUndefined: Self = StObject.set(x, "setUseCssTransform", js.undefined)
    }
  }
  
  trait ISlideIn
    extends StObject
       with IAbstract {
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of isElementBoxFit
      * @returns Boolean
      */
    var getIsElementBoxFit: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of offset
      * @returns Number
      */
    var getOffset: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of useCssTransform
      * @returns Boolean
      */
    var getUseCssTransform: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Number) */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of containerBox
      * @param containerBox String The new value.
      */
    var setContainerBox: js.UndefOr[js.Function1[/* containerBox */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of elementBox
      * @param elementBox String The new value.
      */
    var setElementBox: js.UndefOr[js.Function1[/* elementBox */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of isElementBoxFit
      * @param isElementBoxFit Boolean The new value.
      */
    var setIsElementBoxFit: js.UndefOr[js.Function1[/* isElementBoxFit */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of offset
      * @param offset Number The new value.
      */
    var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of useCssTransform
      * @param useCssTransform Boolean The new value.
      */
    var setUseCssTransform: js.UndefOr[js.Function1[/* useCssTransform */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object ISlideIn {
    
    inline def apply(): ISlideIn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlideIn]
    }
    
    extension [Self <: ISlideIn](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetIsElementBoxFit(value: () => Boolean): Self = StObject.set(x, "getIsElementBoxFit", js.Any.fromFunction0(value))
      
      inline def setGetIsElementBoxFitUndefined: Self = StObject.set(x, "getIsElementBoxFit", js.undefined)
      
      inline def setGetOffset(value: () => Double): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
      
      inline def setGetOffsetUndefined: Self = StObject.set(x, "getOffset", js.undefined)
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setGetUseCssTransform(value: () => Boolean): Self = StObject.set(x, "getUseCssTransform", js.Any.fromFunction0(value))
      
      inline def setGetUseCssTransformUndefined: Self = StObject.set(x, "getUseCssTransform", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setSetContainerBox(value: /* containerBox */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setContainerBox", js.Any.fromFunction1(value))
      
      inline def setSetContainerBoxUndefined: Self = StObject.set(x, "setContainerBox", js.undefined)
      
      inline def setSetElementBox(value: /* elementBox */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setElementBox", js.Any.fromFunction1(value))
      
      inline def setSetElementBoxUndefined: Self = StObject.set(x, "setElementBox", js.undefined)
      
      inline def setSetIsElementBoxFit(value: /* isElementBoxFit */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setIsElementBoxFit", js.Any.fromFunction1(value))
      
      inline def setSetIsElementBoxFitUndefined: Self = StObject.set(x, "setIsElementBoxFit", js.undefined)
      
      inline def setSetOffset(value: /* offset */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      inline def setSetOffsetUndefined: Self = StObject.set(x, "setOffset", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
      
      inline def setSetUseCssTransform(value: /* useCssTransform */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseCssTransform", js.Any.fromFunction1(value))
      
      inline def setSetUseCssTransformUndefined: Self = StObject.set(x, "setUseCssTransform", js.undefined)
    }
  }
  
  type ISlideOut = ISlide
  
  trait IWipe
    extends StObject
       with IAnimation {
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var easing: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of easing
      * @returns String
      */
    var getEasing: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of easing
      * @param easing String The new value.
      */
    var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IWipe {
    
    inline def apply(): IWipe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWipe]
    }
    
    extension [Self <: IWipe](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setGetDirection(value: () => String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setGetEasing(value: () => String): Self = StObject.set(x, "getEasing", js.Any.fromFunction0(value))
      
      inline def setGetEasingUndefined: Self = StObject.set(x, "getEasing", js.undefined)
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
      
      inline def setSetEasing(value: /* easing */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setEasing", js.Any.fromFunction1(value))
      
      inline def setSetEasingUndefined: Self = StObject.set(x, "setEasing", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
    }
  }
  
  trait IWipeIn
    extends StObject
       with IAnimation {
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var easing: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of easing
      * @returns String
      */
    var getEasing: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of out
      * @returns Boolean
      */
    var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of easing
      * @param easing String The new value.
      */
    var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of out
      * @param out Boolean The new value.
      */
    var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IWipeIn {
    
    inline def apply(): IWipeIn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWipeIn]
    }
    
    extension [Self <: IWipeIn](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setGetDirection(value: () => String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setGetEasing(value: () => String): Self = StObject.set(x, "getEasing", js.Any.fromFunction0(value))
      
      inline def setGetEasingUndefined: Self = StObject.set(x, "getEasing", js.undefined)
      
      inline def setGetOut(value: () => Boolean): Self = StObject.set(x, "getOut", js.Any.fromFunction0(value))
      
      inline def setGetOutUndefined: Self = StObject.set(x, "getOut", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
      
      inline def setSetEasing(value: /* easing */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setEasing", js.Any.fromFunction1(value))
      
      inline def setSetEasingUndefined: Self = StObject.set(x, "setEasing", js.undefined)
      
      inline def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOut", js.Any.fromFunction1(value))
      
      inline def setSetOutUndefined: Self = StObject.set(x, "setOut", js.undefined)
    }
  }
  
  type IWipeOut = IWipe
}
