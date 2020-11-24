package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sdp", "writeSessionBoilerplate")
@js.native
object writeSessionBoilerplate extends js.Object {
  
  def apply(): SDPBlob = js.native
  def apply(sessId: js.UndefOr[scala.Nothing], sessVer: js.UndefOr[scala.Nothing], sessUser: String): SDPBlob = js.native
  def apply(sessId: js.UndefOr[scala.Nothing], sessVer: Double): SDPBlob = js.native
  def apply(sessId: js.UndefOr[scala.Nothing], sessVer: Double, sessUser: String): SDPBlob = js.native
  def apply(sessId: String): SDPBlob = js.native
  def apply(sessId: String, sessVer: js.UndefOr[scala.Nothing], sessUser: String): SDPBlob = js.native
  def apply(sessId: String, sessVer: Double): SDPBlob = js.native
  def apply(sessId: String, sessVer: Double, sessUser: String): SDPBlob = js.native
}
