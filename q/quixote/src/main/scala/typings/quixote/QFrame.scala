package typings.quixote

import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFrame extends js.Object {
  
  // Create an element and append it to the frame's body. Throws an exception unless exactly one element is created. (But that one element may contain children.)
  def add(html: String): QElement = js.native
  def add(html: String, nickname: String): QElement = js.native
  
  // Retrieves the frame's body element.
  def body(): QElement = js.native
  
  // Retrieve an element matching a selector. Throws an exception unless exactly one matching element is found
  def get(selector: String): QElement = js.native
  def get(selector: String, nickname: String): QElement = js.native
  
  // Retrieve a list of elements matching a selector. If you want to ensure that exactly one element is retrieved, use frame.get() instead.
  def getAll(selector: String): QElementList = js.native
  def getAll(selector: String, nickname: String): QElementList = js.native
  
  // Determine the (x, y) coordinate of the top-left corner of the frame. This uses pageXOffset and pageYOffset under the covers. (On IE 8, it uses scrollLeft and scrollTop.)
  def getRawScrollPosition(x: Double, y: Double): js.Object = js.native
  
  // Provides access to descriptors for the frame's page (everything you can see or scroll to, not including scrollbars)
  def page(): QElement = js.native
  
  // Remove the test frame entirely.
  def remove(): Unit = js.native
  
  // Reset the frame back to the state it was in immediately after you called quixote.createFrame()
  def reset(): Unit = js.native
  
  // Changes the size of the frame.
  def resize(width: Double, height: Double): Unit = js.native
  
  // Scroll the page so that top-left corner of the frame is as close as possible to an (x, y) coordinate.
  def scroll(x: Double, y: Double): Unit = js.native
  
  // Retrieve the underlying HTMLIFrameElement DOM element for the frame.
  def toDomElement(): HTMLIFrameElement = js.native
  
  // Provides access to descriptors for the frame's viewport (the part of the page that you can see in the frame, not including scrollbars)
  def viewport(): QElement = js.native
}
