package typings.roads.pjaxMod

import typings.std.HTMLElement
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
}

