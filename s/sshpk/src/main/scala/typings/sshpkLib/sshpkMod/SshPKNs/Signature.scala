package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  def toBuffer(format: java.lang.String): nodeLib.Buffer
  def toString(format: java.lang.String): java.lang.String
}

object Signature {
  @scala.inline
  def apply(
    toBuffer: js.Function1[java.lang.String, nodeLib.Buffer],
    toString: js.Function1[java.lang.String, java.lang.String]
  ): Signature = {
    val __obj = js.Dynamic.literal(toBuffer = toBuffer, toString = toString)
  
    __obj.asInstanceOf[Signature]
  }
}

