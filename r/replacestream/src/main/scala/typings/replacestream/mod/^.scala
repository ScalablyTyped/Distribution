package typings.replacestream.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("replacestream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(search: String, replace: String): js.Any = js.native
  def apply(search: String, replace: String, options: Options): js.Any = js.native
  def apply(search: String, replace: ReplaceFunction): js.Any = js.native
  def apply(search: String, replace: ReplaceFunction, options: Options): js.Any = js.native
  def apply(search: RegExp, replace: String): js.Any = js.native
  def apply(search: RegExp, replace: String, options: Options): js.Any = js.native
  def apply(search: RegExp, replace: ReplaceFunction): js.Any = js.native
  def apply(search: RegExp, replace: ReplaceFunction, options: Options): js.Any = js.native
}
