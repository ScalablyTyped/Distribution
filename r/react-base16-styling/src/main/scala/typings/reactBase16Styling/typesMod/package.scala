package typings.reactBase16Styling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type StylingFunction = js.Function2[
    /* keys */ js.UndefOr[
      java.lang.String | typings.reactBase16Styling.reactBase16StylingBooleans.`false` | (js.Array[
        js.UndefOr[java.lang.String | typings.reactBase16Styling.reactBase16StylingBooleans.`false`]
      ])
    ], 
    /* repeated */ js.Any, 
    typings.reactBase16Styling.typesMod.Styling
  ]
  
  type StylingValue = java.lang.String | (typings.csstype.mod.Properties[java.lang.String | scala.Double]) | typings.reactBase16Styling.typesMod.StylingValueFunction
  
  type StylingValueFunction = js.Function2[
    /* styling */ typings.reactBase16Styling.typesMod.Styling, 
    /* repeated */ js.Any, 
    typings.reactBase16Styling.anon.PartialStyling
  ]
  
  type Theme = java.lang.String | typings.base16.mod.Base16Theme | typings.reactBase16Styling.typesMod.StylingConfig
}
