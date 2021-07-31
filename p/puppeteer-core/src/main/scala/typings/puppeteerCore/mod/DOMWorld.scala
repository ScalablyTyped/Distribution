package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "DOMWorld")
@js.native
class DOMWorld protected ()
  extends typings.puppeteerCore.domworldMod.DOMWorld {
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    frame: typings.puppeteerCore.frameManagerMod.Frame,
    timeoutSettings: typings.puppeteerCore.timeoutSettingsMod.TimeoutSettings
  ) = this()
}
/* static members */
object DOMWorld {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "DOMWorld")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "DOMWorld.bindingIdentifier")
  @js.native
  def bindingIdentifier: js.Any = js.native
  @scala.inline
  def bindingIdentifier_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindingIdentifier")(x.asInstanceOf[js.Any])
}
