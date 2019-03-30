package typings
package rashaLib.rashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jwk extends js.Object {
  var d: java.lang.String
  var dp: java.lang.String
  var dq: java.lang.String
  var e: java.lang.String
  var kty: java.lang.String
  var n: java.lang.String
  var p: java.lang.String
  var q: java.lang.String
  var qi: java.lang.String
}

object Jwk {
  @scala.inline
  def apply(
    d: java.lang.String,
    dp: java.lang.String,
    dq: java.lang.String,
    e: java.lang.String,
    kty: java.lang.String,
    n: java.lang.String,
    p: java.lang.String,
    q: java.lang.String,
    qi: java.lang.String
  ): Jwk = {
    val __obj = js.Dynamic.literal(d = d, dp = dp, dq = dq, e = e, kty = kty, n = n, p = p, q = q, qi = qi)
  
    __obj.asInstanceOf[Jwk]
  }
}

