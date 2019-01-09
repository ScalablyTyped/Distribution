package typings
package reactDashSwfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetFPVersion
  extends org.scalablytyped.runtime.Instantiable0[reactDashSwfLib.reactDashSwfMod.rswfNs.ReactSWF] {
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

