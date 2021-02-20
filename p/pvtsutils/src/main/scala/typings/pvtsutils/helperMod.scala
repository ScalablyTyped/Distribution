package typings.pvtsutils

import typings.std.ArrayBuffer
import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("pvtsutils/build/types/helper", "assign")
  @js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("pvtsutils/build/types/helper", "combine")
  @js.native
  def combine(buf: ArrayBuffer*): ArrayBufferLike = js.native
  
  @JSImport("pvtsutils/build/types/helper", "isEqual")
  @js.native
  def isEqual(bytes1: ArrayBuffer, bytes2: ArrayBuffer): Boolean = js.native
}
