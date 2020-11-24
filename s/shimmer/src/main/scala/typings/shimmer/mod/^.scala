package typings.shimmer.mod

import typings.shimmer.anon.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shimmer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(options: Logger): Unit = js.native
  
  def massUnwrap[Nodule /* <: js.Object */](nodules: js.Array[Nodule], names: js.Array[/* keyof Nodule */ String]): Unit = js.native
  
  def massWrap[Nodule /* <: js.Object */, FieldName /* <: /* keyof Nodule */ String */](
    nodules: js.Array[Nodule],
    names: js.Array[FieldName],
    wrapper: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ js.Any
    ]
  ): Unit = js.native
  
  def unwrap[Nodule /* <: js.Object */](nodule: Nodule, name: /* keyof Nodule */ String): Unit = js.native
  
  def wrap[Nodule /* <: js.Object */, FieldName /* <: /* keyof Nodule */ String */](
    nodule: Nodule,
    name: FieldName,
    wrapper: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ js.Any
    ]
  ): Unit = js.native
}
