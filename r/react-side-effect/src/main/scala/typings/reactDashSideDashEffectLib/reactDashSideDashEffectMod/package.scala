package typings
package reactDashSideDashEffectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSideDashEffectMod {
  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[TProp], 
    reactLib.reactMod.ComponentType[TProp] with (reactDashSideDashEffectLib.Anon_Peek[TPeek, TRewind])
  ]
}
