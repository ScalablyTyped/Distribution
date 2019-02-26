package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reflux", "Component")
@js.native
class Component[TOfStore /* <: org.scalablytyped.runtime.Instantiable0[Store] */, P, S] ()
  extends reactLib.reactMod.Component[P, S, js.Any] {
  var store: TOfStore = js.native
  var storeKeys: js.Array[java.lang.String] = js.native
  var stores: js.Array[TOfStore] = js.native
  def mapStoreToState(storeType: TOfStore, mappingFunc: js.Function1[/* newState */ js.Any, _]): scala.Unit = js.native
}

