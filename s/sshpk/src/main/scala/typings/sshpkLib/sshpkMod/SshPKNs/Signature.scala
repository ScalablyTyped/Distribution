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
  def apply(toBuffer: java.lang.String => nodeLib.Buffer, toString: java.lang.String => java.lang.String): Signature = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction1(toBuffer), toString = js.Any.fromFunction1(toString))
  
    __obj.asInstanceOf[Signature]
  }
}

