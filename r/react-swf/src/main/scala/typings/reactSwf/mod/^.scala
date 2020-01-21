package typings.reactSwf.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.reactSwf.mod.rswf.ReactSWF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-swf", JSImport.Namespace)
@js.native
class ^ () extends ReactSWF

@JSImport("react-swf", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Instantiable0[ReactSWF]] {
  /**
    * Returns installed Flash Player version. Result is cached.
    * Must not be called in a non-browser environment.
    * @return {?string} 'X.Y.Z'-version or null.
    */
  def getFPVersion(): String = js.native
  /**
    * Returns if installed Flash Player meets version requirement.
    * Must not be called in a non-browser environment.
    * @return {boolean} true if supported
    */
  def isFPVersionSupported(versionString: String): Boolean = js.native
}

