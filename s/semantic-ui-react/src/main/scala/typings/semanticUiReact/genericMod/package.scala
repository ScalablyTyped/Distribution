package typings.semanticUiReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object genericMod {
  type SemanticShorthandCollection[TProps] = js.Array[typings.semanticUiReact.genericMod.SemanticShorthandItem[TProps]]
  type SemanticShorthandContent = typings.react.mod.ReactNode
  type SemanticShorthandItem[TProps] = typings.react.mod.ReactNode | TProps | typings.semanticUiReact.genericMod.SemanticShorthandItemFunc[TProps]
  type SemanticShorthandItemFunc[TProps] = js.Function3[
    /* component */ typings.react.mod.ReactType[TProps], 
    /* props */ TProps, 
    /* children */ js.UndefOr[typings.react.mod.ReactNode | typings.react.mod.ReactNodeArray], 
    typings.react.mod.ReactElement | scala.Null
  ]
}
