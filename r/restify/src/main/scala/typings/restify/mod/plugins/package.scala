package typings.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  type AuditLoggerContext = js.Function4[
    /* req */ typings.restify.mod.Request, 
    /* res */ typings.restify.mod.Response, 
    /* route */ js.Any, 
    /* error */ js.Any, 
    js.Any
  ]
  type MetricsCallback = js.Function5[
    /* err */ typings.std.Error, 
    /* metrics */ typings.restify.mod.plugins.MetricsCallbackOptions, 
    /* req */ typings.restify.mod.Request, 
    /* res */ typings.restify.mod.Response, 
    /* route */ typings.restify.mod.Route, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.restify.restifyStrings.close
    - typings.restify.restifyStrings.aborted
    - `js.undefined`
  */
  type TMetricsCallback = js.UndefOr[typings.restify.mod.plugins._TMetricsCallback]
}
