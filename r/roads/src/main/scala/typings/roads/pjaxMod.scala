package typings.roads

import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.MouseEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pjaxMod {
  
  @JSImport("roads/types/client/pjax", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RoadsPjax {
    /**
      * Creates a new RoadsPjax instance. PJAX looks in the containerElement at each
      * anchor tag with the  `data-roads-pjax="link"` attribute and changes it from a
      * normal link into a link that uses the road.
      *
      * @param {Road} road - The road that will be used when clicking links
      * @param {HTMLElement} containerElement - The element that will be filled with your roads output
      * @param {Window} window - The page's window object to help set page title url
      */
    def this(road: typings.roads.roadMod.default, containerElement: HTMLElement, window: Window) = this()
    
    /* protected */ /* CompleteClass */
    var _container_element: HTMLElement = js.native
    
    /**
      * Handles all click events, and directs
      *
      * @param {MouseEvent} event
      */
    /* protected */ /* CompleteClass */
    override def _pjaxEventMonitor(event: MouseEvent): Unit = js.native
    
    /* protected */ /* CompleteClass */
    var _road: typings.roads.roadMod.default = js.native
    
    /**
      * Submits the form and re-renders the UI
      *
      * @param {HTMLFormElement} form
      */
    /* protected */ /* CompleteClass */
    override def _roadsFormEvent(form: HTMLFormElement): Unit = js.native
    
    /**
      * Follows the link and renders the UI
      *
      * @param  {HTMLAnchorElement} link
      */
    /* protected */ /* CompleteClass */
    override def _roadsLinkEvent(link: HTMLAnchorElement): Unit = js.native
    
    /* protected */ /* CompleteClass */
    var _window: Window = js.native
    
    /**
      * There are a couple of steps required to get page titles working properly with
      * 	PJAX.
      *
      * First you must use the `storeVals` middleware to manage your page title. In
      * 	the following example we are storing a page title of `"Homepage"`.
      *
      * Second you should have your server-side rendering put this value into the
      * 	`<title>` element of your layout. Check the typescript example for how that
      * 	could work with the Handlebars templating engine.
      *
      * Third you need to create your `RoadsPJAX` object and configure it to look for
      *  your `page-title` value.
      *
      * @param {titleKey} string - The key of the title as stored in the "storeVals" middleware.
      * @returns {RoadsPjax} Returns the PJAX object. This is provided to allow for easy function chaining.
      */
    /* CompleteClass */
    override def addTitleMiddleware(titleKey: String): RoadsPjax = js.native
    
    /**
      * This function call enables PJAX on the current page.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * If you would like PJAX to work on links that are not within the container
      * 	you must call this function. Additionally this function must be called
      * 	before `register`
      *
      * @param {HTMLAnchorElement} element
      */
    /* CompleteClass */
    override def registerAdditionalElement(element: HTMLAnchorElement): Unit = js.native
    
    /**
      * Renders the response into the container
      *
      * @param {Response} response_object
      */
    /* CompleteClass */
    override def render(response_object: typings.roads.responseMod.default): Unit = js.native
  }
  
  trait RoadsPjax extends StObject {
    
    /* protected */ var _container_element: HTMLElement
    
    /* protected */ var _page_title: js.UndefOr[String] = js.undefined
    
    /**
      * Handles all click events, and directs
      *
      * @param {MouseEvent} event
      */
    /* protected */ def _pjaxEventMonitor(event: MouseEvent): Unit
    
    /* protected */ var _road: typings.roads.roadMod.default
    
    /**
      * Submits the form and re-renders the UI
      *
      * @param {HTMLFormElement} form
      */
    /* protected */ def _roadsFormEvent(form: HTMLFormElement): Unit
    
    /**
      * Follows the link and renders the UI
      *
      * @param  {HTMLAnchorElement} link
      */
    /* protected */ def _roadsLinkEvent(link: HTMLAnchorElement): Unit
    
    /* protected */ var _window: Window
    
    /**
      * There are a couple of steps required to get page titles working properly with
      * 	PJAX.
      *
      * First you must use the `storeVals` middleware to manage your page title. In
      * 	the following example we are storing a page title of `"Homepage"`.
      *
      * Second you should have your server-side rendering put this value into the
      * 	`<title>` element of your layout. Check the typescript example for how that
      * 	could work with the Handlebars templating engine.
      *
      * Third you need to create your `RoadsPJAX` object and configure it to look for
      *  your `page-title` value.
      *
      * @param {titleKey} string - The key of the title as stored in the "storeVals" middleware.
      * @returns {RoadsPjax} Returns the PJAX object. This is provided to allow for easy function chaining.
      */
    def addTitleMiddleware(titleKey: String): RoadsPjax
    
    /**
      * This function call enables PJAX on the current page.
      */
    def register(): Unit
    
    /**
      * If you would like PJAX to work on links that are not within the container
      * 	you must call this function. Additionally this function must be called
      * 	before `register`
      *
      * @param {HTMLAnchorElement} element
      */
    def registerAdditionalElement(element: HTMLAnchorElement): Unit
    
    /**
      * Renders the response into the container
      *
      * @param {Response} response_object
      */
    def render(response_object: typings.roads.responseMod.default): Unit
  }
  object RoadsPjax {
    
    inline def apply(
      _container_element: HTMLElement,
      _pjaxEventMonitor: MouseEvent => Unit,
      _road: typings.roads.roadMod.default,
      _roadsFormEvent: HTMLFormElement => Unit,
      _roadsLinkEvent: HTMLAnchorElement => Unit,
      _window: Window,
      addTitleMiddleware: String => RoadsPjax,
      register: () => Unit,
      registerAdditionalElement: HTMLAnchorElement => Unit,
      render: typings.roads.responseMod.default => Unit
    ): RoadsPjax = {
      val __obj = js.Dynamic.literal(_container_element = _container_element.asInstanceOf[js.Any], _pjaxEventMonitor = js.Any.fromFunction1(_pjaxEventMonitor), _road = _road.asInstanceOf[js.Any], _roadsFormEvent = js.Any.fromFunction1(_roadsFormEvent), _roadsLinkEvent = js.Any.fromFunction1(_roadsLinkEvent), _window = _window.asInstanceOf[js.Any], addTitleMiddleware = js.Any.fromFunction1(addTitleMiddleware), register = js.Any.fromFunction0(register), registerAdditionalElement = js.Any.fromFunction1(registerAdditionalElement), render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[RoadsPjax]
    }
    
    extension [Self <: RoadsPjax](x: Self) {
      
      inline def setAddTitleMiddleware(value: String => RoadsPjax): Self = StObject.set(x, "addTitleMiddleware", js.Any.fromFunction1(value))
      
      inline def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
      
      inline def setRegisterAdditionalElement(value: HTMLAnchorElement => Unit): Self = StObject.set(x, "registerAdditionalElement", js.Any.fromFunction1(value))
      
      inline def setRender(value: typings.roads.responseMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def set_container_element(value: HTMLElement): Self = StObject.set(x, "_container_element", value.asInstanceOf[js.Any])
      
      inline def set_page_title(value: String): Self = StObject.set(x, "_page_title", value.asInstanceOf[js.Any])
      
      inline def set_page_titleUndefined: Self = StObject.set(x, "_page_title", js.undefined)
      
      inline def set_pjaxEventMonitor(value: MouseEvent => Unit): Self = StObject.set(x, "_pjaxEventMonitor", js.Any.fromFunction1(value))
      
      inline def set_road(value: typings.roads.roadMod.default): Self = StObject.set(x, "_road", value.asInstanceOf[js.Any])
      
      inline def set_roadsFormEvent(value: HTMLFormElement => Unit): Self = StObject.set(x, "_roadsFormEvent", js.Any.fromFunction1(value))
      
      inline def set_roadsLinkEvent(value: HTMLAnchorElement => Unit): Self = StObject.set(x, "_roadsLinkEvent", js.Any.fromFunction1(value))
      
      inline def set_window(value: Window): Self = StObject.set(x, "_window", value.asInstanceOf[js.Any])
    }
  }
}
