package typings
package samlpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object samlpLibStrings {
  @js.native
  sealed trait `rsa-sha1`
    extends samlpLib.samlpMod.SignatureAlgorithmType
  
  @js.native
  sealed trait `rsa-sha256`
    extends samlpLib.samlpMod.SignatureAlgorithmType
  
  @js.native
  sealed trait sha1
    extends samlpLib.samlpMod.DigestAlgorithmType
  
  @js.native
  sealed trait sha256
    extends samlpLib.samlpMod.DigestAlgorithmType
  
  @scala.inline
  def `rsa-sha1`: `rsa-sha1` = "rsa-sha1".asInstanceOf[`rsa-sha1`]
  @scala.inline
  def `rsa-sha256`: `rsa-sha256` = "rsa-sha256".asInstanceOf[`rsa-sha256`]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
}

