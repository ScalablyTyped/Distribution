package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ref extends js.Object {
  var ref: js.UndefOr[
    typings.react.mod.Ref[
      /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
    ]
  ] = js.native
}

object Ref {
  @scala.inline
  def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  @scala.inline
  implicit class RefOps[Self <: Ref] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRefFunction1(
      value: /* instance */ (/* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any) | Null => Unit
    ): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(
      value: typings.react.mod.Ref[
          /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
        ]
    ): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

