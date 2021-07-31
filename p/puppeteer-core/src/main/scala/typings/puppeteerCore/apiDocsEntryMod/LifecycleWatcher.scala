package typings.puppeteerCore.apiDocsEntryMod

import typings.puppeteerCore.commonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "LifecycleWatcher")
@js.native
class LifecycleWatcher protected ()
  extends typings.puppeteerCore.commonLifecycleWatcherMod.LifecycleWatcher {
  def this(
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.commonFrameManagerMod.Frame,
    waitUntil: js.Array[PuppeteerLifeCycleEvent],
    timeout: Double
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.commonFrameManagerMod.Frame,
    waitUntil: PuppeteerLifeCycleEvent,
    timeout: Double
  ) = this()
}
