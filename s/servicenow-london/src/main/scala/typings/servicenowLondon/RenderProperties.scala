package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProperties extends js.Object {
  def getEncodedQuery(): String
  def getListControl(): js.Any
  def getParameterValue(value: String): String
  def getParameters(): js.Array[String]
  def getReferringURL(): String
  def getViewName(): String
  def getWindowProperties(): js.Any
  def isInDevStudio(): Boolean
  def isInteractive(): Boolean
  def isManyToMany(): Boolean
  def isRelatedList(): Boolean
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
}

