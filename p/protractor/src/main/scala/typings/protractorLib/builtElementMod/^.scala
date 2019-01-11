package typings
package protractorLib.builtElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/element", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("build$")
  var build$: js.Function2[
    /* element */ protractorLib.builtBrowserMod.ElementHelper, 
    /* by */ protractorLib.Anon_ClassName, 
    js.Function1[/* selector */ java.lang.String, protractorLib.builtElementMod.ElementFinder]
  ] = js.native
  @JSName("build$$")
  var build$$: js.Function2[
    /* element */ protractorLib.builtBrowserMod.ElementHelper, 
    /* by */ protractorLib.Anon_ClassName, 
    js.Function1[/* selector */ java.lang.String, protractorLib.builtElementMod.ElementArrayFinder]
  ] = js.native
}

