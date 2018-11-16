package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QFrame extends js.Object {
  // Create an element and append it to the frame's body. Throws an exception unless exactly one element is created. (But that one element may contain children.)
  def add(html: java.lang.String): QElement = js.native
  // Create an element and append it to the frame's body. Throws an exception unless exactly one element is created. (But that one element may contain children.)
  def add(html: java.lang.String, nickname: java.lang.String): QElement = js.native
  // Retrieves the frame's body element.
  def body(): QElement = js.native
  // Retrieve an element matching a selector. Throws an exception unless exactly one matching element is found
  def get(selector: java.lang.String): QElement = js.native
  // Retrieve an element matching a selector. Throws an exception unless exactly one matching element is found
  def get(selector: java.lang.String, nickname: java.lang.String): QElement = js.native
  // Retrieve a list of elements matching a selector. If you want to ensure that exactly one element is retrieved, use frame.get() instead.
  def getAll(selector: java.lang.String): QElementList = js.native
  // Retrieve a list of elements matching a selector. If you want to ensure that exactly one element is retrieved, use frame.get() instead.
  def getAll(selector: java.lang.String, nickname: java.lang.String): QElementList = js.native
  // Determine the (x, y) coordinate of the top-left corner of the frame. This uses pageXOffset and pageYOffset under the covers. (On IE 8, it uses scrollLeft and scrollTop.)
  def getRawScrollPosition(x: scala.Double, y: scala.Double): js.Object = js.native
  // Provides access to descriptors for the frame's page (everything you can see or scroll to, not including scrollbars)
  def page(): QElement = js.native
  // Remove the test frame entirely.
  def remove(): scala.Unit = js.native
  // Reset the frame back to the state it was in immediately after you called quixote.createFrame()
  def reset(): scala.Unit = js.native
  // Changes the size of the frame.
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  // Scroll the page so that top-left corner of the frame is as close as possible to an (x, y) coordinate.
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  // Retrieve the underlying HTMLIFrameElement DOM element for the frame.
  def toDomElement(): stdLib.HTMLIFrameElement = js.native
  // Provides access to descriptors for the frame's viewport (the part of the page that you can see in the frame, not including scrollbars)
  def viewport(): QElement = js.native
}

