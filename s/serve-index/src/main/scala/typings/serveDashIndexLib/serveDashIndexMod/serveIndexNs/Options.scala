package typings
package serveDashIndexLib.serveDashIndexMod.serveIndexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var filter: js.UndefOr[
    js.Function4[
      /* filename */ java.lang.String, 
      /* index */ scala.Double, 
      /* files */ js.Array[File], 
      /* dir */ java.lang.String, 
      scala.Boolean
    ]
  ] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[scala.Boolean] = js.undefined
  var stylesheet: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[
    java.lang.String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, scala.Unit])
  ] = js.undefined
  var view: js.UndefOr[java.lang.String] = js.undefined
}

