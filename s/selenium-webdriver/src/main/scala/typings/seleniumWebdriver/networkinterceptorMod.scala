package typings.seleniumWebdriver

import typings.seleniumWebdriver.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkinterceptorMod {
  
  @JSImport("selenium-webdriver/devtools/networkinterceptor", "HttpResponse")
  @js.native
  /**
    * Creates a HTTP Response that will be used to
    * mock out network interceptions.
    * @param {*} urlToIntercept
    */
  open class HttpResponse () extends StObject {
    def this(urlToIntercept: Any) = this()
    
    /**
      * Add headers that will be returned when we intercept
      * a HTTP Request
      * @param {*} header
      * @param {*} value
      */
    def addHeaders(header: String, value: Any): Unit = js.native
    
    def body: String = js.native
    /**
      * Sets the value of the body of the HTTP Request that
      * will be returned.
      * @param {*} value
      */
    def body_=(arg: String): Unit = js.native
    
    def headers: js.Array[Name] = js.native
    
    /**
      * Returns the Method to be used in the intercept
      */
    def method: String = js.native
    /**
      * Sets the method of the HTTP Request
      * @param {*} value the method of the request.
      */
    def method_=(arg: String): Unit = js.native
    
    var returnBody: String = js.native
    
    var returnHeaders: js.Array[Any] = js.native
    
    var returnMethod: String = js.native
    
    var returnStatus: Double = js.native
    
    def status: Double = js.native
    /**
      * Set the STATUS value of the returned HTTP Request
      * @param {*} value
      */
    def status_=(arg: Double): Unit = js.native
    
    var urlToIntercept: Any = js.native
  }
}
