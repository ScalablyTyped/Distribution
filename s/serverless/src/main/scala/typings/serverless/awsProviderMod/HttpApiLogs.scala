package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpApiLogs extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
}
object HttpApiLogs {
  
  @scala.inline
  def apply(): HttpApiLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpApiLogs]
  }
  
  @scala.inline
  implicit class HttpApiLogsMutableBuilder[Self <: HttpApiLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
