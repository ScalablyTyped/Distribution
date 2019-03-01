package typings
package semanticDashUiDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcGenericMod {
  type SemanticShorthandCollection[TProps] = js.Array[SemanticShorthandItem[TProps]]
  type SemanticShorthandContent = reactLib.reactMod.ReactNs.ReactNode
  type SemanticShorthandItem[TProps] = reactLib.reactMod.ReactNs.ReactNode | TProps | SemanticShorthandItemFunc[TProps]
  type SemanticShorthandItemFunc[TProps] = js.Function3[
    /* component */ reactLib.reactMod.ReactNs.ReactType[TProps], 
    /* props */ TProps, 
    /* children */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | reactLib.reactMod.ReactNs.ReactNodeArray], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
  ]
}
