package typings.reactList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ItemRenderer = js.Function2[
    /* index */ scala.Double, 
    /* key */ scala.Double | java.lang.String, 
    typings.react.mod.global.JSX.Element
  ]
  
  type ItemSizeEstimator = js.Function2[/* index */ scala.Double, /* cache */ js.Object, scala.Double]
  
  type ItemSizeGetter = js.Function1[/* index */ scala.Double, scala.Double]
  
  type ItemsRenderer = js.Function2[
    /* items */ js.Array[typings.react.mod.global.JSX.Element], 
    /* ref */ java.lang.String, 
    typings.react.mod.global.JSX.Element
  ]
  
  type ScrollParentGetter = js.Function0[typings.react.mod.global.JSX.Element]
}
