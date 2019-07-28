package typings.reflux.refluxMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reflux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ActionMethods: js.Any = js.native
  def ListenerMixin(): js.Any = js.native
  def connect(store: Store): Unit = js.native
  def connect(store: Store, key: String): Unit = js.native
  def createAction(): js.Any = js.native
  def createAction(definition: String): js.Any = js.native
  def createAction(definition: js.Object): js.Any = js.native
  def createAction(definition: ActionDefinition): js.Any = js.native
  def createActions(definitions: js.Array[ActionDefinition | String]): js.Any = js.native
  def createActions(definitions: ActionObjectDefinition): js.Any = js.native
  def createStore(definition: StoreDefinition): Store = js.native
  def initStore(typeOfStore: Instantiable0[Store]): Store = js.native
  def listenTo(store: Store, handler: String): Unit = js.native
  def setState(state: js.Any): Unit = js.native
}

