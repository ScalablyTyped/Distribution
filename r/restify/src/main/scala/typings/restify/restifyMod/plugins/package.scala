package typings.restify.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  import typings.restify.restifyMod.Request
  import typings.restify.restifyMod.Response
  import typings.restify.restifyMod.Route
  import typings.std.Error

  type AuditLoggerContext = js.Function4[/* req */ Request, /* res */ Response, /* route */ js.Any, /* error */ js.Any, js.Any]
  type MetricsCallback = js.Function5[
    /* err */ Error, 
    /* metrics */ MetricsCallbackOptions, 
    /* req */ Request, 
    /* res */ Response, 
    /* route */ Route, 
    Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.restify.restifyStrings.close
    - typings.restify.restifyStrings.aborted
    - `js.undefined`
  */
  type TMetricsCallback = js.UndefOr[_TMetricsCallback]
}
