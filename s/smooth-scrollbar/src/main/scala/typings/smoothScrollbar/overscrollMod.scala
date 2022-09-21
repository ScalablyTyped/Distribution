package typings.smoothScrollbar

import typings.smoothScrollbar.mod.ScrollbarPlugin
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overscrollMod {
  
  @JSImport("smooth-scrollbar/plugins/overscroll", JSImport.Default)
  @js.native
  open class default () extends OverscrollPlugin
  /* static members */
  object default {
    
    @JSImport("smooth-scrollbar/plugins/overscroll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smooth-scrollbar/plugins/overscroll", "default.defaultOptions")
    @js.native
    def defaultOptions: OverscrollOptions = js.native
    inline def defaultOptions_=(x: OverscrollOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("smooth-scrollbar/plugins/overscroll", "default.pluginName")
    @js.native
    def pluginName: String = js.native
    inline def pluginName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait OverscrollEffect extends StObject
  @JSImport("smooth-scrollbar/plugins/overscroll", "OverscrollEffect")
  @js.native
  object OverscrollEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OverscrollEffect & String] = js.native
    
    @js.native
    sealed trait BOUNCE
      extends StObject
         with OverscrollEffect
    /* "bounce" */ val BOUNCE: typings.smoothScrollbar.overscrollMod.OverscrollEffect.BOUNCE & String = js.native
    
    @js.native
    sealed trait GLOW
      extends StObject
         with OverscrollEffect
    /* "glow" */ val GLOW: typings.smoothScrollbar.overscrollMod.OverscrollEffect.GLOW & String = js.native
  }
  
  trait Data2d extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Data2d {
    
    inline def apply(x: Double, y: Double): Data2d = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data2d]
    }
    
    extension [Self <: Data2d](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type OnScrollCallback = js.ThisFunction1[/* this */ OverscrollPlugin, /* position */ Data2d, Unit]
  
  trait OverscrollOptions extends StObject {
    
    var damping: Double
    
    var effect: js.UndefOr[OverscrollEffect] = js.undefined
    
    var glowColor: String
    
    var maxOverscroll: Double
    
    var onScroll: js.UndefOr[OnScrollCallback] = js.undefined
  }
  object OverscrollOptions {
    
    inline def apply(damping: Double, glowColor: String, maxOverscroll: Double): OverscrollOptions = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], glowColor = glowColor.asInstanceOf[js.Any], maxOverscroll = maxOverscroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverscrollOptions]
    }
    
    extension [Self <: OverscrollOptions](x: Self) {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: OverscrollEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setGlowColor(value: String): Self = StObject.set(x, "glowColor", value.asInstanceOf[js.Any])
      
      inline def setMaxOverscroll(value: Double): Self = StObject.set(x, "maxOverscroll", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: OnScrollCallback): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    }
  }
  
  @js.native
  trait OverscrollPlugin extends ScrollbarPlugin {
    
    /* private */ var _absorbMomentum: Any = js.native
    
    /* private */ var _addAmplitude: Any = js.native
    
    /* private */ var _amplitude: Any = js.native
    
    /* private */ var _bounce: Any = js.native
    
    /* private */ val _enabled: Any = js.native
    
    /* private */ var _glow: Any = js.native
    
    /* private */ val _isWheelLocked: Any = js.native
    
    /* private */ var _lastEventType: Any = js.native
    
    /* private */ var _lockWheel: Any = js.native
    
    /* private */ var _nextAmp: Any = js.native
    
    /* private */ var _position: Any = js.native
    
    /* private */ var _releaseWheel: Any = js.native
    
    /* private */ var _render: Any = js.native
    
    /* private */ var _touching: Any = js.native
    
    /* private */ var _wheelScrollBack: Any = js.native
    
    /* private */ var _willOverscroll: Any = js.native
    
    def onRender(remainMomentum: Data2d): Unit = js.native
    
    @JSName("options")
    var options_OverscrollPlugin: OverscrollOptions = js.native
    
    def transformDelta(delta: Data2d, fromEvent: Event): Data2d = js.native
  }
}
