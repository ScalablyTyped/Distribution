package typings.prettier.mod.doc

import typings.prettier.mod.Doc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("prettier", "doc.utils.isEmpty")
  @js.native
  def isEmpty(doc: Doc_): Boolean = js.native
  
  @JSImport("prettier", "doc.utils.isLineNext")
  @js.native
  def isLineNext(doc: Doc_): Boolean = js.native
  
  @JSImport("prettier", "doc.utils.mapDoc")
  @js.native
  def mapDoc[T](doc: Doc_, callback: js.Function1[/* doc */ Doc_, T]): T = js.native
  
  @JSImport("prettier", "doc.utils.propagateBreaks")
  @js.native
  def propagateBreaks(doc: Doc_): Unit = js.native
  
  @JSImport("prettier", "doc.utils.removeLines")
  @js.native
  def removeLines(doc: Doc_): Doc_ = js.native
  
  @JSImport("prettier", "doc.utils.stripTrailingHardline")
  @js.native
  def stripTrailingHardline(doc: Doc_): Doc_ = js.native
  
  @JSImport("prettier", "doc.utils.traverseDoc")
  @js.native
  def traverseDoc(doc: Doc_): Unit = js.native
  @JSImport("prettier", "doc.utils.traverseDoc")
  @js.native
  def traverseDoc(
    doc: Doc_,
    onEnter: js.UndefOr[scala.Nothing],
    onExit: js.UndefOr[scala.Nothing],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = js.native
  @JSImport("prettier", "doc.utils.traverseDoc")
  @js.native
  def traverseDoc(doc: Doc_, onEnter: js.UndefOr[scala.Nothing], onExit: js.Function1[/* doc */ Doc_, Unit]): Unit = js.native
  @JSImport("prettier", "doc.utils.traverseDoc")
  @js.native
  def traverseDoc(
    doc: Doc_,
    onEnter: js.UndefOr[scala.Nothing],
    onExit: js.Function1[/* doc */ Doc_, Unit],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = js.native
  @JSImport("prettier", "doc.utils.traverseDoc")
  @js.native
  def traverseDoc(doc: Doc_, onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean]): Unit = js.native
  @JSImport("prettier", "doc.utils.traverseDoc")
  @js.native
  def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.UndefOr[scala.Nothing],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = js.native
  @JSImport("prettier", "doc.utils.traverseDoc")
  @js.native
  def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc_, Unit]
  ): Unit = js.native
  @JSImport("prettier", "doc.utils.traverseDoc")
  @js.native
  def traverseDoc(
    doc: Doc_,
    onEnter: js.Function1[/* doc */ Doc_, Unit | Boolean],
    onExit: js.Function1[/* doc */ Doc_, Unit],
    shouldTraverseConditionalGroups: Boolean
  ): Unit = js.native
  
  @JSImport("prettier", "doc.utils.willBreak")
  @js.native
  def willBreak(doc: Doc_): Boolean = js.native
}
