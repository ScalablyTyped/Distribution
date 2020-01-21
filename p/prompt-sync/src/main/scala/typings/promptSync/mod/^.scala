package typings.promptSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prompt-sync", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * create -- sync function for reading user input from stdin
    * @param   {Object} config {
    *   sigint: {Boolean} exit on ^C
    *   autocomplete: {StringArray} function({String})
    *   history: {String} a history control object (see `prompt-sync-history`)
    * }
    * @returns {Function} prompt function
    */
  def apply(): Prompt = js.native
  def apply(config: Config): Prompt = js.native
}

