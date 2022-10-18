package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.puppeteerCore.libCjsPuppeteerCommonConsoleMessageMod.ConsoleMessageLocation
import typings.puppeteerCore.libCjsPuppeteerCommonConsoleMessageMod.ConsoleMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ConsoleMessage")
@js.native
open class ConsoleMessage protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonConsoleMessageMod.ConsoleMessage {
  /**
    * @public
    */
  def this(
    `type`: ConsoleMessageType,
    text: String,
    args: js.Array[typings.puppeteerCore.libCjsPuppeteerCommonJshandleMod.JSHandle[Any]],
    stackTraceLocations: js.Array[ConsoleMessageLocation]
  ) = this()
}
