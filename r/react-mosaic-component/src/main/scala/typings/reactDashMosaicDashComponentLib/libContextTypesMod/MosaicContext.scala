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
  @JSName("mosaicActions")
  var mosaicActions_Original: propDashTypesLib.propDashTypesMod.Validator[
    propDashTypesLib.propDashTypesMod.InferProps[reactDashMosaicDashComponentLib.Anon_Args]
  ] = js.native
  @JSName("mosaicId")
  var mosaicId_Original: propDashTypesLib.propDashTypesMod.Validator[java.lang.String] = js.native
  def mosaicActions(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def mosaicId(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

