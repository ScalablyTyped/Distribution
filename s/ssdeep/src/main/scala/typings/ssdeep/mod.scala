package typings.ssdeep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssdeep", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compare(hash1: String, hash2: String): Double = js.native
  
  def hash(content: String): String = js.native
  
  @JSName("hash_from_file")
  def hashFromFile(path: String): String = js.native
}
