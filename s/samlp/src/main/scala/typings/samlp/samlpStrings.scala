package typings.samlp

import typings.samlp.mod.DigestAlgorithmType
import typings.samlp.mod.SignatureAlgorithmType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object samlpStrings {
  
  @scala.inline
  def `rsa-sha1`: `rsa-sha1` = "rsa-sha1".asInstanceOf[`rsa-sha1`]
  
  @scala.inline
  def `rsa-sha256`: `rsa-sha256` = "rsa-sha256".asInstanceOf[`rsa-sha256`]
  
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait `rsa-sha1` extends SignatureAlgorithmType
  
  @js.native
  sealed trait `rsa-sha256` extends SignatureAlgorithmType
  
  @js.native
  sealed trait sha1 extends DigestAlgorithmType
  
  @js.native
  sealed trait sha256 extends DigestAlgorithmType
}
