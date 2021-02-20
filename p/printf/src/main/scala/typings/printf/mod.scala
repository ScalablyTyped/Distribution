package typings.printf

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("printf", JSImport.Namespace)
  @js.native
  def apply(format: String, args: js.Any*): String = js.native
  @JSImport("printf", JSImport.Namespace)
  @js.native
  def apply(writeStream: WritableStream, format: String, args: js.Any*): Unit = js.native
}
