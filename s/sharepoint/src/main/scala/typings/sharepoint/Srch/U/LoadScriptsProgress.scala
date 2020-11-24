package typings.sharepoint.Srch.U

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoadScriptsProgress extends js.Object
@JSGlobal("Srch.U.LoadScriptsProgress")
@js.native
object LoadScriptsProgress extends js.Object {
  
  @js.native
  sealed trait failure extends LoadScriptsProgress
  
  @js.native
  sealed trait loading extends LoadScriptsProgress
  
  @js.native
  sealed trait success extends LoadScriptsProgress
}
