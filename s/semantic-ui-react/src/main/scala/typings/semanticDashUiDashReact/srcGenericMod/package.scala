package typings.semanticDashUiDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcGenericMod {
  import typings.react.reactMod.ReactElement
  import typings.react.reactMod.ReactNode
  import typings.react.reactMod.ReactNodeArray
  import typings.react.reactMod.ReactType

  type SemanticShorthandCollection[TProps] = js.Array[SemanticShorthandItem[TProps]]
  type SemanticShorthandContent = ReactNode
  type SemanticShorthandItem[TProps] = ReactNode | TProps | SemanticShorthandItemFunc[TProps]
  type SemanticShorthandItemFunc[TProps] = js.Function3[
    /* component */ ReactType[TProps], 
    /* props */ TProps, 
    /* children */ js.UndefOr[ReactNode | ReactNodeArray], 
    ReactElement | Null
  ]
}
