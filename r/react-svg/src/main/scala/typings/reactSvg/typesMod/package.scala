package typings.reactSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Props = typings.reactSvg.typesMod.BaseProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.reactSvg.typesMod.WrapperType], 
    typings.reactSvg.typesMod.WrapperType
  ])
  
  type WrapperType = typings.std.HTMLSpanElement | typings.std.HTMLDivElement
}
