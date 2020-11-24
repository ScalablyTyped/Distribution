package typings.roads.pjaxMod

import typings.std.Document
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.MouseEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoadsPjax extends js.Object {
  
  var _container_element: HTMLElement = js.native
  
  var _page_title: js.UndefOr[String] = js.native
  
  /**
    * Handles all click events, and directs
    * @param {MouseEvent} event
    */
  /* protected */ def _pjaxEventMonitor(event: MouseEvent): Unit = js.native
  
  var _road: typings.roads.roadMod.default = js.native
  
  /**
    * Submits the form and re-renders the UI
    *
    * @param {HTMLFormElement} form
    */
  /* protected */ def _roadsFormEvent(form: HTMLFormElement): Unit = js.native
  
  /**
    * Follows the link and renders the UI
    *
    * @param  {HTMLAnchorElement} link
    */
  /* protected */ def _roadsLinkEvent(link: HTMLAnchorElement): Unit = js.native
  
  var _window: Window = js.native
  
  /**
    * Assigns the cookie middlware to the road to properly handle cookies
    *
    * @param {Document} document - The pages document object to properly parse and set cookies
    * @returns {RoadsPjax} this object, useful for chaining
    */
  def addCookieMiddleware(document: Document): RoadsPjax = js.native
  
  /**
    * Adds middleware to the assigned road whcih will adds setTitle to the PJAX object (as opposed to the request object like the setTitle middlweare does).
    * This allows you to easily update the page title.
    *
    * @returns {RoadsPjax} this, useful for chaining
    */
  def addTitleMiddleware(): RoadsPjax = js.native
  
  /**
    * Hooks up the PJAX functionality to the information provided via the constructor.
    */
  def register(): Unit = js.native
  
  /**
    *
    * @param {HTMLAnchorElement} element
    */
  def registerAdditionalElement(element: HTMLAnchorElement): Unit = js.native
  
  /**
    * The response from the roads request
    *
    * @param {Response} response_object
    */
  def render(response_object: typings.roads.responseMod.default): Unit = js.native
}
object RoadsPjax {
  
  @scala.inline
  def apply(
    _container_element: HTMLElement,
    _pjaxEventMonitor: MouseEvent => Unit,
    _road: typings.roads.roadMod.default,
    _roadsFormEvent: HTMLFormElement => Unit,
    _roadsLinkEvent: HTMLAnchorElement => Unit,
    _window: Window,
    addCookieMiddleware: Document => RoadsPjax,
    addTitleMiddleware: () => RoadsPjax,
    register: () => Unit,
    registerAdditionalElement: HTMLAnchorElement => Unit,
    render: typings.roads.responseMod.default => Unit
  ): RoadsPjax = {
    val __obj = js.Dynamic.literal(_container_element = _container_element.asInstanceOf[js.Any], _pjaxEventMonitor = js.Any.fromFunction1(_pjaxEventMonitor), _road = _road.asInstanceOf[js.Any], _roadsFormEvent = js.Any.fromFunction1(_roadsFormEvent), _roadsLinkEvent = js.Any.fromFunction1(_roadsLinkEvent), _window = _window.asInstanceOf[js.Any], addCookieMiddleware = js.Any.fromFunction1(addCookieMiddleware), addTitleMiddleware = js.Any.fromFunction0(addTitleMiddleware), register = js.Any.fromFunction0(register), registerAdditionalElement = js.Any.fromFunction1(registerAdditionalElement), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[RoadsPjax]
  }
  
  @scala.inline
  implicit class RoadsPjaxOps[Self <: RoadsPjax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_container_element(value: HTMLElement): Self = this.set("_container_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pjaxEventMonitor(value: MouseEvent => Unit): Self = this.set("_pjaxEventMonitor", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_road(value: typings.roads.roadMod.default): Self = this.set("_road", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_roadsFormEvent(value: HTMLFormElement => Unit): Self = this.set("_roadsFormEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_roadsLinkEvent(value: HTMLAnchorElement => Unit): Self = this.set("_roadsLinkEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_window(value: Window): Self = this.set("_window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddCookieMiddleware(value: Document => RoadsPjax): Self = this.set("addCookieMiddleware", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTitleMiddleware(value: () => RoadsPjax): Self = this.set("addTitleMiddleware", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: () => Unit): Self = this.set("register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterAdditionalElement(value: HTMLAnchorElement => Unit): Self = this.set("registerAdditionalElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: typings.roads.responseMod.default => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_page_title(value: String): Self = this.set("_page_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_page_title: Self = this.set("_page_title", js.undefined)
  }
}
