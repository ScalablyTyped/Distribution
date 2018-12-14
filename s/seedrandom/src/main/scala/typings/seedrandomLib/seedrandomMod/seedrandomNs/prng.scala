package typings
package seedrandomLib.seedrandomMod.seedrandomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait prng
  extends org.scalablytyped.runtime.Instantiable0[prng]
     with org.scalablytyped.runtime.Instantiable1[/* seed */ java.lang.String, prng]
     with org.scalablytyped.runtime.Instantiable2[/* seed */ java.lang.String, /* options */ seedRandomOptions, prng]
     with org.scalablytyped.runtime.Instantiable3[
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

