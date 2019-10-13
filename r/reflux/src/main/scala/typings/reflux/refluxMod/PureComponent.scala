package typings.reflux.refluxMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reflux", "PureComponent")
@js.native
class PureComponent[TOfStore /* <: Instantiable0[Store] */, P, S, SS] ()
  extends typings.react.reactMod.Component[P, S, SS] {
  var store: TOfStore = js.native
  var storeKeys: js.Array[String] = js.native
  var stores: js.Array[TOfStore] = js.native
  def mapStoreToState(storeType: TOfStore, mappingFunc: js.Function1[/* newState */ js.Any, _]): Unit = js.native
}

