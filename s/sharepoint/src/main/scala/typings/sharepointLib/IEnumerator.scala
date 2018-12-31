package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEnumerator[T] extends js.Object {
  def get_current(): T
  def moveNext(): scala.Boolean
  def reset(): scala.Unit
}

