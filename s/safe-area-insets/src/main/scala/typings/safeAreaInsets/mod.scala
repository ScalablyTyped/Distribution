package typings.safeAreaInsets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-area-insets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("safe-area-insets", "bottom")
  @js.native
  val bottom: Double = js.native
  
  @JSImport("safe-area-insets", "left")
  @js.native
  val left: Double = js.native
  
  @JSImport("safe-area-insets", "offChange")
  @js.native
  def offChange: js.Function1[/* callback */ js.Function, Unit] = js.native
  inline def offChange(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def offChange_=(x: js.Function1[/* callback */ js.Function, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offChange")(x.asInstanceOf[js.Any])
  
  @JSImport("safe-area-insets", "onChange")
  @js.native
  def onChange: js.Function1[/* callback */ js.Function, Unit] = js.native
  inline def onChange(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onChange_=(x: js.Function1[/* callback */ js.Function, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
  
  @JSImport("safe-area-insets", "right")
  @js.native
  val right: Double = js.native
  
  @JSImport("safe-area-insets", "support")
  @js.native
  val support: Boolean = js.native
  
  @JSImport("safe-area-insets", "top")
  @js.native
  val top: Double = js.native
}
