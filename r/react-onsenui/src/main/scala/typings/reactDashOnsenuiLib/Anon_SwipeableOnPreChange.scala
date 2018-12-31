package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SwipeableOnPreChange extends js.Object {
  var animation: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.none | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.slide
  ] = js.undefined
  var animationOptions: js.UndefOr[reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions] = js.undefined
  var ignoreEdgeWidth: js.UndefOr[scala.Double] = js.undefined
  var index: scala.Double
  var onPostChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPreChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onReactive: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipe: js.UndefOr[
    js.Function2[
      /* index */ scala.Double, 
      /* animationOptions */ reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions, 
      scala.Unit
    ]
  ] = js.undefined
  var position: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.bottom | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.top | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.auto
  ] = js.undefined
  var swipeable: js.UndefOr[scala.Boolean] = js.undefined
  var tabBorder: js.UndefOr[scala.Boolean] = js.undefined
  def renderTabs(): js.Array[reactDashOnsenuiLib.reactDashOnsenuiMod.TabbarRenderTab]
}

