package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "Frame")
@js.native
class Frame protected ()
  extends typings.puppeteerCore.frameManagerMod.Frame {
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    parentFrame: Null,
    frameId: String
  ) = this()
  /**
    * @internal
    */
  def this(
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager,
    parentFrame: typings.puppeteerCore.frameManagerMod.Frame,
    frameId: String
  ) = this()
}
