package typings.reactNativeElements.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeConsumerProps[T] extends js.Object {
  def children(props: ThemeProps[T]): ReactNode
}

object ThemeConsumerProps {
  @scala.inline
  def apply[T](children: ThemeProps[T] => ReactNode): ThemeConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ThemeConsumerProps[T]]
  }
}

