package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingOptions extends StObject {
  
  /**
    * Print query execution time in milliseconds when logging SQL.
    */
  var benchmark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
}
object LoggingOptions {
  
  inline def apply(): LoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingOptions]
  }
  
  extension [Self <: LoggingOptions](x: Self) {
    
    inline def setBenchmark(value: Boolean): Self = StObject.set(x, "benchmark", value.asInstanceOf[js.Any])
    
    inline def setBenchmarkUndefined: Self = StObject.set(x, "benchmark", js.undefined)
    
    inline def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
  }
}
