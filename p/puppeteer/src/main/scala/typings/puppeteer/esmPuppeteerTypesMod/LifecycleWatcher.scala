package typings.puppeteer.esmPuppeteerTypesMod

import typings.puppeteer.commonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "LifecycleWatcher")
@js.native
open class LifecycleWatcher protected ()
  extends typings.puppeteer.commonLifecycleWatcherMod.LifecycleWatcher {
  def this(
    frameManager: typings.puppeteer.commonFrameManagerMod.FrameManager,
    frame: typings.puppeteer.commonFrameMod.Frame,
    waitUntil: js.Array[PuppeteerLifeCycleEvent],
    timeout: Double
  ) = this()
  def this(
    frameManager: typings.puppeteer.commonFrameManagerMod.FrameManager,
    frame: typings.puppeteer.commonFrameMod.Frame,
    waitUntil: PuppeteerLifeCycleEvent,
    timeout: Double
  ) = this()
}
