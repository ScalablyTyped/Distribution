package typings.shaJs

import org.scalablytyped.runtime.Instantiable0
import typings.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(algorithm: String): Hash = ^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  @JSImport("sha.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha")
  @js.native
  open class sha () extends Hash
  @JSImport("sha.js", "sha")
  @js.native
  val sha: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha1")
  @js.native
  open class sha1 () extends Hash
  @JSImport("sha.js", "sha1")
  @js.native
  val sha1: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha224")
  @js.native
  open class sha224 () extends Hash
  @JSImport("sha.js", "sha224")
  @js.native
  val sha224: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha256")
  @js.native
  open class sha256 () extends Hash
  @JSImport("sha.js", "sha256")
  @js.native
  val sha256: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha384")
  @js.native
  open class sha384 () extends Hash
  @JSImport("sha.js", "sha384")
  @js.native
  val sha384: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha512")
  @js.native
  open class sha512 () extends Hash
  @JSImport("sha.js", "sha512")
  @js.native
  val sha512: HashStatic = js.native
  
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
