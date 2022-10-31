package typings.reactNativeModals.mod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-modals", "ModalPortal")
@js.native
open class ModalPortal protected ()
  extends Component[js.Object, js.Object, Any] {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: Any) = this()
  
  def current: Modal = js.native
  
  def ref: Modal = js.native
  
  def size: Double = js.native
}
/* static members */
object ModalPortal {
  
  @JSImport("react-native-modals", "ModalPortal")
  @js.native
  val ^ : js.Any = js.native
  
  inline def dismiss(key: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def dismissAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAll")().asInstanceOf[Unit]
  
  inline def show(children: ReactNode): Modal = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(children.asInstanceOf[js.Any]).asInstanceOf[Modal]
  inline def show(children: ReactNode, props: ModalProps): Modal = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Modal]
  
  inline def update(key: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def update(key: Any, props: ModalProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
