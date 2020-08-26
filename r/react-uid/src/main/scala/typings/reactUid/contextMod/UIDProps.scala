package typings.reactUid.contextMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDProps extends js.Object {
  var idSource: js.UndefOr[IdSourceType] = js.native
  var name: js.UndefOr[js.Function1[/* n */ String | Double, String]] = js.native
  def children(id: String, uid: js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]): ReactNode = js.native
}

object UIDProps {
  @scala.inline
  def apply(
    children: (String, js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]) => ReactNode
  ): UIDProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    __obj.asInstanceOf[UIDProps]
  }
  @scala.inline
  implicit class UIDPropsOps[Self <: UIDProps] (val x: Self) extends AnyVal {
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
    def setChildren(
      value: (String, js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]) => ReactNode
    ): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setIdSource(value: IdSourceType): Self = this.set("idSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdSource: Self = this.set("idSource", js.undefined)
    @scala.inline
    def setName(value: /* n */ String | Double => String): Self = this.set("name", js.Any.fromFunction1(value))
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

