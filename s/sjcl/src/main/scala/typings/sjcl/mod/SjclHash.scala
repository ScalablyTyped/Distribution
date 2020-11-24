package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait SjclHash extends js.Object {
  
  def reset(): SjclHash = js.native
  
  def update(data: String): SjclHash = js.native
  def update(data: BitArray_): SjclHash = js.native
}
