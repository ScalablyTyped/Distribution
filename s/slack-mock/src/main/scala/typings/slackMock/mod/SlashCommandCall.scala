package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlashCommandCall[T] extends StObject {
  
  var headers: SlashCommandHttpHeaders
  
  var params: T
  
  var statusCode: Double
  
  var `type`: SlashCommandCallType
  
  var url: SlashCommandUrl
}
object SlashCommandCall {
  
  inline def apply[T](
    headers: SlashCommandHttpHeaders,
    params: T,
    statusCode: Double,
    `type`: SlashCommandCallType,
    url: SlashCommandUrl
  ): SlashCommandCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlashCommandCall[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlashCommandCall[?], T] (val x: Self & SlashCommandCall[T]) extends AnyVal {
    
    inline def setHeaders(value: SlashCommandHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setType(value: SlashCommandCallType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SlashCommandUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
