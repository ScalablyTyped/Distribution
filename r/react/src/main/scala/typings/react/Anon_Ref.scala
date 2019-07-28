package typings.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ref extends js.Object {
  var ref: js.UndefOr[/* import warning: ImportType.apply Failed type conversion: infer R */ js.Any] = js.undefined
}

object Anon_Ref {
  @scala.inline
  def apply(ref: /* import warning: ImportType.apply Failed type conversion: infer R */ js.Any = null): Anon_Ref = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Ref]
  }
}

