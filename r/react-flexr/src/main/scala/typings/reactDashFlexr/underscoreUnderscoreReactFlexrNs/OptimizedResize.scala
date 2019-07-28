package typings.reactDashFlexr.underscoreUnderscoreReactFlexrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple resize event throttler. Usefull for force updating when the
  * app have been resized. For best performance, use it in your main
  * app component in the componentDidMount life cycle.
  */
trait OptimizedResize extends js.Object {
  def init(callback: js.Function0[Unit]): Unit
}

object OptimizedResize {
  @scala.inline
  def apply(init: js.Function0[Unit] => Unit): OptimizedResize = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
  
    __obj.asInstanceOf[OptimizedResize]
  }
}

