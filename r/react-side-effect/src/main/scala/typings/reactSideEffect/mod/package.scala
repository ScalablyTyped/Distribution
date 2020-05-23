package typings.reactSideEffect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ typings.react.mod.ComponentType[TProp], 
    typings.react.mod.ComponentType[TProp] with (typings.reactSideEffect.anon.Peek[TPeek, TRewind])
  ]
}
