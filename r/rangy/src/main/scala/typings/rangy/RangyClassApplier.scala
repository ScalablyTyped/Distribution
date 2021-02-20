package typings.rangy

import typings.std.Document
import typings.std.HTMLIFrameElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangyClassApplier extends RangyClassApplierOptions {
  
  def applyToRange(range: RangyRange): Unit = js.native
  
  def applyToSelection(): Unit = js.native
  def applyToSelection(win: Window): Unit = js.native
  
  var className: String = js.native
  
  var cssClass: String = js.native
  
  def detach(): Unit = js.native
  def detach(doc: Document): Unit = js.native
  def detach(doc: HTMLIFrameElement): Unit = js.native
  def detach(doc: Window): Unit = js.native
  
  def isAppliedToRange(range: RangyRange): Boolean = js.native
  
  def isAppliedToSelection(): Boolean = js.native
  def isAppliedToSelection(win: Window): Boolean = js.native
  
  def toggleRange(range: RangyRange): Unit = js.native
  
  def toggleSelection(): Unit = js.native
  def toggleSelection(win: Window): Unit = js.native
  
  def undoToRange(range: RangyRange): Unit = js.native
  
  def undoToSelection(): Unit = js.native
  def undoToSelection(win: Window): Unit = js.native
}
