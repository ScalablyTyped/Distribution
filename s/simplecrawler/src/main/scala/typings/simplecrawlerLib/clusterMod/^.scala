package typings
package simplecrawlerLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var isMaster: scala.Boolean = js.native
  var isWorker: scala.Boolean = js.native
  var settings: ClusterSettings = js.native
  var worker: Worker = js.native
  def addListener(event: java.lang.String, listener: js.Function): Cluster = js.native
  @JSName("addListener")
  def addListener_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): Cluster = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function): scala.Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
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
  def eventNames(): js.Array[java.lang.String] = js.native
  def fork(): Worker = js.native
  def fork(env: js.Any): Worker = js.native
  def getMaxListeners(): scala.Double = js.native
  def listenerCount(`type`: java.lang.String): scala.Double = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function): Cluster = js.native
  @JSName("on")
  def on_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("on")
  def on_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("on")
  def on_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("on")
  def on_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  @JSName("on")
  def on_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("on")
  def on_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("on")
  def on_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): Cluster = js.native
  def once(event: java.lang.String, listener: js.Function): Cluster = js.native
  @JSName("once")
  def once_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("once")
  def once_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("once")
  def once_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("once")
  def once_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  @JSName("once")
  def once_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("once")
  def once_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("once")
  def once_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): Cluster = js.native
  def prependListener(event: java.lang.String, listener: js.Function): Cluster = js.native
  @JSName("prependListener")
  def prependListener_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): Cluster = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(
    event: simplecrawlerLib.simplecrawlerLibStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fork(
    event: simplecrawlerLib.simplecrawlerLibStrings.fork,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(
    event: simplecrawlerLib.simplecrawlerLibStrings.online,
    listener: js.Function1[/* worker */ Worker, scala.Unit]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_setup(
    event: simplecrawlerLib.simplecrawlerLibStrings.setup,
    listener: js.Function1[/* settings */ js.Any, scala.Unit]
  ): Cluster = js.native
  def removeAllListeners(): Cluster = js.native
  def removeAllListeners(event: java.lang.String): Cluster = js.native
  def removeListener(event: java.lang.String, listener: js.Function): Cluster = js.native
  def setMaxListeners(n: scala.Double): Cluster = js.native
  def setupMaster(): scala.Unit = js.native
  def setupMaster(settings: ClusterSetupMasterSettings): scala.Unit = js.native
}

