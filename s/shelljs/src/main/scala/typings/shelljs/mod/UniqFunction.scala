package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqFunction extends StObject {
  
  /**
    * Filter adjacent matching lines from input.
    */
  def apply(input: String): typings.shelljs.mod.ShellString = js.native
  /**
    * Filter adjacent matching lines from input.
    *
    * @param options Available options:
    *        - `-i`: Ignore case while comparing
    *        - `-c`: Prefix lines by the number of occurrences
    *        - `-d`: Only print duplicate lines, one for each group of identical lines
    */
  def apply(options: String, input: String): typings.shelljs.mod.ShellString = js.native
  def apply(options: String, input: String, output: String): typings.shelljs.mod.ShellString = js.native
}
