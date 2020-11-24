package typings.requireDirectory.mod

import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("require-directory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @description function for requiring directory content as hash of modules
    * @param m module for which has will be created
    * @param path path to directory, if you want to build hash for another one (default to __dirname)
    * @param options object with options for require-directory call
    * @returns hash of modules in specified directory
    */
  def apply[T, U](m: NodeModule): RequireDirectoryResult[U] = js.native
  def apply[T, U](m: NodeModule, path: js.UndefOr[scala.Nothing], options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = js.native
  def apply[T, U](m: NodeModule, path: String): RequireDirectoryResult[U] = js.native
  def apply[T, U](m: NodeModule, path: String, options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = js.native
  def apply[T, U](m: NodeModule, path: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = js.native
  def apply[T, U](m: NodeModule, path: RequireDirectoryOptions[T, U], options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = js.native
}
