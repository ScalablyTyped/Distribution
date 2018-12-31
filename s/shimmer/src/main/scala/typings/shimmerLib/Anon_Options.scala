package typings
package shimmerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Options extends js.Object {
  def apply(options: Anon_Logger): scala.Unit = js.native
  def massUnwrap[Nodule /* <: js.Object */](nodules: js.Array[Nodule], names: js.Array[java.lang.String]): scala.Unit = js.native
  def massWrap[Nodule /* <: js.Object */, FieldName /* <: java.lang.String */](
    nodules: js.Array[Nodule],
    names: js.Array[FieldName],
    wrapper: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: Nodule[FieldName] */ js.Any
    ]
  ): scala.Unit = js.native
  def unwrap[Nodule /* <: js.Object */](nodule: Nodule, name: java.lang.String): scala.Unit = js.native
  def wrap[Nodule /* <: js.Object */, FieldName /* <: java.lang.String */](
    nodule: Nodule,
    name: FieldName,
    wrapper: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: Nodule[FieldName] */ js.Any
    ]
  ): scala.Unit = js.native
}

