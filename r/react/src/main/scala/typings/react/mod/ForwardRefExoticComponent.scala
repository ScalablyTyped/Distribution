package typings.react.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// will show `ForwardRef(${Component.displayName || Component.name})` in devtools by default,
// but can be given its own specific name
@js.native
trait ForwardRefExoticComponent[P] extends NamedExoticComponent[P] {
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
}

