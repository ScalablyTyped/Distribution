package typings.readJsonSync

import typings.node.bufferMod.global.Buffer
import typings.node.urlMod.URL_
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(path: String, options: String): Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(path: String, options: ReadFileOptions): Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(path: Double): Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(path: Double, options: String): Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(path: Double, options: ReadFileOptions): Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(path: Buffer): Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(path: Buffer, options: String): Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(path: Buffer, options: ReadFileOptions): Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(path: URL_): Any = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(path: URL_, options: String): Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(path: URL_, options: ReadFileOptions): Any = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("read-json-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ReadFileOptions = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<read-json-sync.anon.FnCall>[1] */ js.Any, 
    js.Object
  ]
}
