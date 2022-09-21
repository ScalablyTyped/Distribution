package typings.puppeteer.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "FileChooser")
@js.native
open class FileChooser protected ()
  extends typings.puppeteer.fileChooserMod.FileChooser {
  /**
    * @internal
    */
  def this(
    element: typings.puppeteer.elementHandleMod.ElementHandle[HTMLInputElement],
    event: FileChooserOpenedEvent
  ) = this()
}
