package typings
package reactDashFaLib.reactDashFaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// fake intermediate interface to remove typing on size, as the typing
// is overrided by react-fa

trait SizeOverrideHTMLProps[T]
  extends reactLib.reactMod.ReactNs.HTMLProps[T] {
  @JSName("size")
  var size_SizeOverrideHTMLProps: js.UndefOr[js.Any] = js.undefined
}

