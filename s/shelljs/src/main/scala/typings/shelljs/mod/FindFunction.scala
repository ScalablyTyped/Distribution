package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindFunction extends StObject {
  
  def apply(path: String*): ShellArray = js.native
  /**
    * Returns array of all files (however deep) in the given paths.
    *
    * @param path The path(s) to search.
    * @return     An array of all files (however deep) in the given path(s).
    */
  def apply(path: js.Array[String]): ShellArray = js.native
}
