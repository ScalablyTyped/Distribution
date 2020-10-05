package typings.rcTreeSelect.treeSelectMod

import typings.rcSelect.generateMod.RefSelectProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeSelect[ValueType]
  extends Component[TreeSelectProps[ValueType], js.Object, js.Any] {
  var selectRef: RefObject[RefSelectProps] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

