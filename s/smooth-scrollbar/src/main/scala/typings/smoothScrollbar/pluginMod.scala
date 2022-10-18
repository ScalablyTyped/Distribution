package typings.smoothScrollbar

import org.scalablytyped.runtime.StringDictionary
import typings.smoothScrollbar.anon.TypeofScrollbarPlugin
import typings.smoothScrollbar.interfacesData2dMod.Data2d
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.Event
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("smooth-scrollbar/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
  @js.native
  open class ScrollbarPlugin protected ()
    extends StObject
       with typings.smoothScrollbar.interfacesPluginMod.ScrollbarPlugin {
    def this(scrollbar: Scrollbar) = this()
    def this(scrollbar: Scrollbar, options: Any) = this()
    
    /* CompleteClass */
    override val name: String = js.native
    
    /* CompleteClass */
    override def onDestroy(): Unit = js.native
    
    /* CompleteClass */
    override def onInit(): Unit = js.native
    
    /* CompleteClass */
    override def onRender(remainMomentum: Data2d): Unit = js.native
    
    /* CompleteClass */
    override def onUpdate(): Unit = js.native
    
    /* CompleteClass */
    override val options: Any = js.native
    
    /* CompleteClass */
    override val scrollbar: typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar = js.native
    
    def transformDelta(delta: Data2d, _evt: Event): Data2d = js.native
    /* CompleteClass */
    override def transformDelta(delta: Data2d, fromEvent: Any): Data2d = js.native
  }
  /* static members */
  object ScrollbarPlugin {
    
    @JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("smooth-scrollbar/plugin", "ScrollbarPlugin.pluginName")
    @js.native
    def pluginName: String = js.native
    inline def pluginName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(x.asInstanceOf[js.Any])
  }
  
  inline def addPlugins(Plugins: TypeofScrollbarPlugin*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(Plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("smooth-scrollbar/plugin", "globalPlugins")
  @js.native
  val globalPlugins: PluginMap = js.native
  
  inline def initPlugins(scrollbar: Scrollbar, options: Any): js.Array[ScrollbarPlugin] = (^.asInstanceOf[js.Dynamic].applyDynamic("initPlugins")(scrollbar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScrollbarPlugin]]
  
  trait PluginMap extends StObject {
    
    var constructors: StringDictionary[TypeofScrollbarPlugin]
    
    var order: Set[String]
  }
  object PluginMap {
    
    inline def apply(constructors: StringDictionary[TypeofScrollbarPlugin], order: Set[String]): PluginMap = {
      val __obj = js.Dynamic.literal(constructors = constructors.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginMap]
    }
    
    extension [Self <: PluginMap](x: Self) {
      
      inline def setConstructors(value: StringDictionary[TypeofScrollbarPlugin]): Self = StObject.set(x, "constructors", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Set[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
}
