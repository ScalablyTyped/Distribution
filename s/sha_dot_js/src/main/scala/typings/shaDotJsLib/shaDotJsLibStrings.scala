package typings
package shaDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object shaDotJsLibStrings {
  @js.native
  sealed trait sha extends js.Object
  
  @js.native
  sealed trait sha1 extends js.Object
  
  @js.native
  sealed trait sha224 extends js.Object
  
  @js.native
  sealed trait sha256 extends js.Object
  
  @js.native
  sealed trait sha384 extends js.Object
  
  @js.native
  sealed trait sha512 extends js.Object
  
  def sha: sha = "sha".asInstanceOf[sha]
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  def sha224: sha224 = "sha224".asInstanceOf[sha224]
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
}

