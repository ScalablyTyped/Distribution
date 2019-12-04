package typings.slate.slateMod

import typings.immutable.Immutable.List
import typings.slate.Anon_PreserveKeys
import typings.slate.slateStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Range")
@js.native
class Range ()
  extends BaseRange
     with RangeType {
  var anchor: Point = js.native
  var focus: Point = js.native
  var `object`: range = js.native
  def toJS(options: Anon_PreserveKeys): RangeJSON = js.native
  def toJSON(options: Anon_PreserveKeys): RangeJSON = js.native
}

/* static members */
@JSImport("slate", "Range")
@js.native
object Range extends js.Object {
  def create(properties: RangeType): Range = js.native
  def create(properties: RangeTypeJSON): Range = js.native
  def create(properties: RangeTypeProperties): Range = js.native
  def createList(): List[Range] = js.native
  def createList(elements: js.Array[RangeTypeProperties | RangeTypeJSON | RangeType]): List[Range] = js.native
  def createList(elements: List[RangeTypeProperties | RangeTypeJSON | RangeType]): List[Range] = js.native
  def createProperties(attrs: RangeType): RangeProperties = js.native
  def createProperties(attrs: RangeTypeJSON): RangeProperties = js.native
  def createProperties(attrs: RangeTypeProperties): RangeProperties = js.native
  def fromJS(properties: RangeTypeJSON): Range = js.native
  def fromJSON(properties: RangeTypeJSON): Range = js.native
  def isRange(maybeRange: js.Any): /* is slate.slate.RangeType */ Boolean = js.native
}

