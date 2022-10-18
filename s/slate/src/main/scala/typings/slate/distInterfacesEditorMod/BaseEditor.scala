package typings.slate.distInterfacesEditorMod

import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesNodeMod.Descendant
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesNodeMod.NodeEntry
import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesTypesMod.TextDirection
import typings.slate.distInterfacesTypesMod.TextUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseEditor extends StObject {
  
  def addMark(key: String, value: Any): Unit = js.native
  
  @JSName("apply")
  def apply(operation: Operation): Unit = js.native
  
  var children: js.Array[Descendant] = js.native
  
  def deleteBackward(unit: TextUnit): Unit = js.native
  
  def deleteForward(unit: TextUnit): Unit = js.native
  
  def deleteFragment(): Unit = js.native
  def deleteFragment(direction: TextDirection): Unit = js.native
  
  def getDirtyPaths(op: Operation): js.Array[Path] = js.native
  
  def getFragment(): js.Array[Descendant] = js.native
  
  def insertBreak(): Unit = js.native
  
  def insertFragment(fragment: js.Array[Node]): Unit = js.native
  
  def insertNode(node: Node): Unit = js.native
  
  def insertSoftBreak(): Unit = js.native
  
  def insertText(text: String): Unit = js.native
  
  def isInline(element: Element): Boolean = js.native
  
  def isVoid(element: Element): Boolean = js.native
  
  var marks: EditorMarks | Null = js.native
  
  def normalizeNode(entry: NodeEntry[Node]): Unit = js.native
  
  def onChange(): Unit = js.native
  
  var operations: js.Array[Operation] = js.native
  
  def removeMark(key: String): Unit = js.native
  
  var selection: Selection = js.native
}
