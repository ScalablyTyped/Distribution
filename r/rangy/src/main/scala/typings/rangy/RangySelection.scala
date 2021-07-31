package typings.rangy

import typings.std.Node
import typings.std.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangySelection
  extends StObject
     with Selection {
  
  def detach(): js.Any = js.native
  
  def getAllRanges(): js.Array[RangyRange] = js.native
  
  def getBookmark(containerNode: Node): js.Any = js.native
  
  def getNativeTextRange(): js.Any = js.native
  
  def inspect(): String = js.native
  
  def isBackwards(): Boolean = js.native
  
  def move(units: String, count: Double): Double = js.native
  def move(units: String, count: Double, opts: js.Any): Double = js.native
  
  def moveToBookmark(bookmark: js.Object): js.Any = js.native
  
  var nativeSelection: Selection = js.native
  
  def refresh(): js.Any = js.native
  def refresh(checkForChanges: Boolean): js.Any = js.native
  
  def restoreCharacterRanges(containerNode: Node, characterRanges: js.Object): js.Any = js.native
  def restoreCharacterRanges(containerNode: Node, characterRanges: js.Object, opts: js.Any): js.Any = js.native
  
  def restoreRanges(saved: js.Object): js.Any = js.native
  
  def saveCharacterRanges(containerNode: Node): js.Object = js.native
  def saveCharacterRanges(containerNode: Node, opts: js.Any): js.Object = js.native
  
  def saveRanges(): js.Object = js.native
  
  def setRanges(ranges: js.Array[RangyRange]): js.Any = js.native
  
  def setSingleRange(range: RangyRange): js.Any = js.native
  
  def toHtml(): String = js.native
}
