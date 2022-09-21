package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.puppeteerCore.commonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "LifecycleWatcher")
@js.native
open class LifecycleWatcher protected ()
  extends typings.puppeteerCore.commonLifecycleWatcherMod.LifecycleWatcher {
  def this(
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.commonFrameMod.Frame,
    waitUntil: js.Array[PuppeteerLifeCycleEvent],
    timeout: Double
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.commonFrameMod.Frame,
    waitUntil: PuppeteerLifeCycleEvent,
    timeout: Double
  ) = this()
}
