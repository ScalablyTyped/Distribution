package typings.puppeteer.mod

import typings.devtoolsProtocol.mod.Protocol.Page.DialogType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "Dialog")
@js.native
open class Dialog () extends StObject {
  
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
  
  /* private */ var `private`: Any = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * @returns The type of the dialog.
    */
  def `type`(): DialogType = js.native
}
