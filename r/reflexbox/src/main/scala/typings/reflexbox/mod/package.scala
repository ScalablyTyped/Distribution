package typings.reflexbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoxType = typings.emotionStyledBase.mod.StyledComponent[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
      typings.std.HTMLDivElement
    ], 
    typings.emotionStyledBase.helperMod.Omit[
      (typings.react.mod.DetailedHTMLProps[
        typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
        typings.std.HTMLDivElement
      ]) with typings.reflexbox.mod.BoxProps, 
      java.lang.String
    ], 
    js.Object
  ]
}
