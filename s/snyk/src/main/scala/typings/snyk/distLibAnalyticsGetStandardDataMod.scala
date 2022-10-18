package typings.snyk

import typings.snyk.distCliArgsMod.ArgsOptions
import typings.snyk.distLibAnalyticsTypesMod.StandardAnalyticsData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAnalyticsGetStandardDataMod {
  
  @JSImport("snyk/dist/lib/analytics/getStandardData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStandardData(args: js.Array[ArgsOptions]): js.Promise[StandardAnalyticsData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStandardData")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StandardAnalyticsData]]
}
