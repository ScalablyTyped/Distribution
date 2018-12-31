package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EditorBreakpoint...
  */
trait IEditorBreakpoint extends js.Object {
  /**
    * If set to true then the breakpoint is enabled (in use).
    */
  var qEnabled: scala.Boolean
  /**
    * Name of the breakpoint.
    */
  var qbufferName: java.lang.String
  /**
    * Line number in the script where the breakpoint is set.
    */
  var qlineIx: scala.Double
}

