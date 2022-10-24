package typings.reactInteractive

import typings.reactInteractive.anon.TagName
import typings.reactInteractive.mod.InteractiveStateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("react-interactive/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def classNameToString(className: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classNameToString")(className.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("react-interactive/dist/utils", "cursorPointer")
  @js.native
  val cursorPointer: CursorPointer_ = js.native
  
  @JSImport("react-interactive/dist/utils", "elementSupportsDisabled")
  @js.native
  val elementSupportsDisabled: ElementTagNameAndType = js.native
  
  @JSImport("react-interactive/dist/utils", "enterKeyTrigger")
  @js.native
  val enterKeyTrigger: ElementTagNameAndType = js.native
  
  inline def resetUserSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetUserSelect")().asInstanceOf[Unit]
  
  inline def setUserSelectNone(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserSelectNone")().asInstanceOf[Unit]
  
  @JSImport("react-interactive/dist/utils", "spaceKeyTrigger")
  @js.native
  val spaceKeyTrigger: ElementTagNameAndType = js.native
  
  inline def stateChanged(param0: InteractiveStateChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stateChanged")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type CursorPointer_ = js.Function2[/* element */ TagName, /* hasOnClickHandler */ Boolean, Boolean]
  
  type ElementTagNameAndType = js.Function1[/* element */ TagName, Boolean]
}
