package typings.sassEmbedded

import typings.sassEmbedded.anon.Alpha
import typings.sassEmbedded.anon.Blackness
import typings.sassEmbedded.anon.Blue
import typings.sassEmbedded.anon.Hue
import typings.sassEmbedded.anon.Lightness
import typings.sassEmbedded.anon.Whiteness
import typings.sassEmbedded.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("sass-embedded/dist/types/value/color", "SassColor")
  @js.native
  open class SassColor protected () extends Value {
    /**
      * Creates an RGB color.
      *
      * @throws `Error` if `red`, `green`, and `blue` aren't between `0` and
      * `255`, or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Alpha) = this()
    /**
      * Creates an HWB color.
      *
      * @throws `Error` if `whiteness` or `blackness` aren't between `0` and `100`,
      * or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Blackness) = this()
    /**
      * Creates an HSL color.
      *
      * @throws `Error` if `saturation` or `lightness` aren't between `0` and
      * `100`, or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Hue) = this()
    
    /** This color's alpha channel, between `0` and `1`. */
    def alpha: Double = js.native
    
    /** This color's blackness, between `0` and `100`. */
    def blackness: Double = js.native
    
    /** This color's blue channel, between `0` and `255`. */
    def blue: Double = js.native
    
    /**
      * Changes one or more of this color's RGB channels and returns the result.
      */
    def change(options: Blue): SassColor = js.native
    /**
      * Changes one or more of this color's HSL channels and returns the result.
      */
    def change(options: Lightness): SassColor = js.native
    /**
      * Changes one or more of this color's HWB channels and returns the result.
      */
    def change(options: Whiteness): SassColor = js.native
    
    /** This color's green channel, between `0` and `255`. */
    def green: Double = js.native
    
    /** This color's hue, between `0` and `360`. */
    def hue: Double = js.native
    
    /** This color's lightness, between `0` and `100`. */
    def lightness: Double = js.native
    
    /** This color's red channel, between `0` and `255`. */
    def red: Double = js.native
    
    /** This color's saturation, between `0` and `100`. */
    def saturation: Double = js.native
    
    /** This color's whiteness, between `0` and `100`. */
    def whiteness: Double = js.native
  }
}
