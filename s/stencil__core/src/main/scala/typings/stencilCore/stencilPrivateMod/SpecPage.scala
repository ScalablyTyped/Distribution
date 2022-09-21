package typings.stencilCore.stencilPrivateMod

import typings.std.HTMLBodyElement
import typings.std.HTMLDocument
import typings.std.Map
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecPage extends StObject {
  
  /**
    * Mocked testing `document.body`.
    */
  var body: HTMLBodyElement = js.native
  
  var build: BuildConditionals = js.native
  
  /**
    * Mocked testing `document`.
    */
  var doc: HTMLDocument = js.native
  
  def flushLoadModule(): js.Promise[Any] = js.native
  def flushLoadModule(bundleId: String): js.Promise[Any] = js.native
  
  def flushQueue(): js.Promise[Any] = js.native
  
  /**
    * The first component found within the mocked `document.body`. If a component isn't found, then it'll return `document.body.firstElementChild`.
    */
  var root: js.UndefOr[AnyHTMLElement] = js.native
  
  /**
    * Similar to `root`, except returns the component instance. If a root component was not found it'll return `null`.
    */
  var rootInstance: js.UndefOr[Any] = js.native
  
  /**
    * Convenience function to set `document.body.innerHTML` and `waitForChanges()`. Function argument should be an html string.
    */
  def setContent(html: String): js.Promise[Any] = js.native
  
  var styles: Map[String, String] = js.native
  
  /**
    * After changes have been made to a component, such as a update to a property or attribute, the test page does not automatically apply the changes. In order to wait for, and apply the update, call `await page.waitForChanges()`.
    */
  def waitForChanges(): js.Promise[Any] = js.native
  
  /**
    * Mocked testing `window`.
    */
  var win: Window = js.native
}
