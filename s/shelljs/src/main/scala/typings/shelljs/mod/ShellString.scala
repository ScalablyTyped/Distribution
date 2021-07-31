package typings.shelljs.mod

import typings.shelljs.mod.^
import typings.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellString
  extends StObject
     with String
     with ShellReturnValue
object ShellString {
  
  @scala.inline
  def apply: ShellStringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("ShellString").asInstanceOf[ShellStringConstructor]
}
