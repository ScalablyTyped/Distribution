package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reflux", JSImport.Namespace)
@js.native
object refluxModMembers extends js.Object {
  val ActionMethods: js.Any = js.native
  def ListenerMixin(): js.Any = js.native
  def connect(store: Store): scala.Unit = js.native
  def connect(store: Store, key: java.lang.String): scala.Unit = js.native
  def createAction(): js.Any = js.native
  def createAction(definition: java.lang.String): js.Any = js.native
  def createAction(definition: js.Object): js.Any = js.native
  def createAction(definition: ActionDefinition): js.Any = js.native
  def createActions(definitions: js.Array[java.lang.String | ActionDefinition]): js.Any = js.native
  def createActions(definitions: ActionObjectDefinition): js.Any = js.native
  def createStore(definition: StoreDefinition): Store = js.native
  def initStore(typeOfStore: org.scalablytyped.runtime.Instantiable0[Store]): Store = js.native
  def listenTo(store: Store, handler: java.lang.String): scala.Unit = js.native
  def setState(state: js.Any): scala.Unit = js.native
}

