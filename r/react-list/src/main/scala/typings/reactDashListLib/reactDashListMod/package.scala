package typings
package reactDashListLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashListMod {
  type ItemRenderer = js.Function2[
    /* index */ scala.Double, 
    /* key */ scala.Double | java.lang.String, 
    reactLib.reactMod.Global.JSXNs.Element
  ]
  type ItemSizeEstimator = js.Function2[/* index */ scala.Double, /* cache */ js.Object, scala.Double]
  type ItemSizeGetter = js.Function1[/* index */ scala.Double, scala.Double]
  type ItemsRenderer = js.Function2[
    /* items */ js.Array[reactLib.reactMod.Global.JSXNs.Element], 
    /* ref */ java.lang.String, 
    reactLib.reactMod.Global.JSXNs.Element
  ]
  type ScrollParentGetter = js.Function0[reactLib.reactMod.Global.JSXNs.Element]
}
