package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupAwaitingEmitter[T /* <: StringDictionary[js.Function1[/* args */ Any, Any]] */]
  extends StObject
     with TypedEventEmitter[T] {
  
  def close(): js.Promise[Unit] = js.native
  
  def emitAndAwait[K /* <: /* keyof T */ String */](
    event: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): js.Promise[
    js.Array[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    ]
  ] = js.native
  
  /**
  	 * Registers an event listener that will be awaited before Rollup continues
  	 * for events emitted via emitAndAwait. All listeners will be awaited in
  	 * parallel while rejections are tracked via Promise.all.
  	 * Listeners are removed automatically when removeAwaited is called, which
  	 * happens automatically after each run.
  	 */
  def onCurrentAwaited[K /* <: /* keyof T */ String */](
    event: K,
    listener: js.Function1[
      /* args */ Parameters[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      js.Promise[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]
    ]
  ): this.type = js.native
  
  def removeAwaited(): this.type = js.native
}
