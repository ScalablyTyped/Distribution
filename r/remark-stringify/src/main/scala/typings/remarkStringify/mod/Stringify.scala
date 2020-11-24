package typings.remarkStringify.mod

import org.scalablytyped.runtime.Instantiable0
import typings.unified.mod.Attacher
import typings.unified.mod.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stringify
  extends Attacher[js.Array[js.UndefOr[PartialRemarkStringifyOptions]], Settings] {
  
  def apply(): Unit = js.native
  def apply(options: PartialRemarkStringifyOptions): Unit = js.native
  
  var Compiler: Instantiable0[RemarkCompiler] = js.native
}
