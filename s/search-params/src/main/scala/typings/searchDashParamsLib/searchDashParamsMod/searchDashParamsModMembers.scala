package typings
package searchDashParamsLib.searchDashParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params", JSImport.Namespace)
@js.native
object searchDashParamsModMembers extends js.Object {
  val build: js.Function2[
    /* params */ js.Object, 
    /* opts */ js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions], 
    java.lang.String
  ] = js.native
  val keep: js.Function3[
    /* path */ java.lang.String, 
    /* paramsToKeep */ js.Array[java.lang.String], 
    /* opts */ js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions], 
    IKeepResponse
  ] = js.native
  val omit: js.Function3[
    /* path */ java.lang.String, 
    /* paramsToOmit */ js.Array[java.lang.String], 
    /* opts */ js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions], 
    IOmitResponse
  ] = js.native
  val parse: js.Function2[
    /* path */ java.lang.String, 
    /* opts */ js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions], 
    js.Object
  ] = js.native
}

