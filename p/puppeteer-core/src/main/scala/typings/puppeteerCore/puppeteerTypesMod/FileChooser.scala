package typings.puppeteerCore.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "FileChooser")
@js.native
open class FileChooser protected ()
  extends typings.puppeteerCore.fileChooserMod.FileChooser {
  /**
    * @internal
    */
  def this(
    element: typings.puppeteerCore.elementHandleMod.ElementHandle[HTMLInputElement],
    event: FileChooserOpenedEvent
  ) = this()
}
