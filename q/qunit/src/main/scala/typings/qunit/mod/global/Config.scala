package typings.qunit.mod.global

import typings.qunit.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var altertitle: Boolean
  
  var autostart: Boolean
  
  var collapse: Boolean
  
  var current: Any
  
  var failOnZeroTests: Boolean
  
  var filter: String | js.RegExp
  
  var fixture: String
  
  var hidepassed: Boolean
  
  var maxDepth: Double
  
  var module: String
  
  var moduleId: js.Array[String]
  
  var noglobals: Boolean
  
  var notrycatch: Boolean
  
  var reorder: Boolean
  
  var requireExpects: Boolean
  
  var scrolltop: Boolean
  
  var seed: String
  
  var testId: js.Array[String]
  
  var testTimeout: Double
  
  var urlConfig: js.Array[Id]
}
object Config {
  
  inline def apply(
    altertitle: Boolean,
    autostart: Boolean,
    collapse: Boolean,
    current: Any,
    failOnZeroTests: Boolean,
    filter: String | js.RegExp,
    fixture: String,
    hidepassed: Boolean,
    maxDepth: Double,
    module: String,
    moduleId: js.Array[String],
    noglobals: Boolean,
    notrycatch: Boolean,
    reorder: Boolean,
    requireExpects: Boolean,
    scrolltop: Boolean,
    seed: String,
    testId: js.Array[String],
    testTimeout: Double,
    urlConfig: js.Array[Id]
  ): Config = {
    val __obj = js.Dynamic.literal(altertitle = altertitle.asInstanceOf[js.Any], autostart = autostart.asInstanceOf[js.Any], collapse = collapse.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], failOnZeroTests = failOnZeroTests.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], fixture = fixture.asInstanceOf[js.Any], hidepassed = hidepassed.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], noglobals = noglobals.asInstanceOf[js.Any], notrycatch = notrycatch.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any], requireExpects = requireExpects.asInstanceOf[js.Any], scrolltop = scrolltop.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], urlConfig = urlConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setAltertitle(value: Boolean): Self = StObject.set(x, "altertitle", value.asInstanceOf[js.Any])
    
    inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    
    inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setFailOnZeroTests(value: Boolean): Self = StObject.set(x, "failOnZeroTests", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String | js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFixture(value: String): Self = StObject.set(x, "fixture", value.asInstanceOf[js.Any])
    
    inline def setHidepassed(value: Boolean): Self = StObject.set(x, "hidepassed", value.asInstanceOf[js.Any])
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: js.Array[String]): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdVarargs(value: String*): Self = StObject.set(x, "moduleId", js.Array(value*))
    
    inline def setNoglobals(value: Boolean): Self = StObject.set(x, "noglobals", value.asInstanceOf[js.Any])
    
    inline def setNotrycatch(value: Boolean): Self = StObject.set(x, "notrycatch", value.asInstanceOf[js.Any])
    
    inline def setReorder(value: Boolean): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
    
    inline def setRequireExpects(value: Boolean): Self = StObject.set(x, "requireExpects", value.asInstanceOf[js.Any])
    
    inline def setScrolltop(value: Boolean): Self = StObject.set(x, "scrolltop", value.asInstanceOf[js.Any])
    
    inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setTestId(value: js.Array[String]): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    inline def setTestIdVarargs(value: String*): Self = StObject.set(x, "testId", js.Array(value*))
    
    inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    inline def setUrlConfig(value: js.Array[Id]): Self = StObject.set(x, "urlConfig", value.asInstanceOf[js.Any])
    
    inline def setUrlConfigVarargs(value: Id*): Self = StObject.set(x, "urlConfig", js.Array(value*))
  }
}
