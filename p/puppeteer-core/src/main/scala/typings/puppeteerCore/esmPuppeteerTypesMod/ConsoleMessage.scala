package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.puppeteerCore.commonConsoleMessageMod.ConsoleMessageLocation
import typings.puppeteerCore.commonConsoleMessageMod.ConsoleMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ConsoleMessage")
@js.native
open class ConsoleMessage protected ()
  extends typings.puppeteerCore.commonConsoleMessageMod.ConsoleMessage {
  /**
    * @public
    */
  def this(
    `type`: ConsoleMessageType,
    text: String,
    args: js.Array[typings.puppeteerCore.commonJshandleMod.JSHandle[Any]],
    stackTraceLocations: js.Array[ConsoleMessageLocation]
  ) = this()
}
