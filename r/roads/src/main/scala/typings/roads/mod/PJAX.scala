package typings.roads.mod

import typings.std.Document_
import typings.std.Element
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", "PJAX")
@js.native
class PJAX protected () extends js.Object {
  /**
    * @param road The road that will turn your pjax requests into HTML
    * @param container_element The element that will be filled with your roads output
    * @param window The pages window object to help set page title and other items
    */
  def this(road: Road) = this()
  def this(road: Road, container_element: Element) = this()
  def this(road: Road, container_element: Null, window: Window_) = this()
  def this(road: Road, container_element: Element, window: Window_) = this()
  /**
    * Assigns the cookie middlware to the road to properly handle cookies
    * @param document The pages document object to properly parse and set cookies
    */
  def addCookieMiddleware(document: Document_): js.Any = js.native
  /**
    * Adds middleware to the assigned road whcih will adds setTitle to the request context. This allows you to easily update the page title
    */
  def addTitleMiddleware(): this.type = js.native
  /**
    * Hooks up the PJAX functionality to the information provided via the constructor
    */
  def register(): js.Any = js.native
  /**
    * @param response_object The response from the roads request
    */
  def render(response_object: js.Object): js.Any = js.native
}

