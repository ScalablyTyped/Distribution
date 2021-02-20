package typings.reactMdForm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectStateMod {
  
  @JSImport("@react-md/form/types/useSelectState", "useSelectState")
  @js.native
  def useSelectState[T /* <: String */](defaultValue: DefaultValue[T]): ReturnValue[T] = js.native
  
  type DefaultValue[T /* <: String */] = T | js.Function0[T]
  
  type ReturnValue[T /* <: String */] = js.Tuple2[T, js.Function1[/* nextValue */ String, Unit]]
}
