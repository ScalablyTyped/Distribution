package typings.rangy

import typings.std.Document
import typings.std.HTMLIFrameElement
import typings.std.Range
import typings.std.Selection
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangyStatic extends StObject {
  
  def addInitListener(listener: js.Function1[/* rangy */ this.type, Unit]): Any = js.native
  
  def createClassApplier(theClass: String): RangyClassApplier = js.native
  def createClassApplier(theClass: String, options: Unit, tagNames: String): RangyClassApplier = js.native
  def createClassApplier(theClass: String, options: Unit, tagNames: js.Array[String]): RangyClassApplier = js.native
  def createClassApplier(theClass: String, options: RangyClassApplierOptions): RangyClassApplier = js.native
  def createClassApplier(theClass: String, options: RangyClassApplierOptions, tagNames: String): RangyClassApplier = js.native
  def createClassApplier(theClass: String, options: RangyClassApplierOptions, tagNames: js.Array[String]): RangyClassApplier = js.native
  
  def createMissingNativeApi(): Any = js.native
  
  def createNativeRange(): Range = js.native
  def createNativeRange(doc: Document): Range = js.native
  def createNativeRange(doc: HTMLIFrameElement): Range = js.native
  def createNativeRange(doc: Window): Range = js.native
  
  def createRange(): RangyRange = js.native
  def createRange(doc: Document): RangyRange = js.native
  def createRange(doc: HTMLIFrameElement): RangyRange = js.native
  def createRange(doc: Window): RangyRange = js.native
  
  def createRangyRange(): RangyRange = js.native
  def createRangyRange(doc: Document): RangyRange = js.native
  def createRangyRange(doc: HTMLIFrameElement): RangyRange = js.native
  def createRangyRange(doc: Window): RangyRange = js.native
  
  def getNativeSelection(): Selection = js.native
  def getNativeSelection(win: Window): Selection = js.native
  
  def getSelection(): RangySelection = js.native
  def getSelection(doc: Document): RangySelection = js.native
  def getSelection(doc: HTMLIFrameElement): RangySelection = js.native
  def getSelection(doc: Window): RangySelection = js.native
  
  var initialized: Boolean = js.native
  
  def shim(): Any = js.native
  
  var supported: Boolean = js.native
}
