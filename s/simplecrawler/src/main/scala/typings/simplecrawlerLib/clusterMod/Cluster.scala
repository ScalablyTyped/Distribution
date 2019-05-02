package typings
package simplecrawlerLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends simplecrawlerLib.eventsMod.EventEmitter {
  var Worker: simplecrawlerLib.clusterMod.Worker = js.native
  var isMaster: scala.Boolean = js.native
  var isWorker: scala.Boolean = js.native
  // TODO: cluster.schedulingPolicy
  var settings: ClusterSettings = js.native
  var worker: Worker = js.native
  var workers: org.scalablytyped.runtime.StringDictionary[Worker] = js.native
  @JSName("addListener")
  def addListener_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): this.type = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function): scala.Unit = js.native
  @JSName("emit")
  def emit_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  def fork(): Worker = js.native
  def fork(env: js.Any): Worker = js.native
  @JSName("on")
  def on_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("on")
  def on_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("once")
  def once_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): this.type = js.native
  def setupMaster(): scala.Unit = js.native
  def setupMaster(settings: ClusterSetupMasterSettings): scala.Unit = js.native
}

