package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.puppeteerCore.libEsmPuppeteerCommonConsoleMessageMod.ConsoleMessageLocation
import typings.puppeteerCore.libEsmPuppeteerCommonConsoleMessageMod.ConsoleMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ConsoleMessage")
@js.native
open class ConsoleMessage protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonConsoleMessageMod.ConsoleMessage {
  /**
    * @public
    */
  def this(
    `type`: ConsoleMessageType,
    text: String,
    args: js.Array[typings.puppeteerCore.libEsmPuppeteerCommonJshandleMod.JSHandle[Any]],
    stackTraceLocations: js.Array[ConsoleMessageLocation]
  ) = this()
}
