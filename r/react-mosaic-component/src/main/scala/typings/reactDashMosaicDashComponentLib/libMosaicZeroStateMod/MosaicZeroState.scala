package typings
package reactDashMosaicDashComponentLib.libMosaicZeroStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/MosaicZeroState", "MosaicZeroState")
@js.native
class MosaicZeroState[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] ()
  extends reactLib.reactMod.PureComponent[MosaicZeroStateProps[T], js.Object, js.Any] {
  @JSName("context")
  var context_MosaicZeroState: reactDashMosaicDashComponentLib.libContextTypesMod.MosaicContext[T] = js.native
  var replace: js.Any = js.native
}

/* static members */
@JSImport("react-mosaic-component/lib/MosaicZeroState", "MosaicZeroState")
@js.native
object MosaicZeroState extends js.Object {
  var contextType: reactLib.reactMod.Context[
    reactDashMosaicDashComponentLib.libContextTypesMod.MosaicContext[java.lang.String | scala.Double]
  ] = js.native
}

