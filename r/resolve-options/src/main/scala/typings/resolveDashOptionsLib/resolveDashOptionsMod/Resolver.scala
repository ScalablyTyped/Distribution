package typings
package resolveDashOptionsLib.resolveDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  def resolve(key: java.lang.String): js.UndefOr[scala.Double | java.lang.String | scala.Boolean | stdLib.Date | scala.Null]
}

object Resolver {
  @scala.inline
  def apply(
    resolve: java.lang.String => js.UndefOr[scala.Double | java.lang.String | scala.Boolean | stdLib.Date | scala.Null]
  ): Resolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[Resolver]
  }
}

