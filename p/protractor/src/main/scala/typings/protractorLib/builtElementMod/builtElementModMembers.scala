package typings
package protractorLib.builtElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/element", JSImport.Namespace)
@js.native
object builtElementModMembers extends js.Object {
  @JSName("build$")
  var build$: js.Function2[
    /* element */ protractorLib.builtBrowserMod.ElementHelper, 
    /* by */ org.scalablytyped.runtime.Instantiable2[
      /* using */ java.lang.String, 
      /* value */ java.lang.String, 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.By
    ], 
    js.Function1[/* selector */ java.lang.String, ElementFinder]
  ] = js.native
  @JSName("build$$")
  var build$$: js.Function2[
    /* element */ protractorLib.builtBrowserMod.ElementHelper, 
    /* by */ org.scalablytyped.runtime.Instantiable2[
      /* using */ java.lang.String, 
      /* value */ java.lang.String, 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.By
    ], 
    js.Function1[/* selector */ java.lang.String, ElementArrayFinder]
  ] = js.native
}

