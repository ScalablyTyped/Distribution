package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlBuilder extends StObject {
  
  def addKeyValueQueryString(key: String, value: String): Unit
  
  def combinePath(path: String): Unit
  
  /** Returns the resulting url */
  def get_url(): String
}
object UrlBuilder {
  
  @scala.inline
  def apply(
    addKeyValueQueryString: (String, String) => Unit,
    combinePath: String => Unit,
    get_url: () => String
  ): UrlBuilder = {
    val __obj = js.Dynamic.literal(addKeyValueQueryString = js.Any.fromFunction2(addKeyValueQueryString), combinePath = js.Any.fromFunction1(combinePath), get_url = js.Any.fromFunction0(get_url))
    __obj.asInstanceOf[UrlBuilder]
  }
  
  @scala.inline
  implicit class UrlBuilderMutableBuilder[Self <: UrlBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddKeyValueQueryString(value: (String, String) => Unit): Self = StObject.set(x, "addKeyValueQueryString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCombinePath(value: String => Unit): Self = StObject.set(x, "combinePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
  }
}
