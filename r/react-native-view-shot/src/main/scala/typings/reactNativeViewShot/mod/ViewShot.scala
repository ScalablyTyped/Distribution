package typings.reactNativeViewShot.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewShot
  extends Component[ViewShotProperties, js.Object, js.Any] {
  var capture: js.UndefOr[js.Function0[js.Promise[String]]] = js.native
}

