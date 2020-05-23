package typings.rdflib.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rdflib.fetcherMod.ExtendedResponse
import typings.rdflib.fetcherMod.Handler
import typings.std.Document
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHandler
  extends Instantiable1[/* response */ ExtendedResponse, Handler]
     with Instantiable2[/* response */ ExtendedResponse, /* dom */ Document, Handler] {
  var pattern: RegExp = js.native
}

