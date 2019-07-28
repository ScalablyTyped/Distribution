package typings.slate.slateMod

import typings.immutable.immutableMod.Set
import typings.slate.slateStrings.selection
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
  val isBlurred: Boolean = js.native
  var isFocused: Boolean = js.native
  var marks: Set[Mark] | Null = js.native
  var `object`: selection = js.native
  def isSelection(maybeSelection: js.Any): /* is slate.slate.Selection */ Boolean = js.native
  def setProperties(properties: Selection): Selection = js.native
  def setProperties(properties: SelectionProperties): Selection = js.native
}

/* static members */
@JSImport("slate", "Selection")
@js.native
object Selection extends js.Object {
  def create(properties: Range): Selection = js.native
  def create(properties: Selection): Selection = js.native
  def create(properties: SelectionProperties): Selection = js.native
  def createProperties(attrs: String): SelectionProperties = js.native
  def createProperties(attrs: Range): SelectionProperties = js.native
  def createProperties(attrs: Selection): SelectionProperties = js.native
  def createProperties(attrs: SelectionProperties): SelectionProperties = js.native
  def fromJSON(properties: SelectionJSON): Selection = js.native
}

