package typings.reactSpringShared

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidEvent
import typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidObserver
import typings.reactSpringShared.distDeclarationsSrcFluidsMod.GetFluidObservers_
import typings.reactSpringShared.distDeclarationsSrcFluidsMod.GetFluidValue_
import typings.reactSpringShared.distDeclarationsSrcFrameLoopMod.OpaqueAnimation
import typings.reactSpringShared.distDeclarationsSrcGlobalsMod.AnimatedGlobals
import typings.reactSpringShared.distDeclarationsSrcHelpersMod.EachFn
import typings.reactSpringShared.distDeclarationsSrcHelpersMod.Eachable
import typings.reactSpringShared.distDeclarationsSrcHelpersMod.IsType
import typings.reactSpringTypes.interpolationMod.InterpolatorArgs
import typings.reactSpringTypes.interpolationMod.InterpolatorConfig
import typings.reactSpringTypes.interpolationMod.InterpolatorFactory
import typings.reactSpringTypes.utilMod.AnyFn
import typings.reactSpringTypes.utilMod.OneOrMore
import typings.std.Map
import typings.std.Parameters
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@react-spring/shared/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extend this class for automatic TypeScript support when passing this
    * value to `fluids`-compatible libraries.
    */
  /* note: abstract class */ @JSImport("@react-spring/shared/dist/declarations/src", "FluidValue")
  @js.native
  open class FluidValue[T, E /* <: FluidEvent[T] */] ()
    extends typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue[T, E] {
    def this(get: js.Function0[T]) = this()
  }
  
  object Globals {
    
    @JSImport("@react-spring/shared/dist/declarations/src", "Globals")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assign(globals: AnimatedGlobals): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(globals.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@react-spring/shared/dist/declarations/src", "Globals.colors")
    @js.native
    def colors: StringDictionary[Double] | Null = js.native
    inline def colors_=(x: StringDictionary[Double] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "Globals.createStringInterpolator")
    @js.native
    def createStringInterpolator: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]] = js.native
    inline def createStringInterpolator_=(x: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createStringInterpolator")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "Globals.skipAnimation")
    @js.native
    def skipAnimation: Boolean = js.native
    inline def skipAnimation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipAnimation")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "Globals.to")
    @js.native
    def to: js.Function2[
        /* source */ OneOrMore[typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue[Any, Any]], 
        /* args */ InterpolatorArgs[Any, Any], 
        typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue[Any, Any]
      ] = js.native
    inline def to_=(
      x: js.Function2[
          /* source */ OneOrMore[typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue[Any, Any]], 
          /* args */ InterpolatorArgs[Any, Any], 
          typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue[Any, Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("to")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "Globals.willAdvance")
    @js.native
    def willAdvance: js.Function1[/* animation */ OpaqueAnimation, Unit] = js.native
    inline def willAdvance_=(x: js.Function1[/* animation */ OpaqueAnimation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("willAdvance")(x.asInstanceOf[js.Any])
  }
  
  inline def addFluidObserver[E /* <: FluidEvent[Any] */](target: js.Object, observer: FluidObserver[E]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Any]
  /** Observe a `fluids`-compatible object. */
  inline def addFluidObserver[T, E /* <: FluidEvent[Any] */](
    target: typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue[T, E],
    observer: FluidObserver[E]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** Send an event to an observer. */
  inline def callFluidObserver[E /* <: FluidEvent[Any] */](observer: FluidObserver[E], event: E): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObserver")(observer.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def callFluidObservers(target: js.Object, event: FluidEvent[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObservers")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Send an event to all observers. */
  inline def callFluidObservers[E /* <: FluidEvent[Any] */](target: typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue[Any, E], event: E): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callFluidObservers")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def colorToRgba(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToRgba")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object colors {
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.aliceblue")
    @js.native
    def aliceblue: Double = js.native
    inline def aliceblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliceblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.antiquewhite")
    @js.native
    def antiquewhite: Double = js.native
    inline def antiquewhite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("antiquewhite")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.aqua")
    @js.native
    def aqua: Double = js.native
    inline def aqua_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aqua")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.aquamarine")
    @js.native
    def aquamarine: Double = js.native
    inline def aquamarine_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aquamarine")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.azure")
    @js.native
    def azure: Double = js.native
    inline def azure_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("azure")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.beige")
    @js.native
    def beige: Double = js.native
    inline def beige_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beige")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.bisque")
    @js.native
    def bisque: Double = js.native
    inline def bisque_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bisque")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.black")
    @js.native
    def black: Double = js.native
    inline def black_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.blanchedalmond")
    @js.native
    def blanchedalmond: Double = js.native
    inline def blanchedalmond_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blanchedalmond")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.blue")
    @js.native
    def blue: Double = js.native
    inline def blue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.blueviolet")
    @js.native
    def blueviolet: Double = js.native
    inline def blueviolet_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blueviolet")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.brown")
    @js.native
    def brown: Double = js.native
    inline def brown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brown")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.burlywood")
    @js.native
    def burlywood: Double = js.native
    inline def burlywood_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("burlywood")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.burntsienna")
    @js.native
    def burntsienna: Double = js.native
    inline def burntsienna_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("burntsienna")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.cadetblue")
    @js.native
    def cadetblue: Double = js.native
    inline def cadetblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cadetblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.chartreuse")
    @js.native
    def chartreuse: Double = js.native
    inline def chartreuse_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chartreuse")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.chocolate")
    @js.native
    def chocolate: Double = js.native
    inline def chocolate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chocolate")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.coral")
    @js.native
    def coral: Double = js.native
    inline def coral_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coral")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.cornflowerblue")
    @js.native
    def cornflowerblue: Double = js.native
    inline def cornflowerblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cornflowerblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.cornsilk")
    @js.native
    def cornsilk: Double = js.native
    inline def cornsilk_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cornsilk")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.crimson")
    @js.native
    def crimson: Double = js.native
    inline def crimson_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crimson")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.cyan")
    @js.native
    def cyan: Double = js.native
    inline def cyan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyan")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkblue")
    @js.native
    def darkblue: Double = js.native
    inline def darkblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkcyan")
    @js.native
    def darkcyan: Double = js.native
    inline def darkcyan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkcyan")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkgoldenrod")
    @js.native
    def darkgoldenrod: Double = js.native
    inline def darkgoldenrod_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgoldenrod")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkgray")
    @js.native
    def darkgray: Double = js.native
    inline def darkgray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkgreen")
    @js.native
    def darkgreen: Double = js.native
    inline def darkgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkgrey")
    @js.native
    def darkgrey: Double = js.native
    inline def darkgrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkkhaki")
    @js.native
    def darkkhaki: Double = js.native
    inline def darkkhaki_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkkhaki")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkmagenta")
    @js.native
    def darkmagenta: Double = js.native
    inline def darkmagenta_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkmagenta")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkolivegreen")
    @js.native
    def darkolivegreen: Double = js.native
    inline def darkolivegreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkolivegreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkorange")
    @js.native
    def darkorange: Double = js.native
    inline def darkorange_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkorange")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkorchid")
    @js.native
    def darkorchid: Double = js.native
    inline def darkorchid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkorchid")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkred")
    @js.native
    def darkred: Double = js.native
    inline def darkred_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkred")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darksalmon")
    @js.native
    def darksalmon: Double = js.native
    inline def darksalmon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darksalmon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkseagreen")
    @js.native
    def darkseagreen: Double = js.native
    inline def darkseagreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkseagreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkslateblue")
    @js.native
    def darkslateblue: Double = js.native
    inline def darkslateblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkslateblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkslategray")
    @js.native
    def darkslategray: Double = js.native
    inline def darkslategray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkslategray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkslategrey")
    @js.native
    def darkslategrey: Double = js.native
    inline def darkslategrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkslategrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkturquoise")
    @js.native
    def darkturquoise: Double = js.native
    inline def darkturquoise_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkturquoise")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.darkviolet")
    @js.native
    def darkviolet: Double = js.native
    inline def darkviolet_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkviolet")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.deeppink")
    @js.native
    def deeppink: Double = js.native
    inline def deeppink_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deeppink")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.deepskyblue")
    @js.native
    def deepskyblue: Double = js.native
    inline def deepskyblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepskyblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.dimgray")
    @js.native
    def dimgray: Double = js.native
    inline def dimgray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dimgray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.dimgrey")
    @js.native
    def dimgrey: Double = js.native
    inline def dimgrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dimgrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.dodgerblue")
    @js.native
    def dodgerblue: Double = js.native
    inline def dodgerblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dodgerblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.firebrick")
    @js.native
    def firebrick: Double = js.native
    inline def firebrick_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firebrick")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.floralwhite")
    @js.native
    def floralwhite: Double = js.native
    inline def floralwhite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("floralwhite")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.forestgreen")
    @js.native
    def forestgreen: Double = js.native
    inline def forestgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forestgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.fuchsia")
    @js.native
    def fuchsia: Double = js.native
    inline def fuchsia_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fuchsia")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.gainsboro")
    @js.native
    def gainsboro: Double = js.native
    inline def gainsboro_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gainsboro")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.ghostwhite")
    @js.native
    def ghostwhite: Double = js.native
    inline def ghostwhite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ghostwhite")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.gold")
    @js.native
    def gold: Double = js.native
    inline def gold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gold")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.goldenrod")
    @js.native
    def goldenrod: Double = js.native
    inline def goldenrod_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goldenrod")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.gray")
    @js.native
    def gray: Double = js.native
    inline def gray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.green")
    @js.native
    def green: Double = js.native
    inline def green_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.greenyellow")
    @js.native
    def greenyellow: Double = js.native
    inline def greenyellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greenyellow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.grey")
    @js.native
    def grey: Double = js.native
    inline def grey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.honeydew")
    @js.native
    def honeydew: Double = js.native
    inline def honeydew_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("honeydew")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.hotpink")
    @js.native
    def hotpink: Double = js.native
    inline def hotpink_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hotpink")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.indianred")
    @js.native
    def indianred: Double = js.native
    inline def indianred_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indianred")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.indigo")
    @js.native
    def indigo: Double = js.native
    inline def indigo_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indigo")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.ivory")
    @js.native
    def ivory: Double = js.native
    inline def ivory_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ivory")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.khaki")
    @js.native
    def khaki: Double = js.native
    inline def khaki_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("khaki")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lavender")
    @js.native
    def lavender: Double = js.native
    inline def lavender_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lavender")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lavenderblush")
    @js.native
    def lavenderblush: Double = js.native
    inline def lavenderblush_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lavenderblush")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lawngreen")
    @js.native
    def lawngreen: Double = js.native
    inline def lawngreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lawngreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lemonchiffon")
    @js.native
    def lemonchiffon: Double = js.native
    inline def lemonchiffon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lemonchiffon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightblue")
    @js.native
    def lightblue: Double = js.native
    inline def lightblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightcoral")
    @js.native
    def lightcoral: Double = js.native
    inline def lightcoral_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightcoral")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightcyan")
    @js.native
    def lightcyan: Double = js.native
    inline def lightcyan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightcyan")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightgoldenrodyellow")
    @js.native
    def lightgoldenrodyellow: Double = js.native
    inline def lightgoldenrodyellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgoldenrodyellow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightgray")
    @js.native
    def lightgray: Double = js.native
    inline def lightgray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightgreen")
    @js.native
    def lightgreen: Double = js.native
    inline def lightgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightgrey")
    @js.native
    def lightgrey: Double = js.native
    inline def lightgrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightpink")
    @js.native
    def lightpink: Double = js.native
    inline def lightpink_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightpink")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightsalmon")
    @js.native
    def lightsalmon: Double = js.native
    inline def lightsalmon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightsalmon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightseagreen")
    @js.native
    def lightseagreen: Double = js.native
    inline def lightseagreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightseagreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightskyblue")
    @js.native
    def lightskyblue: Double = js.native
    inline def lightskyblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightskyblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightslategray")
    @js.native
    def lightslategray: Double = js.native
    inline def lightslategray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightslategray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightslategrey")
    @js.native
    def lightslategrey: Double = js.native
    inline def lightslategrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightslategrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightsteelblue")
    @js.native
    def lightsteelblue: Double = js.native
    inline def lightsteelblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightsteelblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lightyellow")
    @js.native
    def lightyellow: Double = js.native
    inline def lightyellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightyellow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.lime")
    @js.native
    def lime: Double = js.native
    inline def lime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lime")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.limegreen")
    @js.native
    def limegreen: Double = js.native
    inline def limegreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limegreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.linen")
    @js.native
    def linen: Double = js.native
    inline def linen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.magenta")
    @js.native
    def magenta: Double = js.native
    inline def magenta_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("magenta")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.maroon")
    @js.native
    def maroon: Double = js.native
    inline def maroon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maroon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumaquamarine")
    @js.native
    def mediumaquamarine: Double = js.native
    inline def mediumaquamarine_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumaquamarine")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumblue")
    @js.native
    def mediumblue: Double = js.native
    inline def mediumblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumorchid")
    @js.native
    def mediumorchid: Double = js.native
    inline def mediumorchid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumorchid")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumpurple")
    @js.native
    def mediumpurple: Double = js.native
    inline def mediumpurple_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumpurple")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumseagreen")
    @js.native
    def mediumseagreen: Double = js.native
    inline def mediumseagreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumseagreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumslateblue")
    @js.native
    def mediumslateblue: Double = js.native
    inline def mediumslateblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumslateblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumspringgreen")
    @js.native
    def mediumspringgreen: Double = js.native
    inline def mediumspringgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumspringgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumturquoise")
    @js.native
    def mediumturquoise: Double = js.native
    inline def mediumturquoise_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumturquoise")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mediumvioletred")
    @js.native
    def mediumvioletred: Double = js.native
    inline def mediumvioletred_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediumvioletred")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.midnightblue")
    @js.native
    def midnightblue: Double = js.native
    inline def midnightblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midnightblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mintcream")
    @js.native
    def mintcream: Double = js.native
    inline def mintcream_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mintcream")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.mistyrose")
    @js.native
    def mistyrose: Double = js.native
    inline def mistyrose_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mistyrose")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.moccasin")
    @js.native
    def moccasin: Double = js.native
    inline def moccasin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moccasin")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.navajowhite")
    @js.native
    def navajowhite: Double = js.native
    inline def navajowhite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navajowhite")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.navy")
    @js.native
    def navy: Double = js.native
    inline def navy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navy")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.oldlace")
    @js.native
    def oldlace: Double = js.native
    inline def oldlace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oldlace")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.olive")
    @js.native
    def olive: Double = js.native
    inline def olive_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("olive")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.olivedrab")
    @js.native
    def olivedrab: Double = js.native
    inline def olivedrab_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("olivedrab")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.orange")
    @js.native
    def orange: Double = js.native
    inline def orange_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.orangered")
    @js.native
    def orangered: Double = js.native
    inline def orangered_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orangered")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.orchid")
    @js.native
    def orchid: Double = js.native
    inline def orchid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orchid")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.palegoldenrod")
    @js.native
    def palegoldenrod: Double = js.native
    inline def palegoldenrod_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("palegoldenrod")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.palegreen")
    @js.native
    def palegreen: Double = js.native
    inline def palegreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("palegreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.paleturquoise")
    @js.native
    def paleturquoise: Double = js.native
    inline def paleturquoise_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paleturquoise")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.palevioletred")
    @js.native
    def palevioletred: Double = js.native
    inline def palevioletred_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("palevioletred")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.papayawhip")
    @js.native
    def papayawhip: Double = js.native
    inline def papayawhip_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("papayawhip")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.peachpuff")
    @js.native
    def peachpuff: Double = js.native
    inline def peachpuff_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peachpuff")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.peru")
    @js.native
    def peru: Double = js.native
    inline def peru_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peru")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.pink")
    @js.native
    def pink: Double = js.native
    inline def pink_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.plum")
    @js.native
    def plum: Double = js.native
    inline def plum_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plum")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.powderblue")
    @js.native
    def powderblue: Double = js.native
    inline def powderblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("powderblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.purple")
    @js.native
    def purple: Double = js.native
    inline def purple_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.rebeccapurple")
    @js.native
    def rebeccapurple: Double = js.native
    inline def rebeccapurple_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rebeccapurple")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.red")
    @js.native
    def red: Double = js.native
    inline def red_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.rosybrown")
    @js.native
    def rosybrown: Double = js.native
    inline def rosybrown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rosybrown")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.royalblue")
    @js.native
    def royalblue: Double = js.native
    inline def royalblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("royalblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.saddlebrown")
    @js.native
    def saddlebrown: Double = js.native
    inline def saddlebrown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saddlebrown")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.salmon")
    @js.native
    def salmon: Double = js.native
    inline def salmon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("salmon")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.sandybrown")
    @js.native
    def sandybrown: Double = js.native
    inline def sandybrown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sandybrown")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.seagreen")
    @js.native
    def seagreen: Double = js.native
    inline def seagreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seagreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.seashell")
    @js.native
    def seashell: Double = js.native
    inline def seashell_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seashell")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.sienna")
    @js.native
    def sienna: Double = js.native
    inline def sienna_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sienna")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.silver")
    @js.native
    def silver: Double = js.native
    inline def silver_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silver")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.skyblue")
    @js.native
    def skyblue: Double = js.native
    inline def skyblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skyblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.slateblue")
    @js.native
    def slateblue: Double = js.native
    inline def slateblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slateblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.slategray")
    @js.native
    def slategray: Double = js.native
    inline def slategray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slategray")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.slategrey")
    @js.native
    def slategrey: Double = js.native
    inline def slategrey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slategrey")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.snow")
    @js.native
    def snow: Double = js.native
    inline def snow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.springgreen")
    @js.native
    def springgreen: Double = js.native
    inline def springgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("springgreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.steelblue")
    @js.native
    def steelblue: Double = js.native
    inline def steelblue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("steelblue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.tan")
    @js.native
    def tan: Double = js.native
    inline def tan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tan")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.teal")
    @js.native
    def teal: Double = js.native
    inline def teal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teal")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.thistle")
    @js.native
    def thistle: Double = js.native
    inline def thistle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thistle")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.tomato")
    @js.native
    def tomato: Double = js.native
    inline def tomato_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tomato")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.transparent")
    @js.native
    def transparent: Double = js.native
    inline def transparent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.turquoise")
    @js.native
    def turquoise: Double = js.native
    inline def turquoise_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("turquoise")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.violet")
    @js.native
    def violet: Double = js.native
    inline def violet_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("violet")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.wheat")
    @js.native
    def wheat: Double = js.native
    inline def wheat_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wheat")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.white")
    @js.native
    def white: Double = js.native
    inline def white_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.whitesmoke")
    @js.native
    def whitesmoke: Double = js.native
    inline def whitesmoke_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitesmoke")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.yellow")
    @js.native
    def yellow: Double = js.native
    inline def yellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "colors.yellowgreen")
    @js.native
    def yellowgreen: Double = js.native
    inline def yellowgreen_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellowgreen")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-spring/shared/dist/declarations/src", "createInterpolator")
  @js.native
  val createInterpolator: InterpolatorFactory = js.native
  
  inline def createStringInterpolator(config: InterpolatorConfig[String]): js.Function1[/* input */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringInterpolator")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ Double, String]]
  
  inline def defineHidden(obj: Any, key: Any, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineHidden")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def deprecateDirectCall(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecateDirectCall")().asInstanceOf[Unit]
  
  inline def deprecateInterpolate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecateInterpolate")().asInstanceOf[Unit]
  
  inline def each[Value, Key, This](obj: Eachable[Value, Key, This], fn: EachFn[Value, Key, This]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  inline def flush[T](queue: Set[T], iterator: js.Function1[/* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(queue.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flush[P, T](queue: Map[P, T], iterator: js.Function1[/* entry */ js.Tuple2[P, T], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(queue.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flushCalls[T /* <: AnyFn[js.Array[Any], Any] */](
    queue: Set[T],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushCalls")(queue.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object frameLoop {
    
    @JSImport("@react-spring/shared/dist/declarations/src", "frameLoop")
    @js.native
    val ^ : js.Any = js.native
    
    /** Advance all animations by the given time. */
    @JSImport("@react-spring/shared/dist/declarations/src", "frameLoop.advance")
    @js.native
    def advance: js.Function1[/* dt */ Double, Boolean] = js.native
    inline def advance_=(x: js.Function1[/* dt */ Double, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("advance")(x.asInstanceOf[js.Any])
    
    /**
      * Clear all animations. For testing purposes.
      *
      * ☠️ Never call this from within the frameloop.
      */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    @JSImport("@react-spring/shared/dist/declarations/src", "frameLoop.idle")
    @js.native
    val idle: Boolean = js.native
    
    /** Call this when an animation's priority changes. */
    inline def sort(animation: OpaqueAnimation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Advance the given animation on every frame until idle. */
    inline def start(animation: OpaqueAnimation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /** Get the current observer set. Never mutate it directly! */
  @JSImport("@react-spring/shared/dist/declarations/src", "getFluidObservers")
  @js.native
  val getFluidObservers: GetFluidObservers_ = js.native
  
  /**
    * Get the current value.
    * If `arg` is not observable, `arg` is returned.
    */
  @JSImport("@react-spring/shared/dist/declarations/src", "getFluidValue")
  @js.native
  val getFluidValue: GetFluidValue_ = js.native
  
  /** Returns true if `arg` can be observed. */
  inline def hasFluidValue(arg: Any): /* is @react-spring/shared.@react-spring/shared/dist/declarations/src/fluids.FluidValue<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFluidValue")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @react-spring/shared.@react-spring/shared/dist/declarations/src/fluids.FluidValue<any, any> */ Boolean]
  
  @JSImport("@react-spring/shared/dist/declarations/src", "hex3")
  @js.native
  val hex3: js.RegExp = js.native
  
  @JSImport("@react-spring/shared/dist/declarations/src", "hex4")
  @js.native
  val hex4: js.RegExp = js.native
  
  @JSImport("@react-spring/shared/dist/declarations/src", "hex6")
  @js.native
  val hex6: js.RegExp = js.native
  
  @JSImport("@react-spring/shared/dist/declarations/src", "hex8")
  @js.native
  val hex8: js.RegExp = js.native
  
  @JSImport("@react-spring/shared/dist/declarations/src", "hsl")
  @js.native
  val hsl: js.RegExp = js.native
  
  @JSImport("@react-spring/shared/dist/declarations/src", "hsla")
  @js.native
  val hsla: js.RegExp = js.native
  
  object is {
    
    @JSImport("@react-spring/shared/dist/declarations/src", "is")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared/dist/declarations/src", "is.arr")
    @js.native
    def arr: IsType[js.Array[Any]] = js.native
    inline def arr_=(x: IsType[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arr")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src", "is.fun")
    @js.native
    def fun: IsType[js.Function] = js.native
    inline def fun_=(x: IsType[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fun")(x.asInstanceOf[js.Any])
    
    inline def num(a: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("num")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def obj[T /* <: Any */](a: Any): /* is std.Exclude<T & @react-spring/types.@react-spring/types/util.Lookup<any>, std.Function | std.Array<any>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Exclude<T & @react-spring/types.@react-spring/types/util.Lookup<any>, std.Function | std.Array<any>> */ Boolean]
    
    inline def str(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def und(a: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("und")(a.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  }
  
  inline def isAnimatedString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimatedString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSSR(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSR")().asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def removeFluidObserver[E /* <: FluidEvent[Any] */](target: js.Object, observer: FluidObserver[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Stop observing a `fluids`-compatible object. */
  inline def removeFluidObserver[E /* <: FluidEvent[Any] */](
    target: typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue[Any, E],
    observer: FluidObserver[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@react-spring/shared/dist/declarations/src", "rgb")
  @js.native
  val rgb: js.RegExp = js.native
  
  @JSImport("@react-spring/shared/dist/declarations/src", "rgba")
  @js.native
  val rgba: js.RegExp = js.native
  
  /** Define the getter called by `getFluidValue`. */
  inline def setFluidGetter(target: js.Object, get: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setFluidGetter")(target.asInstanceOf[js.Any], get.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toArray[T](a: T): /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, void> extends infer T_1 ? T_1 extends std.Exclude<T, void> ? T_1 extends std.Array<any> ? std.Array<T_1[number]> extends T_1 ? std.Array<std.Exclude<T, void> extends infer T_2 ? T_2 extends std.Exclude<T, void> ? T_2 extends std.Array<infer U> ? U : T_2 : never : never> : T_1 : std.Array<std.Exclude<T, void> extends infer T_3 ? T_3 extends std.Exclude<T, void> ? T_3 extends std.Array<infer U_1> ? U_1 : T_3 : never : never> : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, void> extends infer T_1 ? T_1 extends std.Exclude<T, void> ? T_1 extends std.Array<any> ? std.Array<T_1[number]> extends T_1 ? std.Array<std.Exclude<T, void> extends infer T_2 ? T_2 extends std.Exclude<T, void> ? T_2 extends std.Array<infer U> ? U : T_2 : never : never> : T_1 : std.Array<std.Exclude<T, void> extends infer T_3 ? T_3 extends std.Exclude<T, void> ? T_3 extends std.Array<infer U_1> ? U_1 : T_3 : never : never> : never : never */ js.Any]
  
  inline def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
  
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMemoOne[T](getResult: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoOne")(getResult.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemoOne[T](getResult: js.Function0[T], inputs: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemoOne")(getResult.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useOnce(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnce")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def usePrev[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrev")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def useReducedMotion(): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useReducedMotion")().asInstanceOf[Boolean | Null]
}
