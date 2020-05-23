package typings.reactOnclickoutside.mod

import typings.react.mod.Component
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperInstance[P, C]
  extends Component[OnClickOutProps[LibraryManagedAttributes[C, P]], js.Object, js.Any] {
  def getInstance(): InstanceType[C] = js.native
}

