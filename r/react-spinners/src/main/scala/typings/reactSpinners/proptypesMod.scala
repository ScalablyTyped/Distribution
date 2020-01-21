package typings.reactSpinners

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/helpers/proptypes", JSImport.Namespace)
@js.native
object proptypesMod extends js.Object {
  val heightWidthDefaults: HeightWidthFunction = js.native
  val heightWidthRadiusDefaults: HeightWidthRadiusFunction = js.native
  val sizeDefaults: SizeFunction = js.native
  val sizeMarginDefaults: SizeFunction = js.native
  type DefaultProps = StringDictionary[Boolean | String | js.Object | Double]
  type HeightWidthFunction = js.Function2[/* height */ Double, /* width */ Double, DefaultProps]
  type HeightWidthRadiusFunction = js.Function3[/* height */ Double, /* width */ Double, /* radius */ js.UndefOr[Double], DefaultProps]
  type SizeFunction = js.Function1[/* size */ Double, DefaultProps]
}

