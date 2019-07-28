package typings.slate.slateMod

import typings.immutable.immutableMod.List
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
  var focus: Point = js.native
  var mark: Mark | Null = js.native
  var `object`: decoration = js.native
  def setProperties(properties: Decoration): Decoration = js.native
  def setProperties(properties: DecorationProperties): Decoration = js.native
}

/* static members */
@JSImport("slate", "Decoration")
@js.native
object Decoration extends js.Object {
  def create(properties: DecorationProperties): Decoration = js.native
  def create(properties: Range): Decoration = js.native
  def createList(): List[Decoration] = js.native
  def createList(elements: js.Array[Decoration | DecorationProperties]): List[Decoration] = js.native
  def createList(elements: List[Decoration | DecorationProperties]): List[Decoration] = js.native
  def createProperties(attrs: String): DecorationProperties = js.native
  def createProperties(attrs: Decoration): DecorationProperties = js.native
  def createProperties(attrs: DecorationProperties): DecorationProperties = js.native
  def fromJS(properties: DecorationJSON): Decoration = js.native
  def fromJSON(properties: DecorationJSON): Decoration = js.native
  def isDecoration(maybeDecoration: js.Any): /* is slate.slate.Decoration */ Boolean = js.native
}

