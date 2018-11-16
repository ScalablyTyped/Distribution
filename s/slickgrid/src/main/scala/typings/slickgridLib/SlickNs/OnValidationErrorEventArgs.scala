package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnValidationErrorEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: scala.Double
  var cellNode: stdLib.HTMLElement
  var column: Column[T]
  var editor: slickgridLib.SlickNs.EditorsNs.Editor[T]
  var row: scala.Double
  var validationResults: ValidateResults
}

