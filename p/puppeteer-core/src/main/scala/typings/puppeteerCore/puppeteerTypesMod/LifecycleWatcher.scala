package typings.puppeteerCore.puppeteerTypesMod

import typings.puppeteerCore.lifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "LifecycleWatcher")
@js.native
open class LifecycleWatcher protected ()
  extends typings.puppeteerCore.lifecycleWatcherMod.LifecycleWatcher {
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    frame: typings.puppeteerCore.frameMod.Frame,
    waitUntil: js.Array[PuppeteerLifeCycleEvent],
    timeout: Double
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    frame: typings.puppeteerCore.frameMod.Frame,
    waitUntil: PuppeteerLifeCycleEvent,
    timeout: Double
  ) = this()
}
