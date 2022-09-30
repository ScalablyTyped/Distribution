package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an RGBA color value for use in rendering operations.
  */
@JSGlobal("Color")
@js.native
open class Color protected ()
  extends StObject
     with typings.sphereEngineBrowser.Color {
  /**
    * Construct a new `Color` object from the given RGBA values. All values must be in the range
    * [0.0,1.0].
    * @param red    The amount of red in the color.
    * @param green  The amount of green in the color.
    * @param blue   The amount of blue in the color.
    * @param alpha  Alpha (opacity).  Defaults to `1.0`.
    */
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  
  /**
    * The value of the color's alpha component, representing its opacity. Use values less than 1.0
    * for translucency.
    */
  /* CompleteClass */
  var a: Double = js.native
  
  /** The value of the color's blue component. */
  /* CompleteClass */
  var b: Double = js.native
  
  /**
    * Gets a new `Color` with the same RGB as this one but with its alpha multiplied by the given
    * factor. Useful for implementing transitions.
    */
  /* CompleteClass */
  override def fadeTo(alphaFactor: Double): typings.sphereEngineBrowser.Color = js.native
  
  /** The value of the color's green component. */
  /* CompleteClass */
  var g: Double = js.native
  
  /** The X11 name of the color for known colors, or else its HTML representation, e.g. `#FF8080FF`. */
  /* CompleteClass */
  var name: String = js.native
  
  /** The value of the color's red component. */
  /* CompleteClass */
  var r: Double = js.native
}
object Color {
  
  @JSGlobal("Color")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Color.AliceBlue")
  @js.native
  val AliceBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.AntiqueWhite")
  @js.native
  val AntiqueWhite: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Aqua")
  @js.native
  val Aqua: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Aquamarine")
  @js.native
  val Aquamarine: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Azure")
  @js.native
  val Azure: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Beige")
  @js.native
  val Beige: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Bisque")
  @js.native
  val Bisque: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Black")
  @js.native
  val Black: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.BlanchedAlmond")
  @js.native
  val BlanchedAlmond: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Blue")
  @js.native
  val Blue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.BlueViolet")
  @js.native
  val BlueViolet: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Brown")
  @js.native
  val Brown: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.BurlyWood")
  @js.native
  val BurlyWood: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.CadetBlue")
  @js.native
  val CadetBlue: typings.sphereEngineBrowser.Color = js.native
  
  /** Chartreuse. The best color with the best name. */
  /* static member */
  @JSGlobal("Color.Chartreuse")
  @js.native
  val Chartreuse: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Chocolate")
  @js.native
  val Chocolate: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Coral")
  @js.native
  val Coral: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.CornflowerBlue")
  @js.native
  val CornflowerBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Cornsilk")
  @js.native
  val Cornsilk: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Crimson")
  @js.native
  val Crimson: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Cyan")
  @js.native
  val Cyan: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkBlue")
  @js.native
  val DarkBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkCyan")
  @js.native
  val DarkCyan: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkGoldenrod")
  @js.native
  val DarkGoldenrod: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkGray")
  @js.native
  val DarkGray: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkGreen")
  @js.native
  val DarkGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkKhaki")
  @js.native
  val DarkKhaki: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkMagenta")
  @js.native
  val DarkMagenta: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkOliveGreen")
  @js.native
  val DarkOliveGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkOrange")
  @js.native
  val DarkOrange: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkOrchid")
  @js.native
  val DarkOrchid: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkRed")
  @js.native
  val DarkRed: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkSalmon")
  @js.native
  val DarkSalmon: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkSeaGreen")
  @js.native
  val DarkSeaGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkSlateBlue")
  @js.native
  val DarkSlateBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkSlateGray")
  @js.native
  val DarkSlateGray: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkTurquoise")
  @js.native
  val DarkTurquoise: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DarkViolet")
  @js.native
  val DarkViolet: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DeepPink")
  @js.native
  val DeepPink: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DeepSkyBlue")
  @js.native
  val DeepSkyBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DimGray")
  @js.native
  val DimGray: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.DodgerBlue")
  @js.native
  val DodgerBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.FireBrick")
  @js.native
  val FireBrick: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.FloralWhite")
  @js.native
  val FloralWhite: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.ForestGreen")
  @js.native
  val ForestGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Fuchsia")
  @js.native
  val Fuchsia: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Gainsboro")
  @js.native
  val Gainsboro: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.GhostWhite")
  @js.native
  val GhostWhite: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Gold")
  @js.native
  val Gold: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Goldenrod")
  @js.native
  val Goldenrod: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Gray")
  @js.native
  val Gray: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Green")
  @js.native
  val Green: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.GreenYellow")
  @js.native
  val GreenYellow: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Honeydew")
  @js.native
  val Honeydew: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.HotPink")
  @js.native
  val HotPink: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.IndianRed")
  @js.native
  val IndianRed: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Indigo")
  @js.native
  val Indigo: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Ivory")
  @js.native
  val Ivory: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Khaki")
  @js.native
  val Khaki: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Lavender")
  @js.native
  val Lavender: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LavenderBlush")
  @js.native
  val LavenderBlush: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LawnGreen")
  @js.native
  val LawnGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LemonChiffon")
  @js.native
  val LemonChiffon: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightBlue")
  @js.native
  val LightBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightCoral")
  @js.native
  val LightCoral: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightCyan")
  @js.native
  val LightCyan: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightGoldenrodYellow")
  @js.native
  val LightGoldenrodYellow: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightGray")
  @js.native
  val LightGray: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightGreen")
  @js.native
  val LightGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightPink")
  @js.native
  val LightPink: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSalmon")
  @js.native
  val LightSalmon: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSeaGreen")
  @js.native
  val LightSeaGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSkyBlue")
  @js.native
  val LightSkyBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSlateGray")
  @js.native
  val LightSlateGray: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightSteelBlue")
  @js.native
  val LightSteelBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LightYellow")
  @js.native
  val LightYellow: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Lime")
  @js.native
  val Lime: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.LimeGreen")
  @js.native
  val LimeGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Linen")
  @js.native
  val Linen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Magenta")
  @js.native
  val Magenta: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Maroon")
  @js.native
  val Maroon: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumAquamarine")
  @js.native
  val MediumAquamarine: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumBlue")
  @js.native
  val MediumBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumOrchid")
  @js.native
  val MediumOrchid: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumPurple")
  @js.native
  val MediumPurple: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumSeaGreen")
  @js.native
  val MediumSeaGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumSlateBlue")
  @js.native
  val MediumSlateBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumSpringGreen")
  @js.native
  val MediumSpringGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumTurquoise")
  @js.native
  val MediumTurquoise: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MediumVioletRed")
  @js.native
  val MediumVioletRed: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MidnightBlue")
  @js.native
  val MidnightBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MintCream")
  @js.native
  val MintCream: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.MistyRose")
  @js.native
  val MistyRose: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Moccasin")
  @js.native
  val Moccasin: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.NavajoWhite")
  @js.native
  val NavajoWhite: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Navy")
  @js.native
  val Navy: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.OldLace")
  @js.native
  val OldLace: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Olive")
  @js.native
  val Olive: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.OliveDrab")
  @js.native
  val OliveDrab: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Orange")
  @js.native
  val Orange: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.OrangeRed")
  @js.native
  val OrangeRed: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Orchid")
  @js.native
  val Orchid: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PaleGoldenrod")
  @js.native
  val PaleGoldenrod: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PaleGreen")
  @js.native
  val PaleGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PaleTurquoise")
  @js.native
  val PaleTurquoise: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PaleVioletRed")
  @js.native
  val PaleVioletRed: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PapayaWhip")
  @js.native
  val PapayaWhip: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PeachPuff")
  @js.native
  val PeachPuff: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Peru")
  @js.native
  val Peru: typings.sphereEngineBrowser.Color = js.native
  
  /** Pink. The color of eaty pigs. **\*MUNCH\*** */
  /* static member */
  @JSGlobal("Color.Pink")
  @js.native
  val Pink: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Plum")
  @js.native
  val Plum: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PowderBlue")
  @js.native
  val PowderBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Purple")
  @js.native
  val Purple: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.PurwaBlue")
  @js.native
  val PurwaBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.RebeccaPurple")
  @js.native
  val RebeccaPurple: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Red")
  @js.native
  val Red: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.RosyBrown")
  @js.native
  val RosyBrown: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.RoyalBlue")
  @js.native
  val RoyalBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SaddleBrown")
  @js.native
  val SaddleBrown: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Salmon")
  @js.native
  val Salmon: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SandyBrown")
  @js.native
  val SandyBrown: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SeaGreen")
  @js.native
  val SeaGreen: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Seashell")
  @js.native
  val Seashell: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Sienna")
  @js.native
  val Sienna: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Silver")
  @js.native
  val Silver: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SkyBlue")
  @js.native
  val SkyBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SlateBlue")
  @js.native
  val SlateBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SlateGray")
  @js.native
  val SlateGray: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Snow")
  @js.native
  val Snow: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SpringGreen")
  @js.native
  val SpringGreen: typings.sphereEngineBrowser.Color = js.native
  
  /** Stanky Bean. The first color created and named by an AI. */
  /* static member */
  @JSGlobal("Color.StankyBean")
  @js.native
  val StankyBean: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.SteelBlue")
  @js.native
  val SteelBlue: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Tan")
  @js.native
  val Tan: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Teal")
  @js.native
  val Teal: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Thistle")
  @js.native
  val Thistle: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Tomato")
  @js.native
  val Tomato: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Transparent")
  @js.native
  val Transparent: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Turquoise")
  @js.native
  val Turquoise: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Violet")
  @js.native
  val Violet: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Wheat")
  @js.native
  val Wheat: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.White")
  @js.native
  val White: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.WhiteSmoke")
  @js.native
  val WhiteSmoke: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.Yellow")
  @js.native
  val Yellow: typings.sphereEngineBrowser.Color = js.native
  
  /* static member */
  @JSGlobal("Color.YellowGreen")
  @js.native
  val YellowGreen: typings.sphereEngineBrowser.Color = js.native
  
  /** Check if two `Color` objects are equivalent without regard to their alpha values. */
  /* static member */
  inline def is(color1: typings.sphereEngineBrowser.Color, color2: typings.sphereEngineBrowser.Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** Get a new `Color` which is a 50/50 blend of the two given ones. */
  /* static member */
  inline def mix(color1: typings.sphereEngineBrowser.Color, color2: typings.sphereEngineBrowser.Color): typings.sphereEngineBrowser.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[typings.sphereEngineBrowser.Color]
  /**
    * Get a new `Color` which is a weighted average of the two given ones, using the given
    * weighting factors.
    */
  /* static member */
  inline def mix(
    color1: typings.sphereEngineBrowser.Color,
    color2: typings.sphereEngineBrowser.Color,
    w1: Double,
    w2: Double
  ): typings.sphereEngineBrowser.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], w1.asInstanceOf[js.Any], w2.asInstanceOf[js.Any])).asInstanceOf[typings.sphereEngineBrowser.Color]
  
  /**
    * Gets a `Color` corresponding to the specified color name which can be either HTML notation
    * (e.g. `#7FFF00`) or an X11 color name such as `chartreuse` (case insensitive).
    */
  /* static member */
  inline def of(name: String): typings.sphereEngineBrowser.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any]).asInstanceOf[typings.sphereEngineBrowser.Color]
}
