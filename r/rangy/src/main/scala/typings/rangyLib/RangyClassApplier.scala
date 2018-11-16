package typings
package rangyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangyClassApplier extends RangyClassApplierOptions {
  var className: java.lang.String = js.native
  var cssClass: java.lang.String = js.native
  def applyToRange(range: RangyRange): scala.Unit = js.native
  def applyToSelection(): scala.Unit = js.native
  def applyToSelection(win: stdLib.Window): scala.Unit = js.native
  def detach(): scala.Unit = js.native
  def detach(doc: stdLib.Document): scala.Unit = js.native
  def detach(doc: stdLib.HTMLIFrameElement): scala.Unit = js.native
  def detach(doc: stdLib.Window): scala.Unit = js.native
  def isAppliedToRange(range: RangyRange): scala.Boolean = js.native
  def isAppliedToSelection(): scala.Boolean = js.native
  def isAppliedToSelection(win: stdLib.Window): scala.Boolean = js.native
  def toggleRange(range: RangyRange): scala.Unit = js.native
  def toggleSelection(): scala.Unit = js.native
  def toggleSelection(win: stdLib.Window): scala.Unit = js.native
  def undoToRange(range: RangyRange): scala.Unit = js.native
  def undoToSelection(): scala.Unit = js.native
  def undoToSelection(win: stdLib.Window): scala.Unit = js.native
}

