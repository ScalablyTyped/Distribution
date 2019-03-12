package typings
package slateLib.slateMod

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
  var mark: Mark | scala.Null = js.native
  var `object`: slateLib.slateLibStrings.decoration = js.native
  def setProperties(properties: Decoration): Decoration = js.native
  def setProperties(properties: DecorationProperties): Decoration = js.native
}

/* static members */
@JSImport("slate", "Decoration")
@js.native
object Decoration extends js.Object {
  def create(properties: slateLib.slateMod.DecorationProperties): slateLib.slateMod.Decoration = js.native
  def create(properties: slateLib.slateMod.Range): slateLib.slateMod.Decoration = js.native
  def createList(): immutableLib.immutableMod.List[slateLib.slateMod.Decoration] = js.native
  def createList(
    elements: immutableLib.immutableMod.List[slateLib.slateMod.Decoration | slateLib.slateMod.DecorationProperties]
  ): immutableLib.immutableMod.List[slateLib.slateMod.Decoration] = js.native
  def createList(elements: js.Array[slateLib.slateMod.Decoration | slateLib.slateMod.DecorationProperties]): immutableLib.immutableMod.List[slateLib.slateMod.Decoration] = js.native
  def createProperties(attrs: java.lang.String): slateLib.slateMod.DecorationProperties = js.native
  def createProperties(attrs: slateLib.slateMod.Decoration): slateLib.slateMod.DecorationProperties = js.native
  def createProperties(attrs: slateLib.slateMod.DecorationProperties): slateLib.slateMod.DecorationProperties = js.native
  def fromJS(properties: slateLib.slateMod.DecorationJSON): slateLib.slateMod.Decoration = js.native
  def fromJSON(properties: slateLib.slateMod.DecorationJSON): slateLib.slateMod.Decoration = js.native
  def isDecoration(maybeDecoration: js.Any): /* is slate.slate.Decoration */ scala.Boolean = js.native
}

