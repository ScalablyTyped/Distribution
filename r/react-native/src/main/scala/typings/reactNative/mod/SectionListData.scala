package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionListData[ItemT]
  extends SectionBase[ItemT]
     with /* key */ StringDictionary[js.Any]

object SectionListData {
  @scala.inline
  def apply[ItemT](data: js.Array[ItemT]): SectionListData[ItemT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListData[ItemT]]
  }
}

