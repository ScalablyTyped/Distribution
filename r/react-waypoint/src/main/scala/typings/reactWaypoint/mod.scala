package typings.reactWaypoint

import typings.react.mod.Component
import typings.reactWaypoint.mod.Waypoint.WaypointProps
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-waypoint", "Waypoint")
  @js.native
  class Waypoint protected ()
    extends Component[WaypointProps, js.Object, js.Any] {
    def this(props: WaypointProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaypointProps, context: js.Any) = this()
  }
  /* static members */
  object Waypoint {
    
    @JSImport("react-waypoint", "Waypoint")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-waypoint", "Waypoint.above")
    @js.native
    def above: String = js.native
    @scala.inline
    def above_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("above")(x.asInstanceOf[js.Any])
    
    @JSImport("react-waypoint", "Waypoint.below")
    @js.native
    def below: String = js.native
    @scala.inline
    def below_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("below")(x.asInstanceOf[js.Any])
    
    @JSImport("react-waypoint", "Waypoint.inside")
    @js.native
    def inside: String = js.native
    @scala.inline
    def inside_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inside")(x.asInstanceOf[js.Any])
    
    @JSImport("react-waypoint", "Waypoint.invisible")
    @js.native
    def invisible: String = js.native
    @scala.inline
    def invisible_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invisible")(x.asInstanceOf[js.Any])
    
    trait CallbackArgs extends StObject {
      
      /*
        * The position that the waypoint has at the moment.
        * One of Waypoint.below, Waypoint.above, Waypoint.inside, and Waypoint.invisible.
        */
      var currentPosition: String
      
      /*
        * The native scroll event that triggered the callback.
        * May be missing if the callback wasn't triggered as the result of a scroll
        */
      var event: js.UndefOr[Event] = js.undefined
      
      /*
        * The position that the waypoint had before.
        * One of Waypoint.below, Waypoint.above, Waypoint.inside, and Waypoint.invisible.
        */
      var previousPosition: String
      
      /*
        * The distance from the bottom of the scrollable ancestor to the viewport top.
        */
      var viewportBottom: Double
      
      /*
        * The distance from the scrollable ancestor to the viewport top.
        */
      var viewportTop: Double
      
      /*
        * The waypoint's distance to the top of the viewport.
        */
      var waypointTop: Double
    }
    object CallbackArgs {
      
      @scala.inline
      def apply(
        currentPosition: String,
        previousPosition: String,
        viewportBottom: Double,
        viewportTop: Double,
        waypointTop: Double
      ): CallbackArgs = {
        val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any], viewportBottom = viewportBottom.asInstanceOf[js.Any], viewportTop = viewportTop.asInstanceOf[js.Any], waypointTop = waypointTop.asInstanceOf[js.Any])
        __obj.asInstanceOf[CallbackArgs]
      }
      
      @scala.inline
      implicit class CallbackArgsMutableBuilder[Self <: CallbackArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentPosition(value: String): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        @scala.inline
        def setPreviousPosition(value: String): Self = StObject.set(x, "previousPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewportBottom(value: Double): Self = StObject.set(x, "viewportBottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewportTop(value: Double): Self = StObject.set(x, "viewportTop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWaypointTop(value: Double): Self = StObject.set(x, "waypointTop", value.asInstanceOf[js.Any])
      }
    }
    
    trait WaypointProps extends StObject {
      
      /**
        * `bottomOffset` is like `topOffset`, but for the bottom of the container.
        */
      var bottomOffset: js.UndefOr[String | Double] = js.undefined
      
      /**
        * Use this prop to get debug information in the console log. This slows
        * things down significantly, so it should only be used during development.
        */
      var debug: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If the onEnter/onLeave events are to be fired on rapid scrolling.
        * This has no effect on onPositionChange -- it will fire anyway.
        */
      var fireOnRapidScroll: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether to activate on horizontal scrolling instead of vertical
        */
      var horizontal: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Function called when waypoint enters viewport
        * @param {CallbackArgs} args
        */
      var onEnter: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.undefined
      
      /**
        * Function called when waypoint leaves viewport
        * @param {CallbackArgs} args
        */
      var onLeave: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.undefined
      
      /**
        * Function called when waypoint position changes
        * @param {CallbackArgs} args
        */
      var onPositionChange: js.UndefOr[js.Function1[/* args */ CallbackArgs, Unit]] = js.undefined
      
      /**
        * A custom ancestor to determine if the target is visible in it.
        * This is useful in cases where you do not want the immediate scrollable
        * ancestor to be the container. For example, when your target is in a div
        * that has overflow auto but you are detecting onEnter based on the window.
        */
      var scrollableAncestor: js.UndefOr[js.Any] = js.undefined
      
      /**
        * `topOffset` can either be a number, in which case its a distance from the
        * top of the container in pixels, or a string value. Valid string values are
        * of the form "20px", which is parsed as pixels, or "20%", which is parsed
        * as a percentage of the height of the containing element.
        * For instance, if you pass "-20%", and the containing element is 100px tall,
        * then the waypoint will be triggered when it has been scrolled 20px beyond
        * the top of the containing element.
        */
      var topOffset: js.UndefOr[String | Double] = js.undefined
    }
    object WaypointProps {
      
      @scala.inline
      def apply(): WaypointProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WaypointProps]
      }
      
      @scala.inline
      implicit class WaypointPropsMutableBuilder[Self <: WaypointProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottomOffset(value: String | Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        @scala.inline
        def setFireOnRapidScroll(value: Boolean): Self = StObject.set(x, "fireOnRapidScroll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFireOnRapidScrollUndefined: Self = StObject.set(x, "fireOnRapidScroll", js.undefined)
        
        @scala.inline
        def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
        
        @scala.inline
        def setOnEnter(value: /* args */ CallbackArgs => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
        
        @scala.inline
        def setOnLeave(value: /* args */ CallbackArgs => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
        
        @scala.inline
        def setOnPositionChange(value: /* args */ CallbackArgs => Unit): Self = StObject.set(x, "onPositionChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPositionChangeUndefined: Self = StObject.set(x, "onPositionChange", js.undefined)
        
        @scala.inline
        def setScrollableAncestor(value: js.Any): Self = StObject.set(x, "scrollableAncestor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollableAncestorUndefined: Self = StObject.set(x, "scrollableAncestor", js.undefined)
        
        @scala.inline
        def setTopOffset(value: String | Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
      }
    }
  }
}
