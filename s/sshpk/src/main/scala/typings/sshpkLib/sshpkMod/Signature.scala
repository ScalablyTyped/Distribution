package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Signature")
@js.native
class Signature protected () extends js.Object {
  def this(opts: js.Any) = this()
  def toBuffer(format: java.lang.String): nodeLib.Buffer = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
}

/* static members */
@JSImport("sshpk", "Signature")
@js.native
object Signature extends js.Object {
  def isSignature(obj: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isSignature(obj: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parse(data: java.lang.String, `type`: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.Signature = js.native
  def parse(data: nodeLib.Buffer, `type`: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.Signature = js.native
}

