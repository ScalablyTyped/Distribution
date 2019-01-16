package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionObserverEntry extends js.Object {
  val boundingClientRect: ClientRect | DOMRect
  val intersectionRatio: scala.Double
  val intersectionRect: ClientRect | DOMRect
  val isIntersecting: scala.Boolean
  val rootBounds: ClientRect | DOMRect
  val target: Element
  val time: scala.Double
}

@JSGlobal("IntersectionObserverEntry")
@js.native
object IntersectionObserverEntry
  extends org.scalablytyped.runtime.Instantiable1[
      /* intersectionObserverEntryInit */ IntersectionObserverEntryInit, 
      IntersectionObserverEntry
    ]

