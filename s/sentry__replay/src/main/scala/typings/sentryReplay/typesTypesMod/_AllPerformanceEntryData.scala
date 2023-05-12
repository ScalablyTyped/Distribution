package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AllPerformanceEntryData
  extends StObject
     with _AllEntryData
object _AllPerformanceEntryData {
  
  inline def LargestContentfulPaintData(size: Double, value: Double): typings.sentryReplay.typesTypesMod.LargestContentfulPaintData = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesMod.LargestContentfulPaintData]
  }
  
  inline def NavigationData(): typings.sentryReplay.typesTypesMod.NavigationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.sentryReplay.typesTypesMod.NavigationData]
  }
  
  inline def ResourceData(decodedBodySize: Double, encodedBodySize: Double, size: Double): typings.sentryReplay.typesTypesMod.ResourceData = {
    val __obj = js.Dynamic.literal(decodedBodySize = decodedBodySize.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesMod.ResourceData]
  }
}
