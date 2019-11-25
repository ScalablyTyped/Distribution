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
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], qi = qi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Jwk]
  }
}

