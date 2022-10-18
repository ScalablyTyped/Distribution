package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.puppeteerCore.libEsmPuppeteerCommonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "LifecycleWatcher")
@js.native
open class LifecycleWatcher protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonLifecycleWatcherMod.LifecycleWatcher {
  def this(
    frameManager: typings.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame,
    waitUntil: js.Array[PuppeteerLifeCycleEvent],
    timeout: Double
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame,
    waitUntil: PuppeteerLifeCycleEvent,
    timeout: Double
  ) = this()
}
