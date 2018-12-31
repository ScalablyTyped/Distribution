package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptional extends js.Object {
  var errorFilter: js.UndefOr[
    js.Function3[
      /* errorMsg */ java.lang.String, 
      /* errorCode */ java.lang.String, 
      /* type */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var messages: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var overrideMessages: js.UndefOr[scala.Boolean] = js.undefined
}

