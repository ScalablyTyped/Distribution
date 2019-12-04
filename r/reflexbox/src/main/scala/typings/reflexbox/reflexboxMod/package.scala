package typings.reflexbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reflexboxMod {
  import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
  import typings.atEmotionStyledDashBase.typesHelperMod.Omit
  import typings.react.reactMod.DetailedHTMLProps
  import typings.react.reactMod.HTMLAttributes
  import typings.std.HTMLDivElement

  type BoxType = StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Omit[
      (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with BoxProps, 
      String
    ], 
    js.Object
  ]
}
