package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorConstructor
  extends StObject
     with /* standard es2022.error */
/* standard es5 */
Instantiable0[js.Error]
     with Instantiable1[/* message */ java.lang.String, js.Error]
     with Instantiable2[
      (/* message */ java.lang.String) | (/* message */ Unit), 
      /* options */ ErrorOptions, 
      js.Error
    ] {
  
  /* standard es2022.error */
  def apply(): js.Error = js.native
  def apply(message: java.lang.String): js.Error = js.native
  def apply(message: java.lang.String, options: ErrorOptions): js.Error = js.native
  def apply(message: Unit, options: ErrorOptions): js.Error = js.native
}
