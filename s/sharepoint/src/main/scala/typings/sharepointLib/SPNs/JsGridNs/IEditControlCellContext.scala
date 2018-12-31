package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControlCellContext extends IEditActorCellContext {
  var cellHeight: scala.Double
   // TODO: Determine correct type
  var cellRect: js.Any
  var cellStyle: js.Any
  var cellWidth: scala.Double
  def Hide(element: stdLib.HTMLElement): scala.Unit
  def NotifyEditComplete(): scala.Unit
  def NotifyExpandControl(): scala.Unit
  def Show(element: stdLib.HTMLElement): scala.Unit
}

