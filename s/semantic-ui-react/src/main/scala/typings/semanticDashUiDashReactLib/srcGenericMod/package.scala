package typings
package semanticDashUiDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcGenericMod {
  type SemanticShorthandCollection[TProps] = js.Array[SemanticShorthandItem[TProps]]
  type SemanticShorthandContent = reactLib.reactMod.ReactNode
  type SemanticShorthandItem[TProps] = reactLib.reactMod.ReactNode | TProps | SemanticShorthandItemFunc[TProps]
  type SemanticShorthandItemFunc[TProps] = js.Function3[
    /* component */ reactLib.reactMod.ReactType[TProps], 
    /* props */ TProps, 
    /* children */ js.UndefOr[reactLib.reactMod.ReactNode | reactLib.reactMod.ReactNodeArray], 
    reactLib.reactMod.ReactElement | scala.Null
  ]
}
