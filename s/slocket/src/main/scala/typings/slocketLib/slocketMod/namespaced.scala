package typings
package slocketLib.slocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slocket", JSImport.Namespace)
@js.native
class namespaced protected ()
  extends slocketLib.slocketMod.slocketNs.Slocket {
  def this(lockFile: java.lang.String) = this()
  def this(lockFile: java.lang.String, cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* lock */ slocketLib.slocketMod.slocketNs.Lock, 
      scala.Unit
    ]) = this()
}

