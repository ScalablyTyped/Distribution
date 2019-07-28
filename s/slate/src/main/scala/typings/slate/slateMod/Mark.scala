package typings.slate.slateMod

import typings.immutable.immutableMod.Map
import typings.immutable.immutableMod.Set
import typings.slate.slateStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Mark")
@js.native
class Mark () extends js.Object {
  var data: Map[String, _] = js.native
  var `object`: mark = js.native
  var `type`: String = js.native
  def toJSON(): MarkProperties = js.native
}

/* static members */
@JSImport("slate", "Mark")
@js.native
object Mark extends js.Object {
  def create(properties: String): Mark = js.native
  def create(properties: Mark): Mark = js.native
  def create(properties: MarkProperties): Mark = js.native
  def createSet(array: js.Array[Mark | MarkProperties | String]): Set[Mark] = js.native
  def fromJS(properties: Mark): Mark = js.native
  def fromJS(properties: MarkJSON): Mark = js.native
  def fromJSON(properties: Mark): Mark = js.native
  def fromJSON(properties: MarkJSON): Mark = js.native
  def isMark(maybeMark: js.Any): /* is slate.slate.Mark */ Boolean = js.native
}

