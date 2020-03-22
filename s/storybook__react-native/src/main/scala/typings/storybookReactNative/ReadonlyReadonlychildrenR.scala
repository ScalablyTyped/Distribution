package typings.storybookReactNative

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{}> & std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlyReadonlychildrenR extends js.Object {
  val children: js.UndefOr[ReactNode] = js.undefined
}

object ReadonlyReadonlychildrenR {
  @scala.inline
  def apply(children: ReactNode = null): ReadonlyReadonlychildrenR = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyReadonlychildrenR]
  }
}

