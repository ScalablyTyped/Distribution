package typings.skywayJs.mod

import typings.skywayJs.skywayJsStrings.close
import typings.skywayJs.skywayJsStrings.data
import typings.skywayJs.skywayJsStrings.error
import typings.skywayJs.skywayJsStrings.open
import typings.std.RTCDataChannelInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skyway-js", "DataConnection")
@js.native
open class DataConnection () extends Connection {
  
  var dcInit: RTCDataChannelInit = js.native
  
  var label: String = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ PeerError, Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ PeerError, Unit]): this.type = js.native
  @JSName("once")
  def once_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  
  def send(data: Any): Unit = js.native
  
  var serialization: DataConnectionSerialization = js.native
  
  @JSName("type")
  var type_DataConnection: data = js.native
}
