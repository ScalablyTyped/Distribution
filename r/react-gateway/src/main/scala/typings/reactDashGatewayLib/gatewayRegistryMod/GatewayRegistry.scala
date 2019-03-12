package typings
package reactDashGatewayLib.gatewayRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayRegistry extends js.Object {
  var _children: org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode]]
  ]
  var _containers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[(reactLib.reactMod.Component[js.Object, js.Object, _]) | scala.Null]]
  var _currentId: scala.Double
  def _renderContainer(name: java.lang.String): scala.Unit
  def addChild(name: java.lang.String, gatewayId: java.lang.String, child: reactLib.reactMod.ReactNs.ReactNode): scala.Unit
  def addContainer(name: java.lang.String, container: reactLib.reactMod.Component[js.Object, js.Object, _]): scala.Unit
  def clearChild(name: java.lang.String, gatewayId: java.lang.String): scala.Unit
  def register(name: java.lang.String, child: reactLib.reactMod.ReactNs.ReactNode): java.lang.String
  def removeContainer(name: java.lang.String): scala.Unit
  def unregister(name: java.lang.String, gatewayId: java.lang.String): scala.Unit
}

object GatewayRegistry {
  @scala.inline
  def apply(
    _children: org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode]]
    ],
    _containers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[(reactLib.reactMod.Component[js.Object, js.Object, _]) | scala.Null]],
    _currentId: scala.Double,
    _renderContainer: java.lang.String => scala.Unit,
    addChild: (java.lang.String, java.lang.String, reactLib.reactMod.ReactNs.ReactNode) => scala.Unit,
    addContainer: (java.lang.String, reactLib.reactMod.Component[js.Object, js.Object, _]) => scala.Unit,
    clearChild: (java.lang.String, java.lang.String) => scala.Unit,
    register: (java.lang.String, reactLib.reactMod.ReactNs.ReactNode) => java.lang.String,
    removeContainer: java.lang.String => scala.Unit,
    unregister: (java.lang.String, java.lang.String) => scala.Unit
  ): GatewayRegistry = {
    val __obj = js.Dynamic.literal(_children = _children, _containers = _containers, _currentId = _currentId, _renderContainer = js.Any.fromFunction1(_renderContainer), addChild = js.Any.fromFunction3(addChild), addContainer = js.Any.fromFunction2(addContainer), clearChild = js.Any.fromFunction2(clearChild), register = js.Any.fromFunction2(register), removeContainer = js.Any.fromFunction1(removeContainer), unregister = js.Any.fromFunction2(unregister))
  
    __obj.asInstanceOf[GatewayRegistry]
  }
}

