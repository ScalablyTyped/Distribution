package typings
package slickgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SlickNs {
  type Formatter[T /* <: SlickData */] = js.Function5[
    /* row */ scala.Double, 
    /* cell */ scala.Double, 
    /* value */ js.Any, 
    /* columnDef */ Column[T], 
    /* dataContext */ SlickData, 
    java.lang.String
  ]
  type OnActiveCellPositionChangedEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnBeforeDestroyEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnColumnsReorderedEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnColumnsResizedEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnContextMenuEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnDragEndEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnDragEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnDragInitEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnDragStartEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnMouseEnterEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnMouseLeaveEventArgs[T /* <: SlickData */] = GridEventArgs[T]
  type OnViewportChangedEventArgs[T /* <: SlickData */] = GridEventArgs[T]
}
