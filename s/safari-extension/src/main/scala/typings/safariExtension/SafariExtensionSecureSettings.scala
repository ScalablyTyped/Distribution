package typings.safariExtension

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionSecureSettings
  extends SafariEventTarget
     with /* index */ StringDictionary[js.Any] {
  
  def clear(): Unit = js.native
  
  def getItem(key: String): js.Any = js.native
  
  def removeItem(key: String): Unit = js.native
  
  def setItem(key: String, value: js.Any): Unit = js.native
}
