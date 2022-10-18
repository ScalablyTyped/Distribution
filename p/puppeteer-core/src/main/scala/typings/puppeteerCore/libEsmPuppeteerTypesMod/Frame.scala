package typings.puppeteerCore.libEsmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "Frame")
@js.native
open class Frame protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame {
  /**
    * @internal
    */
  def this(
    frameManager: typings.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: String,
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: Unit,
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
  ) = this()
}
