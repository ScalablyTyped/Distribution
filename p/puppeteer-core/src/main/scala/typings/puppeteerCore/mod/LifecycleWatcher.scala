package typings.puppeteerCore.mod

import typings.puppeteerCore.lifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "LifecycleWatcher")
@js.native
class LifecycleWatcher protected ()
  extends typings.puppeteerCore.lifecycleWatcherMod.LifecycleWatcher {
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    frame: typings.puppeteerCore.frameManagerMod.Frame,
    waitUntil: js.Array[PuppeteerLifeCycleEvent],
    timeout: Double
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    frame: typings.puppeteerCore.frameManagerMod.Frame,
    waitUntil: PuppeteerLifeCycleEvent,
    timeout: Double
  ) = this()
}
