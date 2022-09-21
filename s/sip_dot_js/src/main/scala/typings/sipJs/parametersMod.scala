package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametersMod {
  
  @JSImport("sip.js/lib/grammar/parameters", "Parameters")
  @js.native
  open class Parameters protected () extends StObject {
    def this(parameters: StringDictionary[js.UndefOr[String | Double | Null]]) = this()
    
    def clearParams(): Unit = js.native
    
    def deleteParam(key: String): js.UndefOr[String | Null] = js.native
    
    def getParam(key: String): js.UndefOr[String | Null] = js.native
    
    def hasParam(key: String): Boolean = js.native
    
    var parameters: StringDictionary[String | Null] = js.native
    
    def setParam(key: String): Unit = js.native
    def setParam(key: String, value: String): Unit = js.native
    def setParam(key: String, value: Double): Unit = js.native
  }
}
