package typings.reactHotLoader

import typings.reactHotLoader.mod.AppContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootMod {
  
  @JSImport("react-hot-loader/root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hot[T](Component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("hot")(Component.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def hot[T](Component: T, props: AppContainerProps): T = (^.asInstanceOf[js.Dynamic].applyDynamic("hot")(Component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[T]
}
