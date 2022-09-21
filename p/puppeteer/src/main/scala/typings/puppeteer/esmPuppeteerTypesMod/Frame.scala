package typings.puppeteer.esmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "Frame")
@js.native
open class Frame protected ()
  extends typings.puppeteer.commonFrameMod.Frame {
  /**
    * @internal
    */
  def this(
    frameManager: typings.puppeteer.commonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: String,
    client: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession
  ) = this()
  def this(
    frameManager: typings.puppeteer.commonFrameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: Unit,
    client: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession
  ) = this()
}
