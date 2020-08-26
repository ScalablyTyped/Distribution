package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IntersectionObserverCallback
import typings.std.IntersectionObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserver protected ()
  extends typings.std.IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
}

@JSGlobal("IntersectionObserver")
@js.native
object IntersectionObserver
  extends Instantiable1[/* callback */ IntersectionObserverCallback, typings.std.IntersectionObserver]
     with Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      typings.std.IntersectionObserver
    ]

