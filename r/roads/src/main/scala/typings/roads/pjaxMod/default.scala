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

@JSImport("roads/types/client/pjax", JSImport.Default)
@js.native
class default protected () extends RoadsPjax {
  /**
    * Creates a new RoadsPjax instance. The road provided to this constructor will be the backbone of your PJAX requests.
    *
    * @param {Road} road - The road that will turn your pjax requests into HTML
    * @param {HTMLElement} container_element - The element that will be filled with your roads output
    * @param {Window} window - The pages window object to help set page title and other items
    */
  def this(road: typings.roads.roadMod.default, container_element: HTMLElement, window: Window) = this()
  /* CompleteClass */
  override var _container_element: HTMLElement = js.native
  /* CompleteClass */
  override var _road: typings.roads.roadMod.default = js.native
  /* CompleteClass */
  override var _window: Window = js.native
  /**
    * Handles all click events, and directs
    * @param {MouseEvent} event
    */
  /* CompleteClass */
  /* protected */ override def _pjaxEventMonitor(event: MouseEvent): Unit = js.native
  /**
    * Submits the form and re-renders the UI
    *
    * @param {HTMLFormElement} form
    */
  /* CompleteClass */
  /* protected */ override def _roadsFormEvent(form: HTMLFormElement): Unit = js.native
  /**
    * Follows the link and renders the UI
    *
    * @param  {HTMLAnchorElement} link
    */
  /* CompleteClass */
  /* protected */ override def _roadsLinkEvent(link: HTMLAnchorElement): Unit = js.native
  /**
    * Assigns the cookie middlware to the road to properly handle cookies
    *
    * @param {Document} document - The pages document object to properly parse and set cookies
    * @returns {RoadsPjax} this object, useful for chaining
    */
  /* CompleteClass */
  override def addCookieMiddleware(document: Document): RoadsPjax = js.native
  /**
    * Adds middleware to the assigned road whcih will adds setTitle to the PJAX object (as opposed to the request object like the setTitle middlweare does).
    * This allows you to easily update the page title.
    *
    * @returns {RoadsPjax} this, useful for chaining
    */
  /* CompleteClass */
  override def addTitleMiddleware(): RoadsPjax = js.native
  /**
    * Hooks up the PJAX functionality to the information provided via the constructor.
    */
  /* CompleteClass */
  override def register(): Unit = js.native
  /**
    *
    * @param {HTMLAnchorElement} element
    */
  /* CompleteClass */
  override def registerAdditionalElement(element: HTMLAnchorElement): Unit = js.native
  /**
    * The response from the roads request
    *
    * @param {Response} response_object
    */
  /* CompleteClass */
  override def render(response_object: typings.roads.responseMod.default): Unit = js.native
}

