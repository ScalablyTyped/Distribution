package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.puppeteerCore.libCjsPuppeteerCommonLifecycleWatcherMod.PuppeteerLifeCycleEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "LifecycleWatcher")
@js.native
open class LifecycleWatcher protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonLifecycleWatcherMod.LifecycleWatcher {
  def this(
    frameManager: typings.puppeteerCore.libCjsPuppeteerCommonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame,
    waitUntil: js.Array[PuppeteerLifeCycleEvent],
    timeout: Double
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.libCjsPuppeteerCommonFrameManagerMod.FrameManager,
    frame: typings.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame,
    waitUntil: PuppeteerLifeCycleEvent,
    timeout: Double
  ) = this()
}
