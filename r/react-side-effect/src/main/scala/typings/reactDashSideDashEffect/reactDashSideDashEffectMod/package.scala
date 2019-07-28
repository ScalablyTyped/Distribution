package typings.reactDashSideDashEffect

import typings.react.reactMod.ComponentType
import typings.reactDashSideDashEffect.Anon_Peek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSideDashEffectMod {
  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ ComponentType[TProp], 
    ComponentType[TProp] with (Anon_Peek[TPeek, TRewind])
  ]
}
