package typings.randombytes

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof _randomBytes` */
  inline def apply(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  /* was `typeof _randomBytes` */
  inline def apply(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("randombytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
