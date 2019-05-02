package typings
package simplecrawlerLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSWatcher
  extends simplecrawlerLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_change(
    event: simplecrawlerLib.simplecrawlerLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  def close(): scala.Unit = js.native
  @JSName("on")
  def on_change(
    event: simplecrawlerLib.simplecrawlerLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_change(
    event: simplecrawlerLib.simplecrawlerLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(
    event: simplecrawlerLib.simplecrawlerLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: simplecrawlerLib.simplecrawlerLibStrings.change,
    listener: js.Function2[
      /* eventType */ java.lang.String, 
      /* filename */ java.lang.String | simplecrawlerLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
}

