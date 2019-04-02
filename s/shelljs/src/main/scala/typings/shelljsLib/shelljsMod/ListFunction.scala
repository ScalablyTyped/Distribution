package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFunction extends js.Object {
  def apply(options: java.lang.String, paths: java.lang.String*): ShellArray = js.native
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
  def apply(options: java.lang.String, paths: js.Array[java.lang.String]): ShellArray = js.native
  def apply(paths: java.lang.String*): ShellArray = js.native
  /**
  	 * Returns array of files in the given path, or in current directory if no path provided.
  	 *
  	 * @param paths Paths to search.
  	 * @return      An array of files in the given path(s).
  	 */
  def apply(paths: js.Array[java.lang.String]): ShellArray = js.native
}

