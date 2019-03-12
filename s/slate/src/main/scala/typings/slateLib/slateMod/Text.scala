package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Text")
@js.native
class Text () extends _Node {
  var key: java.lang.String = js.native
  var `object`: slateLib.slateLibStrings.text = js.native
  val text: java.lang.String = js.native
  def addMark(index: scala.Double, length: scala.Double, mark: Mark): Text = js.native
  def addMarks(index: scala.Double, lenght: scala.Double, marks: immutableLib.immutableMod.Set[Mark]): Text = js.native
  def getActiveMarks(): immutableLib.immutableMod.Set[Mark] = js.native
  def getActiveMarksBetweenOffsets(startOffset: scala.Double, endOffset: scala.Double): immutableLib.immutableMod.Set[Mark] = js.native
  def getFirstText(): Text = js.native
  def getKeysToPathsTable(): js.Object = js.native
  def getLastText(): Text = js.native
  def getLeaves(): immutableLib.immutableMod.List[Leaf] = js.native
  def getLeaves(decorations: js.Array[Range]): immutableLib.immutableMod.List[Leaf] = js.native
  def getMarks(): immutableLib.immutableMod.OrderedSet[Mark] = js.native
  def getMarksAsArray(): js.Array[Mark] = js.native
  def getMarksAtIndex(index: scala.Double): immutableLib.immutableMod.OrderedSet[Mark] = js.native
  def getMarksBetweenOffsets(startOffset: scala.Double, endOffset: scala.Double): immutableLib.immutableMod.Set[Mark] = js.native
  def getNode(key: java.lang.String): Node | scala.Null = js.native
  def getPath(key: java.lang.String): Path = js.native
  def getPath(key: Path): Path = js.native
  def getString(): java.lang.String = js.native
  def getText(): java.lang.String = js.native
  def hasNode(key: java.lang.String): scala.Boolean = js.native
  def insertText(offset: scala.Double, text: java.lang.String): Text = js.native
  def insertText(offset: scala.Double, text: java.lang.String, marks: immutableLib.immutableMod.Set[Mark]): Text = js.native
  def mergeText(text: Text): Text = js.native
  def regenerateKey(): Text = js.native
  def removeMark(index: scala.Double, length: Mark, mark: Mark): Text = js.native
  def removeText(start: scala.Double, length: scala.Double): Text = js.native
  def resolvePath(path: Path, index: scala.Double): immutableLib.immutableMod.List[java.lang.String] = js.native
  def searchLeafAtOffset(offset: scala.Double): LeafAndOffset = js.native
  def setLeaves(leaves: immutableLib.immutableMod.List[Leaf]): Text = js.native
  def splitText(offset: scala.Double): js.Array[Text] = js.native
  def toJSON(): TextJSON = js.native
  def updateMark(index: scala.Double, length: scala.Double, mark: Mark, properties: MarkProperties): Text = js.native
}

/* static members */
@JSImport("slate", "Text")
@js.native
object Text extends js.Object {
  def create(properties: java.lang.String): slateLib.slateMod.Text = js.native
  def create(properties: slateLib.slateMod.Text): slateLib.slateMod.Text = js.native
  def create(properties: slateLib.slateMod.TextProperties): slateLib.slateMod.Text = js.native
  def createList(): immutableLib.immutableMod.List[slateLib.slateMod.Text] = js.native
  def createList(
    elements: immutableLib.immutableMod.List[slateLib.slateMod.Text | slateLib.slateMod.TextProperties]
  ): immutableLib.immutableMod.List[slateLib.slateMod.Text] = js.native
  def createList(elements: js.Array[slateLib.slateMod.Text | slateLib.slateMod.TextProperties]): immutableLib.immutableMod.List[slateLib.slateMod.Text] = js.native
  def fromJS(properties: slateLib.slateMod.Text): slateLib.slateMod.Text = js.native
  def fromJS(properties: slateLib.slateMod.TextJSON): slateLib.slateMod.Text = js.native
  def fromJSON(properties: slateLib.slateMod.Text): slateLib.slateMod.Text = js.native
  def fromJSON(properties: slateLib.slateMod.TextJSON): slateLib.slateMod.Text = js.native
  def isText(maybeText: js.Any): /* is slate.slate.Text */ scala.Boolean = js.native
}

