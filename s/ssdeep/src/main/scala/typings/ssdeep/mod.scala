package typings.ssdeep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssdeep", "compare")
  @js.native
  def compare(hash1: String, hash2: String): Double = js.native
  
  @JSImport("ssdeep", "hash")
  @js.native
  def hash(content: String): String = js.native
  
  @JSImport("ssdeep", "hash_from_file")
  @js.native
  def hashFromFile(path: String): String = js.native
}
