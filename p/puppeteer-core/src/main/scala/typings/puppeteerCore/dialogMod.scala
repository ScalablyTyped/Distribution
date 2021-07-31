package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Page.DialogType
import typings.puppeteerCore.connectionMod.CDPSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Dialog", "Dialog")
  @js.native
  class Dialog protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, `type`: DialogType, message: String) = this()
    def this(client: CDPSession, `type`: DialogType, message: String, defaultValue: String) = this()
    
    var _client: js.Any = js.native
    
    var _defaultValue: js.Any = js.native
    
    var _handled: js.Any = js.native
    
    var _message: js.Any = js.native
    
    var _type: js.Any = js.native
    
    /**
      * @param promptText - optional text that will be entered in the dialog
      * prompt. Has no effect if the dialog's type is not `prompt`.
      *
      * @returns A promise that resolves when the dialog has been accepted.
      */
    def accept(): js.Promise[Unit] = js.native
    def accept(promptText: String): js.Promise[Unit] = js.native
    
    /**
      * @returns The default value of the prompt, or an empty string if the dialog
      * is not a `prompt`.
      */
    def defaultValue(): String = js.native
    
    /**
      * @returns A promise which will resolve once the dialog has been dismissed
      */
    def dismiss(): js.Promise[Unit] = js.native
    
    /**
      * @returns The message displayed in the dialog.
      */
    def message(): String = js.native
    
    /**
      * @returns The type of the dialog.
      */
    def `type`(): DialogType = js.native
  }
}
