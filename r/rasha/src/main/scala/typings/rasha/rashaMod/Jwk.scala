package typings.rasha.rashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jwk extends js.Object {
  var d: String
  var dp: String
  var dq: String
  var e: String
  var kty: String
  var n: String
  var p: String
  var q: String
  var qi: String
}

object Jwk {
  @scala.inline
  def apply(
    d: String,
    dp: String,
    dq: String,
    e: String,
    kty: String,
    n: String,
    p: String,
    q: String,
    qi: String
  ): Jwk = {
    val __obj = js.Dynamic.literal(d = d, dp = dp, dq = dq, e = e, kty = kty, n = n, p = p, q = q, qi = qi)
  
    __obj.asInstanceOf[Jwk]
  }
}

