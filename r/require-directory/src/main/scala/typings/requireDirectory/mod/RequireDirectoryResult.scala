package typings.requireDirectory.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequireDirectoryResult[T] extends /**
  * @description module itself or hash of modules in subdirectory with name of this directory
  */
/* index */ StringDictionary[RequireDirectoryResult[T] | T]
object RequireDirectoryResult {
  
  @scala.inline
  def apply[T](): RequireDirectoryResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireDirectoryResult[T]]
  }
}
