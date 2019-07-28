package typings.safariDashExtension

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionSettings
  extends SafariEventTarget
     with /* index */ StringDictionary[js.Any]
     with /* index */ NumberDictionary[js.Any] {
  def clear(): Unit = js.native
  def getItem(key: String): js.Any = js.native
  def removeItem(key: String): Unit = js.native
  def setItem(key: String, value: js.Any): Unit = js.native
}

