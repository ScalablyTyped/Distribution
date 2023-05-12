package typings.semanticUiReact.distCommonjsGenericMod

import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.anon.Children
import typings.semanticUiReact.semanticUiReactStrings.children
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type SemanticShorthandCollection[TProps /* <: Record[String, Any] */] = js.Array[SemanticShorthandItem[TProps]]

type SemanticShorthandContent = ReactNode

type SemanticShorthandItem[TProps /* <: Record[String, Any] */] = ReactNode | SemanticShorthandItemFunc[TProps] | ((Omit[TProps, children]) & Children[TProps])

type SemanticShorthandItemFunc[TProps] = js.Function3[
/* component */ ElementType[TProps], 
/* props */ TProps, 
/* children */ js.UndefOr[ReactNode | ReactNodeArray], 
ReactElement | Null]

type ShorthandRenderFunction[C /* <: ElementType[Any] */, P] = js.Function2[/* Component */ C, /* props */ P, ReactNode]
