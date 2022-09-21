package typings.slate.editorMod

import typings.slate.customTypesMod.ExtendedType
import typings.slate.editorMod.^
import typings.slate.nodeMod.Node
import typings.slate.pathMod.Path
import typings.slate.rangeMod.Range
import typings.slate.slateStrings.text_
import typings.slate.textMod.Text
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Editor: EditorInterface = ^.asInstanceOf[js.Dynamic].selectDynamic("Editor").asInstanceOf[EditorInterface]
type Editor = ExtendedType[typings.slate.slateStrings.Editor, BaseEditor]

type BaseSelection = Range | Null

type EditorMarks = Omit[Text, text_]

type NodeMatch[T /* <: Node */] = js.Function2[/* node */ Node, /* path */ Path, /* is T */ Boolean]

type PropsCompare = js.Function2[/* prop */ Partial[Node], /* node */ Partial[Node], Boolean]

type PropsMerge = js.Function2[/* prop */ Partial[Node], /* node */ Partial[Node], js.Object]

type Selection = ExtendedType[typings.slate.slateStrings.Selection, BaseSelection]
