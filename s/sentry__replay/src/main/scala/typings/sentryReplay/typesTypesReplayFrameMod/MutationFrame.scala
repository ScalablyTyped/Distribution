package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayStrings.replayDotmutations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame because Already inherited
- typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame because Already inherited */ trait MutationFrame
  extends StObject
     with BaseBreadcrumbFrame {
  
  @JSName("category")
  var category_MutationFrame: replayDotmutations
  
  @JSName("data")
  var data_MutationFrame: MutationFrameData
}
object MutationFrame {
  
  inline def apply(data: MutationFrameData, timestamp: Double, `type`: String): MutationFrame = {
    val __obj = js.Dynamic.literal(category = "replay.mutations", data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutationFrame] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: replayDotmutations): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: MutationFrameData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
