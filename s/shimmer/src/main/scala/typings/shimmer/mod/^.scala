package typings.shimmer.mod

import typings.shimmer.AnonLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shimmer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: AnonLogger): Unit = js.native
  def massUnwrap[Nodule /* <: js.Object */](nodules: js.Array[Nodule], names: js.Array[String]): Unit = js.native
  def massWrap[Nodule /* <: js.Object */, FieldName /* <: String */](
    nodules: js.Array[Nodule],
    names: js.Array[FieldName],
    wrapper: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ js.Any
    ]
  ): Unit = js.native
  def unwrap[Nodule /* <: js.Object */](nodule: Nodule, name: String): Unit = js.native
  def wrap[Nodule /* <: js.Object */, FieldName /* <: String */](
    nodule: Nodule,
    name: FieldName,
    wrapper: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ js.Any
    ]
  ): Unit = js.native
}

