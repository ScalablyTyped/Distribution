package typings
package simplecrawlerLib.cookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieJar
  extends simplecrawlerLib.eventsMod.EventEmitter {
  var cookies: js.Array[Cookie] = js.native
  def add(name: java.lang.String, value: java.lang.String, expiry: java.lang.String): this.type = js.native
  def add(name: java.lang.String, value: java.lang.String, expiry: java.lang.String, path: java.lang.String): this.type = js.native
  def add(
    name: java.lang.String,
    value: java.lang.String,
    expiry: java.lang.String,
    path: java.lang.String,
    domain: java.lang.String
  ): this.type = js.native
  def add(
    name: java.lang.String,
    value: java.lang.String,
    expiry: java.lang.String,
    path: java.lang.String,
    domain: java.lang.String,
    httponly: scala.Boolean
  ): this.type = js.native
  def add(
    name: java.lang.String,
    value: java.lang.String,
    expiry: java.lang.String,
    path: java.lang.String,
    domain: java.lang.String,
    httponly: scala.Boolean,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* cookie */ js.UndefOr[Cookie], 
      scala.Unit
    ]
  ): this.type = js.native
  def add(name: java.lang.String, value: java.lang.String, expiry: scala.Double): this.type = js.native
  def add(name: java.lang.String, value: java.lang.String, expiry: scala.Double, path: java.lang.String): this.type = js.native
  def add(
    name: java.lang.String,
    value: java.lang.String,
    expiry: scala.Double,
    path: java.lang.String,
    domain: java.lang.String
  ): this.type = js.native
  def add(
    name: java.lang.String,
    value: java.lang.String,
    expiry: scala.Double,
    path: java.lang.String,
    domain: java.lang.String,
    httponly: scala.Boolean
  ): this.type = js.native
  def add(
    name: java.lang.String,
    value: java.lang.String,
    expiry: scala.Double,
    path: java.lang.String,
    domain: java.lang.String,
    httponly: scala.Boolean,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* cookie */ js.UndefOr[Cookie], 
      scala.Unit
    ]
  ): this.type = js.native
  def addFromHeaders(headers: java.lang.String): this.type = js.native
  def addFromHeaders(
    headers: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[simplecrawlerLib.Error], scala.Unit]
  ): this.type = js.native
  def addFromHeaders(headers: js.Array[java.lang.String]): this.type = js.native
  def addFromHeaders(
    headers: js.Array[java.lang.String],
    callback: js.Function1[/* error */ js.UndefOr[simplecrawlerLib.Error], scala.Unit]
  ): this.type = js.native
  def get(): js.Array[Cookie] = js.native
  def get(name: java.lang.String): js.Array[Cookie] = js.native
  def get(name: java.lang.String, domain: java.lang.String): js.Array[Cookie] = js.native
  def get(
    name: java.lang.String,
    domain: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* cookies */ js.UndefOr[js.Array[Cookie]], 
      scala.Unit
    ]
  ): js.Array[Cookie] = js.native
  def getAsHeader(): js.Array[java.lang.String] = js.native
  def getAsHeader(name: java.lang.String): js.Array[java.lang.String] = js.native
  def getAsHeader(name: java.lang.String, domain: java.lang.String): js.Array[java.lang.String] = js.native
  def getAsHeader(
    name: java.lang.String,
    domain: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* cookies */ js.UndefOr[js.Array[Cookie]], 
      scala.Unit
    ]
  ): js.Array[java.lang.String] = js.native
  def remove(): js.Array[Cookie] = js.native
  def remove(name: java.lang.String): js.Array[Cookie] = js.native
  def remove(name: java.lang.String, domain: java.lang.String): js.Array[Cookie] = js.native
  def remove(
    name: java.lang.String,
    domain: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
      scala.Unit
    ]
  ): js.Array[Cookie] = js.native
}

