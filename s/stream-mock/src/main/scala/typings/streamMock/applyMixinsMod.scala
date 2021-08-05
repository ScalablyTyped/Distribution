package typings.streamMock

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyMixinsMod {
  
  @JSImport("stream-mock/lib/helpers/applyMixins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(derivcedCtor: Constructor[js.Any], baseCtors: js.Array[Constructor[js.Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(derivcedCtor.asInstanceOf[js.Any], baseCtors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Constructor[T] = Instantiable1[/* args */ js.Any, T]
}
