package typings
package reactDashMosaicDashComponentLib.libContextTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicContext[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends js.Object {
  var mosaicActions: MosaicRootActions[T]
  var mosaicId: java.lang.String
}

@JSImport("react-mosaic-component/lib/contextTypes", "MosaicContext")
@js.native
object MosaicContext extends js.Object {
  var mosaicActions: propDashTypesLib.propDashTypesMod.Validator[
    propDashTypesLib.propDashTypesMod.InferProps[reactDashMosaicDashComponentLib.Anon_Args]
  ] = js.native
  var mosaicId: propDashTypesLib.propDashTypesMod.Validator[java.lang.String] = js.native
}

