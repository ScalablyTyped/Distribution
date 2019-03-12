package typings
package slocketLib.slocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slocket
  extends org.scalablytyped.runtime.Instantiable1[/* lockFile */ java.lang.String, slocketLib.slocketMod.slocketNs.Slocket]
     with org.scalablytyped.runtime.Instantiable2[
      /* lockFile */ java.lang.String, 
      /* cb */ js.Function2[
        /* error */ stdLib.Error | scala.Null, 
        /* lock */ slocketLib.slocketMod.slocketNs.Lock, 
        scala.Unit
      ], 
      slocketLib.slocketMod.slocketNs.Slocket
    ] {
  def apply(lockFile: java.lang.String): slocketLib.slocketMod.slocketNs.Slocket = js.native
  def apply(
    lockFile: java.lang.String,
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* lock */ slocketLib.slocketMod.slocketNs.Lock, 
      scala.Unit
    ]
  ): slocketLib.slocketMod.slocketNs.Slocket = js.native
}

