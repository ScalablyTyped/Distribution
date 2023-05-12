package typings.projectOsrmOsrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The OSRM method is the main constructor for creating an OSRM instance.
  * An OSRM instance requires a .osrm network, which is prepared by the OSRM Backend C++ library.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md
  */
@JSImport("@project-osrm/osrm", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with OSRM {
  def this(options: String) = this()
  // tslint:disable-next-line:unified-signatures
  def this(options: PathConstructorOptions) = this()
  // tslint:disable-next-line:unified-signatures
  def this(options: SharedMemoryConstructorOptions) = this()
}
@JSImport("@project-osrm/osrm", JSImport.Namespace)
@js.native
object ^ extends StObject
