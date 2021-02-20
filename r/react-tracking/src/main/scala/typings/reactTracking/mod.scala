package typings.reactTracking

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactTracking.anon.Tracking
import typings.std.Partial
import typings.std.Pick
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-tracking", JSImport.Default)
  @js.native
  val default: Track_[js.Any, js.Any, js.Any] = js.native
  
  @JSImport("react-tracking", "ReactTrackingContext")
  @js.native
  val ReactTrackingContext: TrackingContext[js.Any] = js.native
  
  @JSImport("react-tracking", "track")
  @js.native
  val track: Track_[js.Any, js.Any, js.Any] = js.native
  
  @JSImport("react-tracking", "useTracking")
  @js.native
  def useTracking[P](): TrackingProp[P] = js.native
  
  // Duplicated from ES6 lib to remove the `void` typing, otherwise `track` can’t be used as a HOC function that passes
  // through a JSX component that be used without casting.
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function]
  
  type Decorator = ClassDecorator with MethodDecorator
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTracking.reactTrackingBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typings.reactTracking.reactTrackingStrings._empty
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[js.Any], 
    TypedPropertyDescriptor[js.Any]
  ]
  
  @js.native
  trait Options[T] extends StObject {
    
    /**
      * By default, data tracking objects are pushed to `window.dataLayer[]`. This is a good default if you use Google
      * Tag Manager. You can override this by passing in a dispatch function as a second parameter to the tracking
      * decorator `{ dispatch: fn() }` on some top-level component high up in your app (typically some root-level
      * component that wraps your entire app).
      */
    var dispatch: js.UndefOr[js.Function1[/* data */ T, _]] = js.native
    
    /**
      * To dispatch tracking data when a component mounts, you can pass in `{ dispatchOnMount: true }` as the second
      * parameter to `@track()`. This is useful for dispatching tracking data on "Page" components.
      *
      * If you pass in a function, the function will be called with all of the tracking data from the app's context when
      * the component mounts. The return value of this function will be dispatched in `componentDidMount()`. The object
      * returned from this function call will be merged with the context data and then dispatched. A use case for this
      * would be that you want to provide extra tracking data without adding it to the context.
      */
    var dispatchOnMount: js.UndefOr[Boolean | (js.Function1[/* contextData */ T, T])] = js.native
    
    /**
      * When there's a need to implicitly dispatch an event with some data for every component, you can define an
      * `options.process` function. This function should be declared once, at some top-level component. It will get
      * called with each component's tracking data as the only argument. The returned object from this function will be
      * merged with all the tracking context data and dispatched in `componentDidMount()`. If a falsy value is returned
      * (`false`, `null`, `undefined`, ...), nothing will be dispatched.
      *
      * A common use case for this is to dispatch a `pageview` event for every component in the application that has a
      * `page` property on its `trackingData`.
      */
    var process: js.UndefOr[js.Function1[/* ownTrackingData */ T, T | Falsy]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: /* data */ T => _): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDispatchOnMount(value: Boolean | (js.Function1[/* contextData */ T, T])): Self = StObject.set(x, "dispatchOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatchOnMountFunction1(value: /* contextData */ T => T): Self = StObject.set(x, "dispatchOnMount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDispatchOnMountUndefined: Self = StObject.set(x, "dispatchOnMount", js.undefined)
      
      @scala.inline
      def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      @scala.inline
      def setProcess(value: /* ownTrackingData */ T => T | Falsy): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
  
  type Track_[T, P, S] = js.Function2[
    /* trackingInfo */ js.UndefOr[TrackingInfo[Pick[T, /* keyof T */ String], P, S]], 
    /* options */ js.UndefOr[Options[Partial[T]]], 
    Decorator
  ]
  
  type TrackingContext[T] = Context[Tracking[T]]
  
  type TrackingInfo[T, P, S] = T | (js.Function4[
    /* props */ P, 
    /* state */ S, 
    /* import warning: importer.ImportType#apply Failed type conversion: any[any] */ /* args */ js.Any, 
    /* hasValueErr */ js.Tuple2[js.Any, js.Any], 
    T | Falsy
  ])
  
  @js.native
  trait TrackingProp[P] extends StObject {
    
    /**
      * This method returns all of the contextual tracking data up until this point in the component hierarchy.
      */
    def getTrackingData(): js.Object = js.native
    
    def trackEvent(data: Partial[P]): Unit = js.native
  }
  object TrackingProp {
    
    @scala.inline
    def apply[P](getTrackingData: () => js.Object, trackEvent: Partial[P] => Unit): TrackingProp[P] = {
      val __obj = js.Dynamic.literal(getTrackingData = js.Any.fromFunction0(getTrackingData), trackEvent = js.Any.fromFunction1(trackEvent))
      __obj.asInstanceOf[TrackingProp[P]]
    }
    
    @scala.inline
    implicit class TrackingPropMutableBuilder[Self <: TrackingProp[_], P] (val x: Self with TrackingProp[P]) extends AnyVal {
      
      @scala.inline
      def setGetTrackingData(value: () => js.Object): Self = StObject.set(x, "getTrackingData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrackEvent(value: Partial[P] => Unit): Self = StObject.set(x, "trackEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait _Falsy extends StObject
  
  type _To = Track_[js.Any, js.Any, js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Track_[js.Any, js.Any, js.Any] = default
}
