package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resizeObserverBrowser {
  type ResizeObserverCallback = js.Function2[
    /* entries */ js.Array[typings.resizeObserverBrowser.ResizeObserverEntry], 
    /* observer */ typings.resizeObserverBrowser.ResizeObserver, 
    scala.Unit
  ]
}
