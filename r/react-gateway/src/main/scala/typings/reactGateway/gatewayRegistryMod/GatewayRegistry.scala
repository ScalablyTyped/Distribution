package typings.reactGateway.gatewayRegistryMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayRegistry extends js.Object {
  var _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]]
  var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, _]) | Null]]
  var _currentId: Double
  def _renderContainer(name: String): Unit
  def addChild(name: String, gatewayId: String, child: ReactNode): Unit
  def addContainer(name: String, container: Component[js.Object, js.Object, _]): Unit
  def clearChild(name: String, gatewayId: String): Unit
  def register(name: String, child: ReactNode): String
  def removeContainer(name: String): Unit
  def unregister(name: String, gatewayId: String): Unit
}

object GatewayRegistry {
  @scala.inline
  def apply(
    _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]],
    _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, _]) | Null]],
    _currentId: Double,
    _renderContainer: String => Unit,
    addChild: (String, String, ReactNode) => Unit,
    addContainer: (String, Component[js.Object, js.Object, _]) => Unit,
    clearChild: (String, String) => Unit,
    register: (String, ReactNode) => String,
    removeContainer: String => Unit,
    unregister: (String, String) => Unit
  ): GatewayRegistry = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _containers = _containers.asInstanceOf[js.Any], _currentId = _currentId.asInstanceOf[js.Any], _renderContainer = js.Any.fromFunction1(_renderContainer), addChild = js.Any.fromFunction3(addChild), addContainer = js.Any.fromFunction2(addContainer), clearChild = js.Any.fromFunction2(clearChild), register = js.Any.fromFunction2(register), removeContainer = js.Any.fromFunction1(removeContainer), unregister = js.Any.fromFunction2(unregister))
    __obj.asInstanceOf[GatewayRegistry]
  }
}

