package typings.promptSyncHistory

import typings.promptSync.mod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): History = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[History]
  @scala.inline
  def apply(file: String): History = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[History]
  @scala.inline
  def apply(file: String, max: Double): History = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[History]
  @scala.inline
  def apply(file: Unit, max: Double): History = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[History]
  
  @JSImport("prompt-sync-history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
