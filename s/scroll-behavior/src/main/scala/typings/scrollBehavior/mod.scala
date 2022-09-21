package typings.scrollBehavior

import typings.scrollBehavior.anon.Read
import typings.scrollBehavior.scrollBehaviorStrings.PUSH
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-behavior", JSImport.Default)
  @js.native
  open class default[TLocation /* <: LocationBase */, TContext] protected ()
    extends StObject
       with ScrollBehavior[TLocation, TContext] {
    def this(options: ScrollBehaviorOptions[TLocation, TContext]) = this()
  }
  
  trait LocationBase extends StObject {
    
    var action: PUSH | String
    
    var hash: js.UndefOr[String] = js.undefined
  }
  object LocationBase {
    
    inline def apply(action: PUSH | String): LocationBase = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationBase]
    }
    
    extension [Self <: LocationBase](x: Self) {
      
      inline def setAction(value: PUSH | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    }
  }
  
  type NavigationListener = js.Function0[Unit]
  
  @js.native
  trait ScrollBehavior[TLocation /* <: LocationBase */, TContext] extends StObject {
    
    def registerElement(key: String, element: HTMLElement, shouldUpdateScroll: Null, context: TContext): Unit = js.native
    def registerElement(
      key: String,
      element: HTMLElement,
      shouldUpdateScroll: ShouldUpdateScroll[TContext],
      context: TContext
    ): Unit = js.native
    
    def scrollToTarget(element: HTMLElement, target: String): Unit = js.native
    def scrollToTarget(element: HTMLElement, target: ScrollPosition): Unit = js.native
    
    def startIgnoringScrollEvents(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def stopIgnoringScrollEvents(): Unit = js.native
    
    def unregisterElement(key: String): Unit = js.native
    
    def updateScroll(prevContext: TContext, context: TContext): Unit = js.native
    def updateScroll(prevContext: Null, context: TContext): Unit = js.native
  }
  
  trait ScrollBehaviorOptions[TLocation /* <: LocationBase */, TContext] extends StObject {
    
    def addNavigationListener(listener: NavigationListener): js.Function0[Unit]
    
    def getCurrentLocation(): TLocation
    
    var shouldUpdateScroll: js.UndefOr[ShouldUpdateScroll[TContext]] = js.undefined
    
    var stateStorage: Read[TLocation]
  }
  object ScrollBehaviorOptions {
    
    inline def apply[TLocation /* <: LocationBase */, TContext](
      addNavigationListener: NavigationListener => js.Function0[Unit],
      getCurrentLocation: () => TLocation,
      stateStorage: Read[TLocation]
    ): ScrollBehaviorOptions[TLocation, TContext] = {
      val __obj = js.Dynamic.literal(addNavigationListener = js.Any.fromFunction1(addNavigationListener), getCurrentLocation = js.Any.fromFunction0(getCurrentLocation), stateStorage = stateStorage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollBehaviorOptions[TLocation, TContext]]
    }
    
    extension [Self <: ScrollBehaviorOptions[?, ?], TLocation /* <: LocationBase */, TContext](x: Self & (ScrollBehaviorOptions[TLocation, TContext])) {
      
      inline def setAddNavigationListener(value: NavigationListener => js.Function0[Unit]): Self = StObject.set(x, "addNavigationListener", js.Any.fromFunction1(value))
      
      inline def setGetCurrentLocation(value: () => TLocation): Self = StObject.set(x, "getCurrentLocation", js.Any.fromFunction0(value))
      
      inline def setShouldUpdateScroll(value: (/* prevContext */ TContext | Null, TContext) => ScrollTarget): Self = StObject.set(x, "shouldUpdateScroll", js.Any.fromFunction2(value))
      
      inline def setShouldUpdateScrollUndefined: Self = StObject.set(x, "shouldUpdateScroll", js.undefined)
      
      inline def setStateStorage(value: Read[TLocation]): Self = StObject.set(x, "stateStorage", value.asInstanceOf[js.Any])
    }
  }
  
  type ScrollPosition = js.Tuple2[Double, Double]
  
  type ScrollTarget = js.UndefOr[ScrollPosition | String | Boolean | Null]
  
  type ShouldUpdateScroll[TContext] = js.Function2[/* prevContext */ TContext | Null, /* context */ TContext, ScrollTarget]
}
