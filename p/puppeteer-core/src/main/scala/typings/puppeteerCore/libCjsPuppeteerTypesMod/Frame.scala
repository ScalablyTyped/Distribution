package typings.puppeteerCore.libCjsPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Frame")
@js.native
open class Frame protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame {
  /**
    * @internal
    */
  def this(
    frameManager: typings.puppeteerCore.libCjsPuppeteerCommonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: String,
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.libCjsPuppeteerCommonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: Unit,
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
  ) = this()
}
