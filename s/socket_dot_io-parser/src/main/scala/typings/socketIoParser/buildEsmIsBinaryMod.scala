package typings.socketIoParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmIsBinaryMod {
  
  @JSImport("socket.io-parser/build/esm/is-binary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasBinary(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBinary")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def hasBinary(obj: Any, toJSON: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBinary")(obj.asInstanceOf[js.Any], toJSON.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isBinary(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
