package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Set
import typings.slate.slateStrings.leaf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Leaf")
@js.native
class Leaf () extends js.Object {
  var marks: Set[Mark] | Null = js.native
  var `object`: leaf = js.native
  var text: String = js.native
  def addMark(mark: Mark): Leaf = js.native
  def addMarks(marks: Set[Mark]): Leaf = js.native
  def removeMark(mark: Mark): Leaf = js.native
  def toJSON(): LeafProperties = js.native
  def updateMark(mark: Mark, newMark: Mark): Leaf = js.native
}

/* static members */
@JSImport("slate", "Leaf")
@js.native
object Leaf extends js.Object {
  def create(properties: LeafProperties): Leaf = js.native
  def createLeaves(leaves: List[Leaf]): List[Leaf] = js.native
  def createList(): List[Leaf] = js.native
  def createList(attrs: js.Array[Leaf | LeafProperties]): List[Leaf] = js.native
  def createList(attrs: List[Leaf | LeafProperties]): List[Leaf] = js.native
  def fromJS(properties: LeafJSON): Leaf = js.native
  def fromJSON(properties: LeafJSON): Leaf = js.native
  def isLeaf(maybeLeaf: js.Any): /* is slate.slate.Leaf */ Boolean = js.native
  def isLeafList(maybeLeafList: js.Any): /* is immutable.immutable.List<slate.slate.Leaf> */ Boolean = js.native
  def splitLeaves(leaves: List[Leaf], offset: Double): js.Array[List[Leaf]] = js.native
}

