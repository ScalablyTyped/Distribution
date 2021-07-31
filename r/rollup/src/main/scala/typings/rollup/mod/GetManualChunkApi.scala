package typings.rollup.mod

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManualChunkApi extends StObject {
  
  def getModuleIds(): IterableIterator[String]
  
  def getModuleInfo(moduleId: String): ModuleInfo | Null
  @JSName("getModuleInfo")
  var getModuleInfo_Original: GetModuleInfo
}
object GetManualChunkApi {
  
  @scala.inline
  def apply(
    getModuleIds: () => IterableIterator[String],
    getModuleInfo: /* moduleId */ String => ModuleInfo | Null
  ): GetManualChunkApi = {
    val __obj = js.Dynamic.literal(getModuleIds = js.Any.fromFunction0(getModuleIds), getModuleInfo = js.Any.fromFunction1(getModuleInfo))
    __obj.asInstanceOf[GetManualChunkApi]
  }
  
  @scala.inline
  implicit class GetManualChunkApiMutableBuilder[Self <: GetManualChunkApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetModuleIds(value: () => IterableIterator[String]): Self = StObject.set(x, "getModuleIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModuleInfo(value: /* moduleId */ String => ModuleInfo | Null): Self = StObject.set(x, "getModuleInfo", js.Any.fromFunction1(value))
  }
}
