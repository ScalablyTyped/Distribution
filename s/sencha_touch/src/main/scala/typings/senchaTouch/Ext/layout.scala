package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  trait IAbstract
    extends StObject
       with IObservable {
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
      ] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    }
  }
  
  trait IBox
    extends StObject
       with IDefault {
    
    /** [Config Option] (String) */
    var align: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of align
      * @returns String
      */
    var getAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of orient
      * @returns String
      */
    var getOrient: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of pack
      * @returns String
      */
    var getPack: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method]
      * @param item Object
      * @param isInner Object
      */
    @JSName("onItemInnerStateChange")
    var onItemInnerStateChange_IBox: js.UndefOr[js.Function2[/* item */ js.UndefOr[Any], /* isInner */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var pack: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the value of align
      * @param align String The new value.
      */
    var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of orient
      * @param orient String The new value.
      */
    var setOrient: js.UndefOr[js.Function1[/* orient */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of pack
      * @param pack String The new value.
      */
    var setPack: js.UndefOr[js.Function1[/* pack */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  }
  object IBox {
    
    inline def apply(): IBox = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBox]
    }
    
    extension [Self <: IBox](x: Self) {
      
      inline def setAlign(value: java.lang.String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setGetAlign(value: () => java.lang.String): Self = StObject.set(x, "getAlign", js.Any.fromFunction0(value))
      
      inline def setGetAlignUndefined: Self = StObject.set(x, "getAlign", js.undefined)
      
      inline def setGetOrient(value: () => java.lang.String): Self = StObject.set(x, "getOrient", js.Any.fromFunction0(value))
      
      inline def setGetOrientUndefined: Self = StObject.set(x, "getOrient", js.undefined)
      
      inline def setGetPack(value: () => java.lang.String): Self = StObject.set(x, "getPack", js.Any.fromFunction0(value))
      
      inline def setGetPackUndefined: Self = StObject.set(x, "getPack", js.undefined)
      
      inline def setOnItemInnerStateChange(value: (/* item */ js.UndefOr[Any], /* isInner */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onItemInnerStateChange", js.Any.fromFunction2(value))
      
      inline def setOnItemInnerStateChangeUndefined: Self = StObject.set(x, "onItemInnerStateChange", js.undefined)
      
      inline def setPack(value: java.lang.String): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
      
      inline def setSetAlign(value: /* align */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setAlign", js.Any.fromFunction1(value))
      
      inline def setSetAlignUndefined: Self = StObject.set(x, "setAlign", js.undefined)
      
      inline def setSetOrient(value: /* orient */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setOrient", js.Any.fromFunction1(value))
      
      inline def setSetOrientUndefined: Self = StObject.set(x, "setOrient", js.undefined)
      
      inline def setSetPack(value: /* pack */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setPack", js.Any.fromFunction1(value))
      
      inline def setSetPackUndefined: Self = StObject.set(x, "setPack", js.undefined)
    }
  }
  
  trait ICard
    extends StObject
       with IDefault {
    
    /** [Method]
      * @param item Object
      * @param isInner Object
      * @param destroying Object
      */
    @JSName("onItemInnerStateChange")
    var onItemInnerStateChange_ICard: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[Any], 
          /* isInner */ js.UndefOr[Any], 
          /* destroying */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
  }
  object ICard {
    
    inline def apply(): ICard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICard]
    }
    
    extension [Self <: ICard](x: Self) {
      
      inline def setOnItemInnerStateChange(
        value: (/* item */ js.UndefOr[Any], /* isInner */ js.UndefOr[Any], /* destroying */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onItemInnerStateChange", js.Any.fromFunction3(value))
      
      inline def setOnItemInnerStateChangeUndefined: Self = StObject.set(x, "onItemInnerStateChange", js.undefined)
    }
  }
  
  trait IDefault
    extends StObject
       with IAbstract {
    
    /** [Config Option] (Ext.fx.layout.Card) */
    var animation: js.UndefOr[typings.senchaTouch.Ext.fx.layout.ICard] = js.undefined
    
    /** [Method] Returns the value of animation
      * @returns Ext.fx.layout.Card
      */
    var getAnimation: js.UndefOr[js.Function0[typings.senchaTouch.Ext.fx.layout.ICard]] = js.undefined
    
    /** [Method]
      * @param item Ext.Component
      * @param isInner Boolean
      * @param destroying Boolean
      */
    var onItemInnerStateChange: js.UndefOr[
        js.Function3[
          /* item */ js.UndefOr[IComponent], 
          /* isInner */ js.UndefOr[Boolean], 
          /* destroying */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets the value of animation
      * @param animation Ext.fx.layout.Card The new value.
      */
    var setAnimation: js.UndefOr[
        js.Function1[/* animation */ js.UndefOr[typings.senchaTouch.Ext.fx.layout.ICard], Unit]
      ] = js.undefined
  }
  object IDefault {
    
    inline def apply(): IDefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefault]
    }
    
    extension [Self <: IDefault](x: Self) {
      
      inline def setAnimation(value: typings.senchaTouch.Ext.fx.layout.ICard): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setGetAnimation(value: () => typings.senchaTouch.Ext.fx.layout.ICard): Self = StObject.set(x, "getAnimation", js.Any.fromFunction0(value))
      
      inline def setGetAnimationUndefined: Self = StObject.set(x, "getAnimation", js.undefined)
      
      inline def setOnItemInnerStateChange(
        value: (/* item */ js.UndefOr[IComponent], /* isInner */ js.UndefOr[Boolean], /* destroying */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onItemInnerStateChange", js.Any.fromFunction3(value))
      
      inline def setOnItemInnerStateChangeUndefined: Self = StObject.set(x, "onItemInnerStateChange", js.undefined)
      
      inline def setSetAnimation(value: /* animation */ js.UndefOr[typings.senchaTouch.Ext.fx.layout.ICard] => Unit): Self = StObject.set(x, "setAnimation", js.Any.fromFunction1(value))
      
      inline def setSetAnimationUndefined: Self = StObject.set(x, "setAnimation", js.undefined)
    }
  }
  
  trait IFit
    extends StObject
       with IDefault {
    
    /** [Method]
      * @param item Object
      * @param isInner Object
      */
    @JSName("onItemInnerStateChange")
    var onItemInnerStateChange_IFit: js.UndefOr[js.Function2[/* item */ js.UndefOr[Any], /* isInner */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IFit {
    
    inline def apply(): IFit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFit]
    }
    
    extension [Self <: IFit](x: Self) {
      
      inline def setOnItemInnerStateChange(value: (/* item */ js.UndefOr[Any], /* isInner */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onItemInnerStateChange", js.Any.fromFunction2(value))
      
      inline def setOnItemInnerStateChangeUndefined: Self = StObject.set(x, "onItemInnerStateChange", js.undefined)
    }
  }
  
  trait IFlexBox
    extends StObject
       with IBox {
    
    /** [Method] Sets the flex of an item in this box layout
      * @param item Ext.Component The item of this layout which you want to update the flex of.
      * @param flex Number The flex to set on this method
      */
    var setItemFlex: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[IComponent], /* flex */ js.UndefOr[Double], Unit]
      ] = js.undefined
  }
  object IFlexBox {
    
    inline def apply(): IFlexBox = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFlexBox]
    }
    
    extension [Self <: IFlexBox](x: Self) {
      
      inline def setSetItemFlex(value: (/* item */ js.UndefOr[IComponent], /* flex */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "setItemFlex", js.Any.fromFunction2(value))
      
      inline def setSetItemFlexUndefined: Self = StObject.set(x, "setItemFlex", js.undefined)
    }
  }
  
  trait IFloat
    extends StObject
       with IDefault {
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method]
      * @param item Object
      * @param isInner Object
      */
    @JSName("onItemInnerStateChange")
    var onItemInnerStateChange_IFloat: js.UndefOr[js.Function2[/* item */ js.UndefOr[Any], /* isInner */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  }
  object IFloat {
    
    inline def apply(): IFloat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFloat]
    }
    
    extension [Self <: IFloat](x: Self) {
      
      inline def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setOnItemInnerStateChange(value: (/* item */ js.UndefOr[Any], /* isInner */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onItemInnerStateChange", js.Any.fromFunction2(value))
      
      inline def setOnItemInnerStateChangeUndefined: Self = StObject.set(x, "onItemInnerStateChange", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    }
  }
  
  type IHBox = IFlexBox
  
  trait IVBox
    extends StObject
       with IFlexBox
  object IVBox {
    
    inline def apply(): IVBox = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVBox]
    }
  }
  
  object wrapper {
    
    trait IBoxDock
      extends StObject
         with IBase {
      
      /** [Method] Returns the value of bodyElement
        * @returns Object
        */
      var getBodyElement: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of container
        * @returns Object
        */
      var getContainer: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of direction
        * @returns String
        */
      var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Returns the value of element
        * @returns Object
        */
      var getElement: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of innerWrapper
        * @returns Object
        */
      var getInnerWrapper: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of sizeState
        * @returns Boolean
        */
      var getSizeState: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Sets the value of bodyElement
        * @param bodyElement Object The new value.
        */
      var setBodyElement: js.UndefOr[js.Function1[/* bodyElement */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of container
        * @param container Object The new value.
        */
      var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of direction
        * @param direction String The new value.
        */
      var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
      
      /** [Method] Sets the value of element
        * @param element Object The new value.
        */
      var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of innerWrapper
        * @param innerWrapper Object The new value.
        */
      var setInnerWrapper: js.UndefOr[js.Function1[/* innerWrapper */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of sizeState
        * @param sizeState Boolean The new value.
        */
      var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[Boolean], Unit]] = js.undefined
    }
    object IBoxDock {
      
      inline def apply(): IBoxDock = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IBoxDock]
      }
      
      extension [Self <: IBoxDock](x: Self) {
        
        inline def setGetBodyElement(value: () => Any): Self = StObject.set(x, "getBodyElement", js.Any.fromFunction0(value))
        
        inline def setGetBodyElementUndefined: Self = StObject.set(x, "getBodyElement", js.undefined)
        
        inline def setGetContainer(value: () => Any): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
        
        inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
        
        inline def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
        
        inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
        
        inline def setGetElement(value: () => Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
        
        inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
        
        inline def setGetInnerWrapper(value: () => Any): Self = StObject.set(x, "getInnerWrapper", js.Any.fromFunction0(value))
        
        inline def setGetInnerWrapperUndefined: Self = StObject.set(x, "getInnerWrapper", js.undefined)
        
        inline def setGetSizeState(value: () => Boolean): Self = StObject.set(x, "getSizeState", js.Any.fromFunction0(value))
        
        inline def setGetSizeStateUndefined: Self = StObject.set(x, "getSizeState", js.undefined)
        
        inline def setSetBodyElement(value: /* bodyElement */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBodyElement", js.Any.fromFunction1(value))
        
        inline def setSetBodyElementUndefined: Self = StObject.set(x, "setBodyElement", js.undefined)
        
        inline def setSetContainer(value: /* container */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setContainer", js.Any.fromFunction1(value))
        
        inline def setSetContainerUndefined: Self = StObject.set(x, "setContainer", js.undefined)
        
        inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
        
        inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
        
        inline def setSetElement(value: /* element */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
        
        inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
        
        inline def setSetInnerWrapper(value: /* innerWrapper */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setInnerWrapper", js.Any.fromFunction1(value))
        
        inline def setSetInnerWrapperUndefined: Self = StObject.set(x, "setInnerWrapper", js.undefined)
        
        inline def setSetSizeState(value: /* sizeState */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSizeState", js.Any.fromFunction1(value))
        
        inline def setSetSizeStateUndefined: Self = StObject.set(x, "setSizeState", js.undefined)
      }
    }
    
    trait IDock
      extends StObject
         with IBase {
      
      /** [Method] Returns the value of bodyElement
        * @returns Object
        */
      var getBodyElement: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of container
        * @returns Object
        */
      var getContainer: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of direction
        * @returns String
        */
      var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Returns the value of element
        * @returns Object
        */
      var getElement: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of innerWrapper
        * @returns Object
        */
      var getInnerWrapper: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of sizeState
        * @returns Boolean
        */
      var getSizeState: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Sets the value of bodyElement
        * @param bodyElement Object The new value.
        */
      var setBodyElement: js.UndefOr[js.Function1[/* bodyElement */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of container
        * @param container Object The new value.
        */
      var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of direction
        * @param direction String The new value.
        */
      var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
      
      /** [Method] Sets the value of element
        * @param element Object The new value.
        */
      var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of innerWrapper
        * @param innerWrapper Object The new value.
        */
      var setInnerWrapper: js.UndefOr[js.Function1[/* innerWrapper */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of sizeState
        * @param sizeState Boolean The new value.
        */
      var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[Boolean], Unit]] = js.undefined
    }
    object IDock {
      
      inline def apply(): IDock = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDock]
      }
      
      extension [Self <: IDock](x: Self) {
        
        inline def setGetBodyElement(value: () => Any): Self = StObject.set(x, "getBodyElement", js.Any.fromFunction0(value))
        
        inline def setGetBodyElementUndefined: Self = StObject.set(x, "getBodyElement", js.undefined)
        
        inline def setGetContainer(value: () => Any): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
        
        inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
        
        inline def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
        
        inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
        
        inline def setGetElement(value: () => Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
        
        inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
        
        inline def setGetInnerWrapper(value: () => Any): Self = StObject.set(x, "getInnerWrapper", js.Any.fromFunction0(value))
        
        inline def setGetInnerWrapperUndefined: Self = StObject.set(x, "getInnerWrapper", js.undefined)
        
        inline def setGetSizeState(value: () => Boolean): Self = StObject.set(x, "getSizeState", js.Any.fromFunction0(value))
        
        inline def setGetSizeStateUndefined: Self = StObject.set(x, "getSizeState", js.undefined)
        
        inline def setSetBodyElement(value: /* bodyElement */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBodyElement", js.Any.fromFunction1(value))
        
        inline def setSetBodyElementUndefined: Self = StObject.set(x, "setBodyElement", js.undefined)
        
        inline def setSetContainer(value: /* container */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setContainer", js.Any.fromFunction1(value))
        
        inline def setSetContainerUndefined: Self = StObject.set(x, "setContainer", js.undefined)
        
        inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
        
        inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
        
        inline def setSetElement(value: /* element */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
        
        inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
        
        inline def setSetInnerWrapper(value: /* innerWrapper */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setInnerWrapper", js.Any.fromFunction1(value))
        
        inline def setSetInnerWrapperUndefined: Self = StObject.set(x, "setInnerWrapper", js.undefined)
        
        inline def setSetSizeState(value: /* sizeState */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSizeState", js.Any.fromFunction1(value))
        
        inline def setSetSizeStateUndefined: Self = StObject.set(x, "setSizeState", js.undefined)
      }
    }
    
    trait IInner
      extends StObject
         with IBase {
      
      /** [Method] Returns the value of container
        * @returns Object
        */
      var getContainer: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of sizeState
        * @returns Object
        */
      var getSizeState: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Sets the value of container
        * @param container Object The new value.
        */
      var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of sizeState
        * @param sizeState Object The new value.
        */
      var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[Any], Unit]] = js.undefined
    }
    object IInner {
      
      inline def apply(): IInner = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IInner]
      }
      
      extension [Self <: IInner](x: Self) {
        
        inline def setGetContainer(value: () => Any): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
        
        inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
        
        inline def setGetSizeState(value: () => Any): Self = StObject.set(x, "getSizeState", js.Any.fromFunction0(value))
        
        inline def setGetSizeStateUndefined: Self = StObject.set(x, "getSizeState", js.undefined)
        
        inline def setSetContainer(value: /* container */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setContainer", js.Any.fromFunction1(value))
        
        inline def setSetContainerUndefined: Self = StObject.set(x, "setContainer", js.undefined)
        
        inline def setSetSizeState(value: /* sizeState */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setSizeState", js.Any.fromFunction1(value))
        
        inline def setSetSizeStateUndefined: Self = StObject.set(x, "setSizeState", js.undefined)
      }
    }
  }
}
