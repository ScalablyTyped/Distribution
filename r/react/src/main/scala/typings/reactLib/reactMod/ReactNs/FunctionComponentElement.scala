package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionComponentElement[P] extends ReactElement[P] {
  var ref: js.UndefOr[js.Any] = js.native
  @JSName("type")
  var type_Original: FunctionComponent[P] = js.native
  @JSName("type")
  def type_MFunctionComponentElement(props: P with reactLib.Anon_Children): ReactElement[_] | scala.Null = js.native
  @JSName("type")
  def type_MFunctionComponentElement(props: P with reactLib.Anon_Children, context: js.Any): ReactElement[_] | scala.Null = js.native
}

