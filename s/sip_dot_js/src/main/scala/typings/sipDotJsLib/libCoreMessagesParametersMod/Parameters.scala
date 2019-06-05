package typings
package sipDotJsLib.libCoreMessagesParametersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/parameters", "Parameters")
@js.native
class Parameters protected () extends js.Object {
  def this(parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  var parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def clearParams(): scala.Unit = js.native
  def deleteParam(parameter: java.lang.String): js.Any = js.native
  def getParam(key: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def hasParam(key: java.lang.String): scala.Boolean = js.native
  def setParam(key: java.lang.String, value: js.Any): scala.Unit = js.native
}

