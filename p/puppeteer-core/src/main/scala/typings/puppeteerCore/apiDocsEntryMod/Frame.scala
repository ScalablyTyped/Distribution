package typings.puppeteerCore.apiDocsEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Frame")
@js.native
class Frame protected ()
  extends typings.puppeteerCore.commonFrameManagerMod.Frame {
  def this(
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager,
    parentFrame: Null,
    frameId: String
  ) = this()
  /**
    * @internal
    */
  def this(
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager,
    parentFrame: typings.puppeteerCore.commonFrameManagerMod.Frame,
    frameId: String
  ) = this()
}
