package typings.readJsonSync

import typings.node.Buffer
import typings.node.urlMod.URL_
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(path: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: String, options: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: String, options: ReadFileOptions): js.Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: Double): js.Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: Double, options: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: Double, options: ReadFileOptions): js.Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: Buffer, options: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: Buffer, options: ReadFileOptions): js.Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: URL_): js.Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: URL_, options: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(path: URL_, options: ReadFileOptions): js.Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("read-json-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ReadFileOptions = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<read-json-sync.anon.FnCall>[1] */ js.Any, 
    js.Object
  ]
}
