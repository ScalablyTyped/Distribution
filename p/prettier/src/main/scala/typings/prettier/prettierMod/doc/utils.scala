package typings.prettier.prettierMod.doc

import typings.prettier.prettierMod.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "doc.utils")
@js.native
object utils extends js.Object {
  def isEmpty(doc: Doc): Boolean = js.native
  def isLineNext(doc: Doc): Boolean = js.native
  def mapDoc[T](doc: Doc, callback: js.Function1[/* doc */ Doc, T]): T = js.native
  def propagateBreaks(doc: Doc): Unit = js.native
  def removeLines(doc: Doc): Doc = js.native
  def stripTrailingHardline(doc: Doc): Doc = js.native
  def traverseDoc(doc: Doc): Unit = js.native
  def traverseDoc(doc: Doc, onEnter: js.Function1[/* doc */ Doc, Unit | Boolean]): Unit = js.native
  def traverseDoc(
    doc: Doc,
    onEnter: js.Function1[/* doc */ Doc, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc, Unit]
  ): Unit = js.native
  def traverseDoc(
    doc: Doc,
    onEnter: js.Function1[/* doc */ Doc, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc, Unit],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = js.native
  def willBreak(doc: Doc): Boolean = js.native
}

