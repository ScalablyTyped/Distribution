package typings.reactDashSideDashEffect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSideDashEffectMod {
  import typings.react.reactMod.ComponentType
  import typings.reactDashSideDashEffect.Anon_Peek

  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ ComponentType[TProp], 
    ComponentType[TProp] with (Anon_Peek[TPeek, TRewind])
  ]
}
