package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selector {
  
  inline def apply[T](options: ReadOnlySelectorOptions[T]): RecoilValueReadOnly[T] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[T]]
  inline def apply[T](options: ReadWriteSelectorOptions[T]): RecoilState[T] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RecoilState[T]]
  
  @JSImport("recoil", "selector")
  @js.native
  val ^ : js.Any = js.native
  
  inline def value[T](value: T): WrappedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(value.asInstanceOf[js.Any]).asInstanceOf[WrappedValue[T]]
}
