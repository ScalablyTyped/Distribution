package typings.sentryReplay.typesTypesReplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonEventContext extends StObject {
  
  /**
    * The initial starting timestamp in ms of the session.
    */
  var initialTimestamp: Double
  
  /**
    * The initial URL of the session
    */
  var initialUrl: String
  
  /**
    * Ordered list of URLs that have been visited during a replay segment
    */
  var urls: js.Array[String]
}
object CommonEventContext {
  
  inline def apply(initialTimestamp: Double, initialUrl: String, urls: js.Array[String]): CommonEventContext = {
    val __obj = js.Dynamic.literal(initialTimestamp = initialTimestamp.asInstanceOf[js.Any], initialUrl = initialUrl.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonEventContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonEventContext] (val x: Self) extends AnyVal {
    
    inline def setInitialTimestamp(value: Double): Self = StObject.set(x, "initialTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInitialUrl(value: String): Self = StObject.set(x, "initialUrl", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
