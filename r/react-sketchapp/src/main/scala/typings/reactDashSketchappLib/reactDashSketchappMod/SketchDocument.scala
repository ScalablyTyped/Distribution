package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDocument extends js.Object {
  def addBlankPage(): SketchPage
  def currentPage(): SketchPage
  def documentData(): SketchDocumentData
  def pages(): js.Array[SketchPage]
}

