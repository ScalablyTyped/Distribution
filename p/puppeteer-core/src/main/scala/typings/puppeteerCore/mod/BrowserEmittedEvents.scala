package typings.puppeteerCore.mod

import typings.puppeteerCore.puppeteerCoreStrings.disconnected
import typings.puppeteerCore.puppeteerCoreStrings.targetchanged_
import typings.puppeteerCore.puppeteerCoreStrings.targetcreated
import typings.puppeteerCore.puppeteerCoreStrings.targetdestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.puppeteerCore.puppeteerCoreStrings.disconnected
  - typings.puppeteerCore.puppeteerCoreStrings.targetchanged_
  - typings.puppeteerCore.puppeteerCoreStrings.targetcreated
  - typings.puppeteerCore.puppeteerCoreStrings.targetdestroyed
*/
trait BrowserEmittedEvents extends StObject
object BrowserEmittedEvents {
  
  /**
    * Emitted when Puppeteer gets disconnected from the Chromium instance. This
    * might happen because of one of the following:
    *
    * - Chromium is closed or crashed
    *
    * - The {@link Browser.disconnect | browser.disconnect } method was called.
    */
  inline def Disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  /**
    * Emitted when the url of a target changes. Contains a {@link Target} instance.
    *
    * @remarks
    *
    * Note that this includes target changes in incognito browser contexts.
    */
  inline def TargetChanged: targetchanged_ = "targetchanged".asInstanceOf[targetchanged_]
  
  /**
    * Emitted when a target is created, for example when a new page is opened by
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/Window/open | window.open}
    * or by {@link Browser.newPage | browser.newPage}
    *
    * Contains a {@link Target} instance.
    *
    * @remarks
    *
    * Note that this includes target creations in incognito browser contexts.
    */
  inline def TargetCreated: targetcreated = "targetcreated".asInstanceOf[targetcreated]
  
  /**
    * Emitted when a target is destroyed, for example when a page is closed.
    * Contains a {@link Target} instance.
    *
    * @remarks
    *
    * Note that this includes target destructions in incognito browser contexts.
    */
  inline def TargetDestroyed: targetdestroyed = "targetdestroyed".asInstanceOf[targetdestroyed]
}
