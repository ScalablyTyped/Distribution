package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Mark")
@js.native
class Mark () extends js.Object {
  var data: immutableLib.immutableMod.Map[java.lang.String, _] = js.native
  var `object`: slateLib.slateLibStrings.mark = js.native
  var `type`: java.lang.String = js.native
  def toJSON(): MarkProperties = js.native
}

/* static members */
@JSImport("slate", "Mark")
@js.native
object Mark extends js.Object {
  def create(properties: java.lang.String): slateLib.slateMod.Mark = js.native
  def create(properties: slateLib.slateMod.Mark): slateLib.slateMod.Mark = js.native
  def create(properties: slateLib.slateMod.MarkProperties): slateLib.slateMod.Mark = js.native
  def createSet(array: js.Array[slateLib.slateMod.Mark | slateLib.slateMod.MarkProperties | java.lang.String]): immutableLib.immutableMod.Set[slateLib.slateMod.Mark] = js.native
  def fromJS(properties: slateLib.slateMod.Mark): slateLib.slateMod.Mark = js.native
  def fromJS(properties: slateLib.slateMod.MarkJSON): slateLib.slateMod.Mark = js.native
  def fromJSON(properties: slateLib.slateMod.Mark): slateLib.slateMod.Mark = js.native
  def fromJSON(properties: slateLib.slateMod.MarkJSON): slateLib.slateMod.Mark = js.native
  def isMark(maybeMark: js.Any): /* is slate.slate.Mark */ scala.Boolean = js.native
}

