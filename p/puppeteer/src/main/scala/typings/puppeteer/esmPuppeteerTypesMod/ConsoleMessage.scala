package typings.puppeteer.esmPuppeteerTypesMod

import typings.puppeteer.commonConsoleMessageMod.ConsoleMessageLocation
import typings.puppeteer.commonConsoleMessageMod.ConsoleMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "ConsoleMessage")
@js.native
open class ConsoleMessage protected ()
  extends typings.puppeteer.commonConsoleMessageMod.ConsoleMessage {
  /**
    * @public
    */
  def this(
    `type`: ConsoleMessageType,
    text: String,
    args: js.Array[typings.puppeteer.commonJshandleMod.JSHandle[Any]],
    stackTraceLocations: js.Array[ConsoleMessageLocation]
  ) = this()
}
