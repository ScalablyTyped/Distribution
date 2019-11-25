package typings.smoothDashScrollbar.pluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.smoothDashScrollbar.TypeofClassScrollbarPlugin
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMap extends js.Object {
  var constructors: StringDictionary[TypeofClassScrollbarPlugin]
  var order: Set[String]
}

object PluginMap {
  @scala.inline
  def apply(constructors: StringDictionary[TypeofClassScrollbarPlugin], order: Set[String]): PluginMap = {
    val __obj = js.Dynamic.literal(constructors = constructors.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginMap]
  }
}

