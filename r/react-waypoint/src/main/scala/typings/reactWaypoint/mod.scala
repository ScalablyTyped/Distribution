package typings.reactWaypoint

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactWaypoint.mod.Waypoint.WaypointProps
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Waypoint {
    
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
      
      inline def apply(
        currentPosition: String,
        previousPosition: String,
        viewportBottom: Double,
        viewportTop: Double,
        waypointTop: Double
      ): CallbackArgs = {
        val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any], viewportBottom = viewportBottom.asInstanceOf[js.Any], viewportTop = viewportTop.asInstanceOf[js.Any], waypointTop = waypointTop.asInstanceOf[js.Any])
        __obj.asInstanceOf[CallbackArgs]
      }
      
      extension [Self <: CallbackArgs](x: Self) {
        
        inline def setCurrentPosition(value: String): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
        
        inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        inline def setPreviousPosition(value: String): Self = StObject.set(x, "previousPosition", value.asInstanceOf[js.Any])
        
        inline def setViewportBottom(value: Double): Self = StObject.set(x, "viewportBottom", value.asInstanceOf[js.Any])
        
        inline def setViewportTop(value: Double): Self = StObject.set(x, "viewportTop", value.asInstanceOf[js.Any])
        
        inline def setWaypointTop(value: Double): Self = StObject.set(x, "waypointTop", value.asInstanceOf[js.Any])
      }
    }
    
    trait WaypointProps extends StObject {
      
      /**
        * `bottomOffset` can either be a number, in which case its a distance from the
        * bottom of the container in pixels, or a string value. Valid string values are
        * of the form "20px", which is parsed as pixels, or "20%", which is parsed
        * as a percentage of the height of the containing element.
        * For instance, if you pass "20%", and the containing element is 100px tall,
        * then the waypoint will be triggered when it has been scrolled 20px beyond
        * the bottom of the containing element.
        * 
        * Similar to `topOffset`, but for the bottom of the container.
        */
      var bottomOffset: js.UndefOr[String | Double] = js.undefined
      
      /**
        * Since React 18 Children are no longer implied, therefore we specify them here
        */
      var children: js.UndefOr[ReactNode] = js.undefined
      
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
      var scrollableAncestor: js.UndefOr[Any] = js.undefined
      
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
      
      inline def apply(): WaypointProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WaypointProps]
      }
      
      extension [Self <: WaypointProps](x: Self) {
        
        inline def setBottomOffset(value: String | Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
        
        inline def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        inline def setFireOnRapidScroll(value: Boolean): Self = StObject.set(x, "fireOnRapidScroll", value.asInstanceOf[js.Any])
        
        inline def setFireOnRapidScrollUndefined: Self = StObject.set(x, "fireOnRapidScroll", js.undefined)
        
        inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
        
        inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
        
        inline def setOnEnter(value: /* args */ CallbackArgs => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
        
        inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
        
        inline def setOnLeave(value: /* args */ CallbackArgs => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction1(value))
        
        inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
        
        inline def setOnPositionChange(value: /* args */ CallbackArgs => Unit): Self = StObject.set(x, "onPositionChange", js.Any.fromFunction1(value))
        
        inline def setOnPositionChangeUndefined: Self = StObject.set(x, "onPositionChange", js.undefined)
        
        inline def setScrollableAncestor(value: Any): Self = StObject.set(x, "scrollableAncestor", value.asInstanceOf[js.Any])
        
        inline def setScrollableAncestorUndefined: Self = StObject.set(x, "scrollableAncestor", js.undefined)
        
        inline def setTopOffset(value: String | Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
        
        inline def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
      }
    }
  }
  type Waypoint = Component[WaypointProps, js.Object, Any]
}
