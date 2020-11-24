package typings.reflexbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BoxType = typings.emotionStyledBase.mod.StyledComponent[
    typings.react.mod.DetailedHTMLProps[
      typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
      typings.std.HTMLDivElement
    ], 
    typings.std.Omit[
      (typings.react.mod.DetailedHTMLProps[
        typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
        typings.std.HTMLDivElement
      ]) with typings.reflexbox.mod.BoxProps, 
      /* keyof react.react.ClassAttributes<any> */ typings.reflexbox.reflexboxStrings.ref | typings.reflexbox.reflexboxStrings.key
    ], 
    js.Object
  ]
}
