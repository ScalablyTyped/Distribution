package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeConsumerProps[T] extends js.Object {
  def children(props: ThemeProps[T]): ReactChild
}

object ThemeConsumerProps {
  @scala.inline
  def apply[T](children: ThemeProps[T] => ReactChild): ThemeConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ThemeConsumerProps[T]]
  }
}

