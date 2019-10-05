package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigmaFactory
  extends Instantiable0[Sigma]
     with Instantiable1[
      (/* container */ Element) | (/* configuration */ SigmaConfigs) | (/* container */ String), 
      Sigma
    ] {
  var canvas: Canvas = js.native
  var classes: Classes = js.native
  var misc: Miscellaneous = js.native
  var parsers: Parsers = js.native
  var plugins: Plugins = js.native
  var svg: SVG = js.native
}

