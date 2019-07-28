package typings.protractor.builtElementMod

import typings.protractor.TypeofClassBy
import typings.protractor.builtBrowserMod.ElementHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/element", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("build$")
  var build$: js.Function2[
    /* element */ ElementHelper, 
    /* by */ TypeofClassBy, 
    js.Function1[/* selector */ String, ElementFinder]
  ] = js.native
  @JSName("build$$")
  var build$$: js.Function2[
    /* element */ ElementHelper, 
    /* by */ TypeofClassBy, 
    js.Function1[/* selector */ String, ElementArrayFinder]
  ] = js.native
}

