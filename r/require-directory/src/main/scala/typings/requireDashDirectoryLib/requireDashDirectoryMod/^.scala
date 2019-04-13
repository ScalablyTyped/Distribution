package typings
package requireDashDirectoryLib.requireDashDirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("require-directory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @description default options that is used for "require-directory" module
    */
  val defaults: RequireDirectoryOptions[js.Any, js.Any] = js.native
  /**
    * @description function for requiring directory content as hash of modules
    * @param m module for which has will be created
    * @param path path to directory, if you want to build hash for another one (default to __dirname)
    * @param options object with options for require-directory call
    * @returns hash of modules in specified directory
    */
  def apply[T, U](m: nodeLib.NodeModule): RequireDirectoryResult[U] = js.native
  def apply[T, U](m: nodeLib.NodeModule, path: java.lang.String | (RequireDirectoryOptions[T, U])): RequireDirectoryResult[U] = js.native
  def apply[T, U](
    m: nodeLib.NodeModule,
    path: java.lang.String | (RequireDirectoryOptions[T, U]),
    options: RequireDirectoryOptions[T, U]
  ): RequireDirectoryResult[U] = js.native
}

