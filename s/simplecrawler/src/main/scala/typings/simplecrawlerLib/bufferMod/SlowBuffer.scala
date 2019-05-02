package typings
package simplecrawlerLib.bufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", "SlowBuffer")
@js.native
class SlowBuffer protected ()
  extends simplecrawlerLib.Buffer {
  def this(array: js.Array[_]) = this()
  def this(size: scala.Double) = this()
  def this(size: stdLib.Uint8Array) = this()
  def this(str: java.lang.String) = this()
  def this(str: java.lang.String, encoding: java.lang.String) = this()
}

@JSImport("buffer", "SlowBuffer")
@js.native
object SlowBuffer
  extends org.scalablytyped.runtime.Instantiable2[/* str */ java.lang.String, /* encoding */ java.lang.String, simplecrawlerLib.Buffer]
     with org.scalablytyped.runtime.Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* size */ scala.Double) | (/* str */ java.lang.String) | (/* size */ stdLib.Uint8Array), 
      simplecrawlerLib.Buffer
    ] {
  def byteLength(string: java.lang.String): scala.Double = js.native
  def byteLength(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  def concat(list: js.Array[simplecrawlerLib.Buffer]): simplecrawlerLib.Buffer = js.native
  def concat(list: js.Array[simplecrawlerLib.Buffer], totalLength: scala.Double): simplecrawlerLib.Buffer = js.native
  def isBuffer(obj: js.Any): scala.Boolean = js.native
}

