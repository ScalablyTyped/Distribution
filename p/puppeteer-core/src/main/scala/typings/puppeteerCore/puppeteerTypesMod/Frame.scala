package typings.puppeteerCore.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Frame")
@js.native
open class Frame protected ()
  extends typings.puppeteerCore.frameMod.Frame {
  /**
    * @internal
    */
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: String,
    client: typings.puppeteerCore.commonConnectionMod.CDPSession
  ) = this()
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    frameId: String,
    parentFrameId: Unit,
    client: typings.puppeteerCore.commonConnectionMod.CDPSession
  ) = this()
}
