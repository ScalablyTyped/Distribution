package typings.resizeObserverBrowser

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var ResizeObserver: Instantiable1[
    /* callback */ ResizeObserverCallback, 
    typings.resizeObserverBrowser.ResizeObserver
  ]
}

object Window {
  @scala.inline
  def apply(ResizeObserver: Instantiable1[/* callback */ ResizeObserverCallback, ResizeObserver]): Window = {
    val __obj = js.Dynamic.literal(ResizeObserver = ResizeObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

