package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreHttpAjaxMod {
  
  @js.native
  trait Ajax extends StObject {
    
    var abort: js.Function = js.native
    
    var onerror: js.Function = js.native
    
    var onload: js.Function = js.native
    
    var onprogress: js.Function = js.native
    
    var onreadystatechange: js.Function = js.native
    
    var ontimeout: js.Function = js.native
    
    def open(method: String, url: String): Unit = js.native
    def open(method: String, url: String, async: Boolean): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, user: Unit, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, user: String): Unit = js.native
    def open(method: String, url: String, async: Unit, user: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Unit, user: Unit, password: String): Unit = js.native
    
    var readyState: Double = js.native
    
    var responseText: String = js.native
    
    def send(): Unit = js.native
    def send(payload: Any): Unit = js.native
    
    def setRequestHeader(key: String, value: String): Unit = js.native
    
    var status: Double = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
}
