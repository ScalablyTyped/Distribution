package typings
package reactDashGatewayLib.gatewayRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-gateway/GatewayRegistry", JSImport.Namespace)
@js.native
class ^ () extends GatewayRegistry {
  /* CompleteClass */
  override var _children: org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNode]]
  ] = js.native
  /* CompleteClass */
  override var _containers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[(reactLib.reactMod.Component[js.Object, js.Object, _]) | scala.Null]] = js.native
  /* CompleteClass */
  override var _currentId: scala.Double = js.native
  /* CompleteClass */
  override def _renderContainer(name: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def addChild(name: java.lang.String, gatewayId: java.lang.String, child: reactLib.reactMod.ReactNode): scala.Unit = js.native
  /* CompleteClass */
  override def addContainer(name: java.lang.String, container: reactLib.reactMod.Component[js.Object, js.Object, _]): scala.Unit = js.native
  /* CompleteClass */
  override def clearChild(name: java.lang.String, gatewayId: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def register(name: java.lang.String, child: reactLib.reactMod.ReactNode): java.lang.String = js.native
  /* CompleteClass */
  override def removeContainer(name: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def unregister(name: java.lang.String, gatewayId: java.lang.String): scala.Unit = js.native
}

