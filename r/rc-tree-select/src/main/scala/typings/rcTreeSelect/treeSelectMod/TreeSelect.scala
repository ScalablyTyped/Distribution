package typings.rcTreeSelect.treeSelectMod

import typings.react.mod.Component
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSelect[ValueType]
  extends Component[TreeSelectProps[ValueType], js.Object, js.Any] {
  var selectRef: RefObject[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefSelectProps */ _
  ] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

