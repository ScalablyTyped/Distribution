package typings.reactDashMosaicDashComponent.libContextTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Context
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicContext[T /* <: MosaicKey */] extends js.Object {
  var mosaicActions: MosaicRootActions[T]
  var mosaicId: String
}

@JSImport("react-mosaic-component/lib/contextTypes", "MosaicContext")
@js.native
object MosaicContext extends TopLevel[Context[MosaicContext[String | Double]]]

