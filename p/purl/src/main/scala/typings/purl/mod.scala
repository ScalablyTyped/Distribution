package typings.purl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse the current page URL
    */
  @scala.inline
  def apply(): Url = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Url]
  /**
    * Pass in a URI as a string and parse that
    *
    * @param someUrl the url to be parsed
    */
  @scala.inline
  def apply(someUrl: String): Url = ^.asInstanceOf[js.Dynamic].apply(someUrl.asInstanceOf[js.Any]).asInstanceOf[Url]
  
  @JSImport("purl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ParameterMap = StringDictionary[String]
  
  @js.native
  trait Url extends StObject {
    
    /**
      * The .attr() method is used to return information on various parts of the URL.
      */
    def attr(option: String): String = js.native
    
    /**
      * Gets a parameter from the fragment segment
      */
    def fparam(): ParameterMap = js.native
    def fparam(parameterName: String): String = js.native
    
    /**
      * Gets the fragment segment at the especified position.
      */
    def fsegment(position: Double): String = js.native
    
    /**
      * The .param() method is used to return the values of querystring parameters.
      */
    def param(): ParameterMap = js.native
    def param(parameterName: String): String = js.native
    
    /**
      * The .segment() method is used to return values of individual segments from the URL's path.
      * Pass in an integer value to get the value of that segment - note however that the count is not zero-indexed like an array - i.e. .segment(1) returns the first segment, not the second one.
      * You can also pass in negative values, in which case it will count back from the end of the path rather than forwards from the start.
      */
    def segment(position: Double): String = js.native
  }
}
