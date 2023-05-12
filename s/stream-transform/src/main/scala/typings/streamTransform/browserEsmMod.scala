package typings.streamTransform

import typings.streamTransform.mod.Callback
import typings.streamTransform.mod.Handler
import typings.streamTransform.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserEsmMod {
  
  @JSImport("stream-transform/browser/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stream-transform/browser/esm", "Transformer")
  @js.native
  open class Transformer protected ()
    extends typings.streamTransform.mod.Transformer {
    def this(options: Options) = this()
  }
  
  inline def transform[T, U](handler: Handler[T, U]): typings.streamTransform.mod.Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(handler.asInstanceOf[js.Any]).asInstanceOf[typings.streamTransform.mod.Transformer]
  inline def transform[T, U](handler: Handler[T, U], callback: Callback): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
  inline def transform[T, U](options: Options, handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
  inline def transform[T, U](options: Options, handler: Handler[T, U], callback: Callback): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
  inline def transform[T, U](records: js.Array[T], handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
  inline def transform[T, U](records: js.Array[T], handler: Handler[T, U], callback: Callback): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
  inline def transform[T, U](records: js.Array[T], options: Options, handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
  inline def transform[T, U](records: js.Array[T], options: Options, handler: Handler[T, U], callback: Callback): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
}
