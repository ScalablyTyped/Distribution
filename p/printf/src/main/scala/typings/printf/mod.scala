package typings.printf

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(format: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(writeStream: WritableStream, format: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].apply(writeStream.asInstanceOf[js.Any], format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("printf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
