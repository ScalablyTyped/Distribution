package typings.sipDotJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/parameters", JSImport.Namespace)
@js.native
object libCoreMessagesParametersMod extends js.Object {
  @js.native
  class Parameters protected () extends js.Object {
    def this(parameters: StringDictionary[String]) = this()
    var parameters: StringDictionary[String] = js.native
    def clearParams(): Unit = js.native
    def deleteParam(parameter: String): js.Any = js.native
    def getParam(key: String): js.UndefOr[String] = js.native
    def hasParam(key: String): Boolean = js.native
    def setParam(key: String, value: js.Any): Unit = js.native
  }
  
}

