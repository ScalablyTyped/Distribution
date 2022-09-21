package typings.simonwepSelectionJs.mod

import typings.simonwepSelectionJs.anon.PartialSelectionOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@simonwep/selection-js", JSImport.Default)
@js.native
open class default protected ()
  extends StObject
     with SelectionArea {
  def this(opt: PartialSelectionOptions) = this()
  
  /* private */ /* CompleteClass */
  override val _listeners: Any = js.native
  
  /* CompleteClass */
  override def addEventListener[K /* <: /* keyof Events */ String */](
    event: K,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  /* CompleteClass */
  override def dispatchEvent[K /* <: /* keyof Events */ String */](
    event: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type Parameters<Events[K]> is not an array type */ data: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
    ]
  ): Any = js.native
  
  /* CompleteClass */
  override def emit[K /* <: /* keyof Events */ String */](
    event: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type Parameters<Events[K]> is not an array type */ data: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
    ]
  ): Any = js.native
  
  /* CompleteClass */
  override def off[K /* <: /* keyof Events */ String */](
    event: K,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  // Let's also support on, off and emit like node
  /* eslint-disable no-invalid-this */
  /* CompleteClass */
  override def on[K /* <: /* keyof Events */ String */](
    event: K,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  /* CompleteClass */
  override def removeEventListener[K /* <: /* keyof Events */ String */](
    event: K,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type = js.native
  
  /* CompleteClass */
  override def unbindAllListeners(): Unit = js.native
}
object default {
  
  @JSImport("@simonwep/selection-js", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@simonwep/selection-js", "default.version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
