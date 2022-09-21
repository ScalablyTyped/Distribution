package typings.reactWidgets

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmWidgetHelpersMod {
  
  @JSImport("react-widgets/esm/WidgetHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def notify_[T /* <: js.Function1[/* args */ Any, Any] */](handler: T, args: Parameters[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(handler.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notify_[T /* <: js.Function1[/* args */ Any, Any] */](handler: Unit, args: Parameters[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(handler.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useFirstFocusedRender(focused: Boolean, open: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useFirstFocusedRender")(focused.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useInstanceId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceId")().asInstanceOf[String]
  inline def useInstanceId(otherId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceId")(otherId.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useInstanceId(otherId: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceId")(otherId.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useInstanceId(otherId: Unit, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceId")(otherId.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
}
