package typings.storybookCoreCommon.typesMod

import typings.node.processMod.global.NodeJS.HRTime
import typings.std.ReturnType
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuilderResult extends StObject {
  
  var stats: js.UndefOr[Stats] = js.undefined
  
  var totalTime: js.UndefOr[ReturnType[HRTime]] = js.undefined
}
object BuilderResult {
  
  inline def apply(): BuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuilderResult]
  }
  
  extension [Self <: BuilderResult](x: Self) {
    
    inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setTotalTime(value: ReturnType[HRTime]): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
    
    inline def setTotalTimeUndefined: Self = StObject.set(x, "totalTime", js.undefined)
  }
}
