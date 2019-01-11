package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reflux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ActionMethods: js.Any = js.native
  def ListenerMixin(): js.Any = js.native
  def connect(store: refluxLib.refluxMod.Store): scala.Unit = js.native
  def connect(store: refluxLib.refluxMod.Store, key: java.lang.String): scala.Unit = js.native
  def createAction(): js.Any = js.native
  def createAction(definition: java.lang.String): js.Any = js.native
  def createAction(definition: js.Object): js.Any = js.native
  def createAction(definition: refluxLib.refluxMod.ActionDefinition): js.Any = js.native
  def createActions(definitions: js.Array[refluxLib.refluxMod.ActionDefinition | java.lang.String]): js.Any = js.native
  def createActions(definitions: refluxLib.refluxMod.ActionObjectDefinition): js.Any = js.native
  def createStore(definition: refluxLib.refluxMod.StoreDefinition): refluxLib.refluxMod.Store = js.native
  def initStore(typeOfStore: org.scalablytyped.runtime.Instantiable0[refluxLib.refluxMod.Store]): refluxLib.refluxMod.Store = js.native
  def listenTo(store: refluxLib.refluxMod.Store, handler: java.lang.String): scala.Unit = js.native
  def setState(state: js.Any): scala.Unit = js.native
}

