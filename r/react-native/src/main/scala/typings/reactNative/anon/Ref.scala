package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref extends js.Object {
  var ref: js.UndefOr[
    typings.react.mod.Ref[
      /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
    ]
  ] = js.undefined
}

object Ref {
  @scala.inline
  def apply(
    ref: js.UndefOr[
      Null | (typings.react.mod.Ref[
        /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
      ])
    ] = js.undefined
  ): Ref = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
}

