package typings
package reactDashMosaicDashComponentLib.libContextTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicWindowContext[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends MosaicContext[T] {
  var mosaicWindowActions: MosaicWindowActions
}

@JSImport("react-mosaic-component/lib/contextTypes", "MosaicWindowContext")
@js.native
object MosaicWindowContext extends js.Object {
  @JSName("mosaicActions")
  var mosaicActions_Original: propDashTypesLib.propDashTypesMod.Validator[
    propDashTypesLib.propDashTypesMod.InferProps[reactDashMosaicDashComponentLib.Anon_Args]
  ] = js.native
  @JSName("mosaicId")
  var mosaicId_Original: propDashTypesLib.propDashTypesMod.Validator[java.lang.String] = js.native
  @JSName("mosaicWindowActions")
  var mosaicWindowActions_Original: propDashTypesLib.propDashTypesMod.Validator[
    propDashTypesLib.propDashTypesMod.InferProps[reactDashMosaicDashComponentLib.Anon_ArgsConnectDragSource]
  ] = js.native
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
  def mosaicWindowActions(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

