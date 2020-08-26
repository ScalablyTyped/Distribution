package typings.reactAce.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typings.aceBuilds.anon.PartialEditorOptions
import typings.aceBuilds.mod.Ace.Config
import typings.aceBuilds.mod.Ace.Document
import typings.aceBuilds.mod.Ace.EditSession
import typings.aceBuilds.mod.Ace.Editor
import typings.aceBuilds.mod.Ace.SyntaxMode
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAceBuilds extends js.Object {
  val Ace: TypeofAce = js.native
  var EditSession: (Instantiable1[/* text */ String, typings.aceBuilds.mod.EditSession]) with InstantiableEditSession = js.native
  var Range: (Instantiable4[
    /* startRow */ Double, 
    /* startColumn */ Double, 
    /* endRow */ Double, 
    /* endColumn */ Double, 
    typings.aceBuilds.mod.Range
  ]) with ComparePoints = js.native
  var UndoManager: Instantiable0[typings.aceBuilds.mod.UndoManager] with InstantiableUndoManager = js.native
  var VirtualRenderer: (Instantiable1[/* container */ HTMLElement, typings.aceBuilds.mod.VirtualRenderer]) with InstantiableVirtualRenderer = js.native
  val config: Config = js.native
  val version: String = js.native
  def createEditSession(text: String, mode: SyntaxMode): EditSession = js.native
  def createEditSession(text: Document, mode: SyntaxMode): EditSession = js.native
  def edit(el: String): Editor = js.native
  def edit(el: String, options: PartialEditorOptions): Editor = js.native
  def edit(el: Element): Editor = js.native
  def edit(el: Element, options: PartialEditorOptions): Editor = js.native
  def require(name: String): js.Any = js.native
}

