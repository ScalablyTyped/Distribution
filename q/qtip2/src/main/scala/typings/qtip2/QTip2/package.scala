package typings.qtip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object QTip2 {
  
  type EventApiFunc = js.Function2[/* event */ typings.std.Event, /* api */ typings.qtip2.QTip2.Api, scala.Unit]
  
  type Target = typings.qtip2.JQuery | js.Array[scala.Double] | java.lang.String
  
  type Text = java.lang.String | typings.qtip2.JQuery | typings.qtip2.QTip2.EventApiFunc | scala.Boolean | typings.jquery.JQueryGenericPromise[js.Any]
  
  /**
    * Content property
    */
  type Title = java.lang.String | typings.qtip2.JQuery | typings.qtip2.QTip2.EventApiFunc | scala.Boolean | typings.jquery.JQueryGenericPromise[js.Any]
}
