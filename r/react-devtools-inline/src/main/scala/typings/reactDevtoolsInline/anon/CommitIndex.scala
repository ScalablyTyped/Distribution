package typings.reactDevtoolsInline.anon

import typings.reactDevtoolsInline.commonsMod.ProfilerStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitIndex extends StObject {
  
  var commitIndex: Double
  
  var profilerStore: ProfilerStore
  
  var rootID: Double
}
object CommitIndex {
  
  inline def apply(commitIndex: Double, profilerStore: ProfilerStore, rootID: Double): CommitIndex = {
    val __obj = js.Dynamic.literal(commitIndex = commitIndex.asInstanceOf[js.Any], profilerStore = profilerStore.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitIndex] (val x: Self) extends AnyVal {
    
    inline def setCommitIndex(value: Double): Self = StObject.set(x, "commitIndex", value.asInstanceOf[js.Any])
    
    inline def setProfilerStore(value: ProfilerStore): Self = StObject.set(x, "profilerStore", value.asInstanceOf[js.Any])
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
  }
}
