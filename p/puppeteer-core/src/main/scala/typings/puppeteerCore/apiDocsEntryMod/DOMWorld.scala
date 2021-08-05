package typings.puppeteerCore.apiDocsEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "DOMWorld")
@js.native
class DOMWorld protected ()
  extends typings.puppeteerCore.commonDomworldMod.DOMWorld {
  def this(
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.commonFrameManagerMod.Frame,
    timeoutSettings: typings.puppeteerCore.commonTimeoutSettingsMod.TimeoutSettings
  ) = this()
}
/* static members */
object DOMWorld {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "DOMWorld")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "DOMWorld.bindingIdentifier")
  @js.native
  def bindingIdentifier: js.Any = js.native
  inline def bindingIdentifier_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindingIdentifier")(x.asInstanceOf[js.Any])
}
