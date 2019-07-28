package typings.smoothDashScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesScrollbarMod {
  type AddTransformableMomentumCallback = js.ThisFunction1[/* this */ Scrollbar, /* willScroll */ Boolean, Unit]
  type ScrollListener = js.ThisFunction1[/* this */ Scrollbar, /* status */ ScrollStatus, Unit]
}
