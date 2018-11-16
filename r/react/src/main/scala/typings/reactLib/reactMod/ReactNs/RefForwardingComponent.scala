package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefForwardingComponent[T, P] extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[stdLib.Partial[P]] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  var propTypes: js.UndefOr[ValidationMap[P]] = js.native
  def apply(props: P with reactLib.Anon_Children): ReactElement[_] | scala.Null = js.native
  def apply(props: P with reactLib.Anon_Children, ref: Ref[T]): ReactElement[_] | scala.Null = js.native
}

