package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  def format(date: stdLib.Date): java.lang.String
}

object Anon_Date {
  @scala.inline
  def apply(format: js.Function1[stdLib.Date, java.lang.String]): Anon_Date = {
    val __obj = js.Dynamic.literal(format = format)
  
    __obj.asInstanceOf[Anon_Date]
  }
}

