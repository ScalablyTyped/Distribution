package typings
package qlikDashVisualizationextensionsLib.enigmaJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeneratedAPI extends js.Object {
  /**
           * Despite the name, this property corresponds to the qInfo.qType property on your generic object's properties object.
           */
  var genericType: java.lang.String = js.native
  /**
           * This property contains the handle QIX Engine assigned to the API.
           * Used internally in enigma.js for caches and JSON-RPC
           */
  var handle: scala.Double = js.native
  /**
           * This property contains the unique identifier for this API.
           */
  var id: java.lang.String = js.native
  /**
           * This property contains the schema class name for this API.
           */
  var `type`: java.lang.String = js.native
  /**
           * manual emit an events
           * @param event - event that occures
           */
  @JSName("emit")
  def emit_changed(event: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.changed): scala.Unit = js.native
  /**
           * manual emit an events
           * @param event - event that occures
           */
  @JSName("emit")
  def emit_closed(event: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.closed): scala.Unit = js.native
  /**
           * register a function for events
           * @param event - function called if this event occures
           * @param func - function that is called
           */
  @JSName("on")
  def on_changed(
    event: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.changed,
    func: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
           * register a function for events
           * @param event - function called if this event occures
           * @param func - function that is called
           */
  @JSName("on")
  def on_closed(
    event: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.closed,
    func: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

