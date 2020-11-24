package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProperties extends js.Object {
  
  def getEncodedQuery(): String = js.native
  
  def getListControl(): js.Any = js.native
  
  def getParameterValue(value: String): String = js.native
  
  def getParameters(): js.Array[String] = js.native
  
  def getReferringURL(): String = js.native
  
  def getViewName(): String = js.native
  
  def getWindowProperties(): js.Any = js.native
  
  def isInDevStudio(): Boolean = js.native
  
  def isInteractive(): Boolean = js.native
  
  def isManyToMany(): Boolean = js.native
  
  def isRelatedList(): Boolean = js.native
}
object RenderProperties {
  
  @scala.inline
  def apply(
    getEncodedQuery: () => String,
    getListControl: () => js.Any,
    getParameterValue: String => String,
    getParameters: () => js.Array[String],
    getReferringURL: () => String,
    getViewName: () => String,
    getWindowProperties: () => js.Any,
    isInDevStudio: () => Boolean,
    isInteractive: () => Boolean,
    isManyToMany: () => Boolean,
    isRelatedList: () => Boolean
  ): RenderProperties = {
    val __obj = js.Dynamic.literal(getEncodedQuery = js.Any.fromFunction0(getEncodedQuery), getListControl = js.Any.fromFunction0(getListControl), getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = js.Any.fromFunction0(getParameters), getReferringURL = js.Any.fromFunction0(getReferringURL), getViewName = js.Any.fromFunction0(getViewName), getWindowProperties = js.Any.fromFunction0(getWindowProperties), isInDevStudio = js.Any.fromFunction0(isInDevStudio), isInteractive = js.Any.fromFunction0(isInteractive), isManyToMany = js.Any.fromFunction0(isManyToMany), isRelatedList = js.Any.fromFunction0(isRelatedList))
    __obj.asInstanceOf[RenderProperties]
  }
  
  @scala.inline
  implicit class RenderPropertiesOps[Self <: RenderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetEncodedQuery(value: () => String): Self = this.set("getEncodedQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListControl(value: () => js.Any): Self = this.set("getListControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameterValue(value: String => String): Self = this.set("getParameterValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameters(value: () => js.Array[String]): Self = this.set("getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReferringURL(value: () => String): Self = this.set("getReferringURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewName(value: () => String): Self = this.set("getViewName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWindowProperties(value: () => js.Any): Self = this.set("getWindowProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInDevStudio(value: () => Boolean): Self = this.set("isInDevStudio", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInteractive(value: () => Boolean): Self = this.set("isInteractive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsManyToMany(value: () => Boolean): Self = this.set("isManyToMany", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRelatedList(value: () => Boolean): Self = this.set("isRelatedList", js.Any.fromFunction0(value))
  }
}
