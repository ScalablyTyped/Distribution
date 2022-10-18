package typings.reactNativeWindowsFs

import org.scalablytyped.runtime.Shortcut
import typings.node.fsMod.PathLike
import typings.reactNativeWindowsFs.anon.Encoding
import typings.reactNativeWindowsFs.anon.Typeoffs
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonjsSyncMethodsMod extends Shortcut {
  
  @JSImport("@react-native-windows/fs/lib-commonjs/syncMethods", JSImport.Default)
  @js.native
  val default: SyncMethods = js.native
  
  @js.native
  trait ExtraMethods extends StObject {
    
    def readJsonFileSync[T](path: Double): T = js.native
    def readJsonFileSync[T](path: Double, options: Encoding): T = js.native
    /**
      * Synchronously reads the contents of a file, then parses it as JSON.
      *
      * By default the parsed JSON file is assumed to be a JSON object, with no
      * assumptions made about content (`Record<string, unknown`). If the type is
      * known at call-time, it can be passed to this function to alter the return
      * type.This type is not validated to be correct at runtime.
      *
      * E.g. `fs.readJsonFileSync<Document>(documentPath)`;
      *
      * @param path A path to a file.
      * @param options Optional set of options
      * @param options.encoding The encoding of the JSON file (defaults to utf-8)
      * @param options.flag File access flags
      */
    def readJsonFileSync[T](path: PathLike): T = js.native
    def readJsonFileSync[T](path: PathLike, options: Encoding): T = js.native
  }
  
  type ImportedMethodNames = ValueOf[js.Array[Any]]
  
  type ImportedMethods = Pick[Typeoffs, ImportedMethodNames]
  
  type SyncMethods = ImportedMethods & ExtraMethods
  
  type ValueOf[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  
  type _To = SyncMethods
  
  /* This means you don't have to write `default`, but can instead just say `libCommonjsSyncMethodsMod.foo` */
  override def _to: SyncMethods = default
}
