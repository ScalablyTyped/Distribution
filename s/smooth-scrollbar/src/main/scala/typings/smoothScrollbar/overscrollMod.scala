package typings.smoothScrollbar

import typings.smoothScrollbar.mod.ScrollbarPlugin
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overscrollMod {
  
  @JSImport("smooth-scrollbar/plugins/overscroll", JSImport.Default)
  @js.native
  class default () extends OverscrollPlugin
  /* static members */
  object default {
    
    @JSImport("smooth-scrollbar/plugins/overscroll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smooth-scrollbar/plugins/overscroll", "default.defaultOptions")
    @js.native
    def defaultOptions: OverscrollOptions = js.native
    @scala.inline
    def defaultOptions_=(x: OverscrollOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("smooth-scrollbar/plugins/overscroll", "default.pluginName")
    @js.native
    def pluginName: String = js.native
    @scala.inline
    def pluginName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(x.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(x: Double, y: Double): Data2d = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data2d]
    }
    
    @scala.inline
    implicit class Data2dMutableBuilder[Self <: Data2d] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(damping: Double, glowColor: String, maxOverscroll: Double): OverscrollOptions = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], glowColor = glowColor.asInstanceOf[js.Any], maxOverscroll = maxOverscroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverscrollOptions]
    }
    
    @scala.inline
    implicit class OverscrollOptionsMutableBuilder[Self <: OverscrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: OverscrollEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setGlowColor(value: String): Self = StObject.set(x, "glowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOverscroll(value: Double): Self = StObject.set(x, "maxOverscroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScroll(value: OnScrollCallback): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    }
  }
  
  @js.native
  trait OverscrollPlugin extends ScrollbarPlugin {
    
    var _absorbMomentum: js.Any = js.native
    
    var _addAmplitude: js.Any = js.native
    
    var _amplitude: js.Any = js.native
    
    var _bounce: js.Any = js.native
    
    val _enabled: js.Any = js.native
    
    var _glow: js.Any = js.native
    
    val _isWheelLocked: js.Any = js.native
    
    var _lastEventType: js.Any = js.native
    
    var _lockWheel: js.Any = js.native
    
    var _nextAmp: js.Any = js.native
    
    var _position: js.Any = js.native
    
    var _releaseWheel: js.Any = js.native
    
    var _render: js.Any = js.native
    
    var _touching: js.Any = js.native
    
    var _wheelScrollBack: js.Any = js.native
    
    var _willOverscroll: js.Any = js.native
    
    def onRender(remainMomentum: Data2d): Unit = js.native
    
    @JSName("options")
    var options_OverscrollPlugin: OverscrollOptions = js.native
    
    def transformDelta(delta: Data2d, fromEvent: Event): Data2d = js.native
  }
}
