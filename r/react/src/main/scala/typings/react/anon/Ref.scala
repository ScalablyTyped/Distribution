package typings.react.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref extends js.Object {
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
  ] = js.undefined
}

object Ref {
  @scala.inline
  def apply(ref: /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any = null): Ref = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
}

