package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMap
  extends /* key */ StringDictionary[SchemaLike | js.Array[SchemaLike]]
     with _SchemaLike

object SchemaMap {
  @scala.inline
  def apply(): SchemaMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMap]
  }
}

