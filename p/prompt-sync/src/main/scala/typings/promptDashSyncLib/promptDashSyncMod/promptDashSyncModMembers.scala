package typings
package promptDashSyncLib.promptDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prompt-sync", JSImport.Namespace)
@js.native
object promptDashSyncModMembers extends js.Object {
  /**
    * create -- sync function for reading user input from stdin
    * @param   {Object} config {
    *   sigint: {Boolean} exit on ^C
    *   autocomplete: {StringArray} function({String})
    *   history: {String} a history control object (see `prompt-sync-history`)
    * }
    * @returns {Function} prompt function
    */
  def apply(): promptDashSyncLib.promptDashSyncMod.PromptSyncNs.Prompt = js.native
  def apply(config: promptDashSyncLib.promptDashSyncMod.PromptSyncNs.Config): promptDashSyncLib.promptDashSyncMod.PromptSyncNs.Prompt = js.native
}

