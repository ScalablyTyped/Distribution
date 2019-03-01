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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_children")(_children)
    __obj.updateDynamic("_containers")(_containers)
    __obj.updateDynamic("_currentId")(_currentId)
    __obj.updateDynamic("_renderContainer")(_renderContainer)
    __obj.updateDynamic("addChild")(addChild)
    __obj.updateDynamic("addContainer")(addContainer)
    __obj.updateDynamic("clearChild")(clearChild)
    __obj.updateDynamic("register")(register)
    __obj.updateDynamic("removeContainer")(removeContainer)
    __obj.updateDynamic("unregister")(unregister)
    __obj.asInstanceOf[GatewayRegistry]
  }
}

