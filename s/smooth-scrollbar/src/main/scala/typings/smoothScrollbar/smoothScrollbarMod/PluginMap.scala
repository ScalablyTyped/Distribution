package typings.smoothScrollbar.smoothScrollbarMod

import org.scalablytyped.runtime.StringDictionary
import typings.smoothScrollbar.TypeofScrollbarPlugin
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMap extends js.Object {
  var constructors: StringDictionary[TypeofScrollbarPlugin]
  var order: Set[String]
}

object PluginMap {
  @scala.inline
  def apply(constructors: StringDictionary[TypeofScrollbarPlugin], order: Set[String]): PluginMap = {
    val __obj = js.Dynamic.literal(constructors = constructors.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginMap]
  }
}

