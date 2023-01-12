package typings.speedtestNet.mod

import typings.speedtestNet.anon.Dynamic
import typings.speedtestNet.anon.Latency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteData extends StObject {
  
  var global: Dynamic
  
  var testStage: Latency
}
object SuiteData {
  
  inline def apply(global: Dynamic, testStage: Latency): SuiteData = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], testStage = testStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuiteData] (val x: Self) extends AnyVal {
    
    inline def setGlobal(value: Dynamic): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setTestStage(value: Latency): Self = StObject.set(x, "testStage", value.asInstanceOf[js.Any])
  }
}
