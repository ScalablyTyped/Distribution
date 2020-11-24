package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFunction extends js.Object {
  
  def apply(options: String, paths: String*): ShellArray = js.native
  /**
    * Returns array of files in the given path, or in current directory if no path provided.
    *
    * @param options Available options:
    *        - `-R`: recursive
    *        - `-A`: all files (include files beginning with ., except for . and ..)
    *        - `-L`: follow symlinks
    *        - `-d`: list directories themselves, not their contents
    *        - `-l`: list objects representing each file, each with fields containing
    *                `ls -l` output fields. See fs.Stats for more info
    * @param paths   Paths to search.
    * @return        An array of files in the given path(s).
    */
  def apply(options: String, paths: js.Array[String]): ShellArray = js.native
  def apply(paths: String*): ShellArray = js.native
  /**
    * Returns array of files in the given path, or in current directory if no path provided.
    *
    * @param paths Paths to search.
    * @return      An array of files in the given path(s).
    */
  def apply(paths: js.Array[String]): ShellArray = js.native
}
