package typings
package reactDashGatewayLib.gatewayregistryMod

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
    _renderContainer: js.Function1[java.lang.String, scala.Unit],
    addChild: js.Function3[java.lang.String, java.lang.String, reactLib.reactMod.ReactNs.ReactNode, scala.Unit],
    addContainer: js.Function2[java.lang.String, reactLib.reactMod.Component[js.Object, js.Object, _], scala.Unit],
    clearChild: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    register: js.Function2[java.lang.String, reactLib.reactMod.ReactNs.ReactNode, java.lang.String],
    removeContainer: js.Function1[java.lang.String, scala.Unit],
    unregister: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): GatewayRegistry = {
    val __obj = js.Dynamic.literal(_children = _children, _containers = _containers, _currentId = _currentId, _renderContainer = _renderContainer, addChild = addChild, addContainer = addContainer, clearChild = clearChild, register = register, removeContainer = removeContainer, unregister = unregister)
  
    __obj.asInstanceOf[GatewayRegistry]
  }
}

