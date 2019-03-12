package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Range")
@js.native
class Range ()
  extends BaseRange
     with RangeType {
  var anchor: Point = js.native
  var `object`: slateLib.slateLibStrings.range = js.native
}

/* static members */
@JSImport("slate", "Range")
@js.native
object Range extends js.Object {
  def create(properties: slateLib.slateMod.Range): slateLib.slateMod.Range = js.native
  def create(properties: slateLib.slateMod.RangeProperties): slateLib.slateMod.Range = js.native
  def createList(): immutableLib.immutableMod.List[slateLib.slateMod.Range] = js.native
  def createList(
    elements: immutableLib.immutableMod.List[slateLib.slateMod.Range | slateLib.slateMod.RangeProperties]
  ): immutableLib.immutableMod.List[slateLib.slateMod.Range] = js.native
  def createList(elements: js.Array[slateLib.slateMod.Range | slateLib.slateMod.RangeProperties]): immutableLib.immutableMod.List[slateLib.slateMod.Range] = js.native
  def createProperties(attrs: java.lang.String): slateLib.slateMod.RangeProperties = js.native
  def createProperties(attrs: slateLib.slateMod.Range): slateLib.slateMod.RangeProperties = js.native
  def createProperties(attrs: slateLib.slateMod.RangeProperties): slateLib.slateMod.RangeProperties = js.native
  def fromJS(properties: slateLib.slateMod.RangeJSON): slateLib.slateMod.Range = js.native
  def fromJSON(properties: slateLib.slateMod.RangeJSON): slateLib.slateMod.Range = js.native
  def isRange(maybeRange: js.Any): /* is slate.slate.Range */ scala.Boolean = js.native
}

