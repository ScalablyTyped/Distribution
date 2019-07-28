package typings.reactDashOnsenui

import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashOnsenuiMod {
  type HTMLAttributes[K /* <: String */] = Partial[Pick[typings.react.reactMod.HTMLAttributes[js.Object], K]]
  type InputHTMLAttributes[K /* <: String */] = Partial[Pick[typings.react.reactMod.InputHTMLAttributes[js.Object], K]]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashOnsenui.reactDashOnsenuiStrings.slide
    - typings.reactDashOnsenui.reactDashOnsenuiStrings.lift
    - typings.reactDashOnsenui.reactDashOnsenuiStrings.fade
    - typings.reactDashOnsenui.reactDashOnsenuiStrings.none
    - java.lang.String
  */
  type NavigatorAnimationTypes = _NavigatorAnimationTypes | String
}
