package typings.reactUjs

import typings.jquery.JQuery
import typings.jquery.JQueryStatic
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactUjs.anon.FnCall
import typings.reactUjs.anon.FnCallTypeListenerOptions
import typings.reactUjs.anon.PartialEvent
import typings.reactUjs.mod.SearchSelector
import typings.reactUjs.mod.WebpackRequireContext
import typings.reactUjs.reactUjsBooleans.`false`
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactRailsUJS {
    
    @JSGlobal("ReactRailsUJS")
    @js.native
    val ^ : js.Any = js.native
    
    /** This attribute holds a unique identifier to identify a node. */
    @JSGlobal("ReactRailsUJS.CACHE_ID_ATTR")
    @js.native
    val CACHE_ID_ATTR: String = js.native
    
    /** This attribute holds the name of component which should be mounted. */
    @JSGlobal("ReactRailsUJS.CLASS_NAME_ATTR")
    @js.native
    val CLASS_NAME_ATTR: String = js.native
    
    /** This attribute holds JSON stringified props for initializing the component. */
    @JSGlobal("ReactRailsUJS.PROPS_ATTR")
    @js.native
    val PROPS_ATTR: String = js.native
    
    /** This attribute holds which method to use between: ReactDOM.hydrate, ReactDOM.render. */
    @JSGlobal("ReactRailsUJS.RENDER_ATTR")
    @js.native
    val RENDER_ATTR: String = js.native
    
    /** This attribute is set to persist the element through Turbolinks navigations. */
    @JSGlobal("ReactRailsUJS.TURBOLINKS_PERMANENT_ATTR")
    @js.native
    val TURBOLINKS_PERMANENT_ATTR: String = js.native
    
    /** A map of rendered React elements. The keys are values of CACHE_ID_ATTR attributes. */
    @JSGlobal("ReactRailsUJS.components")
    @js.native
    val components: Record[String, ReactElement] = js.native
    
    /**
      * Check the global context for installed libraries and figure out which library to hook up to (pjax, Turbolinks,
      * jQuery). This is called on load, but you can call it again if needed (it will unmount itself).
      */
    inline def detectEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detectEvents")().asInstanceOf[Unit]
    
    /**
      * Find DOM elements with the CLASS_NAME_ATTR attribute within `searchSelector`.
      */
    inline def findDOMNodes(): JQuery[HTMLElement] | NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNodes")().asInstanceOf[JQuery[HTMLElement] | NodeList]
    inline def findDOMNodes(searchSelector: SearchSelector): JQuery[HTMLElement] | NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNodes")(searchSelector.asInstanceOf[js.Any]).asInstanceOf[JQuery[HTMLElement] | NodeList]
    
    /**
      * Get the constructor for a className (returns a React class). Override this function to lookup classes in a custom
      * way.
      */
    inline def getConstructor(className: String): ComponentType[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstructor")(className.asInstanceOf[js.Any]).asInstanceOf[ComponentType[js.Object]]
    
    /**
      * Internal reference to document.addEventListener, set when detectEvents is called.
      */
    @JSGlobal("ReactRailsUJS.handleEvent")
    @js.native
    def handleEvent: js.UndefOr[FnCall] = js.native
    inline def handleEvent_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(x.asInstanceOf[js.Any])
    
    /**
      * An event listener that calls mountComponents on event.target.
      */
    inline def handleMount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleMount")().asInstanceOf[Unit]
    inline def handleMount(event: PartialEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleMount")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * An event listener that calls unmountComponents on event.target.
      */
    inline def handleUnmount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleUnmount")().asInstanceOf[Unit]
    inline def handleUnmount(event: PartialEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleUnmount")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** If jQuery is detected, save a reference to it for event handlers. */
    @JSGlobal("ReactRailsUJS.jQuery")
    @js.native
    val jQuery: js.UndefOr[`false` | JQueryStatic] = js.native
    
    /**
      * Within `searchSelector`, find nodes which should have React components inside them, and mount them with their props.
      */
    inline def mountComponents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mountComponents")().asInstanceOf[Unit]
    inline def mountComponents(searchSelector: SearchSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mountComponents")(searchSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Internal reference to document.removeEventListener, set when detectEvents is called.
      */
    @JSGlobal("ReactRailsUJS.removeEvent")
    @js.native
    def removeEvent: js.UndefOr[FnCallTypeListenerOptions] = js.native
    inline def removeEvent_=(x: js.UndefOr[FnCallTypeListenerOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEvent")(x.asInstanceOf[js.Any])
    
    /**
      * Render `componentName` with `props` to a string,
      * using the specified `renderFunction` from `react-dom/server`.
      */
    inline def serverRender(renderFunction: String, componentName: String, props: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serverRender")(renderFunction.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Within `searchSelector`, find nodes which have React components inside them, and unmount those components.
      */
    inline def unmountComponents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponents")().asInstanceOf[Unit]
    inline def unmountComponents(searchSelector: SearchSelector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponents")(searchSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Given a Webpack `require.context`, try finding components with `require`, then falling back to global lookup.
      */
    inline def useContext(context: WebpackRequireContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
