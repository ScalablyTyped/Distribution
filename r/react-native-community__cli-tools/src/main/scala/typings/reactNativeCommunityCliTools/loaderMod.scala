package typings.reactNativeCommunityCliTools

import org.scalablytyped.runtime.Instantiable0
import typings.ora.mod.Options
import typings.ora.mod.Ora
import typings.ora.mod.Spinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("@react-native-community/cli-tools/build/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@react-native-community/cli-tools/build/loader", "NoopLoader")
  @js.native
  open class NoopLoader ()
    extends StObject
       with OraNoop
  @JSImport("@react-native-community/cli-tools/build/loader", "NoopLoader")
  @js.native
  val NoopLoader: Instantiable0[OraNoop] = js.native
  
  inline def getLoader(): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoader")().asInstanceOf[Loader]
  inline def getLoader(options: String): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoader")(options.asInstanceOf[js.Any]).asInstanceOf[Loader]
  inline def getLoader(options: Options): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoader")(options.asInstanceOf[js.Any]).asInstanceOf[Loader]
  
  type Loader = Ora
  
  @js.native
  trait OraNoop
    extends StObject
       with Ora {
    
    @JSName("isSpinning")
    var isSpinning_FOraNoop: Boolean = js.native
    
    @JSName("spinner")
    var spinner_FOraNoop: Spinner = js.native
  }
}
