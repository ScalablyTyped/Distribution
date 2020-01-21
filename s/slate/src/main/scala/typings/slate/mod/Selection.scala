package typings.slate.mod

import typings.immutable.Immutable.Set_
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
  var marks: Set_[Mark] = js.native
  var `object`: selection = js.native
  def isSelection(maybeSelection: js.Any): /* is slate.slate.Selection */ Boolean = js.native
  def setProperties(properties: String): Selection = js.native
}

/* static members */
@JSImport("slate", "Selection")
@js.native
object Selection extends js.Object {
  def create(properties: RangeType): Selection = js.native
  def create(properties: RangeTypeJSON): Selection = js.native
  def create(properties: RangeTypeProperties): Selection = js.native
  def createProperties(attrs: String): SelectionProperties = js.native
  def createProperties(attrs: RangeType): SelectionProperties = js.native
  def createProperties(attrs: RangeTypeJSON): SelectionProperties = js.native
  def createProperties(attrs: RangeTypeProperties): SelectionProperties = js.native
  def fromJS(properties: RangeTypeJSON): Selection = js.native
  def fromJS(properties: RangeTypeProperties): Selection = js.native
  def fromJSON(properties: RangeTypeJSON): Selection = js.native
  def fromJSON(properties: RangeTypeProperties): Selection = js.native
}

