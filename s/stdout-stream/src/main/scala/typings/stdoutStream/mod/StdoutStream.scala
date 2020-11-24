package typings.stdoutStream.mod

import typings.node.streamMod.Writable
import typings.stdoutStream.stdoutStreamBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StdoutStream extends Writable {
  
  val _isStdio: `true` = js.native
  
  val isTTY: Boolean = js.native
}
