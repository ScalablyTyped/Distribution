package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionComponent[P] extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[stdLib.Partial[P]] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
  def apply(props: PropsWithChildren[P]): ReactElement | scala.Null = js.native
  def apply(props: PropsWithChildren[P], context: js.Any): ReactElement | scala.Null = js.native
}

