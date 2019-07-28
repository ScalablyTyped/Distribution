package typings.shaDotJs

import typings.shaDotJs.shaDotJsMod.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object shaDotJsStrings {
  @js.native
  sealed trait sha extends Algorithm
  
  @js.native
  sealed trait sha1 extends Algorithm
  
  @js.native
  sealed trait sha224 extends Algorithm
  
  @js.native
  sealed trait sha256 extends Algorithm
  
  @js.native
  sealed trait sha384 extends Algorithm
  
  @js.native
  sealed trait sha512 extends Algorithm
  
  @scala.inline
  def sha: sha = "sha".asInstanceOf[sha]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha224: sha224 = "sha224".asInstanceOf[sha224]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  @scala.inline
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
}

