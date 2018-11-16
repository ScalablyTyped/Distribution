package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately, we have no way of declaring that the component constructor must implement this

trait StaticLifecycle[P, S] extends js.Object {
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[P, S]] = js.undefined
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[P, S]] = js.undefined
}

