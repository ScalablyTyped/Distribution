package typings.pvtsutils

import typings.std.ArrayBuffer
import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("pvtsutils/build/types/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assign(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def combine(buf: ArrayBuffer*): ArrayBufferLike = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(buf.asInstanceOf[js.Any]).asInstanceOf[ArrayBufferLike]
  
  @scala.inline
  def isEqual(bytes1: ArrayBuffer, bytes2: ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(bytes1.asInstanceOf[js.Any], bytes2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
