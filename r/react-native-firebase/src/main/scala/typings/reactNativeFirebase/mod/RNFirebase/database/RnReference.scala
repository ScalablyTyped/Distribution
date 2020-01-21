package typings.reactNativeFirebase.mod.RNFirebase.database

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RnReference
  extends Reference
     with /* key */ StringDictionary[js.Any] {
  def filter(name: String, value: js.Any): js.Any = js.native
  def filter(name: String, value: js.Any, key: String): js.Any = js.native
  def keepSynced(bool: Boolean): js.Any = js.native
}

