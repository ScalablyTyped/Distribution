package typings
package reactDashMosaicDashComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type CreateNode[T /* <: MosaicKey */] = js.Function1[/* repeated */ js.Any, js.Promise[MosaicNode[T]] | MosaicNode[T]]
  type MosaicKey = java.lang.String | scala.Double
  type MosaicNode[T /* <: MosaicKey */] = MosaicParent[T] | T
  type MosaicPath = js.Array[MosaicBranch]
  type MosaicUpdateSpec[T /* <: MosaicKey */] = immutabilityDashHelperLib.immutabilityDashHelperMod.Spec[MosaicNode[T], scala.Nothing]
  type TileRenderer[T /* <: MosaicKey */] = js.Function2[/* t */ T, /* path */ js.Array[MosaicBranch], reactLib.reactMod.Global.JSXNs.Element]
}
