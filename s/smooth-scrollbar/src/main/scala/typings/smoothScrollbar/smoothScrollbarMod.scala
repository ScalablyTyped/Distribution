package typings.smoothScrollbar

import org.scalablytyped.runtime.StringDictionary
import typings.smoothScrollbar.anon.TypeofScrollbarPlugin
import typings.smoothScrollbar.data2dMod.Data2d
import typings.smoothScrollbar.smoothScrollbarScrollbarMod.Scrollbar
import typings.std.Event
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smoothScrollbarMod {
  
  @JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
  @js.native
  class ScrollbarPlugin protected ()
    extends typings.smoothScrollbar.pluginMod.ScrollbarPlugin {
    def this(scrollbar: Scrollbar) = this()
    def this(scrollbar: Scrollbar, options: js.Any) = this()
    
    def transformDelta(delta: Data2d, _evt: Event): Data2d = js.native
  }
  /* static members */
  object ScrollbarPlugin {
    
    @JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    @scala.inline
    def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin.pluginName")
    @js.native
    def pluginName: String = js.native
    @scala.inline
    def pluginName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("smooth-scrollbar/plugin", "addPlugins")
  @js.native
  def addPlugins(Plugins: TypeofScrollbarPlugin*): Unit = js.native
  
  @JSImport("smooth-scrollbar/plugin", "globalPlugins")
  @js.native
  val globalPlugins: PluginMap = js.native
  
  @JSImport("smooth-scrollbar/plugin", "initPlugins")
  @js.native
  def initPlugins(scrollbar: Scrollbar, options: js.Any): js.Array[ScrollbarPlugin] = js.native
  
  @js.native
  trait PluginMap extends StObject {
    
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
    implicit class PluginMapMutableBuilder[Self <: PluginMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstructors(value: StringDictionary[TypeofScrollbarPlugin]): Self = StObject.set(x, "constructors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Set[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
}
