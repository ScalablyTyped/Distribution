package typings.restartHooks

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefWithInitialValueFactoryMod {
  
  @JSImport("@restart/hooks/cjs/useRefWithInitialValueFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](initialValueFactory: js.Function0[T]): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialValueFactory.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
}
