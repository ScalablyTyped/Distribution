package typings.reactOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HTMLAttributes[K /* <: java.lang.String */] = typings.std.Partial[typings.std.Pick[typings.react.mod.HTMLAttributes[js.Object], K]]
  type InputHTMLAttributes[K /* <: java.lang.String */] = typings.std.Partial[typings.std.Pick[typings.react.mod.InputHTMLAttributes[js.Object], K]]
  /* Rewritten from type alias, can be one of: 
    - typings.reactOnsenui.reactOnsenuiStrings.slide
    - typings.reactOnsenui.reactOnsenuiStrings.lift
    - typings.reactOnsenui.reactOnsenuiStrings.fade
    - typings.reactOnsenui.reactOnsenuiStrings.none
    - java.lang.String
  */
  type NavigatorAnimationTypes = typings.reactOnsenui.mod._NavigatorAnimationTypes | java.lang.String
}
