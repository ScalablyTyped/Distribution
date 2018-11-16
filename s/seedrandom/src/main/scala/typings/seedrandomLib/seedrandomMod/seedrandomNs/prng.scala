package typings
package seedrandomLib.seedrandomMod.seedrandomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait prng
  extends ScalablyTyped.runtime.Instantiable0[prng]
     with ScalablyTyped.runtime.Instantiable1[/* seed */ java.lang.String, prng]
     with ScalablyTyped.runtime.Instantiable2[/* seed */ java.lang.String, /* options */ seedRandomOptions, prng]
     with ScalablyTyped.runtime.Instantiable3[
      /* seed */ java.lang.String, 
      /* options */ seedRandomOptions, 
      /* callback */ js.Any, 
      prng
    ] {
  def apply(): scala.Double = js.native
  def double(): scala.Double = js.native
  def int32(): scala.Double = js.native
  def quick(): scala.Double = js.native
  def state(): js.Function0[this.type] = js.native
}

