package typings.reactDevtoolsInline.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerStore extends StObject {
  
  var commitIndex: Double
  
  var profilerStore: typings.reactDevtoolsInline.commonsMod.ProfilerStore
  
  var rootID: Double
}
object ProfilerStore {
  
  inline def apply(
    commitIndex: Double,
    profilerStore: typings.reactDevtoolsInline.commonsMod.ProfilerStore,
    rootID: Double
  ): ProfilerStore = {
    val __obj = js.Dynamic.literal(commitIndex = commitIndex.asInstanceOf[js.Any], profilerStore = profilerStore.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerStore]
  }
  
  extension [Self <: ProfilerStore](x: Self) {
    
    inline def setCommitIndex(value: Double): Self = StObject.set(x, "commitIndex", value.asInstanceOf[js.Any])
    
    inline def setProfilerStore(value: typings.reactDevtoolsInline.commonsMod.ProfilerStore): Self = StObject.set(x, "profilerStore", value.asInstanceOf[js.Any])
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
  }
}
