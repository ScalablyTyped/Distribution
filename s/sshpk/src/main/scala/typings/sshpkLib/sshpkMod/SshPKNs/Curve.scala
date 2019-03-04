package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Curve extends js.Object {
  var G: nodeLib.Buffer
  var a: nodeLib.Buffer
  var b: nodeLib.Buffer
  var n: nodeLib.Buffer
  var p: nodeLib.Buffer
  var pkcs8oid: java.lang.String
  var s: nodeLib.Buffer
  var size: scala.Double
}

object Curve {
  @scala.inline
  def apply(
    G: nodeLib.Buffer,
    a: nodeLib.Buffer,
    b: nodeLib.Buffer,
    n: nodeLib.Buffer,
    p: nodeLib.Buffer,
    pkcs8oid: java.lang.String,
    s: nodeLib.Buffer,
    size: scala.Double
  ): Curve = {
    val __obj = js.Dynamic.literal(G = G, a = a, b = b, n = n, p = p, pkcs8oid = pkcs8oid, s = s, size = size)
  
    __obj.asInstanceOf[Curve]
  }
}

