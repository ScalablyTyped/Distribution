package typings.readJsonSync

import typings.node.Buffer
import typings.node.urlMod.URL_
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("read-json-sync", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(path: String): js.Any = js.native
  def apply(path: String, options: String): js.Any = js.native
  def apply(path: String, options: ReadFileOptions): js.Any = js.native
  def apply(path: Double): js.Any = js.native
  def apply(path: Double, options: String): js.Any = js.native
  def apply(path: Double, options: ReadFileOptions): js.Any = js.native
  def apply(path: Buffer): js.Any = js.native
  def apply(path: Buffer, options: String): js.Any = js.native
  def apply(path: Buffer, options: ReadFileOptions): js.Any = js.native
  def apply(path: URL_): js.Any = js.native
  def apply(path: URL_, options: String): js.Any = js.native
  def apply(path: URL_, options: ReadFileOptions): js.Any = js.native
  
  type ReadFileOptions = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<read-json-sync.anon.FnCall>[1] */ js.Any, 
    js.Object
  ]
}
