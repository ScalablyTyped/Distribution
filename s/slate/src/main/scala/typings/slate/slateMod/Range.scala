package typings.slate.slateMod

import typings.immutable.immutableMod.List
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
  var `object`: range = js.native
}

/* static members */
@JSImport("slate", "Range")
@js.native
object Range extends js.Object {
  def create(properties: Range): Range = js.native
  def create(properties: RangeProperties): Range = js.native
  def createList(): List[Range] = js.native
  def createList(elements: js.Array[Range | RangeProperties]): List[Range] = js.native
  def createList(elements: List[Range | RangeProperties]): List[Range] = js.native
  def createProperties(attrs: String): RangeProperties = js.native
  def createProperties(attrs: Range): RangeProperties = js.native
  def createProperties(attrs: RangeProperties): RangeProperties = js.native
  def fromJS(properties: RangeJSON): Range = js.native
  def fromJSON(properties: RangeJSON): Range = js.native
  def isRange(maybeRange: js.Any): /* is slate.slate.Range */ Boolean = js.native
}

