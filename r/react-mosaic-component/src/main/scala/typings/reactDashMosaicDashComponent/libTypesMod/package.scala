package typings.reactDashMosaicDashComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typings.immutabilityDashHelper.immutabilityDashHelperMod.Spec
  import typings.react.reactMod._Global_.JSX.Element

  type CreateNode[T /* <: MosaicKey */] = js.Function1[/* repeated */ js.Any, js.Promise[MosaicNode[T]] | MosaicNode[T]]
  type MosaicKey = String | Double
  type MosaicNode[T /* <: MosaicKey */] = MosaicParent[T] | T
  type MosaicPath = js.Array[MosaicBranch]
  type MosaicUpdateSpec[T /* <: MosaicKey */] = Spec[MosaicNode[T], scala.Nothing]
  type TileRenderer[T /* <: MosaicKey */] = js.Function2[/* t */ T, /* path */ js.Array[MosaicBranch], Element]
}
