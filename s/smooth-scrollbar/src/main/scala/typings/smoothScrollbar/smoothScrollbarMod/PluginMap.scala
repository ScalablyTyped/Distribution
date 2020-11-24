package typings.smoothScrollbar.smoothScrollbarMod

import org.scalablytyped.runtime.StringDictionary
import typings.smoothScrollbar.anon.TypeofScrollbarPlugin
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMap extends js.Object {
  
  var constructors: StringDictionary[TypeofScrollbarPlugin] = js.native
  
  var order: Set[String] = js.native
}
object PluginMap {
  
  @scala.inline
  def apply(constructors: StringDictionary[TypeofScrollbarPlugin], order: Set[String]): PluginMap = {
    val __obj = js.Dynamic.literal(constructors = constructors.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMap]
  }
  
  @scala.inline
  implicit class PluginMapOps[Self <: PluginMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstructors(value: StringDictionary[TypeofScrollbarPlugin]): Self = this.set("constructors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Set[String]): Self = this.set("order", value.asInstanceOf[js.Any])
  }
}
