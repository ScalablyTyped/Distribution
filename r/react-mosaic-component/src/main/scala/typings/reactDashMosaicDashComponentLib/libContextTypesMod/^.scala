package typings
package reactDashMosaicDashComponentLib.libContextTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/contextTypes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ModernMosaicContext: reactLib.reactMod.Context[MosaicContext[java.lang.String | scala.Double]] = js.native
  val ModernMosaicWindowContext: reactLib.reactMod.Context[
    stdLib.Pick[
      MosaicWindowContext[java.lang.String | scala.Double], 
      reactDashMosaicDashComponentLib.reactDashMosaicDashComponentLibStrings.mosaicWindowActions
    ]
  ] = js.native
  val MosaicActionsPropType: propDashTypesLib.propDashTypesMod.Validator[
    propDashTypesLib.propDashTypesMod.InferProps[reactDashMosaicDashComponentLib.Anon_Args]
  ] = js.native
  val MosaicWindowActionsPropType: propDashTypesLib.propDashTypesMod.Validator[
    propDashTypesLib.propDashTypesMod.InferProps[reactDashMosaicDashComponentLib.Anon_ArgsConnectDragSource]
  ] = js.native
}

