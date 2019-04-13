package typings
package reactDashSwfLib.reactDashSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-swf", JSImport.Namespace)
@js.native
class ^ ()
  extends reactDashSwfLib.reactDashSwfMod.rswfNs.ReactSWF

@JSImport("react-swf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns installed Flash Player version. Result is cached.
    * Must not be called in a non-browser environment.
    * @return {?string} 'X.Y.Z'-version or null.
    */
  def getFPVersion(): java.lang.String = js.native
  /**
    * Returns if installed Flash Player meets version requirement.
    * Must not be called in a non-browser environment.
    * @return {boolean} true if supported
    */
  def isFPVersionSupported(versionString: java.lang.String): scala.Boolean = js.native
}

