package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Selection")
@js.native
class Selection ()
  extends BaseRange
     with RangeType {
  var anchor: Point = js.native
  var focus: Point = js.native
  val isBlurred: scala.Boolean = js.native
  var isFocused: scala.Boolean = js.native
  var marks: immutableLib.immutableMod.Set[Mark] | scala.Null = js.native
  var `object`: slateLib.slateLibStrings.selection = js.native
  def isSelection(maybeSelection: js.Any): /* is slate.slate.Selection */ scala.Boolean = js.native
  def setProperties(properties: Selection): Selection = js.native
  def setProperties(properties: SelectionProperties): Selection = js.native
}

/* static members */
@JSImport("slate", "Selection")
@js.native
object Selection extends js.Object {
  def create(properties: slateLib.slateMod.Range): slateLib.slateMod.Selection = js.native
  def create(properties: slateLib.slateMod.Selection): slateLib.slateMod.Selection = js.native
  def create(properties: slateLib.slateMod.SelectionProperties): slateLib.slateMod.Selection = js.native
  def createProperties(attrs: java.lang.String): slateLib.slateMod.SelectionProperties = js.native
  def createProperties(attrs: slateLib.slateMod.Range): slateLib.slateMod.SelectionProperties = js.native
  def createProperties(attrs: slateLib.slateMod.Selection): slateLib.slateMod.SelectionProperties = js.native
  def createProperties(attrs: slateLib.slateMod.SelectionProperties): slateLib.slateMod.SelectionProperties = js.native
  def fromJSON(properties: slateLib.slateMod.SelectionJSON): slateLib.slateMod.Selection = js.native
}

