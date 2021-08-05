package typings.sequelize.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for retry Options in the sequelize constructor and QueryOptions
  *
  * @see Options, QueryOptions
  */
trait RetryOptions extends StObject {
  
  /**
    * Only retry a query if the error matches one of these strings.
    */
  var `match`: js.UndefOr[js.Array[String | RegExp | typings.std.Error]] = js.undefined
  
  /**
    * How many times a failing query is automatically retried. Set to 0 to disable retrying on SQL_BUSY error.
    */
  var max: js.UndefOr[Double] = js.undefined
}
object RetryOptions {
  
  inline def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  extension [Self <: RetryOptions](x: Self) {
    
    inline def setMatch(value: js.Array[String | RegExp | typings.std.Error]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMatchVarargs(value: (String | RegExp | typings.std.Error)*): Self = StObject.set(x, "match", js.Array(value :_*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
  }
}
