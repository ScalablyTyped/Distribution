package typings.reactSpringShared

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.reactSpringRafz.mod.Rafz
import typings.reactSpringShared.anon.EventObserved
import typings.reactSpringShared.anon.FnCall
import typings.reactSpringShared.anon.PickDOMRectReadOnlywidthh
import typings.reactSpringShared.reactSpringSharedStrings.always
import typings.reactSpringShared.reactSpringSharedStrings.demand
import typings.reactSpringTypes.mod.AnyFn
import typings.reactSpringTypes.mod.EasingFunction
import typings.reactSpringTypes.mod.InterpolatorConfig
import typings.reactSpringTypes.mod.InterpolatorFactory
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Parameters
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-spring/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extend this class for automatic TypeScript support when passing this
    * value to `fluids`-compatible libraries.
    */
  /* note: abstract class */ @JSImport("@react-spring/shared", "FluidValue")
  @js.native
  open class FluidValue[T, E /* <: FluidEvent[T] */] () extends StObject {
    def this(get: js.Function0[T]) = this()
    
    /** Get the current value. */
    /* protected */ var get: js.UndefOr[js.Function0[T]] = js.native
    
    /** Called after an observer is added. */
    /* protected */ var observerAdded: js.UndefOr[js.Function2[/* count */ Double, /* observer */ FluidObserver[E], Unit]] = js.native
    
    /** Called after an observer is removed. */
    /* protected */ var observerRemoved: js.UndefOr[js.Function2[/* count */ Double, /* observer */ FluidObserver[E], Unit]] = js.native
  }
  
  inline def addFluidObserver[E /* <: FluidEvent[Any] */](target: js.Object, observer: FluidObserver[E]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Any]
  /** Observe a `fluids`-compatible object. */
  inline def addFluidObserver[T, E /* <: FluidEvent[Any] */](target: FluidValue[T, E], observer: FluidObserver[E]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** Send an event to an observer. */
  inline def callFluidObserver[E /* <: FluidEvent[Any] */](observer: FluidObserver[E], event: E): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObserver")(observer.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def callFluidObservers(target: js.Object, event: FluidEvent[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObservers")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Send an event to all observers. */
  inline def callFluidObservers[E /* <: FluidEvent[Any] */](target: FluidValue[Any, E], event: E): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObservers")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clamp(min: Double, max: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def colorToRgba(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToRgba")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object colors {
    
    @JSImport("@react-spring/shared", "colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared", "colors.aliceblue")
    @js.native
    def aliceblue: Double = js.native
    inline def aliceblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliceblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.antiquewhite")
    @js.native
    def antiquewhite: Double = js.native
    inline def antiquewhite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("antiquewhite")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.aqua")
    @js.native
    def aqua: Double = js.native
    inline def aqua_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aqua")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.aquamarine")
    @js.native
    def aquamarine: Double = js.native
    inline def aquamarine_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aquamarine")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.azure")
    @js.native
    def azure: Double = js.native
    inline def azure_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("azure")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.beige")
    @js.native
    def beige: Double = js.native
    inline def beige_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beige")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.bisque")
    @js.native
    def bisque: Double = js.native
    inline def bisque_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bisque")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.black")
    @js.native
    def black: Double = js.native
    inline def black_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.blanchedalmond")
    @js.native
    def blanchedalmond: Double = js.native
    inline def blanchedalmond_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blanchedalmond")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.blue")
    @js.native
    def blue: Double = js.native
    inline def blue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.blueviolet")
    @js.native
    def blueviolet: Double = js.native
    inline def blueviolet_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blueviolet")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.brown")
    @js.native
    def brown: Double = js.native
    inline def brown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brown")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.burlywood")
    @js.native
    def burlywood: Double = js.native
    inline def burlywood_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("burlywood")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.burntsienna")
    @js.native
    def burntsienna: Double = js.native
    inline def burntsienna_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("burntsienna")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.cadetblue")
    @js.native
    def cadetblue: Double = js.native
    inline def cadetblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cadetblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.chartreuse")
    @js.native
    def chartreuse: Double = js.native
    inline def chartreuse_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chartreuse")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.chocolate")
    @js.native
    def chocolate: Double = js.native
    inline def chocolate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chocolate")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.coral")
    @js.native
    def coral: Double = js.native
    inline def coral_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coral")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.cornflowerblue")
    @js.native
    def cornflowerblue: Double = js.native
    inline def cornflowerblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cornflowerblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.cornsilk")
    @js.native
    def cornsilk: Double = js.native
    inline def cornsilk_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cornsilk")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.crimson")
    @js.native
    def crimson: Double = js.native
    inline def crimson_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crimson")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.cyan")
    @js.native
    def cyan: Double = js.native
    inline def cyan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyan")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkblue")
    @js.native
    def darkblue: Double = js.native
    inline def darkblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkcyan")
    @js.native
    def darkcyan: Double = js.native
    inline def darkcyan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkcyan")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkgoldenrod")
    @js.native
    def darkgoldenrod: Double = js.native
    inline def darkgoldenrod_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgoldenrod")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkgray")
    @js.native
    def darkgray: Double = js.native
    inline def darkgray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkgreen")
    @js.native
    def darkgreen: Double = js.native
    inline def darkgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkgrey")
    @js.native
    def darkgrey: Double = js.native
    inline def darkgrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkkhaki")
    @js.native
    def darkkhaki: Double = js.native
    inline def darkkhaki_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkkhaki")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkmagenta")
    @js.native
    def darkmagenta: Double = js.native
    inline def darkmagenta_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkmagenta")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkolivegreen")
    @js.native
    def darkolivegreen: Double = js.native
    inline def darkolivegreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkolivegreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkorange")
    @js.native
    def darkorange: Double = js.native
    inline def darkorange_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkorange")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkorchid")
    @js.native
    def darkorchid: Double = js.native
    inline def darkorchid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkorchid")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkred")
    @js.native
    def darkred: Double = js.native
    inline def darkred_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkred")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darksalmon")
    @js.native
    def darksalmon: Double = js.native
    inline def darksalmon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darksalmon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkseagreen")
    @js.native
    def darkseagreen: Double = js.native
    inline def darkseagreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkseagreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkslateblue")
    @js.native
    def darkslateblue: Double = js.native
    inline def darkslateblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkslateblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkslategray")
    @js.native
    def darkslategray: Double = js.native
    inline def darkslategray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkslategray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkslategrey")
    @js.native
    def darkslategrey: Double = js.native
    inline def darkslategrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkslategrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkturquoise")
    @js.native
    def darkturquoise: Double = js.native
    inline def darkturquoise_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkturquoise")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.darkviolet")
    @js.native
    def darkviolet: Double = js.native
    inline def darkviolet_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkviolet")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.deeppink")
    @js.native
    def deeppink: Double = js.native
    inline def deeppink_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deeppink")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.deepskyblue")
    @js.native
    def deepskyblue: Double = js.native
    inline def deepskyblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepskyblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.dimgray")
    @js.native
    def dimgray: Double = js.native
    inline def dimgray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dimgray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.dimgrey")
    @js.native
    def dimgrey: Double = js.native
    inline def dimgrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dimgrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.dodgerblue")
    @js.native
    def dodgerblue: Double = js.native
    inline def dodgerblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dodgerblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.firebrick")
    @js.native
    def firebrick: Double = js.native
    inline def firebrick_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firebrick")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.floralwhite")
    @js.native
    def floralwhite: Double = js.native
    inline def floralwhite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("floralwhite")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.forestgreen")
    @js.native
    def forestgreen: Double = js.native
    inline def forestgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forestgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.fuchsia")
    @js.native
    def fuchsia: Double = js.native
    inline def fuchsia_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fuchsia")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.gainsboro")
    @js.native
    def gainsboro: Double = js.native
    inline def gainsboro_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gainsboro")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.ghostwhite")
    @js.native
    def ghostwhite: Double = js.native
    inline def ghostwhite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ghostwhite")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.gold")
    @js.native
    def gold: Double = js.native
    inline def gold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gold")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.goldenrod")
    @js.native
    def goldenrod: Double = js.native
    inline def goldenrod_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goldenrod")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.gray")
    @js.native
    def gray: Double = js.native
    inline def gray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.green")
    @js.native
    def green: Double = js.native
    inline def green_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.greenyellow")
    @js.native
    def greenyellow: Double = js.native
    inline def greenyellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greenyellow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.grey")
    @js.native
    def grey: Double = js.native
    inline def grey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.honeydew")
    @js.native
    def honeydew: Double = js.native
    inline def honeydew_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("honeydew")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.hotpink")
    @js.native
    def hotpink: Double = js.native
    inline def hotpink_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hotpink")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.indianred")
    @js.native
    def indianred: Double = js.native
    inline def indianred_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indianred")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.indigo")
    @js.native
    def indigo: Double = js.native
    inline def indigo_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indigo")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.ivory")
    @js.native
    def ivory: Double = js.native
    inline def ivory_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ivory")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.khaki")
    @js.native
    def khaki: Double = js.native
    inline def khaki_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("khaki")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lavender")
    @js.native
    def lavender: Double = js.native
    inline def lavender_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lavender")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lavenderblush")
    @js.native
    def lavenderblush: Double = js.native
    inline def lavenderblush_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lavenderblush")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lawngreen")
    @js.native
    def lawngreen: Double = js.native
    inline def lawngreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lawngreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lemonchiffon")
    @js.native
    def lemonchiffon: Double = js.native
    inline def lemonchiffon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lemonchiffon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightblue")
    @js.native
    def lightblue: Double = js.native
    inline def lightblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightcoral")
    @js.native
    def lightcoral: Double = js.native
    inline def lightcoral_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightcoral")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightcyan")
    @js.native
    def lightcyan: Double = js.native
    inline def lightcyan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightcyan")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightgoldenrodyellow")
    @js.native
    def lightgoldenrodyellow: Double = js.native
    inline def lightgoldenrodyellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgoldenrodyellow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightgray")
    @js.native
    def lightgray: Double = js.native
    inline def lightgray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightgreen")
    @js.native
    def lightgreen: Double = js.native
    inline def lightgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightgrey")
    @js.native
    def lightgrey: Double = js.native
    inline def lightgrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightpink")
    @js.native
    def lightpink: Double = js.native
    inline def lightpink_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightpink")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightsalmon")
    @js.native
    def lightsalmon: Double = js.native
    inline def lightsalmon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightsalmon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightseagreen")
    @js.native
    def lightseagreen: Double = js.native
    inline def lightseagreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightseagreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightskyblue")
    @js.native
    def lightskyblue: Double = js.native
    inline def lightskyblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightskyblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightslategray")
    @js.native
    def lightslategray: Double = js.native
    inline def lightslategray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightslategray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightslategrey")
    @js.native
    def lightslategrey: Double = js.native
    inline def lightslategrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightslategrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightsteelblue")
    @js.native
    def lightsteelblue: Double = js.native
    inline def lightsteelblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightsteelblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lightyellow")
    @js.native
    def lightyellow: Double = js.native
    inline def lightyellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightyellow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.lime")
    @js.native
    def lime: Double = js.native
    inline def lime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lime")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.limegreen")
    @js.native
    def limegreen: Double = js.native
    inline def limegreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limegreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.linen")
    @js.native
    def linen: Double = js.native
    inline def linen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.magenta")
    @js.native
    def magenta: Double = js.native
    inline def magenta_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("magenta")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.maroon")
    @js.native
    def maroon: Double = js.native
    inline def maroon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maroon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumaquamarine")
    @js.native
    def mediumaquamarine: Double = js.native
    inline def mediumaquamarine_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumaquamarine")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumblue")
    @js.native
    def mediumblue: Double = js.native
    inline def mediumblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumorchid")
    @js.native
    def mediumorchid: Double = js.native
    inline def mediumorchid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumorchid")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumpurple")
    @js.native
    def mediumpurple: Double = js.native
    inline def mediumpurple_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumpurple")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumseagreen")
    @js.native
    def mediumseagreen: Double = js.native
    inline def mediumseagreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumseagreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumslateblue")
    @js.native
    def mediumslateblue: Double = js.native
    inline def mediumslateblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumslateblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumspringgreen")
    @js.native
    def mediumspringgreen: Double = js.native
    inline def mediumspringgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumspringgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumturquoise")
    @js.native
    def mediumturquoise: Double = js.native
    inline def mediumturquoise_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumturquoise")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mediumvioletred")
    @js.native
    def mediumvioletred: Double = js.native
    inline def mediumvioletred_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumvioletred")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.midnightblue")
    @js.native
    def midnightblue: Double = js.native
    inline def midnightblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midnightblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mintcream")
    @js.native
    def mintcream: Double = js.native
    inline def mintcream_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mintcream")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.mistyrose")
    @js.native
    def mistyrose: Double = js.native
    inline def mistyrose_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mistyrose")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.moccasin")
    @js.native
    def moccasin: Double = js.native
    inline def moccasin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moccasin")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.navajowhite")
    @js.native
    def navajowhite: Double = js.native
    inline def navajowhite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navajowhite")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.navy")
    @js.native
    def navy: Double = js.native
    inline def navy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navy")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.oldlace")
    @js.native
    def oldlace: Double = js.native
    inline def oldlace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oldlace")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.olive")
    @js.native
    def olive: Double = js.native
    inline def olive_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("olive")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.olivedrab")
    @js.native
    def olivedrab: Double = js.native
    inline def olivedrab_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("olivedrab")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.orange")
    @js.native
    def orange: Double = js.native
    inline def orange_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.orangered")
    @js.native
    def orangered: Double = js.native
    inline def orangered_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orangered")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.orchid")
    @js.native
    def orchid: Double = js.native
    inline def orchid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orchid")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.palegoldenrod")
    @js.native
    def palegoldenrod: Double = js.native
    inline def palegoldenrod_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("palegoldenrod")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.palegreen")
    @js.native
    def palegreen: Double = js.native
    inline def palegreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("palegreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.paleturquoise")
    @js.native
    def paleturquoise: Double = js.native
    inline def paleturquoise_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paleturquoise")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.palevioletred")
    @js.native
    def palevioletred: Double = js.native
    inline def palevioletred_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("palevioletred")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.papayawhip")
    @js.native
    def papayawhip: Double = js.native
    inline def papayawhip_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("papayawhip")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.peachpuff")
    @js.native
    def peachpuff: Double = js.native
    inline def peachpuff_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peachpuff")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.peru")
    @js.native
    def peru: Double = js.native
    inline def peru_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peru")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.pink")
    @js.native
    def pink: Double = js.native
    inline def pink_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.plum")
    @js.native
    def plum: Double = js.native
    inline def plum_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plum")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.powderblue")
    @js.native
    def powderblue: Double = js.native
    inline def powderblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("powderblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.purple")
    @js.native
    def purple: Double = js.native
    inline def purple_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.rebeccapurple")
    @js.native
    def rebeccapurple: Double = js.native
    inline def rebeccapurple_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rebeccapurple")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.red")
    @js.native
    def red: Double = js.native
    inline def red_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.rosybrown")
    @js.native
    def rosybrown: Double = js.native
    inline def rosybrown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rosybrown")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.royalblue")
    @js.native
    def royalblue: Double = js.native
    inline def royalblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("royalblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.saddlebrown")
    @js.native
    def saddlebrown: Double = js.native
    inline def saddlebrown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saddlebrown")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.salmon")
    @js.native
    def salmon: Double = js.native
    inline def salmon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("salmon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.sandybrown")
    @js.native
    def sandybrown: Double = js.native
    inline def sandybrown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sandybrown")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.seagreen")
    @js.native
    def seagreen: Double = js.native
    inline def seagreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seagreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.seashell")
    @js.native
    def seashell: Double = js.native
    inline def seashell_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seashell")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.sienna")
    @js.native
    def sienna: Double = js.native
    inline def sienna_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sienna")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.silver")
    @js.native
    def silver: Double = js.native
    inline def silver_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silver")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.skyblue")
    @js.native
    def skyblue: Double = js.native
    inline def skyblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skyblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.slateblue")
    @js.native
    def slateblue: Double = js.native
    inline def slateblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slateblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.slategray")
    @js.native
    def slategray: Double = js.native
    inline def slategray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slategray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.slategrey")
    @js.native
    def slategrey: Double = js.native
    inline def slategrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slategrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.snow")
    @js.native
    def snow: Double = js.native
    inline def snow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.springgreen")
    @js.native
    def springgreen: Double = js.native
    inline def springgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("springgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.steelblue")
    @js.native
    def steelblue: Double = js.native
    inline def steelblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("steelblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.tan")
    @js.native
    def tan: Double = js.native
    inline def tan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tan")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.teal")
    @js.native
    def teal: Double = js.native
    inline def teal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teal")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.thistle")
    @js.native
    def thistle: Double = js.native
    inline def thistle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thistle")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.tomato")
    @js.native
    def tomato: Double = js.native
    inline def tomato_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tomato")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.transparent")
    @js.native
    def transparent: Double = js.native
    inline def transparent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.turquoise")
    @js.native
    def turquoise: Double = js.native
    inline def turquoise_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("turquoise")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.violet")
    @js.native
    def violet: Double = js.native
    inline def violet_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("violet")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.wheat")
    @js.native
    def wheat: Double = js.native
    inline def wheat_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wheat")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.white")
    @js.native
    def white: Double = js.native
    inline def white_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.whitesmoke")
    @js.native
    def whitesmoke: Double = js.native
    inline def whitesmoke_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitesmoke")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.yellow")
    @js.native
    def yellow: Double = js.native
    inline def yellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "colors.yellowgreen")
    @js.native
    def yellowgreen: Double = js.native
    inline def yellowgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellowgreen")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-spring/shared", "createInterpolator")
  @js.native
  val createInterpolator: InterpolatorFactory = js.native
  
  /**
    * Supports string shapes by extracting numbers so new values can be computed,
    * and recombines those values into new strings of the same shape.  Supports
    * things like:
    *
    *     "rgba(123, 42, 99, 0.36)"           // colors
    *     "-45deg"                            // values with units
    *     "0 2px 2px 0px rgba(0, 0, 0, 0.12)" // CSS box-shadows
    *     "rotate(0deg) translate(2px, 3px)"  // CSS transforms
    */
  inline def createStringInterpolator(config: InterpolatorConfig[String]): js.Function1[/* input */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringInterpolator")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ Double, String]]
  
  inline def defineHidden(obj: Any, key: Any, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineHidden")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def deprecateDirectCall(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecateDirectCall")().asInstanceOf[Unit]
  
  inline def deprecateInterpolate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecateInterpolate")().asInstanceOf[Unit]
  
  /** Minifiable `.forEach` call */
  inline def each[Value, Key, This](obj: Eachable[Value, Key, This], fn: EachFn[Value, Key, This]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Iterate the properties of an object */
  inline def eachProp[T /* <: js.Object */, This](
    obj: T,
    fn: js.ThisFunction2[
      /* this */ This, 
      /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T[number] : T[keyof T] */ /* value */ js.Any, 
      /* key */ String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachProp")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachProp[T /* <: js.Object */, This](
    obj: T,
    fn: js.ThisFunction2[
      /* this */ This, 
      /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T[number] : T[keyof T] */ /* value */ js.Any, 
      /* key */ String, 
      Unit
    ],
    ctx: This
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachProp")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@react-spring/shared", "easings")
  @js.native
  val easings: EasingDictionary = js.native
  
  inline def flush[T](queue: Set[T], iterator: js.Function1[/* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(queue.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Copy the `queue`, then iterate it after the `queue` is cleared */
  inline def flush[P, T](queue: Map[P, T], iterator: js.Function1[/* entry */ js.Tuple2[P, T], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(queue.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Call every function in the queue with the same arguments. */
  inline def flushCalls[T /* <: AnyFn[js.Array[Any], Any] */](
    queue: Set[T],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushCalls")(queue.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The frameloop executes its animations in order of lowest priority first.
    * Animations are retained until idle.
    */
  object frameLoop {
    
    @JSImport("@react-spring/shared", "frameLoop")
    @js.native
    val ^ : js.Any = js.native
    
    /** Advance all animations by the given time. */
    @JSImport("@react-spring/shared", "frameLoop.advance")
    @js.native
    def advance: js.Function1[/* dt */ Double, Boolean] = js.native
    inline def advance_=(x: js.Function1[/* dt */ Double, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("advance")(x.asInstanceOf[js.Any])
    
    /**
      * Clear all animations. For testing purposes.
      *
      * ☠️ Never call this from within the frameloop.
      */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    @JSImport("@react-spring/shared", "frameLoop.idle")
    @js.native
    val idle: Boolean = js.native
    
    /** Call this when an animation's priority changes. */
    inline def sort(animation: OpaqueAnimation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Advance the given animation on every frame until idle. */
    inline def start(animation: OpaqueAnimation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /** Get the current observer set. Never mutate it directly! */
  @JSImport("@react-spring/shared", "getFluidObservers")
  @js.native
  val getFluidObservers: GetFluidObservers_ = js.native
  
  /**
    * Get the current value.
    * If `arg` is not observable, `arg` is returned.
    */
  @JSImport("@react-spring/shared", "getFluidValue")
  @js.native
  val getFluidValue: GetFluidValue_ = js.native
  
  /** Returns true if `arg` can be observed. */
  inline def hasFluidValue(arg: Any): /* is @react-spring/shared.@react-spring/shared.FluidValue<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFluidValue")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @react-spring/shared.@react-spring/shared.FluidValue<any, any> */ Boolean]
  
  @JSImport("@react-spring/shared", "hex3")
  @js.native
  val hex3: js.RegExp = js.native
  
  @JSImport("@react-spring/shared", "hex4")
  @js.native
  val hex4: js.RegExp = js.native
  
  @JSImport("@react-spring/shared", "hex6")
  @js.native
  val hex6: js.RegExp = js.native
  
  @JSImport("@react-spring/shared", "hex8")
  @js.native
  val hex8: js.RegExp = js.native
  
  @JSImport("@react-spring/shared", "hsl")
  @js.native
  val hsl: js.RegExp = js.native
  
  @JSImport("@react-spring/shared", "hsla")
  @js.native
  val hsla: js.RegExp = js.native
  
  object is {
    
    @JSImport("@react-spring/shared", "is")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared", "is.arr")
    @js.native
    def arr: IsType[js.Array[Any]] = js.native
    inline def arr_=(x: IsType[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arr")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared", "is.fun")
    @js.native
    def fun: IsType[js.Function] = js.native
    inline def fun_=(x: IsType[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fun")(x.asInstanceOf[js.Any])
    
    inline def num(a: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("num")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def obj[T](a: Any): /* is std.Exclude<T & @react-spring/types.@react-spring/types.Lookup<any>, std.Function | std.Array<any>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Exclude<T & @react-spring/types.@react-spring/types.Lookup<any>, std.Function | std.Array<any>> */ Boolean]
    
    inline def str(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def und(a: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("und")(a.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  }
  
  inline def isAnimatedString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimatedString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  /** Compare animatable values */
  inline def isEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSSR(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSR")().asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def onResize(callback: OnResizeCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onResize")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def onResize(callback: OnResizeCallback, param1: OnResizeOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("onResize")(callback.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def onScroll(callback: OnScrollCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onScroll")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def onScroll(callback: OnScrollCallback, param1: OnScrollOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("onScroll")(callback.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def once[TFunc /* <: js.Function1[/* args */ Any, Any] */](fn: TFunc): js.Function1[/* args */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Any, Unit]]
  
  @JSImport("@react-spring/shared", "prefix")
  @js.native
  val prefix: /* "react-spring: " */ String = js.native
  
  /**
    * Schedule an update for next frame.
    * Your function can return `true` to repeat next frame.
    */
  @JSImport("@react-spring/shared", "raf")
  @js.native
  val raf: Rafz = js.native
  
  inline def removeFluidObserver[E /* <: FluidEvent[Any] */](target: js.Object, observer: FluidObserver[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Stop observing a `fluids`-compatible object. */
  inline def removeFluidObserver[E /* <: FluidEvent[Any] */](target: FluidValue[Any, E], observer: FluidObserver[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@react-spring/shared", "rgb")
  @js.native
  val rgb: js.RegExp = js.native
  
  @JSImport("@react-spring/shared", "rgba")
  @js.native
  val rgba: js.RegExp = js.native
  
  /** Define the getter called by `getFluidValue`. */
  inline def setFluidGetter(target: js.Object, get: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFluidGetter")(target.asInstanceOf[js.Any], get.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toArray[T](a: T): /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, void> extends infer T_1 ? T_1 extends std.Exclude<T, void> ? T_1 extends std.Array<any> ? std.Array<T_1[number]> extends T_1 ? std.Array<std.Exclude<T, void> extends infer T_2 ? T_2 extends std.Exclude<T, void> ? T_2 extends std.Array<infer U> ? U : T_2 : never : never> : T_1 : std.Array<std.Exclude<T, void> extends infer T_3 ? T_3 extends std.Exclude<T, void> ? T_3 extends std.Array<infer U_1> ? U_1 : T_3 : never : never> : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, void> extends infer T_1 ? T_1 extends std.Exclude<T, void> ? T_1 extends std.Array<any> ? std.Array<T_1[number]> extends T_1 ? std.Array<std.Exclude<T, void> extends infer T_2 ? T_2 extends std.Exclude<T, void> ? T_2 extends std.Array<infer U> ? U : T_2 : never : never> : T_1 : std.Array<std.Exclude<T, void> extends infer T_3 ? T_3 extends std.Exclude<T, void> ? T_3 extends std.Array<infer U_1> ? U_1 : T_3 : never : never> : never : never */ js.Any]
  
  /**
    * Creates a constant value over the lifecycle of a component.
    */
  inline def useConstant[T](init: Init[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConstant")(init.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /** Return a function that re-renders this component, if still mounted */
  inline def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useEffect
    */
  /* was `typeof useEffect` */
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /* was `typeof useEffect` */
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMemoOne[T](getResult: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoOne")(getResult.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemoOne[T](getResult: js.Function0[T], inputs: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemoOne")(getResult.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useOnce(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnce")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Use a value from the previous render */
  inline def usePrev[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrev")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  /**
    * Returns `boolean` or `null`, used to automatically
    * set skipAnimations to the value of the user's
    * `prefers-reduced-motion` query.
    *
    * The return value, post-effect, is the value of their prefered setting
    */
  inline def useReducedMotion(): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useReducedMotion")().asInstanceOf[Boolean | Null]
  
  trait AnimatedGlobals extends StObject {
    
    /** Event props are called with `batchedUpdates` to reduce extraneous renders */
    var batchedUpdates: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.undefined
    
    /** Provide custom color names for interpolation */
    var colors: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
    
    /** Provide custom logic for string interpolation */
    var createStringInterpolator: js.UndefOr[
        js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]]
      ] = js.undefined
    
    /** sets the global frameLoop setting for the global raf instance */
    var frameLoop: js.UndefOr[always | demand] = js.undefined
    
    /** Used to measure frame length. Read more [here](https://developer.mozilla.org/en-US/docs/Web/API/Performance/now) */
    var now: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** Schedule a function to run on the next frame */
    var requestAnimationFrame: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.undefined
    
    /** Make all animations instant and skip the frameloop entirely */
    var skipAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Returns a new `Interpolation` object */
    var to: js.UndefOr[FnCall] = js.undefined
    
    /** @internal Exposed for testing purposes */
    var willAdvance: js.UndefOr[js.Function1[/* animation */ OpaqueAnimation, Unit]] = js.undefined
  }
  object AnimatedGlobals {
    
    inline def apply(): AnimatedGlobals = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedGlobals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimatedGlobals] (val x: Self) extends AnyVal {
      
      inline def setBatchedUpdates(value: /* cb */ js.Function0[Unit] => Unit): Self = StObject.set(x, "batchedUpdates", js.Any.fromFunction1(value))
      
      inline def setBatchedUpdatesUndefined: Self = StObject.set(x, "batchedUpdates", js.undefined)
      
      inline def setColors(value: StringDictionary[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsNull: Self = StObject.set(x, "colors", null)
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCreateStringInterpolator(value: /* config */ InterpolatorConfig[String] => js.Function1[/* input */ Double, String]): Self = StObject.set(x, "createStringInterpolator", js.Any.fromFunction1(value))
      
      inline def setCreateStringInterpolatorUndefined: Self = StObject.set(x, "createStringInterpolator", js.undefined)
      
      inline def setFrameLoop(value: always | demand): Self = StObject.set(x, "frameLoop", value.asInstanceOf[js.Any])
      
      inline def setFrameLoopUndefined: Self = StObject.set(x, "frameLoop", js.undefined)
      
      inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setRequestAnimationFrame(value: /* cb */ js.Function0[Unit] => Unit): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
      
      inline def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
      
      inline def setSkipAnimation(value: Boolean): Self = StObject.set(x, "skipAnimation", value.asInstanceOf[js.Any])
      
      inline def setSkipAnimationUndefined: Self = StObject.set(x, "skipAnimation", js.undefined)
      
      inline def setTo(value: FnCall): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setWillAdvance(value: /* animation */ OpaqueAnimation => Unit): Self = StObject.set(x, "willAdvance", js.Any.fromFunction1(value))
      
      inline def setWillAdvanceUndefined: Self = StObject.set(x, "willAdvance", js.undefined)
    }
  }
  
  /* keyof @react-spring/shared.anon.Aliceblue */ /* Rewritten from type alias, can be one of: 
    - typings.reactSpringShared.reactSpringSharedStrings.transparent
    - typings.reactSpringShared.reactSpringSharedStrings.aliceblue
    - typings.reactSpringShared.reactSpringSharedStrings.antiquewhite
    - typings.reactSpringShared.reactSpringSharedStrings.aqua
    - typings.reactSpringShared.reactSpringSharedStrings.aquamarine
    - typings.reactSpringShared.reactSpringSharedStrings.azure
    - typings.reactSpringShared.reactSpringSharedStrings.beige
    - typings.reactSpringShared.reactSpringSharedStrings.bisque
    - typings.reactSpringShared.reactSpringSharedStrings.black
    - typings.reactSpringShared.reactSpringSharedStrings.blanchedalmond
    - typings.reactSpringShared.reactSpringSharedStrings.blue
    - typings.reactSpringShared.reactSpringSharedStrings.blueviolet
    - typings.reactSpringShared.reactSpringSharedStrings.brown
    - typings.reactSpringShared.reactSpringSharedStrings.burlywood
    - typings.reactSpringShared.reactSpringSharedStrings.burntsienna
    - typings.reactSpringShared.reactSpringSharedStrings.cadetblue
    - typings.reactSpringShared.reactSpringSharedStrings.chartreuse
    - typings.reactSpringShared.reactSpringSharedStrings.chocolate
    - typings.reactSpringShared.reactSpringSharedStrings.coral
    - typings.reactSpringShared.reactSpringSharedStrings.cornflowerblue
    - typings.reactSpringShared.reactSpringSharedStrings.cornsilk
    - typings.reactSpringShared.reactSpringSharedStrings.crimson
    - typings.reactSpringShared.reactSpringSharedStrings.cyan
    - typings.reactSpringShared.reactSpringSharedStrings.darkblue
    - typings.reactSpringShared.reactSpringSharedStrings.darkcyan
    - typings.reactSpringShared.reactSpringSharedStrings.darkgoldenrod
    - typings.reactSpringShared.reactSpringSharedStrings.darkgray
    - typings.reactSpringShared.reactSpringSharedStrings.darkgreen
    - typings.reactSpringShared.reactSpringSharedStrings.darkgrey
    - typings.reactSpringShared.reactSpringSharedStrings.darkkhaki
    - typings.reactSpringShared.reactSpringSharedStrings.darkmagenta
    - typings.reactSpringShared.reactSpringSharedStrings.darkolivegreen
    - typings.reactSpringShared.reactSpringSharedStrings.darkorange
    - typings.reactSpringShared.reactSpringSharedStrings.darkorchid
    - typings.reactSpringShared.reactSpringSharedStrings.darkred
    - typings.reactSpringShared.reactSpringSharedStrings.darksalmon
    - typings.reactSpringShared.reactSpringSharedStrings.darkseagreen
    - typings.reactSpringShared.reactSpringSharedStrings.darkslateblue
    - typings.reactSpringShared.reactSpringSharedStrings.darkslategray
    - typings.reactSpringShared.reactSpringSharedStrings.darkslategrey
    - typings.reactSpringShared.reactSpringSharedStrings.darkturquoise
    - typings.reactSpringShared.reactSpringSharedStrings.darkviolet
    - typings.reactSpringShared.reactSpringSharedStrings.deeppink
    - typings.reactSpringShared.reactSpringSharedStrings.deepskyblue
    - typings.reactSpringShared.reactSpringSharedStrings.dimgray
    - typings.reactSpringShared.reactSpringSharedStrings.dimgrey
    - typings.reactSpringShared.reactSpringSharedStrings.dodgerblue
    - typings.reactSpringShared.reactSpringSharedStrings.firebrick
    - typings.reactSpringShared.reactSpringSharedStrings.floralwhite
    - typings.reactSpringShared.reactSpringSharedStrings.forestgreen
    - typings.reactSpringShared.reactSpringSharedStrings.fuchsia
    - typings.reactSpringShared.reactSpringSharedStrings.gainsboro
    - typings.reactSpringShared.reactSpringSharedStrings.ghostwhite
    - typings.reactSpringShared.reactSpringSharedStrings.gold
    - typings.reactSpringShared.reactSpringSharedStrings.goldenrod
    - typings.reactSpringShared.reactSpringSharedStrings.gray
    - typings.reactSpringShared.reactSpringSharedStrings.green
    - typings.reactSpringShared.reactSpringSharedStrings.greenyellow
    - typings.reactSpringShared.reactSpringSharedStrings.grey
    - typings.reactSpringShared.reactSpringSharedStrings.honeydew
    - typings.reactSpringShared.reactSpringSharedStrings.hotpink
    - typings.reactSpringShared.reactSpringSharedStrings.indianred
    - typings.reactSpringShared.reactSpringSharedStrings.indigo
    - typings.reactSpringShared.reactSpringSharedStrings.ivory
    - typings.reactSpringShared.reactSpringSharedStrings.khaki
    - typings.reactSpringShared.reactSpringSharedStrings.lavender
    - typings.reactSpringShared.reactSpringSharedStrings.lavenderblush
    - typings.reactSpringShared.reactSpringSharedStrings.lawngreen
    - typings.reactSpringShared.reactSpringSharedStrings.lemonchiffon
    - typings.reactSpringShared.reactSpringSharedStrings.lightblue
    - typings.reactSpringShared.reactSpringSharedStrings.lightcoral
    - typings.reactSpringShared.reactSpringSharedStrings.lightcyan
    - typings.reactSpringShared.reactSpringSharedStrings.lightgoldenrodyellow
    - typings.reactSpringShared.reactSpringSharedStrings.lightgray
    - typings.reactSpringShared.reactSpringSharedStrings.lightgreen
    - typings.reactSpringShared.reactSpringSharedStrings.lightgrey
    - typings.reactSpringShared.reactSpringSharedStrings.lightpink
    - typings.reactSpringShared.reactSpringSharedStrings.lightsalmon
    - typings.reactSpringShared.reactSpringSharedStrings.lightseagreen
    - typings.reactSpringShared.reactSpringSharedStrings.lightskyblue
    - typings.reactSpringShared.reactSpringSharedStrings.lightslategray
    - typings.reactSpringShared.reactSpringSharedStrings.lightslategrey
    - typings.reactSpringShared.reactSpringSharedStrings.lightsteelblue
    - typings.reactSpringShared.reactSpringSharedStrings.lightyellow
    - typings.reactSpringShared.reactSpringSharedStrings.lime
    - typings.reactSpringShared.reactSpringSharedStrings.limegreen
    - typings.reactSpringShared.reactSpringSharedStrings.linen
    - typings.reactSpringShared.reactSpringSharedStrings.magenta
    - typings.reactSpringShared.reactSpringSharedStrings.maroon
    - typings.reactSpringShared.reactSpringSharedStrings.mediumaquamarine
    - typings.reactSpringShared.reactSpringSharedStrings.mediumblue
    - typings.reactSpringShared.reactSpringSharedStrings.mediumorchid
    - typings.reactSpringShared.reactSpringSharedStrings.mediumpurple
    - typings.reactSpringShared.reactSpringSharedStrings.mediumseagreen
    - typings.reactSpringShared.reactSpringSharedStrings.mediumslateblue
    - typings.reactSpringShared.reactSpringSharedStrings.mediumspringgreen
    - typings.reactSpringShared.reactSpringSharedStrings.mediumturquoise
    - typings.reactSpringShared.reactSpringSharedStrings.mediumvioletred
    - typings.reactSpringShared.reactSpringSharedStrings.midnightblue
    - typings.reactSpringShared.reactSpringSharedStrings.mintcream
    - typings.reactSpringShared.reactSpringSharedStrings.mistyrose
    - typings.reactSpringShared.reactSpringSharedStrings.moccasin
    - typings.reactSpringShared.reactSpringSharedStrings.navajowhite
    - typings.reactSpringShared.reactSpringSharedStrings.navy
    - typings.reactSpringShared.reactSpringSharedStrings.oldlace
    - typings.reactSpringShared.reactSpringSharedStrings.olive
    - typings.reactSpringShared.reactSpringSharedStrings.olivedrab
    - typings.reactSpringShared.reactSpringSharedStrings.orange
    - typings.reactSpringShared.reactSpringSharedStrings.orangered
    - typings.reactSpringShared.reactSpringSharedStrings.orchid
    - typings.reactSpringShared.reactSpringSharedStrings.palegoldenrod
    - typings.reactSpringShared.reactSpringSharedStrings.palegreen
    - typings.reactSpringShared.reactSpringSharedStrings.paleturquoise
    - typings.reactSpringShared.reactSpringSharedStrings.palevioletred
    - typings.reactSpringShared.reactSpringSharedStrings.papayawhip
    - typings.reactSpringShared.reactSpringSharedStrings.peachpuff
    - typings.reactSpringShared.reactSpringSharedStrings.peru
    - typings.reactSpringShared.reactSpringSharedStrings.pink
    - typings.reactSpringShared.reactSpringSharedStrings.plum
    - typings.reactSpringShared.reactSpringSharedStrings.powderblue
    - typings.reactSpringShared.reactSpringSharedStrings.purple
    - typings.reactSpringShared.reactSpringSharedStrings.rebeccapurple
    - typings.reactSpringShared.reactSpringSharedStrings.red
    - typings.reactSpringShared.reactSpringSharedStrings.rosybrown
    - typings.reactSpringShared.reactSpringSharedStrings.royalblue
    - typings.reactSpringShared.reactSpringSharedStrings.saddlebrown
    - typings.reactSpringShared.reactSpringSharedStrings.salmon
    - typings.reactSpringShared.reactSpringSharedStrings.sandybrown
    - typings.reactSpringShared.reactSpringSharedStrings.seagreen
    - typings.reactSpringShared.reactSpringSharedStrings.seashell
    - typings.reactSpringShared.reactSpringSharedStrings.sienna
    - typings.reactSpringShared.reactSpringSharedStrings.silver
    - typings.reactSpringShared.reactSpringSharedStrings.skyblue
    - typings.reactSpringShared.reactSpringSharedStrings.slateblue
    - typings.reactSpringShared.reactSpringSharedStrings.slategray
    - typings.reactSpringShared.reactSpringSharedStrings.slategrey
    - typings.reactSpringShared.reactSpringSharedStrings.snow
    - typings.reactSpringShared.reactSpringSharedStrings.springgreen
    - typings.reactSpringShared.reactSpringSharedStrings.steelblue
    - typings.reactSpringShared.reactSpringSharedStrings.tan
    - typings.reactSpringShared.reactSpringSharedStrings.teal
    - typings.reactSpringShared.reactSpringSharedStrings.thistle
    - typings.reactSpringShared.reactSpringSharedStrings.tomato
    - typings.reactSpringShared.reactSpringSharedStrings.turquoise
    - typings.reactSpringShared.reactSpringSharedStrings.violet
    - typings.reactSpringShared.reactSpringSharedStrings.wheat
    - typings.reactSpringShared.reactSpringSharedStrings.white
    - typings.reactSpringShared.reactSpringSharedStrings.whitesmoke
    - typings.reactSpringShared.reactSpringSharedStrings.yellow
    - typings.reactSpringShared.reactSpringSharedStrings.yellowgreen
  */
  trait ColorName extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSpringShared.reactSpringSharedStrings.start
    - typings.reactSpringShared.reactSpringSharedStrings.end
  */
  trait Direction extends StObject
  object Direction {
    
    inline def end: typings.reactSpringShared.reactSpringSharedStrings.end = "end".asInstanceOf[typings.reactSpringShared.reactSpringSharedStrings.end]
    
    inline def start: typings.reactSpringShared.reactSpringSharedStrings.start = "start".asInstanceOf[typings.reactSpringShared.reactSpringSharedStrings.start]
  }
  
  type EachFn[Value, Key, This] = js.ThisFunction2[/* this */ This, /* value */ Value, /* key */ Key, Unit]
  
  @js.native
  trait Eachable[Value, Key, This] extends StObject {
    
    def forEach(cb: EachFn[Value, Key, This]): Unit = js.native
    def forEach(cb: EachFn[Value, Key, This], ctx: This): Unit = js.native
  }
  
  /**
    * With thanks to ai easings.net
    * https://github.com/ai/easings.net/blob/master/src/easings/easingsFunctions.ts
    */
  trait EasingDictionary extends StObject {
    
    def easeInBack(t: Double): Double
    
    def easeInBounce(t: Double): Double
    
    def easeInCirc(t: Double): Double
    
    def easeInCubic(t: Double): Double
    
    def easeInElastic(t: Double): Double
    
    def easeInExpo(t: Double): Double
    
    def easeInOutBack(t: Double): Double
    
    def easeInOutBounce(t: Double): Double
    
    def easeInOutCirc(t: Double): Double
    
    def easeInOutCubic(t: Double): Double
    
    def easeInOutElastic(t: Double): Double
    
    def easeInOutExpo(t: Double): Double
    
    def easeInOutQuad(t: Double): Double
    
    def easeInOutQuart(t: Double): Double
    
    def easeInOutQuint(t: Double): Double
    
    def easeInOutSine(t: Double): Double
    
    def easeInQuad(t: Double): Double
    
    def easeInQuart(t: Double): Double
    
    def easeInQuint(t: Double): Double
    
    def easeInSine(t: Double): Double
    
    def easeOutBack(t: Double): Double
    
    def easeOutBounce(t: Double): Double
    
    def easeOutCirc(t: Double): Double
    
    def easeOutCubic(t: Double): Double
    
    def easeOutElastic(t: Double): Double
    
    def easeOutExpo(t: Double): Double
    
    def easeOutQuad(t: Double): Double
    
    def easeOutQuart(t: Double): Double
    
    def easeOutQuint(t: Double): Double
    
    def easeOutSine(t: Double): Double
    
    def linear(t: Double): Double
    
    var steps: StepsEasing
  }
  object EasingDictionary {
    
    inline def apply(
      easeInBack: Double => Double,
      easeInBounce: Double => Double,
      easeInCirc: Double => Double,
      easeInCubic: Double => Double,
      easeInElastic: Double => Double,
      easeInExpo: Double => Double,
      easeInOutBack: Double => Double,
      easeInOutBounce: Double => Double,
      easeInOutCirc: Double => Double,
      easeInOutCubic: Double => Double,
      easeInOutElastic: Double => Double,
      easeInOutExpo: Double => Double,
      easeInOutQuad: Double => Double,
      easeInOutQuart: Double => Double,
      easeInOutQuint: Double => Double,
      easeInOutSine: Double => Double,
      easeInQuad: Double => Double,
      easeInQuart: Double => Double,
      easeInQuint: Double => Double,
      easeInSine: Double => Double,
      easeOutBack: Double => Double,
      easeOutBounce: Double => Double,
      easeOutCirc: Double => Double,
      easeOutCubic: Double => Double,
      easeOutElastic: Double => Double,
      easeOutExpo: Double => Double,
      easeOutQuad: Double => Double,
      easeOutQuart: Double => Double,
      easeOutQuint: Double => Double,
      easeOutSine: Double => Double,
      linear: Double => Double,
      steps: (/* steps */ Double, /* direction */ js.UndefOr[Direction]) => EasingFunction
    ): EasingDictionary = {
      val __obj = js.Dynamic.literal(easeInBack = js.Any.fromFunction1(easeInBack), easeInBounce = js.Any.fromFunction1(easeInBounce), easeInCirc = js.Any.fromFunction1(easeInCirc), easeInCubic = js.Any.fromFunction1(easeInCubic), easeInElastic = js.Any.fromFunction1(easeInElastic), easeInExpo = js.Any.fromFunction1(easeInExpo), easeInOutBack = js.Any.fromFunction1(easeInOutBack), easeInOutBounce = js.Any.fromFunction1(easeInOutBounce), easeInOutCirc = js.Any.fromFunction1(easeInOutCirc), easeInOutCubic = js.Any.fromFunction1(easeInOutCubic), easeInOutElastic = js.Any.fromFunction1(easeInOutElastic), easeInOutExpo = js.Any.fromFunction1(easeInOutExpo), easeInOutQuad = js.Any.fromFunction1(easeInOutQuad), easeInOutQuart = js.Any.fromFunction1(easeInOutQuart), easeInOutQuint = js.Any.fromFunction1(easeInOutQuint), easeInOutSine = js.Any.fromFunction1(easeInOutSine), easeInQuad = js.Any.fromFunction1(easeInQuad), easeInQuart = js.Any.fromFunction1(easeInQuart), easeInQuint = js.Any.fromFunction1(easeInQuint), easeInSine = js.Any.fromFunction1(easeInSine), easeOutBack = js.Any.fromFunction1(easeOutBack), easeOutBounce = js.Any.fromFunction1(easeOutBounce), easeOutCirc = js.Any.fromFunction1(easeOutCirc), easeOutCubic = js.Any.fromFunction1(easeOutCubic), easeOutElastic = js.Any.fromFunction1(easeOutElastic), easeOutExpo = js.Any.fromFunction1(easeOutExpo), easeOutQuad = js.Any.fromFunction1(easeOutQuad), easeOutQuart = js.Any.fromFunction1(easeOutQuart), easeOutQuint = js.Any.fromFunction1(easeOutQuint), easeOutSine = js.Any.fromFunction1(easeOutSine), linear = js.Any.fromFunction1(linear), steps = js.Any.fromFunction2(steps))
      __obj.asInstanceOf[EasingDictionary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EasingDictionary] (val x: Self) extends AnyVal {
      
      inline def setEaseInBack(value: Double => Double): Self = StObject.set(x, "easeInBack", js.Any.fromFunction1(value))
      
      inline def setEaseInBounce(value: Double => Double): Self = StObject.set(x, "easeInBounce", js.Any.fromFunction1(value))
      
      inline def setEaseInCirc(value: Double => Double): Self = StObject.set(x, "easeInCirc", js.Any.fromFunction1(value))
      
      inline def setEaseInCubic(value: Double => Double): Self = StObject.set(x, "easeInCubic", js.Any.fromFunction1(value))
      
      inline def setEaseInElastic(value: Double => Double): Self = StObject.set(x, "easeInElastic", js.Any.fromFunction1(value))
      
      inline def setEaseInExpo(value: Double => Double): Self = StObject.set(x, "easeInExpo", js.Any.fromFunction1(value))
      
      inline def setEaseInOutBack(value: Double => Double): Self = StObject.set(x, "easeInOutBack", js.Any.fromFunction1(value))
      
      inline def setEaseInOutBounce(value: Double => Double): Self = StObject.set(x, "easeInOutBounce", js.Any.fromFunction1(value))
      
      inline def setEaseInOutCirc(value: Double => Double): Self = StObject.set(x, "easeInOutCirc", js.Any.fromFunction1(value))
      
      inline def setEaseInOutCubic(value: Double => Double): Self = StObject.set(x, "easeInOutCubic", js.Any.fromFunction1(value))
      
      inline def setEaseInOutElastic(value: Double => Double): Self = StObject.set(x, "easeInOutElastic", js.Any.fromFunction1(value))
      
      inline def setEaseInOutExpo(value: Double => Double): Self = StObject.set(x, "easeInOutExpo", js.Any.fromFunction1(value))
      
      inline def setEaseInOutQuad(value: Double => Double): Self = StObject.set(x, "easeInOutQuad", js.Any.fromFunction1(value))
      
      inline def setEaseInOutQuart(value: Double => Double): Self = StObject.set(x, "easeInOutQuart", js.Any.fromFunction1(value))
      
      inline def setEaseInOutQuint(value: Double => Double): Self = StObject.set(x, "easeInOutQuint", js.Any.fromFunction1(value))
      
      inline def setEaseInOutSine(value: Double => Double): Self = StObject.set(x, "easeInOutSine", js.Any.fromFunction1(value))
      
      inline def setEaseInQuad(value: Double => Double): Self = StObject.set(x, "easeInQuad", js.Any.fromFunction1(value))
      
      inline def setEaseInQuart(value: Double => Double): Self = StObject.set(x, "easeInQuart", js.Any.fromFunction1(value))
      
      inline def setEaseInQuint(value: Double => Double): Self = StObject.set(x, "easeInQuint", js.Any.fromFunction1(value))
      
      inline def setEaseInSine(value: Double => Double): Self = StObject.set(x, "easeInSine", js.Any.fromFunction1(value))
      
      inline def setEaseOutBack(value: Double => Double): Self = StObject.set(x, "easeOutBack", js.Any.fromFunction1(value))
      
      inline def setEaseOutBounce(value: Double => Double): Self = StObject.set(x, "easeOutBounce", js.Any.fromFunction1(value))
      
      inline def setEaseOutCirc(value: Double => Double): Self = StObject.set(x, "easeOutCirc", js.Any.fromFunction1(value))
      
      inline def setEaseOutCubic(value: Double => Double): Self = StObject.set(x, "easeOutCubic", js.Any.fromFunction1(value))
      
      inline def setEaseOutElastic(value: Double => Double): Self = StObject.set(x, "easeOutElastic", js.Any.fromFunction1(value))
      
      inline def setEaseOutExpo(value: Double => Double): Self = StObject.set(x, "easeOutExpo", js.Any.fromFunction1(value))
      
      inline def setEaseOutQuad(value: Double => Double): Self = StObject.set(x, "easeOutQuad", js.Any.fromFunction1(value))
      
      inline def setEaseOutQuart(value: Double => Double): Self = StObject.set(x, "easeOutQuart", js.Any.fromFunction1(value))
      
      inline def setEaseOutQuint(value: Double => Double): Self = StObject.set(x, "easeOutQuint", js.Any.fromFunction1(value))
      
      inline def setEaseOutSine(value: Double => Double): Self = StObject.set(x, "easeOutSine", js.Any.fromFunction1(value))
      
      inline def setLinear(value: Double => Double): Self = StObject.set(x, "linear", js.Any.fromFunction1(value))
      
      inline def setSteps(value: (/* steps */ Double, /* direction */ js.UndefOr[Direction]) => EasingFunction): Self = StObject.set(x, "steps", js.Any.fromFunction2(value))
    }
  }
  
  /** An event sent to `FluidObserver` objects. */
  trait FluidEvent[T] extends StObject {
    
    var parent: FluidValue[T, Any]
    
    var `type`: String
  }
  object FluidEvent {
    
    inline def apply[T](parent: FluidValue[T, Any], `type`: String): FluidEvent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluidEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FluidEvent[?], T] (val x: Self & FluidEvent[T]) extends AnyVal {
      
      inline def setParent(value: FluidValue[T, Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** An observer of `FluidValue` objects. */
  type FluidObserver[E /* <: FluidEvent[Any] */] = EventObserved[E] | (js.Function1[/* event */ E, Unit])
  
  /** Add the `FluidValue` type to every property. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends object ? {[ P in keyof T ]: T[P] | @react-spring/shared.@react-spring/shared.FluidValue<std.Exclude<T[P], void>, any>} : unknown
    }}}
    */
  @js.native
  trait FluidProps[T] extends StObject
  
  @js.native
  trait GetFluidObservers_ extends StObject {
    
    def apply(target: js.Object): ReadonlySet[FluidObserver[Any]] | Null = js.native
    def apply[E /* <: FluidEvent[Any] */](target: FluidValue[Any, E]): ReadonlySet[FluidObserver[E]] | Null = js.native
  }
  
  type GetFluidValue_ = js.Function1[
    /* target */ Any | (FluidValue[scala.Nothing, Any]), 
    (Exclude[Any, FluidValue[Any, Any]]) | scala.Nothing
  ]
  
  type Init[T] = js.Function0[T]
  
  type IsType[U] = js.Function1[
    /* arg */ Any, 
    /* is @react-spring/shared.@react-spring/shared.Narrow<any, U> */ Boolean
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [@react-spring/types.@react-spring/types.Any] ? U : [T] extends [U] ? std.Extract<T, U> : U
    }}}
    */
  type Narrow[T, U] = U
  
  type OnResizeCallback = js.Function1[/* rect */ PickDOMRectReadOnlywidthh, Unit]
  
  trait OnResizeOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
  }
  object OnResizeOptions {
    
    inline def apply(): OnResizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnResizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnResizeOptions] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  type OnScrollCallback = js.Function1[/* info */ ScrollInfo, Unit]
  
  trait OnScrollOptions extends StObject {
    
    /**
      * The root container to measure against
      */
    var container: js.UndefOr[HTMLElement] = js.undefined
  }
  object OnScrollOptions {
    
    inline def apply(): OnScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnScrollOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnScrollOptions] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  trait OpaqueAnimation extends StObject {
    
    def advance(dt: Double): Unit
    
    var idle: Boolean
    
    var priority: Double
  }
  object OpaqueAnimation {
    
    inline def apply(advance: Double => Unit, idle: Boolean, priority: Double): OpaqueAnimation = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1(advance), idle = idle.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpaqueAnimation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpaqueAnimation] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double => Unit): Self = StObject.set(x, "advance", js.Any.fromFunction1(value))
      
      inline def setIdle(value: Boolean): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Whilst user's may not need the scrollLength, it's easier to return
    * the whole state we're storing and let them pick what they want.
    */
  trait ScrollAxis extends StObject {
    
    var current: Double
    
    var progress: Double
    
    var scrollLength: Double
  }
  object ScrollAxis {
    
    inline def apply(current: Double, progress: Double, scrollLength: Double): ScrollAxis = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], scrollLength = scrollLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollAxis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollAxis] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setScrollLength(value: Double): Self = StObject.set(x, "scrollLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollInfo extends StObject {
    
    var time: Double
    
    var x: ScrollAxis
    
    var y: ScrollAxis
  }
  object ScrollInfo {
    
    inline def apply(time: Double, x: ScrollAxis, y: ScrollAxis): ScrollInfo = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollInfo] (val x: Self) extends AnyVal {
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setX(value: ScrollAxis): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: ScrollAxis): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /** Remove the `FluidValue` type from every property. */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] extends @react-spring/shared.@react-spring/shared.FluidValue<infer U, any>? U : T[P]}
    }}}
    */
  @js.native
  trait StaticProps[T /* <: js.Object */] extends StObject
  
  type StepsEasing = js.Function2[/* steps */ Double, /* direction */ js.UndefOr[Direction], EasingFunction]
  
  type globalsAnimatedGlobals = AnimatedGlobals
}
