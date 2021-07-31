package typings.rotJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.rotJs.anon.Height
import typings.rotJs.anon.PartialDisplayOptions
import typings.rotJs.anon.PartialOptions
import typings.rotJs.anon.PartialOptionsBorn
import typings.rotJs.anon.PartialOptionsCellHeight
import typings.rotJs.anon.PartialOptionsCorridorLength
import typings.rotJs.anon.PartialOptionsEmissionThreshold
import typings.rotJs.anon.PartialOptionsOrder
import typings.rotJs.anon.PartialOptionsRoomDugPercentage
import typings.rotJs.anon.TypeofRect
import typings.rotJs.anon.TypeofTileGL
import typings.rotJs.displayMod.default
import typings.rotJs.lightingMod.ReflectivityCallback
import typings.rotJs.pathPathMod.PassableCallback
import typings.rotJs.speedMod.SpeedActor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rot-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Color {
    
    @JSImport("rot-js", "Color")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def add(color1: typings.rotJs.colorMod.Color, colors: typings.rotJs.colorMod.Color*): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(color1.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def add_(color1: typings.rotJs.colorMod.Color, colors: typings.rotJs.colorMod.Color*): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("add_")(color1.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def fromString(str: String): typings.rotJs.colorMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def hsl2rgb(color: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(color.asInstanceOf[js.Any]).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def interpolate(color1: typings.rotJs.colorMod.Color, color2: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    @scala.inline
    def interpolate(color1: typings.rotJs.colorMod.Color, color2: typings.rotJs.colorMod.Color, factor: Double): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def interpolateHSL(color1: typings.rotJs.colorMod.Color, color2: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHSL")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    @scala.inline
    def interpolateHSL(color1: typings.rotJs.colorMod.Color, color2: typings.rotJs.colorMod.Color, factor: Double): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHSL")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @JSImport("rot-js", "Color.lerp")
    @js.native
    val lerp: /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolate */ js.Any = js.native
    
    @JSImport("rot-js", "Color.lerpHSL")
    @js.native
    val lerpHSL: /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolateHSL */ js.Any = js.native
    
    @scala.inline
    def multiply(color1: typings.rotJs.colorMod.Color, colors: typings.rotJs.colorMod.Color*): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(color1.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def multiply_(color1: typings.rotJs.colorMod.Color, colors: typings.rotJs.colorMod.Color*): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply_")(color1.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def randomize(color: typings.rotJs.colorMod.Color, diff: Double): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("randomize")(color.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    @scala.inline
    def randomize(color: typings.rotJs.colorMod.Color, diff: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("randomize")(color.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def rgb2hsl(color: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsl")(color.asInstanceOf[js.Any]).asInstanceOf[typings.rotJs.colorMod.Color]
    
    @scala.inline
    def toHex(color: typings.rotJs.colorMod.Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def toRGB(color: typings.rotJs.colorMod.Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGB")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("rot-js", "DEFAULT_HEIGHT")
  @js.native
  def DEFAULT_HEIGHT: Double = js.native
  @scala.inline
  def DEFAULT_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_HEIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("rot-js", "DEFAULT_WIDTH")
  @js.native
  def DEFAULT_WIDTH: Double = js.native
  @scala.inline
  def DEFAULT_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_WIDTH")(x.asInstanceOf[js.Any])
  
  object DIRS {
    
    @JSImport("rot-js", "DIRS.4")
    @js.native
    val `4`: js.Array[js.Array[Double]] = js.native
    
    @JSImport("rot-js", "DIRS.6")
    @js.native
    val `6`: js.Array[js.Array[Double]] = js.native
    
    @JSImport("rot-js", "DIRS.8")
    @js.native
    val `8`: js.Array[js.Array[Double]] = js.native
  }
  
  @JSImport("rot-js", "Display")
  @js.native
  class Display () extends default {
    def this(options: PartialDisplayOptions) = this()
  }
  /* static members */
  object Display {
    
    @JSImport("rot-js", "Display")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rot-js", "Display.Hex")
    @js.native
    def Hex: Instantiable0[typings.rotJs.hexMod.default] = js.native
    @scala.inline
    def Hex_=(x: Instantiable0[typings.rotJs.hexMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hex")(x.asInstanceOf[js.Any])
    
    @JSImport("rot-js", "Display.Rect")
    @js.native
    def Rect: TypeofRect = js.native
    @scala.inline
    def Rect_=(x: TypeofRect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    @JSImport("rot-js", "Display.Term")
    @js.native
    def Term: Instantiable0[typings.rotJs.termMod.default] = js.native
    @scala.inline
    def Term_=(x: Instantiable0[typings.rotJs.termMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Term")(x.asInstanceOf[js.Any])
    
    @JSImport("rot-js", "Display.Tile")
    @js.native
    def Tile: Instantiable0[typings.rotJs.tileMod.default] = js.native
    
    @JSImport("rot-js", "Display.TileGL")
    @js.native
    def TileGL: TypeofTileGL = js.native
    @scala.inline
    def TileGL_=(x: TypeofTileGL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TileGL")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Tile_=(x: Instantiable0[typings.rotJs.tileMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tile")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rot-js", "Engine")
  @js.native
  class Engine protected ()
    extends typings.rotJs.engineMod.default {
    def this(scheduler: typings.rotJs.schedulerSchedulerMod.default[js.Any]) = this()
  }
  
  @JSImport("rot-js", "EventQueue")
  @js.native
  /**
    * @class Generic event queue: stores events and retrieves them based on their time
    */
  class EventQueue[T] ()
    extends typings.rotJs.eventqueueMod.default[T]
  
  object FOV {
    
    @JSImport("rot-js", "FOV")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "FOV.DiscreteShadowcasting")
    @js.native
    class DiscreteShadowcasting ()
      extends typings.rotJs.discreteShadowcastingMod.default
    @JSImport("rot-js", "FOV.DiscreteShadowcasting")
    @js.native
    def DiscreteShadowcasting: Instantiable0[typings.rotJs.discreteShadowcastingMod.default] = js.native
    @scala.inline
    def DiscreteShadowcasting_=(x: Instantiable0[typings.rotJs.discreteShadowcastingMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DiscreteShadowcasting")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "FOV.PreciseShadowcasting")
    @js.native
    class PreciseShadowcasting ()
      extends typings.rotJs.preciseShadowcastingMod.default
    @JSImport("rot-js", "FOV.PreciseShadowcasting")
    @js.native
    def PreciseShadowcasting: Instantiable0[typings.rotJs.preciseShadowcastingMod.default] = js.native
    @scala.inline
    def PreciseShadowcasting_=(x: Instantiable0[typings.rotJs.preciseShadowcastingMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreciseShadowcasting")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "FOV.RecursiveShadowcasting")
    @js.native
    class RecursiveShadowcasting ()
      extends typings.rotJs.recursiveShadowcastingMod.default
    @JSImport("rot-js", "FOV.RecursiveShadowcasting")
    @js.native
    def RecursiveShadowcasting: Instantiable0[typings.rotJs.recursiveShadowcastingMod.default] = js.native
    @scala.inline
    def RecursiveShadowcasting_=(x: Instantiable0[typings.rotJs.recursiveShadowcastingMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RecursiveShadowcasting")(x.asInstanceOf[js.Any])
  }
  
  object KEYS {
    
    @JSImport("rot-js", "KEYS")
    @js.native
    val ^ : js.Any = js.native
    
    /***/
    @JSImport("rot-js", "KEYS.VK_0")
    @js.native
    def VK_0: Double = js.native
    @scala.inline
    def VK_0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_0")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_1")
    @js.native
    def VK_1: Double = js.native
    @scala.inline
    def VK_1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_1")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_2")
    @js.native
    def VK_2: Double = js.native
    @scala.inline
    def VK_2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_2")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_3")
    @js.native
    def VK_3: Double = js.native
    @scala.inline
    def VK_3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_3")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_4")
    @js.native
    def VK_4: Double = js.native
    @scala.inline
    def VK_4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_4")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_5")
    @js.native
    def VK_5: Double = js.native
    @scala.inline
    def VK_5_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_5")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_6")
    @js.native
    def VK_6: Double = js.native
    @scala.inline
    def VK_6_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_6")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_7")
    @js.native
    def VK_7: Double = js.native
    @scala.inline
    def VK_7_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_7")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_8")
    @js.native
    def VK_8: Double = js.native
    @scala.inline
    def VK_8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_8")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_9")
    @js.native
    def VK_9: Double = js.native
    @scala.inline
    def VK_9_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_9")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_A")
    @js.native
    def VK_A: Double = js.native
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_ACCEPT")
    @js.native
    def VK_ACCEPT: Double = js.native
    @scala.inline
    def VK_ACCEPT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_ACCEPT")(x.asInstanceOf[js.Any])
    
    /** + on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_ADD")
    @js.native
    def VK_ADD: Double = js.native
    @scala.inline
    def VK_ADD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_ADD")(x.asInstanceOf[js.Any])
    
    /** Alt (Option on Mac) key. */
    @JSImport("rot-js", "KEYS.VK_ALT")
    @js.native
    def VK_ALT: Double = js.native
    
    /** AltGr key on Linux. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_ALTGR")
    @js.native
    def VK_ALTGR: Double = js.native
    @scala.inline
    def VK_ALTGR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_ALTGR")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_ALT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_ALT")(x.asInstanceOf[js.Any])
    
    /** Ampersand (&) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_AMPERSAND")
    @js.native
    def VK_AMPERSAND: Double = js.native
    @scala.inline
    def VK_AMPERSAND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_AMPERSAND")(x.asInstanceOf[js.Any])
    
    @JSImport("rot-js", "KEYS.VK_ASTERISK")
    @js.native
    def VK_ASTERISK: Double = js.native
    @scala.inline
    def VK_ASTERISK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_ASTERISK")(x.asInstanceOf[js.Any])
    
    /** Atmark (@) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_AT")
    @js.native
    def VK_AT: Double = js.native
    @scala.inline
    def VK_AT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_AT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_A")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_B")
    @js.native
    def VK_B: Double = js.native
    
    /** Back tick (`) key. */
    @JSImport("rot-js", "KEYS.VK_BACK_QUOTE")
    @js.native
    def VK_BACK_QUOTE: Double = js.native
    @scala.inline
    def VK_BACK_QUOTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_BACK_QUOTE")(x.asInstanceOf[js.Any])
    
    /** Back slash (\) key. */
    @JSImport("rot-js", "KEYS.VK_BACK_SLASH")
    @js.native
    def VK_BACK_SLASH: Double = js.native
    @scala.inline
    def VK_BACK_SLASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_BACK_SLASH")(x.asInstanceOf[js.Any])
    
    /** Backspace key. */
    @JSImport("rot-js", "KEYS.VK_BACK_SPACE")
    @js.native
    def VK_BACK_SPACE: Double = js.native
    @scala.inline
    def VK_BACK_SPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_BACK_SPACE")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_B")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_C")
    @js.native
    def VK_C: Double = js.native
    
    /** Cancel key. */
    @JSImport("rot-js", "KEYS.VK_CANCEL")
    @js.native
    def VK_CANCEL: Double = js.native
    @scala.inline
    def VK_CANCEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CANCEL")(x.asInstanceOf[js.Any])
    
    /** Caps lock. */
    @JSImport("rot-js", "KEYS.VK_CAPS_LOCK")
    @js.native
    def VK_CAPS_LOCK: Double = js.native
    @scala.inline
    def VK_CAPS_LOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CAPS_LOCK")(x.asInstanceOf[js.Any])
    
    /** Circumflex (^) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_CIRCUMFLEX")
    @js.native
    def VK_CIRCUMFLEX: Double = js.native
    @scala.inline
    def VK_CIRCUMFLEX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CIRCUMFLEX")(x.asInstanceOf[js.Any])
    
    /** 5 key on Numpad when NumLock is unlocked. Or on Mac, clear key which is positioned at NumLock key. */
    @JSImport("rot-js", "KEYS.VK_CLEAR")
    @js.native
    def VK_CLEAR: Double = js.native
    @scala.inline
    def VK_CLEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CLEAR")(x.asInstanceOf[js.Any])
    
    /** Close square bracket (]) key. */
    @JSImport("rot-js", "KEYS.VK_CLOSE_BRACKET")
    @js.native
    def VK_CLOSE_BRACKET: Double = js.native
    @scala.inline
    def VK_CLOSE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CLOSE_BRACKET")(x.asInstanceOf[js.Any])
    
    /** Close curly bracket (}) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_CLOSE_CURLY_BRACKET")
    @js.native
    def VK_CLOSE_CURLY_BRACKET: Double = js.native
    @scala.inline
    def VK_CLOSE_CURLY_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CLOSE_CURLY_BRACKET")(x.asInstanceOf[js.Any])
    
    /** Close parenthesis ()) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_CLOSE_PAREN")
    @js.native
    def VK_CLOSE_PAREN: Double = js.native
    @scala.inline
    def VK_CLOSE_PAREN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CLOSE_PAREN")(x.asInstanceOf[js.Any])
    
    /** Colon (:) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_COLON")
    @js.native
    def VK_COLON: Double = js.native
    @scala.inline
    def VK_COLON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_COLON")(x.asInstanceOf[js.Any])
    
    /** Comma (,) key. */
    @JSImport("rot-js", "KEYS.VK_COMMA")
    @js.native
    def VK_COMMA: Double = js.native
    @scala.inline
    def VK_COMMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_COMMA")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_CONTEXT_MENU")
    @js.native
    def VK_CONTEXT_MENU: Double = js.native
    @scala.inline
    def VK_CONTEXT_MENU_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CONTEXT_MENU")(x.asInstanceOf[js.Any])
    
    /** Control key. */
    @JSImport("rot-js", "KEYS.VK_CONTROL")
    @js.native
    def VK_CONTROL: Double = js.native
    @scala.inline
    def VK_CONTROL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CONTROL")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_CONVERT")
    @js.native
    def VK_CONVERT: Double = js.native
    @scala.inline
    def VK_CONVERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_CONVERT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_C_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_C")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_D")
    @js.native
    def VK_D: Double = js.native
    
    /** Decimal point on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_DECIMAL")
    @js.native
    def VK_DECIMAL: Double = js.native
    @scala.inline
    def VK_DECIMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_DECIMAL")(x.asInstanceOf[js.Any])
    
    /** Del(ete) key. */
    @JSImport("rot-js", "KEYS.VK_DELETE")
    @js.native
    def VK_DELETE: Double = js.native
    @scala.inline
    def VK_DELETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_DELETE")(x.asInstanceOf[js.Any])
    
    /** / on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_DIVIDE")
    @js.native
    def VK_DIVIDE: Double = js.native
    @scala.inline
    def VK_DIVIDE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_DIVIDE")(x.asInstanceOf[js.Any])
    
    /** Dollar sign ($) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_DOLLAR")
    @js.native
    def VK_DOLLAR: Double = js.native
    @scala.inline
    def VK_DOLLAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_DOLLAR")(x.asInstanceOf[js.Any])
    
    /** Double quote () key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_DOUBLE_QUOTE")
    @js.native
    def VK_DOUBLE_QUOTE: Double = js.native
    @scala.inline
    def VK_DOUBLE_QUOTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_DOUBLE_QUOTE")(x.asInstanceOf[js.Any])
    
    /** Down arrow. */
    @JSImport("rot-js", "KEYS.VK_DOWN")
    @js.native
    def VK_DOWN: Double = js.native
    @scala.inline
    def VK_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_DOWN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_D_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_D")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_E")
    @js.native
    def VK_E: Double = js.native
    
    /** 英数 key on Japanese Mac keyboard. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_EISU")
    @js.native
    def VK_EISU: Double = js.native
    @scala.inline
    def VK_EISU_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_EISU")(x.asInstanceOf[js.Any])
    
    /** End key. */
    @JSImport("rot-js", "KEYS.VK_END")
    @js.native
    def VK_END: Double = js.native
    @scala.inline
    def VK_END_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_END")(x.asInstanceOf[js.Any])
    
    /** Reserved, but not used. */
    @JSImport("rot-js", "KEYS.VK_ENTER")
    @js.native
    def VK_ENTER: Double = js.native
    @scala.inline
    def VK_ENTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_ENTER")(x.asInstanceOf[js.Any])
    
    /** Equals (=) key. */
    @JSImport("rot-js", "KEYS.VK_EQUALS")
    @js.native
    def VK_EQUALS: Double = js.native
    @scala.inline
    def VK_EQUALS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_EQUALS")(x.asInstanceOf[js.Any])
    
    /** Escape key. */
    @JSImport("rot-js", "KEYS.VK_ESCAPE")
    @js.native
    def VK_ESCAPE: Double = js.native
    @scala.inline
    def VK_ESCAPE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_ESCAPE")(x.asInstanceOf[js.Any])
    
    /** Exclamation (!) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_EXCLAMATION")
    @js.native
    def VK_EXCLAMATION: Double = js.native
    @scala.inline
    def VK_EXCLAMATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_EXCLAMATION")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_EXECUTE")
    @js.native
    def VK_EXECUTE: Double = js.native
    @scala.inline
    def VK_EXECUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_EXECUTE")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_E_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_E")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_F")
    @js.native
    def VK_F: Double = js.native
    
    /** F1 key. */
    @JSImport("rot-js", "KEYS.VK_F1")
    @js.native
    def VK_F1: Double = js.native
    
    /** F10 key. */
    @JSImport("rot-js", "KEYS.VK_F10")
    @js.native
    def VK_F10: Double = js.native
    @scala.inline
    def VK_F10_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F10")(x.asInstanceOf[js.Any])
    
    /** F11 key. */
    @JSImport("rot-js", "KEYS.VK_F11")
    @js.native
    def VK_F11: Double = js.native
    @scala.inline
    def VK_F11_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F11")(x.asInstanceOf[js.Any])
    
    /** F12 key. */
    @JSImport("rot-js", "KEYS.VK_F12")
    @js.native
    def VK_F12: Double = js.native
    @scala.inline
    def VK_F12_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F12")(x.asInstanceOf[js.Any])
    
    /** F13 key. */
    @JSImport("rot-js", "KEYS.VK_F13")
    @js.native
    def VK_F13: Double = js.native
    @scala.inline
    def VK_F13_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F13")(x.asInstanceOf[js.Any])
    
    /** F14 key. */
    @JSImport("rot-js", "KEYS.VK_F14")
    @js.native
    def VK_F14: Double = js.native
    @scala.inline
    def VK_F14_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F14")(x.asInstanceOf[js.Any])
    
    /** F15 key. */
    @JSImport("rot-js", "KEYS.VK_F15")
    @js.native
    def VK_F15: Double = js.native
    @scala.inline
    def VK_F15_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F15")(x.asInstanceOf[js.Any])
    
    /** F16 key. */
    @JSImport("rot-js", "KEYS.VK_F16")
    @js.native
    def VK_F16: Double = js.native
    @scala.inline
    def VK_F16_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F16")(x.asInstanceOf[js.Any])
    
    /** F17 key. */
    @JSImport("rot-js", "KEYS.VK_F17")
    @js.native
    def VK_F17: Double = js.native
    @scala.inline
    def VK_F17_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F17")(x.asInstanceOf[js.Any])
    
    /** F18 key. */
    @JSImport("rot-js", "KEYS.VK_F18")
    @js.native
    def VK_F18: Double = js.native
    @scala.inline
    def VK_F18_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F18")(x.asInstanceOf[js.Any])
    
    /** F19 key. */
    @JSImport("rot-js", "KEYS.VK_F19")
    @js.native
    def VK_F19: Double = js.native
    @scala.inline
    def VK_F19_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F19")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_F1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F1")(x.asInstanceOf[js.Any])
    
    /** F2 key. */
    @JSImport("rot-js", "KEYS.VK_F2")
    @js.native
    def VK_F2: Double = js.native
    
    /** F20 key. */
    @JSImport("rot-js", "KEYS.VK_F20")
    @js.native
    def VK_F20: Double = js.native
    @scala.inline
    def VK_F20_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F20")(x.asInstanceOf[js.Any])
    
    /** F21 key. */
    @JSImport("rot-js", "KEYS.VK_F21")
    @js.native
    def VK_F21: Double = js.native
    @scala.inline
    def VK_F21_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F21")(x.asInstanceOf[js.Any])
    
    /** F22 key. */
    @JSImport("rot-js", "KEYS.VK_F22")
    @js.native
    def VK_F22: Double = js.native
    @scala.inline
    def VK_F22_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F22")(x.asInstanceOf[js.Any])
    
    /** F23 key. */
    @JSImport("rot-js", "KEYS.VK_F23")
    @js.native
    def VK_F23: Double = js.native
    @scala.inline
    def VK_F23_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F23")(x.asInstanceOf[js.Any])
    
    /** F24 key. */
    @JSImport("rot-js", "KEYS.VK_F24")
    @js.native
    def VK_F24: Double = js.native
    @scala.inline
    def VK_F24_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F24")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_F2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F2")(x.asInstanceOf[js.Any])
    
    /** F3 key. */
    @JSImport("rot-js", "KEYS.VK_F3")
    @js.native
    def VK_F3: Double = js.native
    @scala.inline
    def VK_F3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F3")(x.asInstanceOf[js.Any])
    
    /** F4 key. */
    @JSImport("rot-js", "KEYS.VK_F4")
    @js.native
    def VK_F4: Double = js.native
    @scala.inline
    def VK_F4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F4")(x.asInstanceOf[js.Any])
    
    /** F5 key. */
    @JSImport("rot-js", "KEYS.VK_F5")
    @js.native
    def VK_F5: Double = js.native
    @scala.inline
    def VK_F5_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F5")(x.asInstanceOf[js.Any])
    
    /** F6 key. */
    @JSImport("rot-js", "KEYS.VK_F6")
    @js.native
    def VK_F6: Double = js.native
    @scala.inline
    def VK_F6_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F6")(x.asInstanceOf[js.Any])
    
    /** F7 key. */
    @JSImport("rot-js", "KEYS.VK_F7")
    @js.native
    def VK_F7: Double = js.native
    @scala.inline
    def VK_F7_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F7")(x.asInstanceOf[js.Any])
    
    /** F8 key. */
    @JSImport("rot-js", "KEYS.VK_F8")
    @js.native
    def VK_F8: Double = js.native
    @scala.inline
    def VK_F8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F8")(x.asInstanceOf[js.Any])
    
    /** F9 key. */
    @JSImport("rot-js", "KEYS.VK_F9")
    @js.native
    def VK_F9: Double = js.native
    @scala.inline
    def VK_F9_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F9")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_FINAL")
    @js.native
    def VK_FINAL: Double = js.native
    @scala.inline
    def VK_FINAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_FINAL")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_F_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_F")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_G")
    @js.native
    def VK_G: Double = js.native
    
    /** Greater-than (>) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_GREATER_THAN")
    @js.native
    def VK_GREATER_THAN: Double = js.native
    @scala.inline
    def VK_GREATER_THAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_GREATER_THAN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_G")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_H")
    @js.native
    def VK_H: Double = js.native
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_HANGUL")
    @js.native
    def VK_HANGUL: Double = js.native
    @scala.inline
    def VK_HANGUL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_HANGUL")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_HANJA")
    @js.native
    def VK_HANJA: Double = js.native
    @scala.inline
    def VK_HANJA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_HANJA")(x.asInstanceOf[js.Any])
    
    /** Hash (#) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_HASH")
    @js.native
    def VK_HASH: Double = js.native
    @scala.inline
    def VK_HASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_HASH")(x.asInstanceOf[js.Any])
    
    /** Help key. */
    @JSImport("rot-js", "KEYS.VK_HELP")
    @js.native
    def VK_HELP: Double = js.native
    @scala.inline
    def VK_HELP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_HELP")(x.asInstanceOf[js.Any])
    
    /** Home key. */
    @JSImport("rot-js", "KEYS.VK_HOME")
    @js.native
    def VK_HOME: Double = js.native
    @scala.inline
    def VK_HOME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_HOME")(x.asInstanceOf[js.Any])
    
    /** Hyphen-US/docs/Minus (-) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_HYPHEN_MINUS")
    @js.native
    def VK_HYPHEN_MINUS: Double = js.native
    @scala.inline
    def VK_HYPHEN_MINUS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_HYPHEN_MINUS")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_H_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_H")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_I")
    @js.native
    def VK_I: Double = js.native
    
    /** Ins(ert) key. */
    @JSImport("rot-js", "KEYS.VK_INSERT")
    @js.native
    def VK_INSERT: Double = js.native
    @scala.inline
    def VK_INSERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_INSERT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_I_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_I")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_J")
    @js.native
    def VK_J: Double = js.native
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_JUNJA")
    @js.native
    def VK_JUNJA: Double = js.native
    @scala.inline
    def VK_JUNJA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_JUNJA")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_J_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_J")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_K")
    @js.native
    def VK_K: Double = js.native
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_KANA")
    @js.native
    def VK_KANA: Double = js.native
    @scala.inline
    def VK_KANA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_KANA")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_KANJI")
    @js.native
    def VK_KANJI: Double = js.native
    @scala.inline
    def VK_KANJI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_KANJI")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_K_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_K")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_L")
    @js.native
    def VK_L: Double = js.native
    
    /** Left arrow. */
    @JSImport("rot-js", "KEYS.VK_LEFT")
    @js.native
    def VK_LEFT: Double = js.native
    @scala.inline
    def VK_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_LEFT")(x.asInstanceOf[js.Any])
    
    /** Less-than (<) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_LESS_THAN")
    @js.native
    def VK_LESS_THAN: Double = js.native
    @scala.inline
    def VK_LESS_THAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_LESS_THAN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_L_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_L")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_M")
    @js.native
    def VK_M: Double = js.native
    
    /** Meta key on Linux, Command key on Mac. */
    @JSImport("rot-js", "KEYS.VK_META")
    @js.native
    def VK_META: Double = js.native
    @scala.inline
    def VK_META_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_META")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_MODECHANGE")
    @js.native
    def VK_MODECHANGE: Double = js.native
    @scala.inline
    def VK_MODECHANGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_MODECHANGE")(x.asInstanceOf[js.Any])
    
    /** * on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_MULTIPLY")
    @js.native
    def VK_MULTIPLY: Double = js.native
    @scala.inline
    def VK_MULTIPLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_MULTIPLY")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_M_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_M")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_N")
    @js.native
    def VK_N: Double = js.native
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_NONCONVERT")
    @js.native
    def VK_NONCONVERT: Double = js.native
    @scala.inline
    def VK_NONCONVERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NONCONVERT")(x.asInstanceOf[js.Any])
    
    /** 0 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD0")
    @js.native
    def VK_NUMPAD0: Double = js.native
    @scala.inline
    def VK_NUMPAD0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD0")(x.asInstanceOf[js.Any])
    
    /** 1 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD1")
    @js.native
    def VK_NUMPAD1: Double = js.native
    @scala.inline
    def VK_NUMPAD1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD1")(x.asInstanceOf[js.Any])
    
    /** 2 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD2")
    @js.native
    def VK_NUMPAD2: Double = js.native
    @scala.inline
    def VK_NUMPAD2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD2")(x.asInstanceOf[js.Any])
    
    /** 3 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD3")
    @js.native
    def VK_NUMPAD3: Double = js.native
    @scala.inline
    def VK_NUMPAD3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD3")(x.asInstanceOf[js.Any])
    
    /** 4 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD4")
    @js.native
    def VK_NUMPAD4: Double = js.native
    @scala.inline
    def VK_NUMPAD4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD4")(x.asInstanceOf[js.Any])
    
    /** 5 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD5")
    @js.native
    def VK_NUMPAD5: Double = js.native
    @scala.inline
    def VK_NUMPAD5_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD5")(x.asInstanceOf[js.Any])
    
    /** 6 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD6")
    @js.native
    def VK_NUMPAD6: Double = js.native
    @scala.inline
    def VK_NUMPAD6_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD6")(x.asInstanceOf[js.Any])
    
    /** 7 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD7")
    @js.native
    def VK_NUMPAD7: Double = js.native
    @scala.inline
    def VK_NUMPAD7_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD7")(x.asInstanceOf[js.Any])
    
    /** 8 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD8")
    @js.native
    def VK_NUMPAD8: Double = js.native
    @scala.inline
    def VK_NUMPAD8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD8")(x.asInstanceOf[js.Any])
    
    /** 9 on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_NUMPAD9")
    @js.native
    def VK_NUMPAD9: Double = js.native
    @scala.inline
    def VK_NUMPAD9_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUMPAD9")(x.asInstanceOf[js.Any])
    
    /** Num Lock key. */
    @JSImport("rot-js", "KEYS.VK_NUM_LOCK")
    @js.native
    def VK_NUM_LOCK: Double = js.native
    @scala.inline
    def VK_NUM_LOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_NUM_LOCK")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_N_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_N")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_O")
    @js.native
    def VK_O: Double = js.native
    
    /** Open square bracket ([) key. */
    @JSImport("rot-js", "KEYS.VK_OPEN_BRACKET")
    @js.native
    def VK_OPEN_BRACKET: Double = js.native
    @scala.inline
    def VK_OPEN_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_OPEN_BRACKET")(x.asInstanceOf[js.Any])
    
    /** Open curly bracket ({) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_OPEN_CURLY_BRACKET")
    @js.native
    def VK_OPEN_CURLY_BRACKET: Double = js.native
    @scala.inline
    def VK_OPEN_CURLY_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_OPEN_CURLY_BRACKET")(x.asInstanceOf[js.Any])
    
    /** Open parenthesis (() key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_OPEN_PAREN")
    @js.native
    def VK_OPEN_PAREN: Double = js.native
    @scala.inline
    def VK_OPEN_PAREN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_OPEN_PAREN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_O_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_O")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_P")
    @js.native
    def VK_P: Double = js.native
    
    /** Page Down key. */
    @JSImport("rot-js", "KEYS.VK_PAGE_DOWN")
    @js.native
    def VK_PAGE_DOWN: Double = js.native
    @scala.inline
    def VK_PAGE_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PAGE_DOWN")(x.asInstanceOf[js.Any])
    
    /** Page Up key. */
    @JSImport("rot-js", "KEYS.VK_PAGE_UP")
    @js.native
    def VK_PAGE_UP: Double = js.native
    @scala.inline
    def VK_PAGE_UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PAGE_UP")(x.asInstanceOf[js.Any])
    
    /** Pause key. */
    @JSImport("rot-js", "KEYS.VK_PAUSE")
    @js.native
    def VK_PAUSE: Double = js.native
    @scala.inline
    def VK_PAUSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PAUSE")(x.asInstanceOf[js.Any])
    
    /** Percent (%) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_PERCENT")
    @js.native
    def VK_PERCENT: Double = js.native
    @scala.inline
    def VK_PERCENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PERCENT")(x.asInstanceOf[js.Any])
    
    /** Period (.) key. */
    @JSImport("rot-js", "KEYS.VK_PERIOD")
    @js.native
    def VK_PERIOD: Double = js.native
    @scala.inline
    def VK_PERIOD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PERIOD")(x.asInstanceOf[js.Any])
    
    /** Pipe (|) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_PIPE")
    @js.native
    def VK_PIPE: Double = js.native
    @scala.inline
    def VK_PIPE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PIPE")(x.asInstanceOf[js.Any])
    
    /** Plus (+) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_PLUS")
    @js.native
    def VK_PLUS: Double = js.native
    @scala.inline
    def VK_PLUS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PLUS")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_PRINT")
    @js.native
    def VK_PRINT: Double = js.native
    
    /** Print Screen key. */
    @JSImport("rot-js", "KEYS.VK_PRINTSCREEN")
    @js.native
    def VK_PRINTSCREEN: Double = js.native
    @scala.inline
    def VK_PRINTSCREEN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PRINTSCREEN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_PRINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_PRINT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_P_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_P")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_Q")
    @js.native
    def VK_Q: Double = js.native
    
    /** Question mark (?) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_QUESTION_MARK")
    @js.native
    def VK_QUESTION_MARK: Double = js.native
    @scala.inline
    def VK_QUESTION_MARK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_QUESTION_MARK")(x.asInstanceOf[js.Any])
    
    /** Quote (''') key. */
    @JSImport("rot-js", "KEYS.VK_QUOTE")
    @js.native
    def VK_QUOTE: Double = js.native
    @scala.inline
    def VK_QUOTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_QUOTE")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_Q_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_Q")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_R")
    @js.native
    def VK_R: Double = js.native
    
    /** Return/enter key on the main keyboard. */
    @JSImport("rot-js", "KEYS.VK_RETURN")
    @js.native
    def VK_RETURN: Double = js.native
    @scala.inline
    def VK_RETURN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_RETURN")(x.asInstanceOf[js.Any])
    
    /** Right arrow. */
    @JSImport("rot-js", "KEYS.VK_RIGHT")
    @js.native
    def VK_RIGHT: Double = js.native
    @scala.inline
    def VK_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_RIGHT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_R")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_S")
    @js.native
    def VK_S: Double = js.native
    
    /** Scroll Lock key. */
    @JSImport("rot-js", "KEYS.VK_SCROLL_LOCK")
    @js.native
    def VK_SCROLL_LOCK: Double = js.native
    @scala.inline
    def VK_SCROLL_LOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SCROLL_LOCK")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0. */
    @JSImport("rot-js", "KEYS.VK_SELECT")
    @js.native
    def VK_SELECT: Double = js.native
    @scala.inline
    def VK_SELECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SELECT")(x.asInstanceOf[js.Any])
    
    /** Semicolon (;) key. */
    @JSImport("rot-js", "KEYS.VK_SEMICOLON")
    @js.native
    def VK_SEMICOLON: Double = js.native
    @scala.inline
    def VK_SEMICOLON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SEMICOLON")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_SEPARATOR")
    @js.native
    def VK_SEPARATOR: Double = js.native
    @scala.inline
    def VK_SEPARATOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SEPARATOR")(x.asInstanceOf[js.Any])
    
    /** Shift key. */
    @JSImport("rot-js", "KEYS.VK_SHIFT")
    @js.native
    def VK_SHIFT: Double = js.native
    @scala.inline
    def VK_SHIFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SHIFT")(x.asInstanceOf[js.Any])
    
    /** Slash (/) key. */
    @JSImport("rot-js", "KEYS.VK_SLASH")
    @js.native
    def VK_SLASH: Double = js.native
    @scala.inline
    def VK_SLASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SLASH")(x.asInstanceOf[js.Any])
    
    /** Linux support for this keycode was added in Gecko 4.0.	 */
    @JSImport("rot-js", "KEYS.VK_SLEEP")
    @js.native
    def VK_SLEEP: Double = js.native
    @scala.inline
    def VK_SLEEP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SLEEP")(x.asInstanceOf[js.Any])
    
    /** Space bar. */
    @JSImport("rot-js", "KEYS.VK_SPACE")
    @js.native
    def VK_SPACE: Double = js.native
    @scala.inline
    def VK_SPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SPACE")(x.asInstanceOf[js.Any])
    
    /** - on the numeric keypad. */
    @JSImport("rot-js", "KEYS.VK_SUBTRACT")
    @js.native
    def VK_SUBTRACT: Double = js.native
    @scala.inline
    def VK_SUBTRACT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_SUBTRACT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_S_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_S")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_T")
    @js.native
    def VK_T: Double = js.native
    
    /** Tab key. */
    @JSImport("rot-js", "KEYS.VK_TAB")
    @js.native
    def VK_TAB: Double = js.native
    @scala.inline
    def VK_TAB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_TAB")(x.asInstanceOf[js.Any])
    
    /** Tilde (~) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_TILDE")
    @js.native
    def VK_TILDE: Double = js.native
    @scala.inline
    def VK_TILDE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_TILDE")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_T_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_T")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_U")
    @js.native
    def VK_U: Double = js.native
    
    /** Underscore (_) key. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_UNDERSCORE")
    @js.native
    def VK_UNDERSCORE: Double = js.native
    @scala.inline
    def VK_UNDERSCORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_UNDERSCORE")(x.asInstanceOf[js.Any])
    
    /** Up arrow. */
    @JSImport("rot-js", "KEYS.VK_UP")
    @js.native
    def VK_UP: Double = js.native
    @scala.inline
    def VK_UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_UP")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_U_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_U")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_V")
    @js.native
    def VK_V: Double = js.native
    @scala.inline
    def VK_V_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_V")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_W")
    @js.native
    def VK_W: Double = js.native
    
    /** Windows logo key on Windows. Or Super or Hyper key on Linux. Requires Gecko 15.0 */
    @JSImport("rot-js", "KEYS.VK_WIN")
    @js.native
    def VK_WIN: Double = js.native
    @scala.inline
    def VK_WIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_WIN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VK_W_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_W")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_X")
    @js.native
    def VK_X: Double = js.native
    @scala.inline
    def VK_X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_X")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_Y")
    @js.native
    def VK_Y: Double = js.native
    @scala.inline
    def VK_Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_Y")(x.asInstanceOf[js.Any])
    
    /***/
    @JSImport("rot-js", "KEYS.VK_Z")
    @js.native
    def VK_Z: Double = js.native
    @scala.inline
    def VK_Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VK_Z")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rot-js", "Lighting")
  @js.native
  class Lighting protected ()
    extends typings.rotJs.lightingMod.default {
    def this(reflectivityCallback: ReflectivityCallback) = this()
    def this(reflectivityCallback: ReflectivityCallback, options: PartialOptionsEmissionThreshold) = this()
  }
  
  object Map {
    
    @JSImport("rot-js", "Map")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Map.Arena")
    @js.native
    class Arena ()
      extends typings.rotJs.arenaMod.default
    @JSImport("rot-js", "Map.Arena")
    @js.native
    def Arena: Instantiable0[typings.rotJs.arenaMod.default] = js.native
    @scala.inline
    def Arena_=(x: Instantiable0[typings.rotJs.arenaMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arena")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Map.Cellular")
    @js.native
    class Cellular protected ()
      extends typings.rotJs.cellularMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: PartialOptionsBorn) = this()
    }
    @JSImport("rot-js", "Map.Cellular")
    @js.native
    def Cellular: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* options */ js.UndefOr[PartialOptionsBorn], 
        typings.rotJs.cellularMod.default
      ] = js.native
    @scala.inline
    def Cellular_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* options */ js.UndefOr[PartialOptionsBorn], 
          typings.rotJs.cellularMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cellular")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Map.Digger")
    @js.native
    class Digger protected ()
      extends typings.rotJs.diggerMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: PartialOptionsCorridorLength) = this()
    }
    @JSImport("rot-js", "Map.Digger")
    @js.native
    def Digger: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* options */ js.UndefOr[PartialOptionsCorridorLength], 
        typings.rotJs.diggerMod.default
      ] = js.native
    @scala.inline
    def Digger_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* options */ js.UndefOr[PartialOptionsCorridorLength], 
          typings.rotJs.diggerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Digger")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Map.DividedMaze")
    @js.native
    class DividedMaze ()
      extends typings.rotJs.dividedmazeMod.default
    @JSImport("rot-js", "Map.DividedMaze")
    @js.native
    def DividedMaze: Instantiable0[typings.rotJs.dividedmazeMod.default] = js.native
    @scala.inline
    def DividedMaze_=(x: Instantiable0[typings.rotJs.dividedmazeMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DividedMaze")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Map.EllerMaze")
    @js.native
    class EllerMaze ()
      extends typings.rotJs.ellermazeMod.default
    @JSImport("rot-js", "Map.EllerMaze")
    @js.native
    def EllerMaze: Instantiable0[typings.rotJs.ellermazeMod.default] = js.native
    @scala.inline
    def EllerMaze_=(x: Instantiable0[typings.rotJs.ellermazeMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EllerMaze")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Map.IceyMaze")
    @js.native
    class IceyMaze protected ()
      extends typings.rotJs.iceymazeMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, regularity: Double) = this()
    }
    @JSImport("rot-js", "Map.IceyMaze")
    @js.native
    def IceyMaze: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* regularity */ js.UndefOr[Double], 
        typings.rotJs.iceymazeMod.default
      ] = js.native
    @scala.inline
    def IceyMaze_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* regularity */ js.UndefOr[Double], 
          typings.rotJs.iceymazeMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IceyMaze")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Map.Rogue")
    @js.native
    class Rogue protected ()
      extends typings.rotJs.rogueMod.default {
      def this(width: Double, height: Double, options: PartialOptionsCellHeight) = this()
    }
    @JSImport("rot-js", "Map.Rogue")
    @js.native
    def Rogue: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* options */ PartialOptionsCellHeight, 
        typings.rotJs.rogueMod.default
      ] = js.native
    @scala.inline
    def Rogue_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* options */ PartialOptionsCellHeight, 
          typings.rotJs.rogueMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rogue")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Map.Uniform")
    @js.native
    class Uniform protected ()
      extends typings.rotJs.uniformMod.default {
      def this(width: Double, height: Double, options: PartialOptionsRoomDugPercentage) = this()
    }
    @JSImport("rot-js", "Map.Uniform")
    @js.native
    def Uniform: Instantiable3[
        /* width */ Double, 
        /* height */ Double, 
        /* options */ PartialOptionsRoomDugPercentage, 
        typings.rotJs.uniformMod.default
      ] = js.native
    @scala.inline
    def Uniform_=(
      x: Instantiable3[
          /* width */ Double, 
          /* height */ Double, 
          /* options */ PartialOptionsRoomDugPercentage, 
          typings.rotJs.uniformMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uniform")(x.asInstanceOf[js.Any])
  }
  
  object Noise {
    
    @JSImport("rot-js", "Noise")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Noise.Simplex")
    @js.native
    /**
      * @param gradients Random gradients
      */
    class Simplex ()
      extends typings.rotJs.simplexMod.default {
      def this(gradients: Double) = this()
    }
    @JSImport("rot-js", "Noise.Simplex")
    @js.native
    def Simplex: Instantiable1[/* gradients */ js.UndefOr[Double], typings.rotJs.simplexMod.default] = js.native
    @scala.inline
    def Simplex_=(x: Instantiable1[/* gradients */ js.UndefOr[Double], typings.rotJs.simplexMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Simplex")(x.asInstanceOf[js.Any])
  }
  
  object Path {
    
    @JSImport("rot-js", "Path")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Path.AStar")
    @js.native
    class AStar protected ()
      extends typings.rotJs.astarMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
    }
    @JSImport("rot-js", "Path.AStar")
    @js.native
    def AStar: Instantiable4[
        /* toX */ Double, 
        /* toY */ Double, 
        /* passableCallback */ PassableCallback, 
        /* options */ js.UndefOr[PartialOptions], 
        typings.rotJs.astarMod.default
      ] = js.native
    @scala.inline
    def AStar_=(
      x: Instantiable4[
          /* toX */ Double, 
          /* toY */ Double, 
          /* passableCallback */ PassableCallback, 
          /* options */ js.UndefOr[PartialOptions], 
          typings.rotJs.astarMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AStar")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Path.Dijkstra")
    @js.native
    class Dijkstra protected ()
      extends typings.rotJs.dijkstraMod.default {
      def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
    }
    @JSImport("rot-js", "Path.Dijkstra")
    @js.native
    def Dijkstra: Instantiable4[
        /* toX */ Double, 
        /* toY */ Double, 
        /* passableCallback */ PassableCallback, 
        /* options */ PartialOptions, 
        typings.rotJs.dijkstraMod.default
      ] = js.native
    @scala.inline
    def Dijkstra_=(
      x: Instantiable4[
          /* toX */ Double, 
          /* toY */ Double, 
          /* passableCallback */ PassableCallback, 
          /* options */ PartialOptions, 
          typings.rotJs.dijkstraMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dijkstra")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rot-js", "RNG")
  @js.native
  val RNG: typings.rotJs.rngMod.RNG = js.native
  
  object Scheduler {
    
    @JSImport("rot-js", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Scheduler.Action")
    @js.native
    class Action[T] ()
      extends typings.rotJs.actionMod.default[T]
    @JSImport("rot-js", "Scheduler.Action")
    @js.native
    def Action: Instantiable0[typings.rotJs.actionMod.default[js.Object]] = js.native
    @scala.inline
    def Action_=(x: Instantiable0[typings.rotJs.actionMod.default[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Scheduler.Simple")
    @js.native
    class Simple[T] ()
      extends typings.rotJs.simpleMod.default[T]
    @JSImport("rot-js", "Scheduler.Simple")
    @js.native
    def Simple: Instantiable0[typings.rotJs.simpleMod.default[js.Object]] = js.native
    @scala.inline
    def Simple_=(x: Instantiable0[typings.rotJs.simpleMod.default[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Simple")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rot-js", "Scheduler.Speed")
    @js.native
    class Speed[T /* <: SpeedActor */] ()
      extends typings.rotJs.speedMod.default[T]
    @JSImport("rot-js", "Scheduler.Speed")
    @js.native
    def Speed: Instantiable0[typings.rotJs.speedMod.default[SpeedActor]] = js.native
    @scala.inline
    def Speed_=(x: Instantiable0[typings.rotJs.speedMod.default[SpeedActor]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Speed")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rot-js", "StringGenerator")
  @js.native
  class StringGenerator protected ()
    extends typings.rotJs.stringgeneratorMod.default {
    def this(options: PartialOptionsOrder) = this()
  }
  
  object Text {
    
    @JSImport("rot-js", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rot-js", "Text.TYPE_BG")
    @js.native
    val TYPE_BG: /* 3 */ Double = js.native
    
    @JSImport("rot-js", "Text.TYPE_FG")
    @js.native
    val TYPE_FG: /* 2 */ Double = js.native
    
    @JSImport("rot-js", "Text.TYPE_NEWLINE")
    @js.native
    val TYPE_NEWLINE: /* 1 */ Double = js.native
    
    @JSImport("rot-js", "Text.TYPE_TEXT")
    @js.native
    val TYPE_TEXT: /* 0 */ Double = js.native
    
    @scala.inline
    def measure(str: String, maxWidth: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(str.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[Height]
    
    @scala.inline
    def tokenize(str: String, maxWidth: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(str.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  }
  
  object Util {
    
    @JSImport("rot-js", "Util")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def capitalize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def clamp(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def clamp(`val`: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def clamp(`val`: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def clamp(`val`: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def format(template: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def mod(x: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
