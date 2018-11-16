package typings
package rangyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangyStatic extends js.Object {
  var initialized: scala.Boolean = js.native
  var supported: scala.Boolean = js.native
  def addInitListener(listener: js.Function1[/* rangy */ this.type, scala.Unit]): js.Any = js.native
  def createClassApplier(theClass: java.lang.String): RangyClassApplier = js.native
  def createClassApplier(theClass: java.lang.String, options: RangyClassApplierOptions): RangyClassApplier = js.native
  def createClassApplier(theClass: java.lang.String, options: RangyClassApplierOptions, tagNames: java.lang.String): RangyClassApplier = js.native
  def createClassApplier(
    theClass: java.lang.String,
    options: RangyClassApplierOptions,
    tagNames: js.Array[java.lang.String]
  ): RangyClassApplier = js.native
  def createMissingNativeApi(): js.Any = js.native
  def createNativeRange(): stdLib.Range = js.native
  def createNativeRange(doc: stdLib.Document): stdLib.Range = js.native
  def createNativeRange(doc: stdLib.HTMLIFrameElement): stdLib.Range = js.native
  def createNativeRange(doc: stdLib.Window): stdLib.Range = js.native
  def createRange(): RangyRange = js.native
  def createRange(doc: stdLib.Document): RangyRange = js.native
  def createRange(doc: stdLib.HTMLIFrameElement): RangyRange = js.native
  def createRange(doc: stdLib.Window): RangyRange = js.native
  def createRangyRange(): RangyRange = js.native
  def createRangyRange(doc: stdLib.Document): RangyRange = js.native
  def createRangyRange(doc: stdLib.HTMLIFrameElement): RangyRange = js.native
  def createRangyRange(doc: stdLib.Window): RangyRange = js.native
  def getNativeSelection(): stdLib.Selection = js.native
  def getNativeSelection(win: stdLib.Window): stdLib.Selection = js.native
  def getSelection(): RangySelection = js.native
  def getSelection(doc: stdLib.Document): RangySelection = js.native
  def getSelection(doc: stdLib.HTMLIFrameElement): RangySelection = js.native
  def getSelection(doc: stdLib.Window): RangySelection = js.native
  def shim(): js.Any = js.native
}

