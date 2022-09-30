package typings.printf

import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def apply(writeStream: WritableStream[Any], format: String, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(writeStream.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  @JSImport("printf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
