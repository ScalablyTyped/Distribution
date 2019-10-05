package typings.reactDashMove

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashMove.animateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-move", JSImport.Namespace)
@js.native
object reactDashMoveMod extends js.Object {
  @js.native
  class Animate () extends default
  
  @js.native
  class NodeGroup ()
    extends typings.reactDashMove.nodeGroupMod.default
  
  type GetInterpolator = js.Function4[
    /* begValue */ js.UndefOr[js.Any], 
    /* endValue */ js.UndefOr[js.Any], 
    /* attr */ js.UndefOr[String], 
    /* namespace */ js.UndefOr[String], 
    js.Function1[/* t */ Double, js.Any]
  ]
  type HashMap = StringDictionary[js.Any]
}

