package typings
package sipDotJsLib.libURIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/URI", "Parameters")
@js.native
class Parameters protected () extends js.Object {
  def this(parameters: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  var parameters: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  def clearParams(): scala.Unit = js.native
  def deleteParam(parameter: java.lang.String): js.Any = js.native
  def getParam(key: java.lang.String): js.Any = js.native
  def hasParam(key: java.lang.String): scala.Boolean = js.native
  def setParam(key: java.lang.String, value: js.Any): scala.Unit = js.native
}

