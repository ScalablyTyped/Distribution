package typings.rollup.mod

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualChunkMeta extends StObject {
  
  def getModuleIds(): IterableIterator[String]
  
  def getModuleInfo(moduleId: String): ModuleInfo | Null
  @JSName("getModuleInfo")
  var getModuleInfo_Original: GetModuleInfo
}
object ManualChunkMeta {
  
  inline def apply(
    getModuleIds: () => IterableIterator[String],
    getModuleInfo: /* moduleId */ String => ModuleInfo | Null
  ): ManualChunkMeta = {
    val __obj = js.Dynamic.literal(getModuleIds = js.Any.fromFunction0(getModuleIds), getModuleInfo = js.Any.fromFunction1(getModuleInfo))
    __obj.asInstanceOf[ManualChunkMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManualChunkMeta] (val x: Self) extends AnyVal {
    
    inline def setGetModuleIds(value: () => IterableIterator[String]): Self = StObject.set(x, "getModuleIds", js.Any.fromFunction0(value))
    
    inline def setGetModuleInfo(value: /* moduleId */ String => ModuleInfo | Null): Self = StObject.set(x, "getModuleInfo", js.Any.fromFunction1(value))
  }
}
