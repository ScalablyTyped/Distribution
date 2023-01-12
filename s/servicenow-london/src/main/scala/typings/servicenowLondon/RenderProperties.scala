package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderProperties extends StObject {
  
  def getEncodedQuery(): String
  
  def getListControl(): Any
  
  def getParameterValue(value: String): String
  
  def getParameters(): js.Array[String]
  
  def getReferringURL(): String
  
  def getViewName(): String
  
  def getWindowProperties(): Any
  
  def isInDevStudio(): Boolean
  
  def isInteractive(): Boolean
  
  def isManyToMany(): Boolean
  
  def isRelatedList(): Boolean
}
object RenderProperties {
  
  inline def apply(
    getEncodedQuery: () => String,
    getListControl: () => Any,
    getParameterValue: String => String,
    getParameters: () => js.Array[String],
    getReferringURL: () => String,
    getViewName: () => String,
    getWindowProperties: () => Any,
    isInDevStudio: () => Boolean,
    isInteractive: () => Boolean,
    isManyToMany: () => Boolean,
    isRelatedList: () => Boolean
  ): RenderProperties = {
    val __obj = js.Dynamic.literal(getEncodedQuery = js.Any.fromFunction0(getEncodedQuery), getListControl = js.Any.fromFunction0(getListControl), getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = js.Any.fromFunction0(getParameters), getReferringURL = js.Any.fromFunction0(getReferringURL), getViewName = js.Any.fromFunction0(getViewName), getWindowProperties = js.Any.fromFunction0(getWindowProperties), isInDevStudio = js.Any.fromFunction0(isInDevStudio), isInteractive = js.Any.fromFunction0(isInteractive), isManyToMany = js.Any.fromFunction0(isManyToMany), isRelatedList = js.Any.fromFunction0(isRelatedList))
    __obj.asInstanceOf[RenderProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderProperties] (val x: Self) extends AnyVal {
    
    inline def setGetEncodedQuery(value: () => String): Self = StObject.set(x, "getEncodedQuery", js.Any.fromFunction0(value))
    
    inline def setGetListControl(value: () => Any): Self = StObject.set(x, "getListControl", js.Any.fromFunction0(value))
    
    inline def setGetParameterValue(value: String => String): Self = StObject.set(x, "getParameterValue", js.Any.fromFunction1(value))
    
    inline def setGetParameters(value: () => js.Array[String]): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    inline def setGetReferringURL(value: () => String): Self = StObject.set(x, "getReferringURL", js.Any.fromFunction0(value))
    
    inline def setGetViewName(value: () => String): Self = StObject.set(x, "getViewName", js.Any.fromFunction0(value))
    
    inline def setGetWindowProperties(value: () => Any): Self = StObject.set(x, "getWindowProperties", js.Any.fromFunction0(value))
    
    inline def setIsInDevStudio(value: () => Boolean): Self = StObject.set(x, "isInDevStudio", js.Any.fromFunction0(value))
    
    inline def setIsInteractive(value: () => Boolean): Self = StObject.set(x, "isInteractive", js.Any.fromFunction0(value))
    
    inline def setIsManyToMany(value: () => Boolean): Self = StObject.set(x, "isManyToMany", js.Any.fromFunction0(value))
    
    inline def setIsRelatedList(value: () => Boolean): Self = StObject.set(x, "isRelatedList", js.Any.fromFunction0(value))
  }
}
