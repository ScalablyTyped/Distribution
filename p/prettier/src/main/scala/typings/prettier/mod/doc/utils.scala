package typings.prettier.mod.doc

import typings.prettier.mod.Doc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "doc.utils")
@js.native
object utils extends js.Object {
  def isEmpty(doc: Doc_): Boolean = js.native
  def isLineNext(doc: Doc_): Boolean = js.native
  def mapDoc[T](doc: Doc_, callback: js.Function1[/* doc */ Doc_, T]): T = js.native
  def propagateBreaks(doc: Doc_): Unit = js.native
  def removeLines(doc: Doc_): Doc_ = js.native
  def stripTrailingHardline(doc: Doc_): Doc_ = js.native
  def traverseDoc(doc: Doc_): Unit = js.native
  def traverseDoc(doc: Doc_, onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean]): Unit = js.native
  def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc_, Unit]
  ): Unit = js.native
  def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc_, Unit],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = js.native
  def willBreak(doc: Doc_): Boolean = js.native
}

