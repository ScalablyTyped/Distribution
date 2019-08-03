package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.slate.Anon_Mark
import typings.slate.slateStrings.decoration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Decoration")
@js.native
class Decoration ()
  extends BaseRange
     with RangeType {
  var anchor: Point = js.native
  var data: Data = js.native
  var focus: Point = js.native
  var `object`: decoration = js.native
  var `type`: String = js.native
}

/* static members */
@JSImport("slate", "Decoration")
@js.native
object Decoration extends js.Object {
  def create(properties: RangeType): Decoration = js.native
  def create(properties: RangeTypeJSON): Decoration = js.native
  def create(properties: RangeTypeProperties): Decoration = js.native
  def createList(): List[Decoration] = js.native
  def createList(elements: js.Array[RangeTypeProperties | RangeTypeJSON | RangeType]): List[Decoration] = js.native
  def createList(elements: List[RangeTypeProperties | RangeTypeJSON | RangeType]): List[Decoration] = js.native
  def createProperties(attrs: RangeType): DecorationProperties = js.native
  def createProperties(attrs: RangeTypeJSON): DecorationProperties = js.native
  def createProperties(attrs: RangeTypeProperties): DecorationProperties = js.native
  def fromJSON(properties: DecorationJSON with Anon_Mark): Decoration = js.native
  def isDecoration(maybeDecoration: js.Any): /* is slate.slate.Decoration */ Boolean = js.native
}

