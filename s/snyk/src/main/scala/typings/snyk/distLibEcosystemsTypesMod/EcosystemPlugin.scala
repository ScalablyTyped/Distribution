package typings.snyk.distLibEcosystemsTypesMod

import typings.snyk.anon.ReadableResult
import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcosystemPlugin extends StObject {
  
  def display(
    scanResults: js.Array[ScanResult],
    testResults: js.Array[TestResult],
    errors: js.Array[String],
    options: Options
  ): js.Promise[String]
  
  def scan(options: Options): js.Promise[PluginResponse]
  
  var test: js.UndefOr[
    js.Function2[/* paths */ js.Array[String], /* options */ Options, js.Promise[ReadableResult]]
  ] = js.undefined
}
object EcosystemPlugin {
  
  inline def apply(
    display: (js.Array[ScanResult], js.Array[TestResult], js.Array[String], Options) => js.Promise[String],
    scan: Options => js.Promise[PluginResponse]
  ): EcosystemPlugin = {
    val __obj = js.Dynamic.literal(display = js.Any.fromFunction4(display), scan = js.Any.fromFunction1(scan))
    __obj.asInstanceOf[EcosystemPlugin]
  }
  
  extension [Self <: EcosystemPlugin](x: Self) {
    
    inline def setDisplay(
      value: (js.Array[ScanResult], js.Array[TestResult], js.Array[String], Options) => js.Promise[String]
    ): Self = StObject.set(x, "display", js.Any.fromFunction4(value))
    
    inline def setScan(value: Options => js.Promise[PluginResponse]): Self = StObject.set(x, "scan", js.Any.fromFunction1(value))
    
    inline def setTest(value: (/* paths */ js.Array[String], /* options */ Options) => js.Promise[ReadableResult]): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
