package typings.stdoutStream

import org.scalablytyped.runtime.Shortcut
import typings.node.streamMod.Writable
import typings.stdoutStream.stdoutStreamBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("stdout-stream", JSImport.Namespace)
  @js.native
  val ^ : StdoutStream = js.native
  
  @js.native
  trait StdoutStream extends Writable {
    
    val _isStdio: `true` = js.native
    
    val isTTY: Boolean = js.native
  }
  
  type _To = StdoutStream
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: StdoutStream = ^
}
