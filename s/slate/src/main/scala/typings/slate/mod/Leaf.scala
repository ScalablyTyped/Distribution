package typings.slate.mod

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set_
import typings.slate.slateStrings.leaf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : Immutable.Record(object) * / any */ @JSImport("slate", "Leaf")
@js.native
class Leaf () extends js.Object {
  var marks: Set_[Mark] | Null = js.native
  var `object`: leaf = js.native
  var text: String = js.native
  def addMark(mark: Mark): Leaf = js.native
  def addMarks(marks: Set_[Mark]): Leaf = js.native
  def insertText(offset: Double, string: String): Leaf = js.native
  def removeMark(mark: Mark): Leaf = js.native
  def toJS(): LeafJSON = js.native
  def toJSON(): LeafJSON = js.native
  def updateMark(mark: Mark, newMark: Mark): Leaf = js.native
}

/* static members */
@JSImport("slate", "Leaf")
@js.native
object Leaf extends js.Object {
  def create(properties: Leaf): Leaf = js.native
  def create(properties: LeafJSON): Leaf = js.native
  def create(properties: LeafProperties): Leaf = js.native
  def createLeaves(leaves: List[Leaf]): List[Leaf] = js.native
  def createList(): List[Leaf] = js.native
  def createList(attrs: js.Array[LeafProperties | LeafJSON | Leaf]): List[Leaf] = js.native
  def createList(attrs: List[LeafProperties | LeafJSON | Leaf]): List[Leaf] = js.native
  def fromJS(properties: LeafJSON): Leaf = js.native
  def fromJS(properties: LeafProperties): Leaf = js.native
  def fromJSON(properties: LeafJSON): Leaf = js.native
  def fromJSON(properties: LeafProperties): Leaf = js.native
  def isLeaf(maybeLeaf: js.Any): /* is slate.slate.Leaf */ Boolean = js.native
  def isLeafList(maybeLeafList: js.Any): /* is immutable.Immutable.List<slate.slate.Leaf> */ Boolean = js.native
  def splitLeaves(leaves: List[Leaf], offset: Double): js.Array[List[Leaf]] = js.native
}

