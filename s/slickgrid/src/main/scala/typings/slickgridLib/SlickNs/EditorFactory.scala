package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFactory extends js.Object {
  def getEditor[T](column: Column[T]): slickgridLib.SlickNs.EditorsNs.Editor[T]
}

