package typings.rcTimePicker.mod

import typings.rcTimePicker.anon.PartialTimePickerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePicker
  extends Component[PartialTimePickerProps, js.Object, js.Any] {
  
  def close(): Unit = js.native
  
  def isAM(): Boolean = js.native
}
