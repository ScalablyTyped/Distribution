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
  
  def detach(): Any = js.native
  
  def getAllRanges(): js.Array[RangyRange] = js.native
  
  def getBookmark(containerNode: Node): Any = js.native
  
  def getNativeTextRange(): Any = js.native
  
  def inspect(): String = js.native
  
  def isBackwards(): Boolean = js.native
  
  def move(units: String, count: Double): Double = js.native
  def move(units: String, count: Double, opts: Any): Double = js.native
  
  def moveToBookmark(bookmark: js.Object): Any = js.native
  
  var nativeSelection: Selection = js.native
  
  def refresh(): Any = js.native
  def refresh(checkForChanges: Boolean): Any = js.native
  
  def restoreCharacterRanges(containerNode: Node, characterRanges: js.Object): Any = js.native
  def restoreCharacterRanges(containerNode: Node, characterRanges: js.Object, opts: Any): Any = js.native
  
  def restoreRanges(saved: js.Object): Any = js.native
  
  def saveCharacterRanges(containerNode: Node): js.Object = js.native
  def saveCharacterRanges(containerNode: Node, opts: Any): js.Object = js.native
  
  def saveRanges(): js.Object = js.native
  
  def setRanges(ranges: js.Array[RangyRange]): Any = js.native
  
  def setSingleRange(range: RangyRange): Any = js.native
  
  def toHtml(): String = js.native
}
