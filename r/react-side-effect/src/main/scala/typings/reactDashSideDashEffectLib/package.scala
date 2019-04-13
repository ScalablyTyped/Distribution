package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSideDashEffectLib {
  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[TProp], 
    reactLib.reactMod.ComponentType[TProp] with (Anon_Peek[TPeek, TRewind])
  ]
}
