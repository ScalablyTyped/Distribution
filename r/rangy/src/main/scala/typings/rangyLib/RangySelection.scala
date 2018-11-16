package typings
package rangyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangySelection
  extends stdLib.Selection {
  var nativeSelection: stdLib.Selection = js.native
  def detach(): js.Any = js.native
  def getAllRanges(): js.Array[RangyRange] = js.native
  def getBookmark(containerNode: stdLib.Node): js.Any = js.native
  def getNativeTextRange(): js.Any = js.native
  def inspect(): java.lang.String = js.native
  def isBackwards(): scala.Boolean = js.native
  def move(units: java.lang.String, count: scala.Double): scala.Double = js.native
  def move(units: java.lang.String, count: scala.Double, opts: js.Any): scala.Double = js.native
  def moveToBookmark(bookmark: js.Object): js.Any = js.native
  def refresh(): js.Any = js.native
  def refresh(checkForChanges: scala.Boolean): js.Any = js.native
  def restoreCharacterRanges(containerNode: stdLib.Node, characterRanges: js.Object): js.Any = js.native
  def restoreCharacterRanges(containerNode: stdLib.Node, characterRanges: js.Object, opts: js.Any): js.Any = js.native
  def restoreRanges(saved: js.Object): js.Any = js.native
  def saveCharacterRanges(containerNode: stdLib.Node): js.Object = js.native
  def saveCharacterRanges(containerNode: stdLib.Node, opts: js.Any): js.Object = js.native
  def saveRanges(): js.Object = js.native
  def setRanges(ranges: js.Array[RangyRange]): js.Any = js.native
  def setSingleRange(range: RangyRange): js.Any = js.native
  def toHtml(): java.lang.String = js.native
}

