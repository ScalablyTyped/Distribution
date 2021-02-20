package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOnlyRecordSourceProxy extends StObject {
  
  def get(dataID: DataID): js.UndefOr[ReadOnlyRecordProxy | Null] = js.native
  
  def getRoot(): ReadOnlyRecordProxy = js.native
}
object ReadOnlyRecordSourceProxy {
  
  @scala.inline
  def apply(get: DataID => js.UndefOr[ReadOnlyRecordProxy | Null], getRoot: () => ReadOnlyRecordProxy): ReadOnlyRecordSourceProxy = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
    __obj.asInstanceOf[ReadOnlyRecordSourceProxy]
  }
  
  @scala.inline
  implicit class ReadOnlyRecordSourceProxyMutableBuilder[Self <: ReadOnlyRecordSourceProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: DataID => js.UndefOr[ReadOnlyRecordProxy | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRoot(value: () => ReadOnlyRecordProxy): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
  }
}
