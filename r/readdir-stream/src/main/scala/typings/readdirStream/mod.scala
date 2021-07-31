package typings.readdirStream

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(dir: String): ReadableStream = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  @JSImport("readdir-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
