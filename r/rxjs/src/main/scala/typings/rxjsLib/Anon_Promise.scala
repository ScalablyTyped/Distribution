package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Promise extends js.Object {
  /**
    * The promise constructor used by default for methods such as
    * {@link toPromise} and {@link forEach}
    */
  var Promise: stdLib.PromiseConstructorLike
  /**
    * If true, turns on synchronous error rethrowing, which is a deprecated behavior
    * in v6 and higher. This behavior enables bad patterns like wrapping a subscribe
    * call in a try/catch block. It also enables producer interference, a nasty bug
    * where a multicast can be broken for all observers by a downstream consumer with
    * an unhandled error. DO NOT USE THIS FLAG UNLESS IT'S NEEDED TO BY TIME
    * FOR MIGRATION REASONS.
    */
  var useDeprecatedSynchronousErrorHandling: scala.Boolean
}

object Anon_Promise {
  @scala.inline
  def apply(Promise: stdLib.PromiseConstructorLike, useDeprecatedSynchronousErrorHandling: scala.Boolean): Anon_Promise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Promise")(Promise)
    __obj.updateDynamic("useDeprecatedSynchronousErrorHandling")(useDeprecatedSynchronousErrorHandling)
    __obj.asInstanceOf[Anon_Promise]
  }
}

