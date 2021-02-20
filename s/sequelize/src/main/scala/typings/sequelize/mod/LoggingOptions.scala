package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingOptions extends StObject {
  
  /**
    * Print query execution time in milliseconds when logging SQL.
    */
  var benchmark: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
}
object LoggingOptions {
  
  @scala.inline
  def apply(): LoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingOptions]
  }
  
  @scala.inline
  implicit class LoggingOptionsMutableBuilder[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenchmark(value: Boolean): Self = StObject.set(x, "benchmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenchmarkUndefined: Self = StObject.set(x, "benchmark", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
  }
}
