package typings.semanticUiReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object genericMod {
  
  type SemanticShorthandCollection[TProps] = js.Array[typings.semanticUiReact.genericMod.SemanticShorthandItem[TProps]]
  
  type SemanticShorthandContent = typings.react.mod.ReactNode
  
  type SemanticShorthandItem[TProps /* <: typings.std.Record[java.lang.String, _] */] = typings.react.mod.ReactNode | typings.semanticUiReact.genericMod.SemanticShorthandItemFunc[TProps] | ((typings.std.Omit[TProps, typings.semanticUiReact.semanticUiReactStrings.children]) with typings.semanticUiReact.anon.`0`[TProps])
  
  type SemanticShorthandItemFunc[TProps] = js.Function3[
    /* component */ typings.react.mod.ElementType[TProps], 
    /* props */ TProps, 
    /* children */ js.UndefOr[typings.react.mod.ReactNode | typings.react.mod.ReactNodeArray], 
    typings.react.mod.ReactElement | scala.Null
  ]
  
  type ShorthandRenderFunction[C /* <: typings.react.mod.ElementType[_] */, P] = js.Function2[/* Component */ C, /* props */ P, typings.react.mod.ReactNode]
}
