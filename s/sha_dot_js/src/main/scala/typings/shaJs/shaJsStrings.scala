package typings.shaJs

import typings.shaJs.shaMod.SHA_.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaJsStrings {
  
  @js.native
  sealed trait sha
    extends StObject
       with Algorithm
  inline def sha: sha = "sha".asInstanceOf[sha]
  
  @js.native
  sealed trait sha1
    extends StObject
       with Algorithm
  inline def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha224
    extends StObject
       with Algorithm
  inline def sha224: sha224 = "sha224".asInstanceOf[sha224]
  
  @js.native
  sealed trait sha256
    extends StObject
       with Algorithm
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha384
    extends StObject
       with Algorithm
  inline def sha384: sha384 = "sha384".asInstanceOf[sha384]
  
  @js.native
  sealed trait sha512
    extends StObject
       with Algorithm
  inline def sha512: sha512 = "sha512".asInstanceOf[sha512]
}
