package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningMod {
  
  @JSImport("rc-util/lib/warning", JSImport.Default)
  @js.native
  def default(valid: Boolean, message: String): Unit = js.native
  
  @JSImport("rc-util/lib/warning", "call")
  @js.native
  def call(
    method: js.Function2[/* valid */ Boolean, /* message */ String, Unit],
    valid: Boolean,
    message: String
  ): Unit = js.native
  
  @JSImport("rc-util/lib/warning", "note")
  @js.native
  def note(valid: Boolean, message: String): Unit = js.native
  
  @JSImport("rc-util/lib/warning", "noteOnce")
  @js.native
  def noteOnce(valid: Boolean, message: String): Unit = js.native
  
  @JSImport("rc-util/lib/warning", "resetWarned")
  @js.native
  def resetWarned(): Unit = js.native
  
  @JSImport("rc-util/lib/warning", "warning")
  @js.native
  def warning(valid: Boolean, message: String): Unit = js.native
  
  @JSImport("rc-util/lib/warning", "warningOnce")
  @js.native
  def warningOnce(valid: Boolean, message: String): Unit = js.native
}
