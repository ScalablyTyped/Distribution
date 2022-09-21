package typings.puppeteer.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "Frame")
@js.native
open class Frame protected ()
  extends typings.puppeteer.frameMod.Frame {
  /**
    * @internal
    */
  def this(
    frameManager: typings.puppeteer.frameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: String,
    client: typings.puppeteer.commonConnectionMod.CDPSession
  ) = this()
  def this(
    frameManager: typings.puppeteer.frameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: Unit,
    client: typings.puppeteer.commonConnectionMod.CDPSession
  ) = this()
}
