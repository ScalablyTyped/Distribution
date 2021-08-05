package typings.reduxSagaDelayP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@redux-saga/delay-p", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](ms: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def default[T](ms: Double, `val`: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ms.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
