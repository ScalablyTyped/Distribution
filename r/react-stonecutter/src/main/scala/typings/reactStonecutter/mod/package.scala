package typings.reactStonecutter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AngleUnit = typings.reactStonecutter.reactStonecutterStrings.deg
  
  type Coordinates = js.Tuple2[scala.Double, scala.Double]
  
  type Easing = java.lang.String
  
  type LayoutFunction = js.Function2[
    /* itemProps */ js.Array[js.Any], 
    /* gridProps */ js.Array[js.Any], 
    typings.reactStonecutter.mod.Layout_
  ]
}
