package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atom {
  
  inline def apply[T](options: AtomOptions[T]): RecoilState[T] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RecoilState[T]]
  
  @JSImport("recoil", "atom")
  @js.native
  val ^ : js.Any = js.native
  
  inline def value[T](value: T): WrappedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(value.asInstanceOf[js.Any]).asInstanceOf[WrappedValue[T]]
}
