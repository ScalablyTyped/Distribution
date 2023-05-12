package typings.slate.distInterfacesEditorMod

import typings.slate.distInterfacesEditorMod.^
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesTextMod.Text
import typings.slate.distTypesCustomTypesMod.ExtendedType
import typings.slate.slateStrings.text_
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
