package typings
package searchDashParamsLib.typingsEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params/typings/encode", JSImport.Namespace)
@js.native
object typingsEncodeModMembers extends js.Object {
  val decode: js.Function2[/* value */ js.Any, /* opts */ IFinalOptions, java.lang.String | scala.Boolean] = js.native
  val encode: js.Function3[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* opts */ IFinalOptions, 
    java.lang.String
  ] = js.native
  val encodeArray: js.Function3[
    /* name */ java.lang.String, 
    /* arr */ js.Array[js.Any], 
    /* opts */ IFinalOptions, 
    java.lang.String
  ] = js.native
  val makeOptions: js.Function1[/* opts */ js.UndefOr[IOptions], IFinalOptions] = js.native
}

