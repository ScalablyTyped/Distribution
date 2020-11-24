package typings.reflux.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reflux", "Component")
@js.native
class Component[TOfStore /* <: Instantiable0[Store] */, P, S] ()
  extends typings.react.mod.Component[P, S, js.Any] {
  
  def mapStoreToState(storeType: TOfStore, mappingFunc: js.Function1[/* newState */ js.Any, _]): Unit = js.native
  
  var store: TOfStore = js.native
  
  var storeKeys: js.Array[String] = js.native
  
  var stores: js.Array[TOfStore] = js.native
}
