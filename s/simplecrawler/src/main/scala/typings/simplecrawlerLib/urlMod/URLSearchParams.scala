package typings
package simplecrawlerLib.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "URLSearchParams")
@js.native
class URLSearchParams ()
  extends simplecrawlerLib.Iterable[js.Array[java.lang.String]] {
  def this(init: java.lang.String) = this()
  def this(init: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) = this()
  def this(init: simplecrawlerLib.Iterable[js.Array[java.lang.String]]) = this()
  def this(init: URLSearchParams) = this()
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[simplecrawlerLib.Iterator[js.Array[java.lang.String]]] = js.native
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def entries(): simplecrawlerLib.Iterator[js.Array[java.lang.String]] = js.native
  def forEach(
    callback: js.Function3[
      /* value */ java.lang.String, 
      /* name */ java.lang.String, 
      /* searchParams */ this.type, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def keys(): simplecrawlerLib.Iterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def sort(): scala.Unit = js.native
  def values(): simplecrawlerLib.Iterator[java.lang.String] = js.native
}

