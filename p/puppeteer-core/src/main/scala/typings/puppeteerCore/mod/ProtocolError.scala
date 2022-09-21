package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "ProtocolError")
@js.native
open class ProtocolError () extends CustomError {
  def this(message: String) = this()
  
  var code: js.UndefOr[Double] = js.native
  
  var originalMessage: String = js.native
}
