package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametersMod {
  
  @JSImport("sip.js/lib/grammar/parameters", "Parameters")
  @js.native
  class Parameters protected () extends StObject {
    def this(parameters: StringDictionary[String]) = this()
    
    def clearParams(): Unit = js.native
    
    def deleteParam(parameter: String): js.Any = js.native
    
    def getParam(key: String): js.UndefOr[String] = js.native
    
    def hasParam(key: String): Boolean = js.native
    
    var parameters: StringDictionary[String] = js.native
    
    def setParam(key: String, value: js.Any): Unit = js.native
  }
}
