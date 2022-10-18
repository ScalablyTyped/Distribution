package typings.shaJs

import org.scalablytyped.runtime.Instantiable0
import typings.node.cryptoMod.Hash
import typings.shaJs.shaMod.SHA_.HashStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object shaMod {
  
  inline def apply(algorithm: String): Hash = ^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  @JSImport("sha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sha", "sha")
  @js.native
  val sha: HashStatic = js.native
  
  @JSImport("sha", "sha1")
  @js.native
  val sha1: HashStatic = js.native
  
  @JSImport("sha", "sha224")
  @js.native
  val sha224: HashStatic = js.native
  
  @JSImport("sha", "sha256")
  @js.native
  val sha256: HashStatic = js.native
  
  @JSImport("sha", "sha384")
  @js.native
  val sha384: HashStatic = js.native
  
  @JSImport("sha", "sha512")
  @js.native
  val sha512: HashStatic = js.native
  
  object SHA_ {
    
    /* Rewritten from type alias, can be one of: 
      - typings.shaJs.shaJsStrings.sha
      - typings.shaJs.shaJsStrings.sha1
      - typings.shaJs.shaJsStrings.sha224
      - typings.shaJs.shaJsStrings.sha256
      - typings.shaJs.shaJsStrings.sha384
      - typings.shaJs.shaJsStrings.sha512
    */
    trait Algorithm extends StObject
    object Algorithm {
      
      inline def sha: typings.shaJs.shaJsStrings.sha = "sha".asInstanceOf[typings.shaJs.shaJsStrings.sha]
      
      inline def sha1: typings.shaJs.shaJsStrings.sha1 = "sha1".asInstanceOf[typings.shaJs.shaJsStrings.sha1]
      
      inline def sha224: typings.shaJs.shaJsStrings.sha224 = "sha224".asInstanceOf[typings.shaJs.shaJsStrings.sha224]
      
      inline def sha256: typings.shaJs.shaJsStrings.sha256 = "sha256".asInstanceOf[typings.shaJs.shaJsStrings.sha256]
      
      inline def sha384: typings.shaJs.shaJsStrings.sha384 = "sha384".asInstanceOf[typings.shaJs.shaJsStrings.sha384]
      
      inline def sha512: typings.shaJs.shaJsStrings.sha512 = "sha512".asInstanceOf[typings.shaJs.shaJsStrings.sha512]
    }
    
    @js.native
    trait HashStatic
      extends StObject
         with Instantiable0[Hash]
  }
}
