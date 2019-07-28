package typings.simplecrawler.cookiesMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieJar extends EventEmitter {
  var cookies: js.Array[Cookie] = js.native
  def add(name: String, value: String, expiry: String): this.type = js.native
  def add(name: String, value: String, expiry: String, path: String): this.type = js.native
  def add(name: String, value: String, expiry: String, path: String, domain: String): this.type = js.native
  def add(name: String, value: String, expiry: String, path: String, domain: String, httponly: Boolean): this.type = js.native
  def add(
    name: String,
    value: String,
    expiry: String,
    path: String,
    domain: String,
    httponly: Boolean,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
  ): this.type = js.native
  def add(name: String, value: String, expiry: Double): this.type = js.native
  def add(name: String, value: String, expiry: Double, path: String): this.type = js.native
  def add(name: String, value: String, expiry: Double, path: String, domain: String): this.type = js.native
  def add(name: String, value: String, expiry: Double, path: String, domain: String, httponly: Boolean): this.type = js.native
  def add(
    name: String,
    value: String,
    expiry: Double,
    path: String,
    domain: String,
    httponly: Boolean,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* cookie */ js.UndefOr[Cookie], Unit]
  ): this.type = js.native
  def addFromHeaders(headers: String): this.type = js.native
  def addFromHeaders(headers: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): this.type = js.native
  def addFromHeaders(headers: js.Array[String]): this.type = js.native
  def addFromHeaders(headers: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): this.type = js.native
  def get(): js.Array[Cookie] = js.native
  def get(name: String): js.Array[Cookie] = js.native
  def get(name: String, domain: String): js.Array[Cookie] = js.native
  def get(
    name: String,
    domain: String,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
  ): js.Array[Cookie] = js.native
  def getAsHeader(): js.Array[String] = js.native
  def getAsHeader(name: String): js.Array[String] = js.native
  def getAsHeader(name: String, domain: String): js.Array[String] = js.native
  def getAsHeader(
    name: String,
    domain: String,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* cookies */ js.UndefOr[js.Array[Cookie]], Unit]
  ): js.Array[String] = js.native
  def remove(): js.Array[Cookie] = js.native
  def remove(name: String): js.Array[Cookie] = js.native
  def remove(name: String, domain: String): js.Array[Cookie] = js.native
  def remove(
    name: String,
    domain: String,
    callback: js.Function2[
      /* error */ js.UndefOr[Error], 
      /* cookiesRemoved */ js.UndefOr[js.Array[Cookie]], 
      Unit
    ]
  ): js.Array[Cookie] = js.native
}

