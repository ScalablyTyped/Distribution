package typings.slateReact

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Ancestor
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesRangeRefMod.RangeRef
import typings.slate.distInterfacesTextMod.Text
import typings.slateReact.distHooksAndroidInputManagerAndroidInputManagerMod.Action
import typings.slateReact.distPluginReactEditorMod.ReactEditor
import typings.slateReact.distUtilsDiffTextMod.TextDiff
import typings.slateReact.distUtilsDomMod.global.Window
import typings.slateReact.distUtilsKeyMod.Key
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsWeakMapsMod {
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_ELEMENT")
  @js.native
  val EDITOR_TO_ELEMENT: WeakMap[Editor, HTMLElement] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_FORCE_RENDER")
  @js.native
  val EDITOR_TO_FORCE_RENDER: WeakMap[Editor, js.Function0[Unit]] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_KEY_TO_ELEMENT")
  @js.native
  val EDITOR_TO_KEY_TO_ELEMENT: WeakMap[Editor, WeakMap[Key, HTMLElement]] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_ON_CHANGE")
  @js.native
  val EDITOR_TO_ON_CHANGE: WeakMap[ReactEditor, js.Function0[Unit]] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_PENDING_ACTION")
  @js.native
  val EDITOR_TO_PENDING_ACTION: WeakMap[Editor, Action | Null] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_PENDING_DIFFS")
  @js.native
  val EDITOR_TO_PENDING_DIFFS: WeakMap[Editor, js.Array[TextDiff]] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_PENDING_INSERTION_MARKS")
  @js.native
  val EDITOR_TO_PENDING_INSERTION_MARKS: WeakMap[Editor, Partial[Text] | Null] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_PENDING_SELECTION")
  @js.native
  val EDITOR_TO_PENDING_SELECTION: WeakMap[Editor, Range | Null] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_PLACEHOLDER")
  @js.native
  val EDITOR_TO_PLACEHOLDER: WeakMap[Editor, String] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_PLACEHOLDER_ELEMENT")
  @js.native
  val EDITOR_TO_PLACEHOLDER_ELEMENT: WeakMap[Editor, HTMLElement] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_SCHEDULE_FLUSH")
  @js.native
  val EDITOR_TO_SCHEDULE_FLUSH: WeakMap[Editor, js.Function0[Unit]] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_USER_MARKS")
  @js.native
  val EDITOR_TO_USER_MARKS: WeakMap[Editor, Partial[Text] | Null] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_USER_SELECTION")
  @js.native
  val EDITOR_TO_USER_SELECTION: WeakMap[Editor, RangeRef | Null] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "EDITOR_TO_WINDOW")
  @js.native
  val EDITOR_TO_WINDOW: WeakMap[Editor, Window] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "ELEMENT_TO_NODE")
  @js.native
  val ELEMENT_TO_NODE: WeakMap[HTMLElement, Node] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "IS_CLICKING")
  @js.native
  val IS_CLICKING: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "IS_COMPOSING")
  @js.native
  val IS_COMPOSING: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "IS_DRAGGING")
  @js.native
  val IS_DRAGGING: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "IS_FOCUSED")
  @js.native
  val IS_FOCUSED: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "MARK_PLACEHOLDER_SYMBOL")
  @js.native
  val MARK_PLACEHOLDER_SYMBOL: String = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "NODE_TO_ELEMENT")
  @js.native
  val NODE_TO_ELEMENT: WeakMap[Node, HTMLElement] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "NODE_TO_INDEX")
  @js.native
  val NODE_TO_INDEX: WeakMap[Node, Double] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "NODE_TO_KEY")
  @js.native
  val NODE_TO_KEY: WeakMap[Node, Key] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "NODE_TO_PARENT")
  @js.native
  val NODE_TO_PARENT: WeakMap[Node, Ancestor] = js.native
  
  @JSImport("slate-react/dist/utils/weak-maps", "PLACEHOLDER_SYMBOL")
  @js.native
  val PLACEHOLDER_SYMBOL: String = js.native
}
