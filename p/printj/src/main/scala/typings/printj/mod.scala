package typings.printj

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("printj", "sprintf")
  @js.native
  def sprintf(fmt: String, args: js.Any*): String = js.native
  
  @JSImport("printj", "version")
  @js.native
  val version: String = js.native
  
  @JSImport("printj", "vsprintf")
  @js.native
  def vsprintf(fmt: String, args: js.Array[_]): String = js.native
}
