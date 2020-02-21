package typings.shevyjs

import typings.shevyjs.shevyjsStrings.fontSize
import typings.shevyjs.shevyjsStrings.lineHeight
import typings.shevyjs.shevyjsStrings.marginBottom
import typings.shevyjs.typesMod.Factor
import typings.shevyjs.typesMod.Options
import typings.shevyjs.typesMod.RhythmProperties
import typings.shevyjs.typesMod.Scale
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shevyjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Shevy extends js.Object {
    var addMarginBottom: Boolean = js.native
    var baseFontScale: ReturnType[js.Function1[/* fontScale */ Scale | String, js.Array[Double]]] = js.native
    var baseFontSize: String = js.native
    var baseFontUnit: ReturnType[js.Function1[/* size */ String, String]] = js.native
    var baseLineHeight: Double = js.native
    var body: Pick[RhythmProperties, Exclude[fontSize | lineHeight | marginBottom, marginBottom]] = js.native
    var content: RhythmProperties = js.native
    var h1: RhythmProperties = js.native
    var h2: RhythmProperties = js.native
    var h3: RhythmProperties = js.native
    var h4: RhythmProperties = js.native
    var h5: RhythmProperties = js.native
    var h6: RhythmProperties = js.native
    var proximity: Boolean = js.native
    var proximityFactor: Factor = js.native
    def baseSpacing(): String = js.native
    def baseSpacing(factor: Factor): String = js.native
    def lineHeightSpacing(): String = js.native
    def lineHeightSpacing(factor: Factor): String = js.native
  }
  
  @js.native
  class default () extends Shevy {
    def this(options: Partial[Options]) = this()
  }
  
}

