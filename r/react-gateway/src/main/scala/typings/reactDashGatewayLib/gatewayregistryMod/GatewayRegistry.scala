package typings
package reactDashGatewayLib.gatewayregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GatewayRegistry extends js.Object {
  var _children: ScalablyTyped.runtime.StringDictionary[
    js.UndefOr[ScalablyTyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode]]
  ]
  var _containers: ScalablyTyped.runtime.StringDictionary[js.UndefOr[(reactLib.reactMod.Component[js.Object, js.Object, _]) | scala.Null]]
  var _currentId: scala.Double
  def _renderContainer(name: java.lang.String): scala.Unit
  def addChild(name: java.lang.String, gatewayId: java.lang.String, child: reactLib.reactMod.ReactNs.ReactNode): scala.Unit
  def addContainer(name: java.lang.String, container: reactLib.reactMod.Component[js.Object, js.Object, _]): scala.Unit
  def clearChild(name: java.lang.String, gatewayId: java.lang.String): scala.Unit
  def register(name: java.lang.String, child: reactLib.reactMod.ReactNs.ReactNode): java.lang.String
  def removeContainer(name: java.lang.String): scala.Unit
  def unregister(name: java.lang.String, gatewayId: java.lang.String): scala.Unit
}

