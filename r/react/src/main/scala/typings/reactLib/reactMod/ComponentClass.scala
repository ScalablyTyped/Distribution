package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentClass[P, S]
  extends StaticLifecycle[P, S]
     with org.scalablytyped.runtime.Instantiable1[/* props */ P, Component[P, S, js.Any]]
     with org.scalablytyped.runtime.Instantiable2[/* props */ P, /* context */ js.Any, Component[P, S, js.Any]] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[stdLib.Partial[P]] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
}

