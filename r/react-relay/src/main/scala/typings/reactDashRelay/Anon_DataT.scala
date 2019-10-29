package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataT[T /* <: js.Array[
/* import warning: ImportType.apply Failed type conversion: { readonly  $data ? :unknown} */ js.Any] */] extends js.Object {
  @JSName(" $data")
  val ` $data`: T
}

object Anon_DataT {
  @scala.inline
  def apply[T /* <: js.Array[
    /* import warning: ImportType.apply Failed type conversion: { readonly  $data ? :unknown} */ js.Any
  ] */](` $data`: T): Anon_DataT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $data")(` $data`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataT[T]]
  }
}

