package typings.rcFieldForm.listMod

import typings.rcFieldForm.interfaceMod.NamePath
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProps extends js.Object {
  var children: js.UndefOr[
    js.Function2[
      /* fields */ js.Array[ListField], 
      /* operations */ ListOperations, 
      Element | ReactNode
    ]
  ] = js.native
  var name: NamePath = js.native
}

object ListProps {
  @scala.inline
  def apply(name: NamePath): ListProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps] (val x: Self) extends AnyVal {
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
    def setNameVarargs(value: (String | Double)*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: NamePath): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: (/* fields */ js.Array[ListField], /* operations */ ListOperations) => Element | ReactNode): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

