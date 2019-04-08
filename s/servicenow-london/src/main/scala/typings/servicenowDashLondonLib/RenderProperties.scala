package typings
package servicenowDashLondonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProperties extends js.Object {
  def getEncodedQuery(): java.lang.String
  def getListControl(): js.Any
  def getParameterValue(value: java.lang.String): java.lang.String
  def getParameters(): js.Array[java.lang.String]
  def getReferringURL(): java.lang.String
  def getViewName(): java.lang.String
  def getWindowProperties(): js.Any
  def isInDevStudio(): scala.Boolean
  def isInteractive(): scala.Boolean
  def isManyToMany(): scala.Boolean
  def isRelatedList(): scala.Boolean
}

object RenderProperties {
  @scala.inline
  def apply(
    getEncodedQuery: () => java.lang.String,
    getListControl: () => js.Any,
    getParameterValue: java.lang.String => java.lang.String,
    getParameters: () => js.Array[java.lang.String],
    getReferringURL: () => java.lang.String,
    getViewName: () => java.lang.String,
    getWindowProperties: () => js.Any,
    isInDevStudio: () => scala.Boolean,
    isInteractive: () => scala.Boolean,
    isManyToMany: () => scala.Boolean,
    isRelatedList: () => scala.Boolean
  ): RenderProperties = {
    val __obj = js.Dynamic.literal(getEncodedQuery = js.Any.fromFunction0(getEncodedQuery), getListControl = js.Any.fromFunction0(getListControl), getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = js.Any.fromFunction0(getParameters), getReferringURL = js.Any.fromFunction0(getReferringURL), getViewName = js.Any.fromFunction0(getViewName), getWindowProperties = js.Any.fromFunction0(getWindowProperties), isInDevStudio = js.Any.fromFunction0(isInDevStudio), isInteractive = js.Any.fromFunction0(isInteractive), isManyToMany = js.Any.fromFunction0(isManyToMany), isRelatedList = js.Any.fromFunction0(isRelatedList))
  
    __obj.asInstanceOf[RenderProperties]
  }
}

