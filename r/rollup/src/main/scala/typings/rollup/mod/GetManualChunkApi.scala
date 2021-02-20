package typings.rollup.mod

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetManualChunkApi extends StObject {
  
  def getModuleIds(): IterableIterator[String] = js.native
  
  def getModuleInfo(moduleId: String): ModuleInfo | Null = js.native
  @JSName("getModuleInfo")
  var getModuleInfo_Original: GetModuleInfo = js.native
}
