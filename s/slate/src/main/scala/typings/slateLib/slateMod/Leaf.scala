package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Leaf")
@js.native
class Leaf () extends js.Object {
  var marks: immutableLib.immutableMod.Set[Mark] | scala.Null = js.native
  var `object`: slateLib.slateLibStrings.leaf = js.native
  var text: java.lang.String = js.native
  def addMark(mark: Mark): Leaf = js.native
  def addMarks(marks: immutableLib.immutableMod.Set[Mark]): Leaf = js.native
  def removeMark(mark: Mark): Leaf = js.native
  def toJSON(): LeafProperties = js.native
  def updateMark(mark: Mark, newMark: Mark): Leaf = js.native
}

/* static members */
@JSImport("slate", "Leaf")
@js.native
object Leaf extends js.Object {
  def create(properties: slateLib.slateMod.LeafProperties): slateLib.slateMod.Leaf = js.native
  def createLeaves(leaves: immutableLib.immutableMod.List[slateLib.slateMod.Leaf]): immutableLib.immutableMod.List[slateLib.slateMod.Leaf] = js.native
  def createList(): immutableLib.immutableMod.List[slateLib.slateMod.Leaf] = js.native
  def createList(attrs: immutableLib.immutableMod.List[slateLib.slateMod.Leaf | slateLib.slateMod.LeafProperties]): immutableLib.immutableMod.List[slateLib.slateMod.Leaf] = js.native
  def createList(attrs: js.Array[slateLib.slateMod.Leaf | slateLib.slateMod.LeafProperties]): immutableLib.immutableMod.List[slateLib.slateMod.Leaf] = js.native
  def fromJS(properties: slateLib.slateMod.LeafJSON): slateLib.slateMod.Leaf = js.native
  def fromJSON(properties: slateLib.slateMod.LeafJSON): slateLib.slateMod.Leaf = js.native
  def isLeaf(maybeLeaf: js.Any): /* is slate.slate.Leaf */ scala.Boolean = js.native
  def isLeafList(maybeLeafList: js.Any): /* is immutable.immutable.List<slate.slate.Leaf> */ scala.Boolean = js.native
  def splitLeaves(leaves: immutableLib.immutableMod.List[slateLib.slateMod.Leaf], offset: scala.Double): js.Array[immutableLib.immutableMod.List[slateLib.slateMod.Leaf]] = js.native
}

