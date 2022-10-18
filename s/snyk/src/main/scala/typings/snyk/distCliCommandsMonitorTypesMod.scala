package typings.snyk

import typings.snyk.distLibErrorsMod.MonitorError
import typings.snyk.snykBooleans.`false`
import typings.snyk.snykBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsMonitorTypesMod {
  
  trait BadResult extends StObject {
    
    var data: MonitorError
    
    var ok: `false`
    
    var path: String
  }
  object BadResult {
    
    inline def apply(data: MonitorError, path: String): BadResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ok = false, path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadResult]
    }
    
    extension [Self <: BadResult](x: Self) {
      
      inline def setData(value: MonitorError): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOk(value: `false`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait GoodResult extends StObject {
    
    var data: String
    
    var ok: `true`
    
    var path: String
    
    var projectName: js.UndefOr[String] = js.undefined
  }
  object GoodResult {
    
    inline def apply(data: String, path: String): GoodResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ok = true, path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoodResult]
    }
    
    extension [Self <: GoodResult](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOk(value: `true`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    }
  }
}
