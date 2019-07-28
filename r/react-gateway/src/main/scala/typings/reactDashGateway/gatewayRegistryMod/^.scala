package typings.reactDashGateway.gatewayRegistryMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-gateway/GatewayRegistry", JSImport.Namespace)
@js.native
class ^ () extends GatewayRegistry {
  /* CompleteClass */
  override var _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]] = js.native
  /* CompleteClass */
  override var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, _]) | Null]] = js.native
  /* CompleteClass */
  override var _currentId: Double = js.native
  /* CompleteClass */
  override def _renderContainer(name: String): Unit = js.native
  /* CompleteClass */
  override def addChild(name: String, gatewayId: String, child: ReactNode): Unit = js.native
  /* CompleteClass */
  override def addContainer(name: String, container: Component[js.Object, js.Object, _]): Unit = js.native
  /* CompleteClass */
  override def clearChild(name: String, gatewayId: String): Unit = js.native
  /* CompleteClass */
  override def register(name: String, child: ReactNode): String = js.native
  /* CompleteClass */
  override def removeContainer(name: String): Unit = js.native
  /* CompleteClass */
  override def unregister(name: String, gatewayId: String): Unit = js.native
}

