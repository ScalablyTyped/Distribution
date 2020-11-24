package typings.sinon.anon

import typings.sinon.mod.SinonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get[T, K /* <: /* keyof T */ String */] extends js.Object {
  
  // Methods
  def get(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  @JSName("get")
  var get_Original: SinonSpy[
    js.Array[js.Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  // Methods
  def set(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): Unit = js.native
  @JSName("set")
  var set_Original: SinonSpy[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ], 
    Unit
  ] = js.native
}
