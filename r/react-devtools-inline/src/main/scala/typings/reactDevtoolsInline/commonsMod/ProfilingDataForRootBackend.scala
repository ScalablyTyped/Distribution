package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilingDataForRootBackend extends StObject {
  
  var commitData: js.Array[CommitDataBackend]
  
  var displayName: String
  
  var initialTreeBaseDurations: js.Array[js.Tuple2[Double, Double]]
  
  var rootID: Double
}
object ProfilingDataForRootBackend {
  
  inline def apply(
    commitData: js.Array[CommitDataBackend],
    displayName: String,
    initialTreeBaseDurations: js.Array[js.Tuple2[Double, Double]],
    rootID: Double
  ): ProfilingDataForRootBackend = {
    val __obj = js.Dynamic.literal(commitData = commitData.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], initialTreeBaseDurations = initialTreeBaseDurations.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingDataForRootBackend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfilingDataForRootBackend] (val x: Self) extends AnyVal {
    
    inline def setCommitData(value: js.Array[CommitDataBackend]): Self = StObject.set(x, "commitData", value.asInstanceOf[js.Any])
    
    inline def setCommitDataVarargs(value: CommitDataBackend*): Self = StObject.set(x, "commitData", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setInitialTreeBaseDurations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "initialTreeBaseDurations", value.asInstanceOf[js.Any])
    
    inline def setInitialTreeBaseDurationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "initialTreeBaseDurations", js.Array(value*))
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
  }
}
