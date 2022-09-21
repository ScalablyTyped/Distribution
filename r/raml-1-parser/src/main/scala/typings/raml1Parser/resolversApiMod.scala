package typings.raml1Parser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolversApiMod {
  
  trait FSResolver extends StObject {
    
    /**
      * Load file content synchronosly
      * @param path File path
      * @return File content as string
      **/
    def content(path: String): String
    
    /**
      * Load file content asynchronosly
      * @param path File path
      * @return File content as string
      **/
    def contentAsync(path: String): js.Promise[String]
  }
  object FSResolver {
    
    inline def apply(content: String => String, contentAsync: String => js.Promise[String]): FSResolver = {
      val __obj = js.Dynamic.literal(content = js.Any.fromFunction1(content), contentAsync = js.Any.fromFunction1(contentAsync))
      __obj.asInstanceOf[FSResolver]
    }
    
    extension [Self <: FSResolver](x: Self) {
      
      inline def setContent(value: String => String): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentAsync(value: String => js.Promise[String]): Self = StObject.set(x, "contentAsync", js.Any.fromFunction1(value))
    }
  }
  
  trait HTTPResolver extends StObject {
    
    /**
      * Load resource by URL synchronously
      * @param url Resource URL
      * @return Resource content in string form
      **/
    def getResource(url: String): Response
    
    /**
      * Load resource by URL asynchronously
      * @param url Resource URL
      * @return Resource content in string form
      **/
    def getResourceAsync(url: String): js.Promise[Response]
  }
  object HTTPResolver {
    
    inline def apply(getResource: String => Response, getResourceAsync: String => js.Promise[Response]): HTTPResolver = {
      val __obj = js.Dynamic.literal(getResource = js.Any.fromFunction1(getResource), getResourceAsync = js.Any.fromFunction1(getResourceAsync))
      __obj.asInstanceOf[HTTPResolver]
    }
    
    extension [Self <: HTTPResolver](x: Self) {
      
      inline def setGetResource(value: String => Response): Self = StObject.set(x, "getResource", js.Any.fromFunction1(value))
      
      inline def setGetResourceAsync(value: String => js.Promise[Response]): Self = StObject.set(x, "getResourceAsync", js.Any.fromFunction1(value))
    }
  }
  
  trait Response extends StObject {
    
    /**
      * Page content
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * Error message
      */
    var errorMessage: js.UndefOr[String] = js.undefined
  }
  object Response {
    
    inline def apply(): Response = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    }
  }
}
