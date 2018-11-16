package typings
package slickgridLib.SlickNs.EditorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditorOptions[T /* <: slickgridLib.SlickNs.SlickData */] extends js.Object {
  var cancelChanges: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var column: slickgridLib.SlickNs.Column[T]
  var commitChanges: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var container: stdLib.HTMLElement
  var grid: slickgridLib.SlickNs.Grid[T]
  var gridPosition: js.UndefOr[slickgridLib.SlickNs.CellPosition] = js.undefined
  var item: js.UndefOr[T] = js.undefined
  var position: js.UndefOr[slickgridLib.SlickNs.CellPosition] = js.undefined
}

