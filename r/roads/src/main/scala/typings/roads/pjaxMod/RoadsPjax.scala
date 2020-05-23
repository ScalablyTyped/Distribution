package typings.roads.pjaxMod

import typings.std.Document
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.MouseEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoadsPjax extends js.Object {
  var _container_element: HTMLElement
  var _page_title: js.UndefOr[String] = js.undefined
  var _road: typings.roads.roadMod.default
  var _window: Window
  /**
    * Handles all click events, and directs
    * @param {MouseEvent} event
    */
  /* protected */ def _pjaxEventMonitor(event: MouseEvent): Unit
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
  /**
    * Assigns the cookie middlware to the road to properly handle cookies
    *
    * @param {Document} document - The pages document object to properly parse and set cookies
    * @returns {RoadsPjax} this object, useful for chaining
    */
  def addCookieMiddleware(document: Document): RoadsPjax
  /**
    * Adds middleware to the assigned road whcih will adds setTitle to the PJAX object (as opposed to the request object like the setTitle middlweare does).
    * This allows you to easily update the page title.
    *
    * @returns {RoadsPjax} this, useful for chaining
    */
  def addTitleMiddleware(): RoadsPjax
  /**
    * Hooks up the PJAX functionality to the information provided via the constructor.
    */
  def register(): Unit
  /**
    *
    * @param {HTMLAnchorElement} element
    */
  def registerAdditionalElement(element: HTMLAnchorElement): Unit
  /**
    * The response from the roads request
    *
    * @param {Response} response_object
    */
  def render(response_object: typings.roads.responseMod.default): Unit
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
    render: typings.roads.responseMod.default => Unit,
    _page_title: String = null
  ): RoadsPjax = {
    val __obj = js.Dynamic.literal(_container_element = _container_element.asInstanceOf[js.Any], _pjaxEventMonitor = js.Any.fromFunction1(_pjaxEventMonitor), _road = _road.asInstanceOf[js.Any], _roadsFormEvent = js.Any.fromFunction1(_roadsFormEvent), _roadsLinkEvent = js.Any.fromFunction1(_roadsLinkEvent), _window = _window.asInstanceOf[js.Any], addCookieMiddleware = js.Any.fromFunction1(addCookieMiddleware), addTitleMiddleware = js.Any.fromFunction0(addTitleMiddleware), register = js.Any.fromFunction0(register), registerAdditionalElement = js.Any.fromFunction1(registerAdditionalElement), render = js.Any.fromFunction1(render))
    if (_page_title != null) __obj.updateDynamic("_page_title")(_page_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadsPjax]
  }
}

