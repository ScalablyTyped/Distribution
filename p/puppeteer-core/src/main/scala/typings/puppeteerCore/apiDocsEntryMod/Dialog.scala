package typings.puppeteerCore.apiDocsEntryMod

import typings.devtoolsProtocol.mod.Protocol.Page.DialogType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Dialog")
@js.native
class Dialog protected ()
  extends typings.puppeteerCore.commonDialogMod.Dialog {
  /**
    * @internal
    */
  def this(client: typings.puppeteerCore.commonConnectionMod.CDPSession, `type`: DialogType, message: String) = this()
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    `type`: DialogType,
    message: String,
    defaultValue: String
  ) = this()
}
