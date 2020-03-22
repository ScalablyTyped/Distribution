package typings.rcFieldForm.listMod

import typings.rcFieldForm.interfaceMod.NamePath
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends js.Object {
  var children: js.UndefOr[
    js.Function2[
      /* fields */ js.Array[ListField], 
      /* operations */ ListOperations, 
      Element | ReactNode
    ]
  ] = js.undefined
  var name: NamePath
}

object ListProps {
  @scala.inline
  def apply(
    name: NamePath,
    children: (/* fields */ js.Array[ListField], /* operations */ ListOperations) => Element | ReactNode = null
  ): ListProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction2(children))
    __obj.asInstanceOf[ListProps]
  }
}

