package typings.reactDashList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashListMod {
  import typings.react.reactMod.Global.JSXNs.Element

  type ItemRenderer = js.Function2[/* index */ Double, /* key */ Double | String, Element]
  type ItemSizeEstimator = js.Function2[/* index */ Double, /* cache */ js.Object, Double]
  type ItemSizeGetter = js.Function1[/* index */ Double, Double]
  type ItemsRenderer = js.Function2[/* items */ js.Array[Element], /* ref */ String, Element]
  type ScrollParentGetter = js.Function0[Element]
}
