package typings.puppeteerCore.mod

import typings.puppeteerCore.consoleMessageMod.ConsoleMessageLocation
import typings.puppeteerCore.consoleMessageMod.ConsoleMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "ConsoleMessage")
@js.native
class ConsoleMessage protected ()
  extends typings.puppeteerCore.consoleMessageMod.ConsoleMessage {
  /**
    * @public
    */
  def this(
    `type`: ConsoleMessageType,
    text: String,
    args: js.Array[typings.puppeteerCore.jshandleMod.JSHandle],
    stackTraceLocations: js.Array[ConsoleMessageLocation]
  ) = this()
}
